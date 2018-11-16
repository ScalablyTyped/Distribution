package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "TransformStreamDefaultController")
@js.native
class TransformStreamDefaultController[R] () extends js.Object {
  val desiredSize: scala.Double | scala.Null = js.native
  def enqueue(chunk: R): scala.Unit = js.native
  def error(reason: js.Any): scala.Unit = js.native
  def terminate(): scala.Unit = js.native
}

