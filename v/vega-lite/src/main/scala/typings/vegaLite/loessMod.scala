package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.transformMod.LoessTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loessMod {
  
  @JSImport("vega-lite/build/src/compile/data/loess", "LoessTransformNode")
  @js.native
  open class LoessTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: LoessTransform) = this()
    
    def assemble(): typings.vegaTypings.transformMod.LoessTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
