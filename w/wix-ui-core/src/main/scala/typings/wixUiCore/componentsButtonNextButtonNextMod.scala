package typings.wixUiCore

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.RefObject
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.wixUiCore.anon.TypeofButtonNextComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsButtonNextButtonNextMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-ui-core/dist/standalone/src/components/button-next/button-next", "ButtonNext")
  @js.native
  class ButtonNext () extends ButtonNextComponent
  @JSImport("wix-ui-core/dist/standalone/src/components/button-next/button-next", "ButtonNext")
  @js.native
  val ButtonNext: TypeofButtonNextComponent & Instantiable0[ButtonNextComponent] = js.native
  
  /**
    * ButtonNext
    */
  @js.native
  trait ButtonNextComponent
    extends Component[ButtonProps, js.Object, js.Any] {
    
    def focus(): Unit = js.native
    
    var innerComponentRef: RefObject[HTMLElement | ComponentType[js.Object]] = js.native
  }
  
  trait ButtonProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement] {
    
    /** an element type to render as (string or function).  */
    var as: js.UndefOr[String | ComponentType[js.Any]] = js.undefined
    
    /** class name to be added to the content span */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /** React ref to be attached to the content span */
    var contentRef: js.UndefOr[RefObject[HTMLSpanElement]] = js.undefined
    
    var focusableOnBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var focusableOnFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** URL of the page that link goes to */
    var href: js.UndefOr[String] = js.undefined
    
    /** accepts prefix icon */
    var prefixIcon: js.UndefOr[ReactElement] = js.undefined
    
    /** accepts suffix icon  */
    var suffixIcon: js.UndefOr[ReactElement] = js.undefined
  }
  object ButtonProps {
    
    @scala.inline
    def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String | ComponentType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setContentRef(value: RefObject[HTMLSpanElement]): Self = StObject.set(x, "contentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentRefUndefined: Self = StObject.set(x, "contentRef", js.undefined)
      
      @scala.inline
      def setFocusableOnBlur(value: () => Unit): Self = StObject.set(x, "focusableOnBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocusableOnBlurUndefined: Self = StObject.set(x, "focusableOnBlur", js.undefined)
      
      @scala.inline
      def setFocusableOnFocus(value: () => Unit): Self = StObject.set(x, "focusableOnFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocusableOnFocusUndefined: Self = StObject.set(x, "focusableOnFocus", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setPrefixIcon(value: ReactElement): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      @scala.inline
      def setSuffixIcon(value: ReactElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
    }
  }
}
