package typings.whatwgDashStreams.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "ReadableStreamDefaultController")
@js.native
class ReadableStreamDefaultController[R] () extends js.Object {
  val desiredSize: Double | Null = js.native
  def close(): Unit = js.native
  def enqueue(chunk: R): Unit = js.native
  def error(e: js.Any): Unit = js.native
}

