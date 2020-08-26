package typings.yandexMaps.anon

import typings.yandexMaps.mod.IClassConstructor
import typings.yandexMaps.mod.ISelectableControlLayout
import typings.yandexMaps.yandexMapsStrings.selectable
import typings.yandexMaps.yandexMapsStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  var layout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.native
  var selectOnClick: js.UndefOr[Boolean] = js.native
  var selectableLayout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.native
  var separatorLayout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.native
  var `type`: js.UndefOr[selectable | separator] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object Layout {
  @scala.inline
  def apply(): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
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
    def setLayout(value: String | IClassConstructor[ISelectableControlLayout]): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setSelectOnClick(value: Boolean): Self = this.set("selectOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectOnClick: Self = this.set("selectOnClick", js.undefined)
    @scala.inline
    def setSelectableLayout(value: String | IClassConstructor[ISelectableControlLayout]): Self = this.set("selectableLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectableLayout: Self = this.set("selectableLayout", js.undefined)
    @scala.inline
    def setSeparatorLayout(value: String | IClassConstructor[ISelectableControlLayout]): Self = this.set("separatorLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparatorLayout: Self = this.set("separatorLayout", js.undefined)
    @scala.inline
    def setType(value: selectable | separator): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

