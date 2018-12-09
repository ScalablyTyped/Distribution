package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "ReadableStreamDefaultReader")
@js.native
class ReadableStreamDefaultReader[R] protected () extends js.Object {
  def this(stream: ReadableStream[R]) = this()
  val closed: js.Promise[scala.Unit] = js.native
  def cancel(reason: js.Any): js.Promise[scala.Unit] = js.native
  def read(): js.Promise[ReadResult[R]] = js.native
  def releaseLock(): scala.Unit = js.native
}

