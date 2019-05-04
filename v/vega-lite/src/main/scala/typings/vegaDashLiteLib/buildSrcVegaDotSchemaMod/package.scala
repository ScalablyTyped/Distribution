package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcVegaDotSchemaMod {
  type FontWeight = FontWeightString | FontWeightNumber
  type FontWeightNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - VgNonUnionDomain
    - DataRefUnionDomain
    - VgFieldRefUnionDomain
  */
  type VgDomain = _VgDomain | js.Array[js.Any]
  type VgEncodeEntry = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in vega-lite.vega-lite/build/src/vega.schema.VgEncodeChannel ]:? vega-lite.vega-lite/build/src/vega.schema.VgValueRef | std.Array<vega-lite.vega-lite/build/src/vega.schema.VgValueRef & {  test? :string}>}
    */ vegaDashLiteLib.vegaDashLiteLibStrings.VgEncodeEntry with js.Any
  type VgEventStream = js.Any
  type VgFieldRef = java.lang.String | VgParentRef | js.Array[VgParentRef]
  type VgGuideEncode = js.Any
  type VgMarkGroup = js.Any
  /* Rewritten from type alias, can be one of: 
    - js.Array[js.Any]
    - VgDataRef
    - VgSignalRef
  */
  type VgNonUnionDomain = _VgNonUnionDomain | js.Array[js.Any]
  type VgPostEncodingTransform = VgGeoShapeTransform
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - VgDataRef
    - js.Array[scala.Double | java.lang.String | VgDataRef | VgSignalRef]
    - VgScheme
    - VgRangeStep
  */
  type VgRange = _VgRange | (js.Array[scala.Double | java.lang.String | VgDataRef | VgSignalRef]) | java.lang.String
}
