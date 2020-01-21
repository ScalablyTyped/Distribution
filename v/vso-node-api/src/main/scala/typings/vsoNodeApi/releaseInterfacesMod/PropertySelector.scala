package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertySelector extends js.Object {
  var properties: js.Array[String]
  var selectorType: PropertySelectorType
}

object PropertySelector {
  @scala.inline
  def apply(properties: js.Array[String], selectorType: PropertySelectorType): PropertySelector = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], selectorType = selectorType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropertySelector]
  }
}

