package typings.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParseRuler extends js.Object {
  var State: js.Any
  var parse: js.Any
  var ruler: AnonAfter
  var ruler2: AnonAfter
  var skipToken: js.Any
  var tokenize: js.Any
}

object AnonParseRuler {
  @scala.inline
  def apply(
    State: js.Any,
    parse: js.Any,
    ruler: AnonAfter,
    ruler2: AnonAfter,
    skipToken: js.Any,
    tokenize: js.Any
  ): AnonParseRuler = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any], ruler2 = ruler2.asInstanceOf[js.Any], skipToken = skipToken.asInstanceOf[js.Any], tokenize = tokenize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParseRuler]
  }
}

