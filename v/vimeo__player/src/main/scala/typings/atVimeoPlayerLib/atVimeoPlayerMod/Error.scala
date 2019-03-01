package typings
package atVimeoPlayerLib.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var message: java.lang.String
  var method: java.lang.String
  var name: java.lang.String
}

object Error {
  @scala.inline
  def apply(message: java.lang.String, method: java.lang.String, name: java.lang.String): Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Error]
  }
}

