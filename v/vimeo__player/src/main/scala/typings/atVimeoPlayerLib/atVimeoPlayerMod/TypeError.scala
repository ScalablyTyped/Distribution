package typings
package atVimeoPlayerLib.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeError extends Error {
  @JSName("name")
  var name_TypeError: atVimeoPlayerLib.atVimeoPlayerLibStrings.TypeError
}

object TypeError {
  @scala.inline
  def apply(
    message: java.lang.String,
    method: java.lang.String,
    name: atVimeoPlayerLib.atVimeoPlayerLibStrings.TypeError
  ): TypeError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[TypeError]
  }
}

