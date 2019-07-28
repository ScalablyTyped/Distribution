package typings.whatwgDashStreams.whatwgDashStreamsMod

import typings.std.ArrayBufferView
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "ReadableStreamBYOBRequest")
@js.native
class ReadableStreamBYOBRequest () extends js.Object {
  val view: Uint8Array = js.native
  def respond(bytesWritten: Double): Unit = js.native
  def respondWithNewView(view: ArrayBufferView): Unit = js.native
}

