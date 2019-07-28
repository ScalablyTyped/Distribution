package typings.whatwgDashStreams.whatwgDashStreamsMod

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "ReadableStreamBYOBReader")
@js.native
class ReadableStreamBYOBReader[R] protected () extends js.Object {
  def this(stream: ReadableStream[R]) = this()
  val closed: js.Promise[Unit] = js.native
  def cancel(reason: js.Any): js.Promise[Unit] = js.native
  def read[T /* <: ArrayBufferView */](view: T): js.Promise[ReadResult[T]] = js.native
  def releaseLock(): Unit = js.native
}

