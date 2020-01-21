package typings.tern

import typings.tern.ternStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameString extends js.Object {
  var name: string
}

object AnonNameString {
  @scala.inline
  def apply(name: string): AnonNameString = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameString]
  }
}

