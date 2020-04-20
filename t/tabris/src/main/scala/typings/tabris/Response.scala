package typings.tabris

import typings.std.ArrayBuffer
import typings.tabris.tabrisStrings.basic
import typings.tabris.tabrisStrings.cors
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.error
import typings.tabris.tabrisStrings.opaque
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Response
/**
  * Represents an HTTP Response as used by `fetch()`.
  */
@JSGlobal("Response")
@js.native
class Response () extends js.Object {
  def this(body: String) = this()
  def this(body: Blob) = this()
  def this(body: FormData) = this()
  def this(body: String, init: ResponseInit) = this()
  def this(body: Blob, init: ResponseInit) = this()
  def this(body: FormData, init: ResponseInit) = this()
  val bodyUsed: Boolean = js.native
  val headers: Headers = js.native
  val ok: Boolean = js.native
  val status: Double = js.native
  val statusText: String = js.native
  val `type`: basic | cors | default | error | opaque = js.native
  val url: String = js.native
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  def blob(): js.Promise[Blob] = js.native
  def json(): js.Promise[_] = js.native
  @JSName("json")
  def json_T[T](): js.Promise[T] = js.native
  def text(): js.Promise[String] = js.native
}

/* static members */
@JSGlobal("Response")
@js.native
object Response extends js.Object {
  def error(): Response = js.native
  def redirect(url: String, status: Double): Response = js.native
}

