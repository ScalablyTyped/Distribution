package typings.yandexMaps.anon

import typings.yandexMaps.mod.IClassConstructor
import typings.yandexMaps.mod.ISelectableControlLayout
import typings.yandexMaps.yandexMapsStrings.left
import typings.yandexMaps.yandexMapsStrings.none
import typings.yandexMaps.yandexMapsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined yandex-maps.yandex-maps.control.IBaseButtonParametersOptions & {  collapseOnBlur :boolean | undefined,   expandOnClick :boolean | undefined,   popupFloat :'left' | 'right' | undefined} */
@js.native
trait IBaseButtonParametersOptiAdjustMapMargin extends js.Object {
  
  var adjustMapMargin: js.UndefOr[Boolean] = js.native
  
  var collapseOnBlur: js.UndefOr[Boolean] = js.native
  
  var expandOnClick: js.UndefOr[Boolean] = js.native
  
  var float: js.UndefOr[none | left | right] = js.native
  
  var floatIndex: js.UndefOr[Double] = js.native
  
  var layout: js.UndefOr[IClassConstructor[ISelectableControlLayout] | String] = js.native
  
  var maxWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  
  var popupFloat: js.UndefOr[left | right] = js.native
  
  var position: js.UndefOr[Bottom] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object IBaseButtonParametersOptiAdjustMapMargin {
  
  @scala.inline
  def apply(): IBaseButtonParametersOptiAdjustMapMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseButtonParametersOptiAdjustMapMargin]
  }
  
  @scala.inline
  implicit class IBaseButtonParametersOptiAdjustMapMarginOps[Self <: IBaseButtonParametersOptiAdjustMapMargin] (val x: Self) extends AnyVal {
    
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
    def setAdjustMapMargin(value: Boolean): Self = this.set("adjustMapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustMapMargin: Self = this.set("adjustMapMargin", js.undefined)
    
    @scala.inline
    def setCollapseOnBlur(value: Boolean): Self = this.set("collapseOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseOnBlur: Self = this.set("collapseOnBlur", js.undefined)
    
    @scala.inline
    def setExpandOnClick(value: Boolean): Self = this.set("expandOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandOnClick: Self = this.set("expandOnClick", js.undefined)
    
    @scala.inline
    def setFloat(value: none | left | right): Self = this.set("float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    
    @scala.inline
    def setFloatIndex(value: Double): Self = this.set("floatIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatIndex: Self = this.set("floatIndex", js.undefined)
    
    @scala.inline
    def setLayout(value: IClassConstructor[ISelectableControlLayout] | String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMaxWidthVarargs(value: (js.Array[Double] | Double)*): Self = this.set("maxWidth", js.Array(value :_*))
    
    @scala.inline
    def setMaxWidth(value: (js.Array[js.Array[Double] | Double]) | Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setPopupFloat(value: left | right): Self = this.set("popupFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupFloat: Self = this.set("popupFloat", js.undefined)
    
    @scala.inline
    def setPosition(value: Bottom): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
