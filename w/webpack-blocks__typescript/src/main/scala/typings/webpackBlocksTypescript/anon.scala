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
    
    @scala.inline
    def apply(): Modules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Modules]
    }
    
    @scala.inline
    implicit class ModulesMutableBuilder[Self <: Modules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModules(value: Boolean): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setTargets(value: String): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    }
  }
}
