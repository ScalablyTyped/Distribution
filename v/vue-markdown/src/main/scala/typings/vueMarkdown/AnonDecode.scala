package typings.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecode extends js.Object {
  var decode: js.Any
  var encode: js.Any
  var format: js.Any
  var parse: js.Any
}

object AnonDecode {
  @scala.inline
  def apply(decode: js.Any, encode: js.Any, format: js.Any, parse: js.Any): AnonDecode = {
    val __obj = js.Dynamic.literal(decode = decode.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDecode]
  }
}

