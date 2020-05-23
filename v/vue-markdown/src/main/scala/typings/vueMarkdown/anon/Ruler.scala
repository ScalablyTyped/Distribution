package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ruler extends js.Object {
  var State: js.Any
  var parse: js.Any
  var ruler: After
  var ruler2: After
  var skipToken: js.Any
  var tokenize: js.Any
}

object Ruler {
  @scala.inline
  def apply(State: js.Any, parse: js.Any, ruler: After, ruler2: After, skipToken: js.Any, tokenize: js.Any): Ruler = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any], ruler2 = ruler2.asInstanceOf[js.Any], skipToken = skipToken.asInstanceOf[js.Any], tokenize = tokenize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruler]
  }
}

