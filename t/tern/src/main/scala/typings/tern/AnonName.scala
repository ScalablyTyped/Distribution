package typings.tern

import typings.tern.ternStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: number
}

object AnonName {
  @scala.inline
  def apply(name: number): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

