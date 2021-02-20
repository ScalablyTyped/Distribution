package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeoutProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var autoClose: js.UndefOr[Boolean] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var buttonWidth: js.UndefOr[Double] = js.native
  
  var close: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var left: js.UndefOr[js.Array[SwipeoutAction]] = js.native
  
  var onClose: js.UndefOr[
    js.Function2[/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double], Unit]
  ] = js.native
  
  var onOpen: js.UndefOr[
    js.Function2[/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double], Unit]
  ] = js.native
  
  var right: js.UndefOr[js.Array[SwipeoutAction]] = js.native
  
  var rowID: js.UndefOr[Double] = js.native
  
  var scroll: js.UndefOr[js.Function1[/* value */ js.UndefOr[Boolean], Unit]] = js.native
  
  var sectionID: js.UndefOr[Double] = js.native
  
  var sensitivity: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object SwipeoutProps {
  
  @scala.inline
  def apply(): SwipeoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeoutProps]
  }
  
  @scala.inline
  implicit class SwipeoutPropsMutableBuilder[Self <: SwipeoutProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setButtonWidth(value: Double): Self = StObject.set(x, "buttonWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonWidthUndefined: Self = StObject.set(x, "buttonWidth", js.undefined)
    
    @scala.inline
    def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLeft(value: js.Array[SwipeoutAction]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLeftVarargs(value: SwipeoutAction*): Self = StObject.set(x, "left", js.Array(value :_*))
    
    @scala.inline
    def setOnClose(value: (/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: (/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    @scala.inline
    def setRight(value: js.Array[SwipeoutAction]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setRightVarargs(value: SwipeoutAction*): Self = StObject.set(x, "right", js.Array(value :_*))
    
    @scala.inline
    def setRowID(value: Double): Self = StObject.set(x, "rowID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIDUndefined: Self = StObject.set(x, "rowID", js.undefined)
    
    @scala.inline
    def setScroll(value: /* value */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    @scala.inline
    def setSectionID(value: Double): Self = StObject.set(x, "sectionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIDUndefined: Self = StObject.set(x, "sectionID", js.undefined)
    
    @scala.inline
    def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
