package typings.stylableWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/webpack-plugin/cjs/stylable-auto-init-dependency", JSImport.Namespace)
@js.native
object stylableAutoInitDependencyMod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  class StylableAutoInitDependency protected () extends js.Object {
    def this(module: js.Any) = this()
    def this(module: js.Any, globalInjection: js.Function1[/* code */ String, String]) = this()
    
    var globalInjection: js.UndefOr[js.Function1[/* code */ String, String]] = js.native
    
    var module: js.Any = js.native
    
    var range: Double = js.native
    
    var requireWebpackRequire: Boolean = js.native
    
    var `type`: String = js.native
    
    def updateHash(hash: js.Any): Unit = js.native
  }
  
  @js.native
  class StylableAutoInitDependencyTemplate () extends js.Object {
    
    @JSName("apply")
    def apply(_dep: js.Any, source: js.Any, _runtimeTemplate: js.Any): Unit = js.native
  }
}
