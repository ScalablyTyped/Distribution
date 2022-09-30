package typings.swcNodeCore

import typings.swcNodeCore.swcNodeCoreStrings.automatic
import typings.swcNodeCore.swcNodeCoreStrings.classic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@swc/core.@swc/core.ReactConfig> */
  trait PartialReactConfig extends StObject {
    
    var development: js.UndefOr[Boolean] = js.undefined
    
    var importSource: js.UndefOr[String] = js.undefined
    
    var pragma: js.UndefOr[String] = js.undefined
    
    var pragmaFrag: js.UndefOr[String] = js.undefined
    
    var refresh: js.UndefOr[Boolean] = js.undefined
    
    var runtime: js.UndefOr[automatic | classic] = js.undefined
    
    var throwIfNamespace: js.UndefOr[Boolean] = js.undefined
    
    var useBuiltins: js.UndefOr[Boolean] = js.undefined
  }
  object PartialReactConfig {
    
    inline def apply(): PartialReactConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialReactConfig]
    }
    
    extension [Self <: PartialReactConfig](x: Self) {
      
      inline def setDevelopment(value: Boolean): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
      
      inline def setDevelopmentUndefined: Self = StObject.set(x, "development", js.undefined)
      
      inline def setImportSource(value: String): Self = StObject.set(x, "importSource", value.asInstanceOf[js.Any])
      
      inline def setImportSourceUndefined: Self = StObject.set(x, "importSource", js.undefined)
      
      inline def setPragma(value: String): Self = StObject.set(x, "pragma", value.asInstanceOf[js.Any])
      
      inline def setPragmaFrag(value: String): Self = StObject.set(x, "pragmaFrag", value.asInstanceOf[js.Any])
      
      inline def setPragmaFragUndefined: Self = StObject.set(x, "pragmaFrag", js.undefined)
      
      inline def setPragmaUndefined: Self = StObject.set(x, "pragma", js.undefined)
      
      inline def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      inline def setRuntime(value: automatic | classic): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setThrowIfNamespace(value: Boolean): Self = StObject.set(x, "throwIfNamespace", value.asInstanceOf[js.Any])
      
      inline def setThrowIfNamespaceUndefined: Self = StObject.set(x, "throwIfNamespace", js.undefined)
      
      inline def setUseBuiltins(value: Boolean): Self = StObject.set(x, "useBuiltins", value.asInstanceOf[js.Any])
      
      inline def setUseBuiltinsUndefined: Self = StObject.set(x, "useBuiltins", js.undefined)
    }
  }
}
