package typings.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultValueContainer extends js.Object {
  var defaultValue: String
}

object DefaultValueContainer {
  @scala.inline
  def apply(defaultValue: String): DefaultValueContainer = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultValueContainer]
  }
}

