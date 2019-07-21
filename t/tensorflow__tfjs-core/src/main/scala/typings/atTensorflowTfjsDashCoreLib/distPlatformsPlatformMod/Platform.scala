package typings
package atTensorflowTfjsDashCoreLib.distPlatformsPlatformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Platform extends js.Object {
  /** Decode the provided bytes into a string using the provided encoding. */
  def decode(bytes: stdLib.Uint8Array, encoding: java.lang.String): java.lang.String = js.native
  /**
    * Encode the provided string into an array of bytes using the provided
    * encoding.
    */
  def encode(text: java.lang.String, encoding: java.lang.String): stdLib.Uint8Array = js.native
  /**
    * Makes an HTTP request.
    * @param path The URL path to make a request to
    * @param init The request init. See init here:
    *     https://developer.mozilla.org/en-US/docs/Web/API/Request/Request
    */
  def fetch(path: java.lang.String): js.Promise[stdLib.Response] = js.native
  def fetch(path: java.lang.String, requestInits: stdLib.RequestInit): js.Promise[stdLib.Response] = js.native
  /**
    * Returns the current high-resolution time in milliseconds relative to an
    * arbitrary time in the past. It works across different platforms (node.js,
    * browsers).
    */
  def now(): scala.Double = js.native
}

