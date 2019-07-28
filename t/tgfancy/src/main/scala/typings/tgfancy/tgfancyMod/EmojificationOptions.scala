package typings.tgfancy.tgfancyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmojificationOptions extends js.Object {
  def emojify(text: String): String
}

object EmojificationOptions {
  @scala.inline
  def apply(emojify: String => String): EmojificationOptions = {
    val __obj = js.Dynamic.literal(emojify = js.Any.fromFunction1(emojify))
  
    __obj.asInstanceOf[EmojificationOptions]
  }
}

