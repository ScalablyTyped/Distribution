package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Process extends js.Object {
  var State: js.Any
  var process: js.Any
  var ruler: After
}

object Process {
  @scala.inline
  def apply(State: js.Any, process: js.Any, ruler: After): Process = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Process]
  }
}

