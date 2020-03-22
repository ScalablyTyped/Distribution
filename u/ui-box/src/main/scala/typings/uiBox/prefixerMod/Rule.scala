package typings.uiBox.prefixerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var property: String
  var value: String
}

object Rule {
  @scala.inline
  def apply(property: String, value: String): Rule = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Rule]
  }
}

