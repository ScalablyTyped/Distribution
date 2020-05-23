package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parse extends js.Object {
  var State: js.Any
  var parse: js.Any
  var ruler: After
  var tokenize: js.Any
}

object Parse {
  @scala.inline
  def apply(State: js.Any, parse: js.Any, ruler: After, tokenize: js.Any): Parse = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any], tokenize = tokenize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parse]
  }
}

