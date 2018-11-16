package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "WritableStreamDefaultWriter")
@js.native
class WritableStreamDefaultWriter[W] protected () extends js.Object {
  def this(stream: WritableStream[W]) = this()
  val closed: stdLib.Promise[scala.Unit] = js.native
  val desiredSize: scala.Double | scala.Null = js.native
  val ready: stdLib.Promise[scala.Unit] = js.native
  def abort(reason: js.Any): stdLib.Promise[scala.Unit] = js.native
  def close(): stdLib.Promise[scala.Unit] = js.native
  def releaseLock(): scala.Unit = js.native
  def write(chunk: W): stdLib.Promise[scala.Unit] = js.native
}

