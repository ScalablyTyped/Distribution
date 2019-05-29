package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcScaleMod {
  /* Rewritten from type alias, can be one of: 
    - js.Array[
  scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime | scala.Double | java.lang.String]
    - vegaDashLiteLib.vegaDashLiteLibStrings.unaggregated
    - SelectionDomain
  */
  type Domain = _Domain | (js.Array[
    scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime | scala.Double | java.lang.String
  ])
  type Range = (js.Array[scala.Double | java.lang.String]) | java.lang.String
  type ScaleTypeIndex = org.scalablytyped.runtime.StringDictionary[js.Array[ScaleType]]
  type Scheme = java.lang.String | SchemeParams
}
