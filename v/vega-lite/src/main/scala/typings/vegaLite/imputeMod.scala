package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.transformMod.ImputeTransform
import typings.vegaLite.unitMod.UnitModel
import typings.vegaTypings.transformMod.FormulaTransform
import typings.vegaTypings.transformMod.WindowTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imputeMod {
  
  @JSImport("vega-lite/build/src/compile/data/impute", "ImputeNode")
  @js.native
  class ImputeNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: ImputeTransform) = this()
    
    def assemble(): js.Array[
        FormulaTransform | typings.vegaTypings.transformMod.ImputeTransform | WindowTransform
      ] = js.native
    
    var processSequence: js.Any = js.native
    
    val transform: js.Any = js.native
  }
  /* static members */
  object ImputeNode {
    
    @JSImport("vega-lite/build/src/compile/data/impute", "ImputeNode")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def makeFromEncoding(parent: DataFlowNode, model: UnitModel): ImputeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromEncoding")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[ImputeNode]
    
    @scala.inline
    def makeFromTransform(parent: DataFlowNode, imputeTransform: ImputeTransform): ImputeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromTransform")(parent.asInstanceOf[js.Any], imputeTransform.asInstanceOf[js.Any])).asInstanceOf[ImputeNode]
  }
}
