package typings
package atVimeoPlayerLib.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidCuePoint extends Error {
  @JSName("name")
  var name_InvalidCuePoint: atVimeoPlayerLib.atVimeoPlayerLibStrings.InvalidCuePoint
}

object InvalidCuePoint {
  @scala.inline
  def apply(
    message: java.lang.String,
    method: java.lang.String,
    name: atVimeoPlayerLib.atVimeoPlayerLibStrings.InvalidCuePoint
  ): InvalidCuePoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[InvalidCuePoint]
  }
}

