package typings.webpack.webpackMod

import typings.webpack.webpackMod.StatsNs.ToJsonOptions
import typings.webpack.webpackMod.StatsNs.ToJsonOutput
import typings.webpack.webpackMod.StatsNs.ToStringOptions
import typings.webpack.webpackMod.compilationNs.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Stats")
@js.native
abstract class Stats () extends js.Object {
  var compilation: Compilation = js.native
  var endTime: js.UndefOr[Double] = js.native
  var hash: js.UndefOr[String] = js.native
  var startTime: js.UndefOr[Double] = js.native
  /** Returns true if there were errors while compiling. */
  def hasErrors(): Boolean = js.native
  /** Returns true if there were warnings while compiling. */
  def hasWarnings(): Boolean = js.native
  /** Returns compilation information as a JSON object. */
  def toJson(): ToJsonOutput = js.native
  def toJson(options: ToJsonOptions): ToJsonOutput = js.native
  def toJson(options: ToJsonOptions, forToString: Boolean): ToJsonOutput = js.native
  def toString(options: ToStringOptions): String = js.native
}

