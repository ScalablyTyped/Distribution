package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeoutProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var buttonWidth: js.UndefOr[Double] = js.undefined
  
  var close: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var left: js.UndefOr[js.Array[SwipeoutAction]] = js.undefined
  
  var onClose: js.UndefOr[
    js.Function2[/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double], Unit]
  ] = js.undefined
  
  var onOpen: js.UndefOr[
    js.Function2[/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double], Unit]
  ] = js.undefined
  
  var right: js.UndefOr[js.Array[SwipeoutAction]] = js.undefined
  
  var rowID: js.UndefOr[Double] = js.undefined
  
  var scroll: js.UndefOr[js.Function1[/* value */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  var sectionID: js.UndefOr[Double] = js.undefined
  
  var sensitivity: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object SwipeoutProps {
  
  inline def apply(): SwipeoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeoutProps]
  }
  
  extension [Self <: SwipeoutProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setButtonWidth(value: Double): Self = StObject.set(x, "buttonWidth", value.asInstanceOf[js.Any])
    
    inline def setButtonWidthUndefined: Self = StObject.set(x, "buttonWidth", js.undefined)
    
    inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLeft(value: js.Array[SwipeoutAction]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLeftVarargs(value: SwipeoutAction*): Self = StObject.set(x, "left", js.Array(value :_*))
    
    inline def setOnClose(value: (/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnOpen(value: (/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setRight(value: js.Array[SwipeoutAction]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRightVarargs(value: SwipeoutAction*): Self = StObject.set(x, "right", js.Array(value :_*))
    
    inline def setRowID(value: Double): Self = StObject.set(x, "rowID", value.asInstanceOf[js.Any])
    
    inline def setRowIDUndefined: Self = StObject.set(x, "rowID", js.undefined)
    
    inline def setScroll(value: /* value */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction1(value))
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setSectionID(value: Double): Self = StObject.set(x, "sectionID", value.asInstanceOf[js.Any])
    
    inline def setSectionIDUndefined: Self = StObject.set(x, "sectionID", js.undefined)
    
    inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
