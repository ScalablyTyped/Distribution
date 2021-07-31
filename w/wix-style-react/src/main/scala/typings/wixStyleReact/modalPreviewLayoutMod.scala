package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalPreviewLayoutMod {
  
  @JSImport("wix-style-react/dist/es/src/ModalPreviewLayout", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[ModalPreviewLayoutProps, js.Object, js.Any]
  
  type ModalPreviewLayout = PureComponent[ModalPreviewLayoutProps, js.Object, js.Any]
  
  trait ModalPreviewLayoutProps extends StObject {
    
    var actions: js.UndefOr[ReactNode] = js.undefined
    
    var children: ReactNode
    
    var closeButtonTooltipText: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var nextButtonProps: js.UndefOr[NextButtonProps] = js.undefined
    
    var nextButtonTooltipText: js.UndefOr[String] = js.undefined
    
    def onClose(): Unit
    
    var prevButtonProps: js.UndefOr[PrevButtonProps] = js.undefined
    
    var prevButtonTooltipText: js.UndefOr[String] = js.undefined
    
    var shouldCloseOnOverlayClick: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ModalPreviewLayoutProps {
    
    @scala.inline
    def apply(onClose: () => Unit): ModalPreviewLayoutProps = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose))
      __obj.asInstanceOf[ModalPreviewLayoutProps]
    }
    
    @scala.inline
    implicit class ModalPreviewLayoutPropsMutableBuilder[Self <: ModalPreviewLayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: ReactNode): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCloseButtonTooltipText(value: String): Self = StObject.set(x, "closeButtonTooltipText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonTooltipTextUndefined: Self = StObject.set(x, "closeButtonTooltipText", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setNextButtonProps(value: NextButtonProps): Self = StObject.set(x, "nextButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextButtonPropsUndefined: Self = StObject.set(x, "nextButtonProps", js.undefined)
      
      @scala.inline
      def setNextButtonTooltipText(value: String): Self = StObject.set(x, "nextButtonTooltipText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextButtonTooltipTextUndefined: Self = StObject.set(x, "nextButtonTooltipText", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrevButtonProps(value: PrevButtonProps): Self = StObject.set(x, "prevButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevButtonPropsUndefined: Self = StObject.set(x, "prevButtonProps", js.undefined)
      
      @scala.inline
      def setPrevButtonTooltipText(value: String): Self = StObject.set(x, "prevButtonTooltipText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevButtonTooltipTextUndefined: Self = StObject.set(x, "prevButtonTooltipText", js.undefined)
      
      @scala.inline
      def setShouldCloseOnOverlayClick(value: Boolean): Self = StObject.set(x, "shouldCloseOnOverlayClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldCloseOnOverlayClickUndefined: Self = StObject.set(x, "shouldCloseOnOverlayClick", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait NextButtonProps extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* childIndexDisplayed */ Double, js.Object]] = js.undefined
    
    var tooltipText: js.UndefOr[ReactNode] = js.undefined
  }
  object NextButtonProps {
    
    @scala.inline
    def apply(): NextButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextButtonProps]
    }
    
    @scala.inline
    implicit class NextButtonPropsMutableBuilder[Self <: NextButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: /* childIndexDisplayed */ Double => js.Object): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setTooltipText(value: ReactNode): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTextUndefined: Self = StObject.set(x, "tooltipText", js.undefined)
    }
  }
  
  trait PrevButtonProps extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* childIndexDisplayed */ Double, js.Object]] = js.undefined
    
    var tooltipText: js.UndefOr[ReactNode] = js.undefined
  }
  object PrevButtonProps {
    
    @scala.inline
    def apply(): PrevButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrevButtonProps]
    }
    
    @scala.inline
    implicit class PrevButtonPropsMutableBuilder[Self <: PrevButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: /* childIndexDisplayed */ Double => js.Object): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setTooltipText(value: ReactNode): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTextUndefined: Self = StObject.set(x, "tooltipText", js.undefined)
    }
  }
}
