package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisSelectProperties extends js.Object {
  var items: js.Array[Double] = js.native
}

object VisSelectProperties {
  @scala.inline
  def apply(items: js.Array[Double]): VisSelectProperties = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisSelectProperties]
  }
  @scala.inline
  implicit class VisSelectPropertiesOps[Self <: VisSelectProperties] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Double*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Double]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}

