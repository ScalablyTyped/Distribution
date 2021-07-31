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
    
    @scala.inline
    def apply(): ModalMobileLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalMobileLayoutProps]
    }
    
    @scala.inline
    implicit class ModalMobileLayoutPropsMutableBuilder[Self <: ModalMobileLayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      @scala.inline
      def setOnCloseButtonClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
      
      @scala.inline
      def setOnOverlayClick(value: () => Unit): Self = StObject.set(x, "onOverlayClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOverlayClickUndefined: Self = StObject.set(x, "onOverlayClick", js.undefined)
      
      @scala.inline
      def setStickyFooter(value: Boolean): Self = StObject.set(x, "stickyFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyFooterUndefined: Self = StObject.set(x, "stickyFooter", js.undefined)
      
      @scala.inline
      def setStickyTitle(value: Boolean): Self = StObject.set(x, "stickyTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyTitleUndefined: Self = StObject.set(x, "stickyTitle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
