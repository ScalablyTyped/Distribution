package typings.winjs.global.WinJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WinJS.log")
@js.native
object log extends js.Object {
  
  //#endregion Objects
  //#region Functions
  /**
    * You can provide an implementation of this method yourself, or use WinJS.Utilities.startLog to create one that logs to the JavaScript console.
    * @param message The message to log.
    * @param tags The tag or tags to categorize the message (winjs, winjs controls, etc.).
    * @param type The type of message (error, warning, info, etc.).
    **/
  def apply(message: String): Unit = js.native
  def apply(message: String, tags: js.UndefOr[scala.Nothing], `type`: String): Unit = js.native
  def apply(message: String, tags: String): Unit = js.native
  def apply(message: String, tags: String, `type`: String): Unit = js.native
  def apply(message: js.Function0[String]): Unit = js.native
  def apply(message: js.Function0[String], tags: js.UndefOr[scala.Nothing], `type`: String): Unit = js.native
  def apply(message: js.Function0[String], tags: String): Unit = js.native
  def apply(message: js.Function0[String], tags: String, `type`: String): Unit = js.native
}
