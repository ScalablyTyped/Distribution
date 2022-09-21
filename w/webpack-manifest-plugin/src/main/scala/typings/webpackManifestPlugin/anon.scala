package typings.webpackManifestPlugin

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ModuleAssets extends StObject {
    
    var moduleAssets: Record[Any, Any]
  }
  object ModuleAssets {
    
    inline def apply(moduleAssets: Record[Any, Any]): ModuleAssets = {
      val __obj = js.Dynamic.literal(moduleAssets = moduleAssets.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleAssets]
    }
    
    extension [Self <: ModuleAssets](x: Self) {
      
      inline def setModuleAssets(value: Record[Any, Any]): Self = StObject.set(x, "moduleAssets", value.asInstanceOf[js.Any])
    }
  }
}
