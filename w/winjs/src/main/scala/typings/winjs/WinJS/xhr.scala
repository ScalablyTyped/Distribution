package typings.winjs.WinJS

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.xhr")
@js.native
object xhr extends js.Object {
  /**
    * Wraps calls to XMLHttpRequest in a promise.
    * @param options The options that are applied to the XMLHttpRequest object, as follows: type, url, user, password, responseType, headers, data, customRequestInitializer.
    * @returns A promise that returns the XMLHttpRequest object when it completes.
    **/
  def apply(options: IXHROptions): Promise[XMLHttpRequest] = js.native
}

