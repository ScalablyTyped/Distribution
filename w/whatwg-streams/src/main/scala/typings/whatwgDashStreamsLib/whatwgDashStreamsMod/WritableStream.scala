package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "WritableStream")
@js.native
class WritableStream[W] () extends js.Object {
  def this(underlyingSink: WritableStreamSink[W]) = this()
  def this(underlyingSink: WritableStreamSink[W], strategy: QueuingStrategy[W]) = this()
  val locked: scala.Boolean = js.native
  def abort(reason: js.Any): stdLib.Promise[scala.Unit] = js.native
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
}

