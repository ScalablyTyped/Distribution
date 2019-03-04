package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConcatenateResult extends js.Object {
  var done: js.Promise[workboxDashSwLib.StreamSource]
  var stream: stdLib.ReadableStream[_]
}

object IConcatenateResult {
  @scala.inline
  def apply(done: js.Promise[workboxDashSwLib.StreamSource], stream: stdLib.ReadableStream[_]): IConcatenateResult = {
    val __obj = js.Dynamic.literal(done = done, stream = stream)
  
    __obj.asInstanceOf[IConcatenateResult]
  }
}

