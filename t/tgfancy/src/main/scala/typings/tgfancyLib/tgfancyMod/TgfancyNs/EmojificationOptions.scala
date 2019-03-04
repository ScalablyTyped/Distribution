package typings
package tgfancyLib.tgfancyMod.TgfancyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmojificationOptions extends js.Object {
  def emojify(text: java.lang.String): java.lang.String
}

object EmojificationOptions {
  @scala.inline
  def apply(emojify: js.Function1[java.lang.String, java.lang.String]): EmojificationOptions = {
    val __obj = js.Dynamic.literal(emojify = emojify)
  
    __obj.asInstanceOf[EmojificationOptions]
  }
}

