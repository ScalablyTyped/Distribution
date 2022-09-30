package typings.styledReactModal

import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("styled-react-modal", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ModalProps, js.Object, Any]
  object default {
    
    @JSImport("styled-react-modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def styled(
      `object`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InterpolationFunction<any> */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("styled")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
    /* static member */
    inline def styled(strings: TemplateStringsArray, interpolations: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("styled")(scala.List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  }
  
  @JSImport("styled-react-modal", "BaseModalBackground")
  @js.native
  val BaseModalBackground: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StyledComponent<'div', any> */ Any = js.native
  
  @JSImport("styled-react-modal", "ModalProvider")
  @js.native
  open class ModalProvider protected ()
    extends Component[ModalProviderProps, js.Object, Any] {
    def this(props: ModalProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalProviderProps, context: Any) = this()
  }
  
  type Modal = Component[ModalProps, js.Object, Any]
  
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
    
    inline def apply(isOpen: Boolean): ModalProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setAfterOpen(value: () => Unit): Self = StObject.set(x, "afterOpen", js.Any.fromFunction0(value))
      
      inline def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      inline def setAllowScroll(value: Boolean): Self = StObject.set(x, "allowScroll", value.asInstanceOf[js.Any])
      
      inline def setAllowScrollUndefined: Self = StObject.set(x, "allowScroll", js.undefined)
      
      inline def setBackgroundProps(value: js.Object): Self = StObject.set(x, "backgroundProps", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPropsUndefined: Self = StObject.set(x, "backgroundProps", js.undefined)
      
      inline def setBeforeClose(value: js.Promise[Unit] | js.Function0[Unit]): Self = StObject.set(x, "beforeClose", value.asInstanceOf[js.Any])
      
      inline def setBeforeCloseFunction0(value: () => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction0(value))
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBeforeOpen(value: js.Promise[Unit] | js.Function0[Unit]): Self = StObject.set(x, "beforeOpen", value.asInstanceOf[js.Any])
      
      inline def setBeforeOpenFunction0(value: () => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction0(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setOnBackgroundClick(value: /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onBackgroundClick", js.Any.fromFunction1(value))
      
      inline def setOnBackgroundClickUndefined: Self = StObject.set(x, "onBackgroundClick", js.undefined)
      
      inline def setOnEscapeKeydown(value: /* event */ Event => Unit): Self = StObject.set(x, "onEscapeKeydown", js.Any.fromFunction1(value))
      
      inline def setOnEscapeKeydownUndefined: Self = StObject.set(x, "onEscapeKeydown", js.undefined)
    }
  }
  
  trait ModalProviderProps extends StObject {
    
    var backgroundComponent: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyStyledComponent */ Any
      ] = js.undefined
    
    var children: ReactNode
  }
  object ModalProviderProps {
    
    inline def apply(): ModalProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProviderProps]
    }
    
    extension [Self <: ModalProviderProps](x: Self) {
      
      inline def setBackgroundComponent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyStyledComponent */ Any
      ): Self = StObject.set(x, "backgroundComponent", value.asInstanceOf[js.Any])
      
      inline def setBackgroundComponentUndefined: Self = StObject.set(x, "backgroundComponent", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
