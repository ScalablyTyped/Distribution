package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.wixStyleReact.anon.`8`
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonWithAsProp
import typings.wixStyleReact.distTypesCommonMod.IconElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingNotificationMod {
  
  @JSImport("wix-style-react/dist/types/FloatingNotification", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[FloatingNotificationProps, js.Object, Any]
  
  type FloatingNotification = PureComponent[FloatingNotificationProps, js.Object, Any]
  
  type FloatingNotificationButtonProps = ButtonWithAsProp[`8`]
  
  trait FloatingNotificationProps extends StObject {
    
    var buttonProps: js.UndefOr[FloatingNotificationButtonProps] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var prefixIcon: js.UndefOr[IconElement] = js.undefined
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var text: js.UndefOr[ReactNode] = js.undefined
    
    var textButtonProps: js.UndefOr[FloatingNotificationButtonProps] = js.undefined
    
    var `type`: js.UndefOr[FloatingNotificationType] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object FloatingNotificationProps {
    
    inline def apply(): FloatingNotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FloatingNotificationProps]
    }
    
    extension [Self <: FloatingNotificationProps](x: Self) {
      
      inline def setButtonProps(value: FloatingNotificationButtonProps): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      inline def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setOnClose(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPrefixIcon(value: IconElement): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
      
      inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextButtonProps(value: FloatingNotificationButtonProps): Self = StObject.set(x, "textButtonProps", value.asInstanceOf[js.Any])
      
      inline def setTextButtonPropsUndefined: Self = StObject.set(x, "textButtonProps", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: FloatingNotificationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.success
    - typings.wixStyleReact.wixStyleReactStrings.destructive
    - typings.wixStyleReact.wixStyleReactStrings.warning
    - typings.wixStyleReact.wixStyleReactStrings.premium
    - typings.wixStyleReact.wixStyleReactStrings.preview
    - typings.wixStyleReact.wixStyleReactStrings.dark
  */
  trait FloatingNotificationType extends StObject
  object FloatingNotificationType {
    
    inline def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def destructive: typings.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def preview: typings.wixStyleReact.wixStyleReactStrings.preview = "preview".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.preview]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typings.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.success]
    
    inline def warning: typings.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warning]
  }
}
