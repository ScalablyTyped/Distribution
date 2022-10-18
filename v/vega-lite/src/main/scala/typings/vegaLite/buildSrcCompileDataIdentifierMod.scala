package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaTypings.typesSpecTransformMod.IdentifierTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataIdentifierMod {
  
  @JSImport("vega-lite/build/src/compile/data/identifier", "IdentifierNode")
  @js.native
  open class IdentifierNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode) = this()
    
    def assemble(): IdentifierTransform = js.native
  }
}
