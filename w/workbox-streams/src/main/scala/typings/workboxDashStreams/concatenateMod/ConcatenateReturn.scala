package typings.workboxDashStreams.concatenateMod

import typings.std.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatenateReturn extends js.Object {
  var done: js.Promise[Unit]
  var stream: ReadableStream[_]
}

object ConcatenateReturn {
  @scala.inline
  def apply(done: js.Promise[Unit], stream: ReadableStream[_]): ConcatenateReturn = {
    val __obj = js.Dynamic.literal(done = done, stream = stream)
  
    __obj.asInstanceOf[ConcatenateReturn]
  }
}

