package typings.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParse extends js.Object {
  var State: js.Any
  var parse: js.Any
  var ruler: AnonAfter
  var tokenize: js.Any
}

object AnonParse {
  @scala.inline
  def apply(State: js.Any, parse: js.Any, ruler: AnonAfter, tokenize: js.Any): AnonParse = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any], tokenize = tokenize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParse]
  }
}

