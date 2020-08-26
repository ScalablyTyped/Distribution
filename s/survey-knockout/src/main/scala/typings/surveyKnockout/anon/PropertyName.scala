package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyName extends js.Object {
  var propertyName: String = js.native
}

object PropertyName {
  @scala.inline
  def apply(propertyName: String): PropertyName = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyName]
  }
  @scala.inline
  implicit class PropertyNameOps[Self <: PropertyName] (val x: Self) extends AnyVal {
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
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
  }
  
}

