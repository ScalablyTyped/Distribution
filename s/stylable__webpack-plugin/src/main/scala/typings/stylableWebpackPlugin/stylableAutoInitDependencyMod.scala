package typings.stylableWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableAutoInitDependencyMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("@stylable/webpack-plugin/cjs/stylable-auto-init-dependency", "StylableAutoInitDependency")
  @js.native
  class StylableAutoInitDependency protected () extends StObject {
    def this(module: js.Any) = this()
    def this(module: js.Any, globalInjection: js.Function1[/* code */ String, String]) = this()
    
    var globalInjection: js.UndefOr[js.Function1[/* code */ String, String]] = js.native
    
    var module: js.Any = js.native
    
    var range: Double = js.native
    
    var requireWebpackRequire: Boolean = js.native
    
    var `type`: String = js.native
    
    def updateHash(hash: js.Any): Unit = js.native
  }
  
  @JSImport("@stylable/webpack-plugin/cjs/stylable-auto-init-dependency", "StylableAutoInitDependencyTemplate")
  @js.native
  class StylableAutoInitDependencyTemplate () extends StObject {
    
    @JSName("apply")
    def apply(_dep: js.Any, source: js.Any, _runtimeTemplate: js.Any): Unit = js.native
  }
}
