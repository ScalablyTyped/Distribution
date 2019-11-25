package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classifications extends js.Object {
  var endOfLineState: EndOfLineState
  var spans: js.Array[Double]
}

object Classifications {
  @scala.inline
  def apply(endOfLineState: EndOfLineState, spans: js.Array[Double]): Classifications = {
    val __obj = js.Dynamic.literal(endOfLineState = endOfLineState.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Classifications]
  }
}

