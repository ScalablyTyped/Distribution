package typings
package atTensorflowTfjsDashCoreLib.distPlatformsPlatformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Platform extends js.Object {
  /** UTF-8 decode the provided bytes into a string. */
  def decodeUTF8(bytes: stdLib.Uint8Array): java.lang.String = js.native
  /** UTF-8 encode the provided string into an array of bytes. */
  def encodeUTF8(text: java.lang.String): stdLib.Uint8Array = js.native
  /**
    * Makes an HTTP request.
    * @param path The URL path to make a request to
    * @param init The request init. See init here:
    *     https://developer.mozilla.org/en-US/docs/Web/API/Request/Request
    */
  def fetch(path: java.lang.String): js.Promise[stdLib.Response] = js.native
  def fetch(path: java.lang.String, requestInits: stdLib.RequestInit): js.Promise[stdLib.Response] = js.native
}

