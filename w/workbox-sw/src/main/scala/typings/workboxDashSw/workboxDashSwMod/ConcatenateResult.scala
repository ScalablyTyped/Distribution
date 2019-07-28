package typings.workboxDashSw.workboxDashSwMod

import typings.std.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatenateResult extends js.Object {
  var done: js.Promise[StreamSource]
  var stream: ReadableStream[_]
}

object ConcatenateResult {
  @scala.inline
  def apply(done: js.Promise[StreamSource], stream: ReadableStream[_]): ConcatenateResult = {
    val __obj = js.Dynamic.literal(done = done, stream = stream)
  
    __obj.asInstanceOf[ConcatenateResult]
  }
}

