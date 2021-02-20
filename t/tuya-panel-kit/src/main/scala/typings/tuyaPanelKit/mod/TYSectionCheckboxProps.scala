package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
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
  implicit class TYSectionCheckboxPropsMutableBuilder[Self <: TYSectionCheckboxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedIcon(value: String): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabledColor(value: String): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledColorUndefined: Self = StObject.set(x, "disabledColor", js.undefined)
    
    @scala.inline
    def setHideOnUnselect(value: Boolean): Self = StObject.set(x, "hideOnUnselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOnUnselectUndefined: Self = StObject.set(x, "hideOnUnselect", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* checked */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUnCheckedIcon(value: String): Self = StObject.set(x, "unCheckedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnCheckedIconUndefined: Self = StObject.set(x, "unCheckedIcon", js.undefined)
  }
}
