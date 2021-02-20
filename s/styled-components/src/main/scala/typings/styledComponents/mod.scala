package typings.styledComponents

import typings.styledComponents.styledComponentsMod.AnyIfEmpty
import typings.styledComponents.styledComponentsMod.CSSProp
import typings.styledComponents.styledComponentsMod.DefaultTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait Attributes extends StObject {
    
    // NOTE: unlike the plain javascript version, it is not possible to get access
    // to the element's own attributes inside function interpolations.
    // Only theme will be accessible, and only with the DefaultTheme due to the global
    // nature of this declaration.
    // If you are writing this inline you already have access to all the attributes anyway,
    // no need for the extra indirection.
    /**
      * If present, this React element will be converted by
      * `babel-plugin-styled-components` into a styled component
      * with the given css as its styles.
      */
    var css: js.UndefOr[CSSProp[AnyIfEmpty[DefaultTheme]]] = js.native
  }
  object Attributes {
    
    @scala.inline
    def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: CSSProp[AnyIfEmpty[DefaultTheme]]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    }
  }
}
