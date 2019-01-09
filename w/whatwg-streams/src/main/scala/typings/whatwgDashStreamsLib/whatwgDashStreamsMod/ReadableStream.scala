package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-streams", "ReadableStream")
@js.native
class ReadableStream[R] () extends js.Object {
  def this(underlyingSource: ReadableByteStreamSource) = this()
  def this(underlyingSource: ReadableStreamSource[R]) = this()
  def this(underlyingSource: ReadableByteStreamSource, strategy: QueuingStrategy[R]) = this()
  def this(underlyingSource: ReadableStreamSource[R], strategy: QueuingStrategy[R]) = this()
  val locked: scala.Boolean = js.native
  def cancel(reason: js.Any): js.Promise[scala.Unit] = js.native
  def getReader(): ReadableStreamDefaultReader[R] = js.native
  def getReader(hasMode: whatwgDashStreamsLib.Anon_Byob): ReadableStreamBYOBReader[R] = js.native
  def pipeThrough[T /* <: ReadableStream[_] */](hasWritableReadable: WritableReadablePair[WritableStream[R], T]): T = js.native
  def pipeThrough[T /* <: ReadableStream[_] */](hasWritableReadable: WritableReadablePair[WritableStream[R], T], options: PipeOptions): T = js.native
  def pipeTo(dest: WritableStream[R]): js.Promise[scala.Unit] = js.native
  def pipeTo(dest: WritableStream[R], options: PipeOptions): js.Promise[scala.Unit] = js.native
  def tee(): js.Tuple2[ReadableStream[R], ReadableStream[R]] = js.native
}

