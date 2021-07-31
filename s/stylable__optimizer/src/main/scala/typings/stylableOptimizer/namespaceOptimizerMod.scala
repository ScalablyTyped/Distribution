package typings.stylableOptimizer

import typings.std.Record
import typings.stylableCore.mod.StylableMeta
import typings.stylableCore.typesMod.IStylableNamespaceOptimizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespaceOptimizerMod {
  
  @JSImport("@stylable/optimizer/cjs/namespace-optimizer", "StylableNamespaceOptimizer")
  @js.native
  class StylableNamespaceOptimizer ()
    extends StObject
       with IStylableNamespaceOptimizer {
    
    def getNamespace(meta: StylableMeta, _env: js.Any*): String = js.native
    /* CompleteClass */
    override def getNamespace(meta: typings.stylableCore.stylableMetaMod.StylableMeta, _env: js.Any*): String = js.native
    
    /* CompleteClass */
    var index: Double = js.native
    
    /* CompleteClass */
    var namespaceMapping: Record[String, String] = js.native
    
    /* CompleteClass */
    var namespacePrefix: String = js.native
  }
}
