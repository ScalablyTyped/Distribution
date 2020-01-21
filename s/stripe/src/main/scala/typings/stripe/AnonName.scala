package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  /**
    * The name of the custom field. This may be up to 30 characters.
    */
  var name: String
  /**
    * The value of the custom field. This may be up to 30 characters.
    */
  var value: String
}

object AnonName {
  @scala.inline
  def apply(name: String, value: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

