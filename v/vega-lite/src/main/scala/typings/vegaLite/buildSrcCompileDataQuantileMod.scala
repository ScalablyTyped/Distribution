package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcTransformMod.QuantileTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataQuantileMod {
  
  @JSImport("vega-lite/build/src/compile/data/quantile", "QuantileTransformNode")
  @js.native
  open class QuantileTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: QuantileTransform) = this()
    
    def assemble(): typings.vegaTypings.typesSpecTransformMod.QuantileTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
