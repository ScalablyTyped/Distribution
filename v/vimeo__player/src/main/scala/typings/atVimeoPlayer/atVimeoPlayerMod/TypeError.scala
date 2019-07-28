package typings.atVimeoPlayer.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeError extends Error {
  @JSName("name")
  var name_TypeError: typings.atVimeoPlayer.atVimeoPlayerStrings.TypeError
}

object TypeError {
  @scala.inline
  def apply(message: String, method: String, name: typings.atVimeoPlayer.atVimeoPlayerStrings.TypeError): TypeError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[TypeError]
  }
}

