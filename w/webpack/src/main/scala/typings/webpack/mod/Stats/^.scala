package typings.webpack.mod.Stats

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Stats")
@js.native
object ^ extends js.Object {
  def filterWarnings(warnings: js.Array[String]): js.Array[String] = js.native
  def filterWarnings(
    warnings: js.Array[String],
    warningsFilter: js.Array[String | RegExp | (js.Function1[/* warning */ String, Boolean])]
  ): js.Array[String] = js.native
  /**
    * Returns the default json options from the stats preset.
    * @param preset The preset to be transformed into json options.
    */
  def presetToOptions(): ToJsonOptionsObject = js.native
  def presetToOptions(preset: Preset): ToJsonOptionsObject = js.native
}

