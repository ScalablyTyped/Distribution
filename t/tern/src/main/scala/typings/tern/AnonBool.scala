package typings.tern

import typings.tern.ternStrings.bool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBool extends js.Object {
  var name: bool
}

object AnonBool {
  @scala.inline
  def apply(name: bool): AnonBool = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBool]
  }
}

