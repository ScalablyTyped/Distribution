package typings.uirouterAngularjs

import typings.uirouterCore.mod.StateService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStateFiltersMod {
  
  object IncludedByStateFilter {
    
    inline def apply($state: StateService): Any = ^.asInstanceOf[js.Dynamic].apply($state.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("@uirouter/angularjs/lib/stateFilters", "$IncludedByStateFilter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@uirouter/angularjs/lib/stateFilters", "$IncludedByStateFilter.$inject")
    @js.native
    def inject: js.Array[String] = js.native
    
    inline def inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  object IsStateFilter {
    
    inline def apply($state: StateService): Any = ^.asInstanceOf[js.Dynamic].apply($state.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("@uirouter/angularjs/lib/stateFilters", "$IsStateFilter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@uirouter/angularjs/lib/stateFilters", "$IsStateFilter.$inject")
    @js.native
    def inject: js.Array[String] = js.native
    
    inline def inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
}
