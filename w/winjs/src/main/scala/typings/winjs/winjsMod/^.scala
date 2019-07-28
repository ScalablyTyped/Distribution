package typings.winjs.winjsMod

import typings.std.XMLHttpRequest
import typings.winjs.WinJSNs.IXHROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  //#region Properties
  /**
    * Can be set to show the results of a validation process.
    **/
  var validation: Boolean = js.native
  //#endregion Objects
  //#region Functions
  /**
    * You can provide an implementation of this method yourself, or use WinJS.Utilities.startLog to create one that logs to the JavaScript console.
    * @param message The message to log.
    * @param tags The tag or tags to categorize the message (winjs, winjs controls, etc.).
    * @param type The type of message (error, warning, info, etc.).
    **/
  def log(message: String): Unit = js.native
  def log(message: String, tags: String): Unit = js.native
  def log(message: String, tags: String, `type`: String): Unit = js.native
  def log(message: js.Function0[String]): Unit = js.native
  def log(message: js.Function0[String], tags: String): Unit = js.native
  def log(message: js.Function0[String], tags: String, `type`: String): Unit = js.native
  /**
    * Wraps calls to XMLHttpRequest in a promise.
    * @param options The options that are applied to the XMLHttpRequest object, as follows: type, url, user, password, responseType, headers, data, customRequestInitializer.
    * @returns A promise that returns the XMLHttpRequest object when it completes.
    **/
  def xhr(options: IXHROptions): typings.winjs.WinJSNs.Promise[XMLHttpRequest] = js.native
}

