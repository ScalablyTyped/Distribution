package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageBoxMarketerialLayoutMod {
  
  @JSImport("wix-style-react/dist/es/src/MessageBox/MarketerialLayout/MessageBoxMarketerialLayout", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[MessageBoxMarketerialLayoutProps, js.Object, js.Any]
  
  type MessageBoxMarketerialLayout = PureComponent[MessageBoxMarketerialLayoutProps, js.Object, js.Any]
  
  trait MessageBoxMarketerialLayoutProps extends StObject {
    
    var content: ReactNode
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var footerBottomChildren: js.UndefOr[ReactNode] = js.undefined
    
    var imageComponent: js.UndefOr[ReactNode] = js.undefined
    
    var imageUrl: js.UndefOr[String] = js.undefined
    
    var noBodyPadding: js.UndefOr[Boolean] = js.undefined
    
    var onClose: MouseEventHandler[HTMLButtonElement]
    
    var onPrimaryButtonClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onSecondaryButtonClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var primaryButtonDisabled: js.UndefOr[Boolean] = js.undefined
    
    var primaryButtonLabel: js.UndefOr[String] = js.undefined
    
    var primaryButtonNode: js.UndefOr[ReactNode] = js.undefined
    
    var primaryButtonTheme: js.UndefOr[MessageBoxMarketerialLayoutThemePrimaryButtonTheme] = js.undefined
    
    var removeButtonsPadding: js.UndefOr[Boolean] = js.undefined
    
    var secondaryButtonLabel: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[MessageBoxMarketerialLayoutTheme] = js.undefined
    
    var title: ReactNode
    
    var width: js.UndefOr[String] = js.undefined
  }
  object MessageBoxMarketerialLayoutProps {
    
    inline def apply(onClose: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): MessageBoxMarketerialLayoutProps = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose))
      __obj.asInstanceOf[MessageBoxMarketerialLayoutProps]
    }
    
    extension [Self <: MessageBoxMarketerialLayoutProps](x: Self) {
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFooterBottomChildren(value: ReactNode): Self = StObject.set(x, "footerBottomChildren", value.asInstanceOf[js.Any])
      
      inline def setFooterBottomChildrenUndefined: Self = StObject.set(x, "footerBottomChildren", js.undefined)
      
      inline def setImageComponent(value: ReactNode): Self = StObject.set(x, "imageComponent", value.asInstanceOf[js.Any])
      
      inline def setImageComponentUndefined: Self = StObject.set(x, "imageComponent", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setNoBodyPadding(value: Boolean): Self = StObject.set(x, "noBodyPadding", value.asInstanceOf[js.Any])
      
      inline def setNoBodyPaddingUndefined: Self = StObject.set(x, "noBodyPadding", js.undefined)
      
      inline def setOnClose(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnPrimaryButtonClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onPrimaryButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnPrimaryButtonClickUndefined: Self = StObject.set(x, "onPrimaryButtonClick", js.undefined)
      
      inline def setOnSecondaryButtonClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSecondaryButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnSecondaryButtonClickUndefined: Self = StObject.set(x, "onSecondaryButtonClick", js.undefined)
      
      inline def setPrimaryButtonDisabled(value: Boolean): Self = StObject.set(x, "primaryButtonDisabled", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonDisabledUndefined: Self = StObject.set(x, "primaryButtonDisabled", js.undefined)
      
      inline def setPrimaryButtonLabel(value: String): Self = StObject.set(x, "primaryButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonLabelUndefined: Self = StObject.set(x, "primaryButtonLabel", js.undefined)
      
      inline def setPrimaryButtonNode(value: ReactNode): Self = StObject.set(x, "primaryButtonNode", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonNodeUndefined: Self = StObject.set(x, "primaryButtonNode", js.undefined)
      
      inline def setPrimaryButtonTheme(value: MessageBoxMarketerialLayoutThemePrimaryButtonTheme): Self = StObject.set(x, "primaryButtonTheme", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonThemeUndefined: Self = StObject.set(x, "primaryButtonTheme", js.undefined)
      
      inline def setRemoveButtonsPadding(value: Boolean): Self = StObject.set(x, "removeButtonsPadding", value.asInstanceOf[js.Any])
      
      inline def setRemoveButtonsPaddingUndefined: Self = StObject.set(x, "removeButtonsPadding", js.undefined)
      
      inline def setSecondaryButtonLabel(value: String): Self = StObject.set(x, "secondaryButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonLabelUndefined: Self = StObject.set(x, "secondaryButtonLabel", js.undefined)
      
      inline def setTheme(value: MessageBoxMarketerialLayoutTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.blue
    - typings.wixStyleReact.wixStyleReactStrings.purple
    - typings.wixStyleReact.wixStyleReactStrings.white
  */
  trait MessageBoxMarketerialLayoutTheme extends StObject
  object MessageBoxMarketerialLayoutTheme {
    
    inline def blue: typings.wixStyleReact.wixStyleReactStrings.blue = "blue".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.blue]
    
    inline def purple: typings.wixStyleReact.wixStyleReactStrings.purple = "purple".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.purple]
    
    inline def white: typings.wixStyleReact.wixStyleReactStrings.white = "white".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.white]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.blue
    - typings.wixStyleReact.wixStyleReactStrings.purple
  */
  trait MessageBoxMarketerialLayoutThemePrimaryButtonTheme extends StObject
  object MessageBoxMarketerialLayoutThemePrimaryButtonTheme {
    
    inline def blue: typings.wixStyleReact.wixStyleReactStrings.blue = "blue".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.blue]
    
    inline def purple: typings.wixStyleReact.wixStyleReactStrings.purple = "purple".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.purple]
  }
}
