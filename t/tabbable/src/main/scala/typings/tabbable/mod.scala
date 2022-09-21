package typings.tabbable

import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGElement
import typings.std.ShadowRoot
import typings.tabbable.tabbableStrings.`legacy-full`
import typings.tabbable.tabbableStrings.`non-zero-area`
import typings.tabbable.tabbableStrings.full
import typings.tabbable.tabbableStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tabbable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def focusable(container: Element): js.Array[FocusableElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("focusable")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[FocusableElement]]
  inline def focusable(container: Element, options: TabbableOptions & CheckOptions): js.Array[FocusableElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusable")(container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[FocusableElement]]
  
  inline def isFocusable(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isFocusable(element: Element, options: CheckOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTabbable(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTabbable")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isTabbable(element: Element, options: CheckOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTabbable")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def tabbable(container: Element): js.Array[FocusableElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("tabbable")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[FocusableElement]]
  inline def tabbable(container: Element, options: TabbableOptions & CheckOptions): js.Array[FocusableElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("tabbable")(container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[FocusableElement]]
  
  trait CheckOptions extends StObject {
    
    var displayCheck: js.UndefOr[full | `legacy-full` | `non-zero-area` | none] = js.undefined
    
    var getShadowRoot: js.UndefOr[
        Boolean | (js.Function1[/* node */ FocusableElement, js.UndefOr[ShadowRoot | Boolean]])
      ] = js.undefined
  }
  object CheckOptions {
    
    inline def apply(): CheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckOptions]
    }
    
    extension [Self <: CheckOptions](x: Self) {
      
      inline def setDisplayCheck(value: full | `legacy-full` | `non-zero-area` | none): Self = StObject.set(x, "displayCheck", value.asInstanceOf[js.Any])
      
      inline def setDisplayCheckUndefined: Self = StObject.set(x, "displayCheck", js.undefined)
      
      inline def setGetShadowRoot(value: Boolean | (js.Function1[/* node */ FocusableElement, js.UndefOr[ShadowRoot | Boolean]])): Self = StObject.set(x, "getShadowRoot", value.asInstanceOf[js.Any])
      
      inline def setGetShadowRootFunction1(value: /* node */ FocusableElement => js.UndefOr[ShadowRoot | Boolean]): Self = StObject.set(x, "getShadowRoot", js.Any.fromFunction1(value))
      
      inline def setGetShadowRootUndefined: Self = StObject.set(x, "getShadowRoot", js.undefined)
    }
  }
  
  type FocusableElement = HTMLElement | SVGElement
  
  trait TabbableOptions extends StObject {
    
    var includeContainer: js.UndefOr[Boolean] = js.undefined
  }
  object TabbableOptions {
    
    inline def apply(): TabbableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabbableOptions]
    }
    
    extension [Self <: TabbableOptions](x: Self) {
      
      inline def setIncludeContainer(value: Boolean): Self = StObject.set(x, "includeContainer", value.asInstanceOf[js.Any])
      
      inline def setIncludeContainerUndefined: Self = StObject.set(x, "includeContainer", js.undefined)
    }
  }
}
