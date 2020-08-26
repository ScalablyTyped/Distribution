package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertiesDirection extends js.Object {
  var properties: Direction = js.native
  var value: js.Array[_] = js.native
}

object PropertiesDirection {
  @scala.inline
  def apply(properties: Direction, value: js.Array[_]): PropertiesDirection = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesDirection]
  }
  @scala.inline
  implicit class PropertiesDirectionOps[Self <: PropertiesDirection] (val x: Self) extends AnyVal {
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
    def setProperties(value: Direction): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

