package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "ReadableStreamDefaultController")
@js.native
class ReadableStreamDefaultController[R] () extends js.Object {
  val desiredSize: scala.Double | scala.Null = js.native
  def close(): scala.Unit = js.native
  def enqueue(chunk: R): scala.Unit = js.native
  def error(e: js.Any): scala.Unit = js.native
}

