package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaTypings.transformMod.IdentifierTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identifierMod {
  
  @JSImport("vega-lite/build/src/compile/data/identifier", "IdentifierNode")
  @js.native
  class IdentifierNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode) = this()
    
    def assemble(): IdentifierTransform = js.native
  }
}
