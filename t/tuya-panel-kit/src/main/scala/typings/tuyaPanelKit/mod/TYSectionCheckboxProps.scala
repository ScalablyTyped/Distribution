package typings.tuyaPanelKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tuyaPanelKit.mod.CheckboxProps because var conflicts: accessibilityLabel, children, disabled, style. Inlined size, disabledColor, checked, checkedIcon, unCheckedIcon, reverse, hideOnUnselect, color, onChange */ @js.native
trait TYSectionCheckboxProps extends TYListItemProps {
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var checkedIcon: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var disabledColor: js.UndefOr[String] = js.native
  
  var hideOnUnselect: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var unCheckedIcon: js.UndefOr[String] = js.native
}
object TYSectionCheckboxProps {
  
  @scala.inline
  def apply(): TYSectionCheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TYSectionCheckboxProps]
  }
  
  @scala.inline
  implicit class TYSectionCheckboxPropsOps[Self <: TYSectionCheckboxProps] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setCheckedIcon(value: String): Self = this.set("checkedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedIcon: Self = this.set("checkedIcon", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDisabledColor(value: String): Self = this.set("disabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledColor: Self = this.set("disabledColor", js.undefined)
    
    @scala.inline
    def setHideOnUnselect(value: Boolean): Self = this.set("hideOnUnselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnUnselect: Self = this.set("hideOnUnselect", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* checked */ Boolean => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUnCheckedIcon(value: String): Self = this.set("unCheckedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnCheckedIcon: Self = this.set("unCheckedIcon", js.undefined)
  }
}
