package typings.wordpressComponents

import typings.react.mod.ComponentType
import typings.react.mod.SVGProps
import typings.react.mod.global.JSX.Element
import typings.std.SVGSVGElement
import typings.wordpressComponents.iconMod.Icon.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  object default {
    
    // eslint-disable-next-line no-unnecessary-generics
    inline def apply[P](props: Props[P]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/components/icon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object Icon {
    
    // prettier-ignore
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
      * TS definition: {{{
      T extends react.react.ComponentType<infer U> ? U : T extends @wordpress/components.@wordpress/components/dashicon.Dashicon.Icon ? react.react.SVGProps<std.SVGSVGElement> : {}
      }}}
      */
    type AdditionalProps[T] = SVGProps[SVGSVGElement]
    
    trait BaseProps[P] extends StObject {
      
      /**
        * The icon to render. Supported values are: Dashicons (specified as
        * strings), functions, WPComponent instances and `null`.
        * @defaultValue null
        */
      var icon: js.UndefOr[IconType[P]] = js.undefined
      
      /**
        * The size (width and height) of the icon.
        * @defaultValue `20` (when using Dashicon), `24` otherwise
        */
      var size: js.UndefOr[Double] = js.undefined
    }
    object BaseProps {
      
      inline def apply[P](): BaseProps[P] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseProps[P]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BaseProps[?], P] (val x: Self & BaseProps[P]) extends AnyVal {
        
        inline def setIcon(value: IconType[P]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      }
    }
    
    type IconType[P] = typings.wordpressComponents.dashiconMod.Dashicon.Icon | ComponentType[P] | Element
    
    type Props[P] = BaseProps[P] & AdditionalProps[IconType[P]]
  }
}
