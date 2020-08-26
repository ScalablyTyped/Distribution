package typings.vegaTypings.bindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseBinding extends js.Object {
  var debounce: js.UndefOr[Double] = js.native
  var element: js.UndefOr[Element] = js.native
  var name: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object BaseBinding {
  @scala.inline
  def apply(): BaseBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseBinding]
  }
  @scala.inline
  implicit class BaseBindingOps[Self <: BaseBinding] (val x: Self) extends AnyVal {
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
    def setDebounce(value: Double): Self = this.set("debounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebounce: Self = this.set("debounce", js.undefined)
    @scala.inline
    def setElement(value: Element): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

