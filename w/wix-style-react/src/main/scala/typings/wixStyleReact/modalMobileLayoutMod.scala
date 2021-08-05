package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMobileLayoutMod {
  
  @JSImport("wix-style-react/dist/es/src/ModalMobileLayout", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[ModalMobileLayoutProps, js.Object, js.Any]
  
  type ModalMobileLayout = PureComponent[ModalMobileLayoutProps, js.Object, js.Any]
  
  trait ModalMobileLayoutProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var fullscreen: js.UndefOr[Boolean] = js.undefined
    
    var onCloseButtonClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onOverlayClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stickyFooter: js.UndefOr[Boolean] = js.undefined
    
    var stickyTitle: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object ModalMobileLayoutProps {
    
    inline def apply(): ModalMobileLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalMobileLayoutProps]
    }
    
    extension [Self <: ModalMobileLayoutProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setOnCloseButtonClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
      
      inline def setOnOverlayClick(value: () => Unit): Self = StObject.set(x, "onOverlayClick", js.Any.fromFunction0(value))
      
      inline def setOnOverlayClickUndefined: Self = StObject.set(x, "onOverlayClick", js.undefined)
      
      inline def setStickyFooter(value: Boolean): Self = StObject.set(x, "stickyFooter", value.asInstanceOf[js.Any])
      
      inline def setStickyFooterUndefined: Self = StObject.set(x, "stickyFooter", js.undefined)
      
      inline def setStickyTitle(value: Boolean): Self = StObject.set(x, "stickyTitle", value.asInstanceOf[js.Any])
      
      inline def setStickyTitleUndefined: Self = StObject.set(x, "stickyTitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
