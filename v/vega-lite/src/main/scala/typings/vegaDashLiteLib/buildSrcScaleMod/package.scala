package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcScaleMod {
  /* Rewritten from type alias, can be one of: 
    - js.Array[scala.Double]
    - js.Array[java.lang.String]
    - js.Array[scala.Boolean]
    - js.Array[vegaDashLiteLib.buildSrcDatetimeMod.DateTime]
    - vegaDashLiteLib.vegaDashLiteLibStrings.unaggregated
    - SelectionDomain
  */
  type Domain = _Domain | js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[scala.Boolean] | js.Array[vegaDashLiteLib.buildSrcDatetimeMod.DateTime]
  type Range = js.Array[scala.Double] | js.Array[java.lang.String] | java.lang.String
  type ScaleTypeIndex = org.scalablytyped.runtime.StringDictionary[js.Array[ScaleType]]
  type Scheme = java.lang.String | SchemeParams
}
