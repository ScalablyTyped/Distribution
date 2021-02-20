package typings.xstyledStyledComponents

import typings.std.HTMLElement
import typings.styledComponents.styledComponentsMod.ServerStyleSheet
import typings.styledComponents.styledComponentsMod.StylisPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<styled-components.styled-components.StyleSheetManagerProps> */
  @js.native
  trait ReadonlyStyleSheetManager extends StObject {
    
    val disableCSSOMInjection: js.UndefOr[Boolean] = js.native
    
    val disableVendorPrefixes: js.UndefOr[Boolean] = js.native
    
    val sheet: js.UndefOr[ServerStyleSheet] = js.native
    
    val stylisPlugins: js.UndefOr[js.Array[StylisPlugin]] = js.native
    
    val target: js.UndefOr[HTMLElement] = js.native
  }
  object ReadonlyStyleSheetManager {
    
    @scala.inline
    def apply(): ReadonlyStyleSheetManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyStyleSheetManager]
    }
    
    @scala.inline
    implicit class ReadonlyStyleSheetManagerMutableBuilder[Self <: ReadonlyStyleSheetManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableCSSOMInjection(value: Boolean): Self = StObject.set(x, "disableCSSOMInjection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCSSOMInjectionUndefined: Self = StObject.set(x, "disableCSSOMInjection", js.undefined)
      
      @scala.inline
      def setDisableVendorPrefixes(value: Boolean): Self = StObject.set(x, "disableVendorPrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableVendorPrefixesUndefined: Self = StObject.set(x, "disableVendorPrefixes", js.undefined)
      
      @scala.inline
      def setSheet(value: ServerStyleSheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
      
      @scala.inline
      def setStylisPlugins(value: js.Array[StylisPlugin]): Self = StObject.set(x, "stylisPlugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylisPluginsUndefined: Self = StObject.set(x, "stylisPlugins", js.undefined)
      
      @scala.inline
      def setStylisPluginsVarargs(value: StylisPlugin*): Self = StObject.set(x, "stylisPlugins", js.Array(value :_*))
      
      @scala.inline
      def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait Target extends StObject {
    
    var target: String = js.native
  }
  object Target {
    
    @scala.inline
    def apply(target: String): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
