package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.transformMod.FlattenTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flattenMod {
  
  @JSImport("vega-lite/build/src/compile/data/flatten", "FlattenTransformNode")
  @js.native
  open class FlattenTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: FlattenTransform) = this()
    
    def assemble(): typings.vegaTypings.transformMod.FlattenTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
