package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.transformMod.RegressionTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regressionMod {
  
  @JSImport("vega-lite/build/src/compile/data/regression", "RegressionTransformNode")
  @js.native
  class RegressionTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: RegressionTransform) = this()
    
    def assemble(): typings.vegaTypings.transformMod.RegressionTransform = js.native
    
    var transform: js.Any = js.native
  }
}
