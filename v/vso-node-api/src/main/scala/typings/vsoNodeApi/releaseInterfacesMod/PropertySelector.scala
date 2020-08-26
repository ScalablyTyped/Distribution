package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertySelector extends js.Object {
  var properties: js.Array[String] = js.native
  var selectorType: PropertySelectorType = js.native
}

object PropertySelector {
  @scala.inline
  def apply(properties: js.Array[String], selectorType: PropertySelectorType): PropertySelector = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], selectorType = selectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertySelector]
  }
  @scala.inline
  implicit class PropertySelectorOps[Self <: PropertySelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorType(value: PropertySelectorType): Self = this.set("selectorType", value.asInstanceOf[js.Any])
  }
  
}

