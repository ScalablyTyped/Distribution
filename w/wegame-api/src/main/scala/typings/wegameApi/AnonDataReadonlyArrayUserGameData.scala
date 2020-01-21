package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataReadonlyArrayUserGameData extends js.Object {
  var data: js.Array[UserGameData]
}

object AnonDataReadonlyArrayUserGameData {
  @scala.inline
  def apply(data: js.Array[UserGameData]): AnonDataReadonlyArrayUserGameData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataReadonlyArrayUserGameData]
  }
}

