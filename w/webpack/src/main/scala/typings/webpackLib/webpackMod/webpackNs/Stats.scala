package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var compilation: webpackLib.webpackMod.webpackNs.compilationNs.Compilation = js.native
  var endTime: js.UndefOr[stdLib.Date] = js.native
  var hash: js.UndefOr[java.lang.String] = js.native
  var startTime: js.UndefOr[stdLib.Date] = js.native
  /** Returns true if there were errors while compiling. */
  def hasErrors(): scala.Boolean = js.native
  /** Returns true if there were warnings while compiling. */
  def hasWarnings(): scala.Boolean = js.native
  /** Returns compilation information as a JSON object. */
  def toJson(): js.Any = js.native
  /** Returns compilation information as a JSON object. */
  def toJson(options: webpackLib.webpackMod.webpackNs.StatsNs.ToJsonOptions): js.Any = js.native
  /** Returns a formatted string of the compilation information (similar to CLI output). */
  def toString(options: webpackLib.webpackMod.webpackNs.StatsNs.ToStringOptions): java.lang.String = js.native
}

