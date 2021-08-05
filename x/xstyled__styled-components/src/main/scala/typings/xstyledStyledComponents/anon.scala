package typings.xstyledStyledComponents

import typings.std.HTMLElement
import typings.styledComponents.styledComponentsMod.ServerStyleSheet
import typings.styledComponents.styledComponentsMod.StylisPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<styled-components.styled-components.StyleSheetManagerProps> */
  trait ReadonlyStyleSheetManager extends StObject {
    
    val disableCSSOMInjection: js.UndefOr[Boolean] = js.undefined
    
    val disableVendorPrefixes: js.UndefOr[Boolean] = js.undefined
    
    val sheet: js.UndefOr[ServerStyleSheet] = js.undefined
    
    val stylisPlugins: js.UndefOr[js.Array[StylisPlugin]] = js.undefined
    
    val target: js.UndefOr[HTMLElement] = js.undefined
  }
  object ReadonlyStyleSheetManager {
    
    inline def apply(): ReadonlyStyleSheetManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyStyleSheetManager]
    }
    
    extension [Self <: ReadonlyStyleSheetManager](x: Self) {
      
      inline def setDisableCSSOMInjection(value: Boolean): Self = StObject.set(x, "disableCSSOMInjection", value.asInstanceOf[js.Any])
      
      inline def setDisableCSSOMInjectionUndefined: Self = StObject.set(x, "disableCSSOMInjection", js.undefined)
      
      inline def setDisableVendorPrefixes(value: Boolean): Self = StObject.set(x, "disableVendorPrefixes", value.asInstanceOf[js.Any])
      
      inline def setDisableVendorPrefixesUndefined: Self = StObject.set(x, "disableVendorPrefixes", js.undefined)
      
      inline def setSheet(value: ServerStyleSheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      inline def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
      
      inline def setStylisPlugins(value: js.Array[StylisPlugin]): Self = StObject.set(x, "stylisPlugins", value.asInstanceOf[js.Any])
      
      inline def setStylisPluginsUndefined: Self = StObject.set(x, "stylisPlugins", js.undefined)
      
      inline def setStylisPluginsVarargs(value: StylisPlugin*): Self = StObject.set(x, "stylisPlugins", js.Array(value :_*))
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Target extends StObject {
    
    var target: String
  }
  object Target {
    
    inline def apply(target: String): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
