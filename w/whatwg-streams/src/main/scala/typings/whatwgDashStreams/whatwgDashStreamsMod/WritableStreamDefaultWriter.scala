package typings.whatwgDashStreams.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "WritableStreamDefaultWriter")
@js.native
class WritableStreamDefaultWriter[W] protected () extends js.Object {
  def this(stream: WritableStream[W]) = this()
  val closed: js.Promise[Unit] = js.native
  val desiredSize: Double | Null = js.native
  val ready: js.Promise[Unit] = js.native
  def abort(reason: js.Any): js.Promise[Unit] = js.native
  def close(): js.Promise[Unit] = js.native
  def releaseLock(): Unit = js.native
  def write(chunk: W): js.Promise[Unit] = js.native
}

