package typings
package tgfancyLib.tgfancyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmojificationOptions extends js.Object {
  def emojify(text: java.lang.String): java.lang.String
}

object EmojificationOptions {
  @scala.inline
  def apply(emojify: java.lang.String => java.lang.String): EmojificationOptions = {
    val __obj = js.Dynamic.literal(emojify = js.Any.fromFunction1(emojify))
  
    __obj.asInstanceOf[EmojificationOptions]
  }
}

