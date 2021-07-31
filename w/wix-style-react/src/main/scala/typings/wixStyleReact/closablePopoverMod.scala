package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closablePopoverMod {
  
  @JSImport("wix-style-react/dist/es/src/FloatingHelper/ClosablePopover", JSImport.Default)
  @js.native
  class default () extends ClosablePopover
  
  @js.native
  trait ClosablePopover
    extends PureComponent[ClosablePopoverProps, js.Object, js.Any] {
    
    def close(): Unit = js.native
    
    def open(): Unit = js.native
  }
  
  trait ClosablePopoverProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeOnMouseLeave: js.UndefOr[Boolean] = js.undefined
    
    var content: js.Function
    
    var initiallyOpened: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[js.Function] = js.undefined
    
    var onOpen: js.UndefOr[js.Function] = js.undefined
    
    var opened: js.UndefOr[Boolean] = js.undefined
    
    var target: ReactNode
  }
  object ClosablePopoverProps {
    
    @scala.inline
    def apply(content: js.Function): ClosablePopoverProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClosablePopoverProps]
    }
    
    @scala.inline
    implicit class ClosablePopoverPropsMutableBuilder[Self <: ClosablePopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseOnMouseLeave(value: Boolean): Self = StObject.set(x, "closeOnMouseLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnMouseLeaveUndefined: Self = StObject.set(x, "closeOnMouseLeave", js.undefined)
      
      @scala.inline
      def setContent(value: js.Function): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiallyOpened(value: Boolean): Self = StObject.set(x, "initiallyOpened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiallyOpenedUndefined: Self = StObject.set(x, "initiallyOpened", js.undefined)
      
      @scala.inline
      def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: js.Function): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
      
      @scala.inline
      def setTarget(value: ReactNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
