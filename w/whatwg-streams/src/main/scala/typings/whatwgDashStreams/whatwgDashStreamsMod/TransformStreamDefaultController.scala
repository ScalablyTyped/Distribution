package typings.whatwgDashStreams.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "TransformStreamDefaultController")
@js.native
class TransformStreamDefaultController[R] () extends js.Object {
  val desiredSize: Double | Null = js.native
  def enqueue(chunk: R): Unit = js.native
  def error(reason: js.Any): Unit = js.native
  def terminate(): Unit = js.native
}

