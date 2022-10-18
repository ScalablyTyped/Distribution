package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.buildSrcTransformMod.ImputeTransform
import typings.vegaTypings.typesSpecTransformMod.FormulaTransform
import typings.vegaTypings.typesSpecTransformMod.WindowTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataImputeMod {
  
  @JSImport("vega-lite/build/src/compile/data/impute", "ImputeNode")
  @js.native
  open class ImputeNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: ImputeTransform) = this()
    
    def assemble(): js.Array[
        FormulaTransform | typings.vegaTypings.typesSpecTransformMod.ImputeTransform | WindowTransform
      ] = js.native
    
    /* private */ var processSequence: Any = js.native
    
    /* private */ val transform: Any = js.native
  }
  /* static members */
  object ImputeNode {
    
    @JSImport("vega-lite/build/src/compile/data/impute", "ImputeNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def makeFromEncoding(parent: DataFlowNode, model: UnitModel): ImputeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromEncoding")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[ImputeNode]
    
    inline def makeFromTransform(parent: DataFlowNode, imputeTransform: ImputeTransform): ImputeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromTransform")(parent.asInstanceOf[js.Any], imputeTransform.asInstanceOf[js.Any])).asInstanceOf[ImputeNode]
  }
}
