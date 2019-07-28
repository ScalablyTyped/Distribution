package typings.vegaDashLite

import org.scalablytyped.runtime.StringDictionary
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgMarkConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcConfigMod {
  type RangeConfig = RangeConfigProps with StringDictionary[RangeConfigValue]
  /* Rewritten from type alias, can be one of: 
    - js.Array[scala.Double | java.lang.String]
    - typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgScheme
    - typings.vegaDashLite.Anon_Step
  */
  type RangeConfigValue = _RangeConfigValue | (js.Array[Double | String])
  type StyleConfigIndex = StringDictionary[VgMarkConfig]
}
