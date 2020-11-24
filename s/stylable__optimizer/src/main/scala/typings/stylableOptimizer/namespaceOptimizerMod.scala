package typings.stylableOptimizer

import typings.stylableCore.mod.StylableMeta
import typings.stylableCore.typesMod.IStylableNamespaceOptimizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/optimizer/cjs/namespace-optimizer", JSImport.Namespace)
@js.native
object namespaceOptimizerMod extends js.Object {
  
  @js.native
  class StylableNamespaceOptimizer () extends IStylableNamespaceOptimizer {
    
    def getNamespace(meta: StylableMeta, _env: js.Any*): String = js.native
  }
}
