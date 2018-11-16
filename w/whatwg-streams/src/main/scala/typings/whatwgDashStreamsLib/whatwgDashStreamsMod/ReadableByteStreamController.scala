package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "ReadableByteStreamController")
@js.native
class ReadableByteStreamController () extends js.Object {
  val byobRequest: js.UndefOr[ReadableStreamBYOBRequest] = js.native
  val desiredSize: scala.Double | scala.Null = js.native
  def close(): scala.Unit = js.native
  def enqueue(chunk: stdLib.ArrayBufferView): scala.Unit = js.native
  def error(e: js.Any): scala.Unit = js.native
}

