package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerLayoutMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/MessageBox/FunctionalLayout/HeaderLayout", JSImport.Default)
  @js.native
  val default: SFC[HeaderLayoutProps] = js.native
  
  trait HeaderLayoutProps extends StObject {
    
    var closeButton: js.UndefOr[Boolean] = js.undefined
    
    var onCancel: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var theme: js.UndefOr[HeaderLayoutTheme] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object HeaderLayoutProps {
    
    inline def apply(): HeaderLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderLayoutProps]
    }
    
    extension [Self <: HeaderLayoutProps](x: Self) {
      
      inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      inline def setOnCancel(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setTheme(value: HeaderLayoutTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.red
    - typings.wixStyleReact.wixStyleReactStrings.blue
    - typings.wixStyleReact.wixStyleReactStrings.purple
  */
  trait HeaderLayoutTheme extends StObject
  object HeaderLayoutTheme {
    
    inline def blue: typings.wixStyleReact.wixStyleReactStrings.blue = "blue".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.blue]
    
    inline def purple: typings.wixStyleReact.wixStyleReactStrings.purple = "purple".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.purple]
    
    inline def red: typings.wixStyleReact.wixStyleReactStrings.red = "red".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.red]
  }
  
  type _To = SFC[HeaderLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `headerLayoutMod.foo` */
  override def _to: SFC[HeaderLayoutProps] = default
}
