package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcVegaDotSchemaMod {
  type FontWeight = FontWeightString | FontWeightNumber
  type FontWeightNumber = Double
  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgNonUnionDomain
    - typings.vegaDashLite.buildSrcVegaDotSchemaMod.DataRefUnionDomain
    - typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgFieldRefUnionDomain
  */
  type VgDomain = _VgDomain | js.Array[js.Any]
  type VgEncodeEntry = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in vega-lite.vega-lite/build/src/vega.schema.VgEncodeChannel ]:? vega-lite.vega-lite/build/src/vega.schema.VgValueRef | std.Array<vega-lite.vega-lite/build/src/vega.schema.VgValueRef & {  test? :string}>}
    */ typings.vegaDashLite.vegaDashLiteStrings.VgEncodeEntry with js.Any
  type VgEventStream = js.Any
  type VgFieldRef = String | VgParentRef | js.Array[VgParentRef]
  type VgGuideEncode = js.Any
  type VgMarkGroup = js.Any
  /* Rewritten from type alias, can be one of: 
    - js.Array[js.Any]
    - typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgDataRef
    - typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgSignalRef
  */
  type VgNonUnionDomain = _VgNonUnionDomain | js.Array[js.Any]
  type VgPostEncodingTransform = VgGeoShapeTransform
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgDataRef
    - js.Array[
  scala.Double | java.lang.String | typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgDataRef | typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgSignalRef]
    - typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgScheme
    - typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgRangeStep
  */
  type VgRange = _VgRange | (js.Array[Double | String | VgDataRef | VgSignalRef]) | String
}
