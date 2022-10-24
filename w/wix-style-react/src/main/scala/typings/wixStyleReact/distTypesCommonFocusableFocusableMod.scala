package typings.wixStyleReact

import typings.react.mod.ComponentType
import typings.std.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonFocusableFocusableMod {
  
  @JSImport("wix-style-react/dist/types/common/Focusable/Focusable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withFocusable[T](Component: ComponentType[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withFocusable")(Component.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def withFocusable[T](Component: ComponentType[T], options: FocusableOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("withFocusable")(Component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait FocusableOptions extends StObject {
    
    var isFocusWithMouse: js.UndefOr[Boolean] = js.undefined
  }
  object FocusableOptions {
    
    inline def apply(): FocusableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusableOptions]
    }
    
    extension [Self <: FocusableOptions](x: Self) {
      
      inline def setIsFocusWithMouse(value: Boolean): Self = StObject.set(x, "isFocusWithMouse", value.asInstanceOf[js.Any])
      
      inline def setIsFocusWithMouseUndefined: Self = StObject.set(x, "isFocusWithMouse", js.undefined)
    }
  }
  
  trait Triggers extends StObject {
    
    def blur(): Unit
    
    def focus(): Unit
  }
  object Triggers {
    
    inline def apply(blur: () => Unit, focus: () => Unit): Triggers = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[Triggers]
    }
    
    extension [Self <: Triggers](x: Self) {
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  trait WithFocusableProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[js.Function2[/* event */ FocusEvent, /* triggers */ Triggers, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function2[/* event */ FocusEvent, /* triggers */ Triggers, Unit]] = js.undefined
  }
  object WithFocusableProps {
    
    inline def apply(): WithFocusableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithFocusableProps]
    }
    
    extension [Self <: WithFocusableProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnBlur(value: (/* event */ FocusEvent, /* triggers */ Triggers) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: (/* event */ FocusEvent, /* triggers */ Triggers) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
}
