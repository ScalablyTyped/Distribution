package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "ReadableStreamBYOBReader")
@js.native
class ReadableStreamBYOBReader[R] protected () extends js.Object {
  def this(stream: ReadableStream[R]) = this()
  val closed: stdLib.Promise[scala.Unit] = js.native
  def cancel(reason: js.Any): stdLib.Promise[scala.Unit] = js.native
  def read[T /* <: stdLib.ArrayBufferView */](view: T): stdLib.Promise[ReadResult[T]] = js.native
  def releaseLock(): scala.Unit = js.native
}

