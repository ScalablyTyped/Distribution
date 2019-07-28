package typings.vegaDashLite

import org.scalablytyped.runtime.StringDictionary
import typings.vegaDashLite.buildSrcDatetimeMod.DateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcScaleMod {
  /* Rewritten from type alias, can be one of: 
    - js.Array[
  scala.Boolean | typings.vegaDashLite.buildSrcDatetimeMod.DateTime | scala.Double | java.lang.String]
    - typings.vegaDashLite.vegaDashLiteStrings.unaggregated
    - typings.vegaDashLite.buildSrcScaleMod.SelectionDomain
  */
  type Domain = _Domain | (js.Array[Boolean | DateTime | Double | String])
  type Range = (js.Array[Double | String]) | String
  type ScaleTypeIndex = StringDictionary[js.Array[ScaleType]]
  type Scheme = String | SchemeParams
}
