package typings.whatwgDashStreams.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "ReadableStreamDefaultReader")
@js.native
class ReadableStreamDefaultReader[R] protected () extends js.Object {
  def this(stream: ReadableStream[R]) = this()
  val closed: js.Promise[Unit] = js.native
  def cancel(reason: js.Any): js.Promise[Unit] = js.native
  def read(): js.Promise[ReadResult[R]] = js.native
  def releaseLock(): Unit = js.native
}

