package typings.winjs.WinJS.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.startLog")
@js.native
object startLog extends js.Object {
  /**
    * Configures a logger that writes messages containing the specified tags to the JavaScript console.
    * @param options The tags for messages to log. Multiple tags should be separated by spaces. May contain type, tags, excludeTags and action properties.
    **/
  def apply(): Unit = js.native
  def apply(options: ILogOptions): Unit = js.native
  def apply(tags: String): Unit = js.native
}

