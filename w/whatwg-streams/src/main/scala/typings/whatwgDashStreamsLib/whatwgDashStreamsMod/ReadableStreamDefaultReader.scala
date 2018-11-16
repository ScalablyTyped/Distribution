package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "ReadableStreamDefaultReader")
@js.native
class ReadableStreamDefaultReader[R] protected () extends js.Object {
  def this(stream: ReadableStream[R]) = this()
  val closed: stdLib.Promise[scala.Unit] = js.native
  def cancel(reason: js.Any): stdLib.Promise[scala.Unit] = js.native
  def read(): stdLib.Promise[ReadResult[R]] = js.native
  def releaseLock(): scala.Unit = js.native
}

