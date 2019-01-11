package typings
package winjsLib.WinJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS")
@js.native
object ^ extends js.Object {
  //#region Properties
  /**
    * Can be set to show the results of a validation process.
    **/
  var validation: scala.Boolean = js.native
  //#endregion Objects
  //#region Functions
  /**
    * You can provide an implementation of this method yourself, or use WinJS.Utilities.startLog to create one that logs to the JavaScript console.
    * @param message The message to log.
    * @param tags The tag or tags to categorize the message (winjs, winjs controls, etc.).
    * @param type The type of message (error, warning, info, etc.).
    **/
  def log(message: java.lang.String): scala.Unit = js.native
  def log(message: java.lang.String, tags: java.lang.String): scala.Unit = js.native
  def log(message: java.lang.String, tags: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def log(message: js.Function0[java.lang.String]): scala.Unit = js.native
  def log(message: js.Function0[java.lang.String], tags: java.lang.String): scala.Unit = js.native
  def log(message: js.Function0[java.lang.String], tags: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  /**
    * Wraps calls to XMLHttpRequest in a promise.
    * @param options The options that are applied to the XMLHttpRequest object, as follows: type, url, user, password, responseType, headers, data, customRequestInitializer.
    * @returns A promise that returns the XMLHttpRequest object when it completes.
    **/
  def xhr(options: winjsLib.WinJSNs.IXHROptions): winjsLib.WinJSNs.Promise[stdLib.XMLHttpRequest] = js.native
}

