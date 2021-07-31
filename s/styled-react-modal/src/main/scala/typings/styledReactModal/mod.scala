package typings.styledReactModal

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.TemplateStringsArray
import typings.styledComponents.styledComponentsMod.AnyStyledComponent
import typings.styledComponents.styledComponentsMod.CSSObject
import typings.styledComponents.styledComponentsMod.InterpolationFunction
import typings.styledComponents.styledComponentsMod.StyledComponent
import typings.styledReactModal.styledReactModalStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("styled-react-modal", JSImport.Default)
  @js.native
  class default ()
    extends Component[ModalProps, js.Object, js.Any]
  object default {
    
    @JSImport("styled-react-modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def styled(`object`: CSSObject): StyledComponent[ComponentClass[ModalProps, ComponentState], js.Any, js.Object, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("styled")(`object`.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[ComponentClass[ModalProps, ComponentState], js.Any, js.Object, scala.Nothing]]
    @scala.inline
    def styled(`object`: InterpolationFunction[js.Any]): StyledComponent[ComponentClass[ModalProps, ComponentState], js.Any, js.Object, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("styled")(`object`.asInstanceOf[js.Any]).asInstanceOf[StyledComponent[ComponentClass[ModalProps, ComponentState], js.Any, js.Object, scala.Nothing]]
    /* static member */
    @scala.inline
    def styled(strings: TemplateStringsArray, interpolations: js.Any*): StyledComponent[ComponentClass[ModalProps, ComponentState], js.Any, js.Object, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(strings.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[StyledComponent[ComponentClass[ModalProps, ComponentState], js.Any, js.Object, scala.Nothing]]
  }
  
  @JSImport("styled-react-modal", "BaseModalBackground")
  @js.native
  val BaseModalBackground: StyledComponent[div, js.Any, js.Object, scala.Nothing] = js.native
  
  @JSImport("styled-react-modal", "ModalProvider")
  @js.native
  class ModalProvider protected ()
    extends Component[ModalProviderProps, js.Object, js.Any] {
    def this(props: ModalProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalProviderProps, context: js.Any) = this()
  }
  
  type Modal = Component[ModalProps, js.Object, js.Any]
  
  trait ModalProps extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var allowScroll: js.UndefOr[Boolean] = js.undefined
    
    var backgroundProps: js.UndefOr[js.Object] = js.undefined
    
    var beforeClose: js.UndefOr[js.Promise[Unit] | js.Function0[Unit]] = js.undefined
    
    var beforeOpen: js.UndefOr[js.Promise[Unit] | js.Function0[Unit]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var isOpen: Boolean
    
    var onBackgroundClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
    
    var onEscapeKeydown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  }
  object ModalProps {
    
    @scala.inline
    def apply(isOpen: Boolean): ModalProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      @scala.inline
      def setAfterOpen(value: () => Unit): Self = StObject.set(x, "afterOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      @scala.inline
      def setAllowScroll(value: Boolean): Self = StObject.set(x, "allowScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowScrollUndefined: Self = StObject.set(x, "allowScroll", js.undefined)
      
      @scala.inline
      def setBackgroundProps(value: js.Object): Self = StObject.set(x, "backgroundProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundPropsUndefined: Self = StObject.set(x, "backgroundProps", js.undefined)
      
      @scala.inline
      def setBeforeClose(value: js.Promise[Unit] | js.Function0[Unit]): Self = StObject.set(x, "beforeClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCloseFunction0(value: () => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      @scala.inline
      def setBeforeOpen(value: js.Promise[Unit] | js.Function0[Unit]): Self = StObject.set(x, "beforeOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeOpenFunction0(value: () => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBackgroundClick(value: /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onBackgroundClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBackgroundClickUndefined: Self = StObject.set(x, "onBackgroundClick", js.undefined)
      
      @scala.inline
      def setOnEscapeKeydown(value: /* event */ Event => Unit): Self = StObject.set(x, "onEscapeKeydown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscapeKeydownUndefined: Self = StObject.set(x, "onEscapeKeydown", js.undefined)
    }
  }
  
  trait ModalProviderProps extends StObject {
    
    var backgroundComponent: js.UndefOr[AnyStyledComponent] = js.undefined
    
    var children: ReactNode
  }
  object ModalProviderProps {
    
    @scala.inline
    def apply(): ModalProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProviderProps]
    }
    
    @scala.inline
    implicit class ModalProviderPropsMutableBuilder[Self <: ModalProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundComponent(value: AnyStyledComponent): Self = StObject.set(x, "backgroundComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundComponentUndefined: Self = StObject.set(x, "backgroundComponent", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
