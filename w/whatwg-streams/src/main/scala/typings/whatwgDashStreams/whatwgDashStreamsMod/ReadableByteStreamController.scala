package typings.whatwgDashStreams.whatwgDashStreamsMod

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "ReadableByteStreamController")
@js.native
class ReadableByteStreamController () extends js.Object {
  val byobRequest: js.UndefOr[ReadableStreamBYOBRequest] = js.native
  val desiredSize: Double | Null = js.native
  def close(): Unit = js.native
  def enqueue(chunk: ArrayBufferView): Unit = js.native
  def error(e: js.Any): Unit = js.native
}

