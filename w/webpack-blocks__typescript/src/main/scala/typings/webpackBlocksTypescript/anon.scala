package typings.webpackBlocksTypescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Modules extends StObject {
    
    var modules: js.UndefOr[Boolean] = js.undefined
    
    var targets: js.UndefOr[String] = js.undefined
  }
  object Modules {
    
    inline def apply(): Modules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Modules]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Modules] (val x: Self) extends AnyVal {
      
      inline def setModules(value: Boolean): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setTargets(value: String): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    }
  }
}
