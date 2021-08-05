package typings.vegaLite

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.SingleDefChannel
import typings.vegaLite.channeldefMod.FieldRefOption
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.modelMod.ModelWithField
import typings.vegaLite.transformMod.CalculateTransform
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaTypings.transformMod.FormulaTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateMod {
  
  @JSImport("vega-lite/build/src/compile/data/calculate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/data/calculate", "CalculateNode")
  @js.native
  class CalculateNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: CalculateTransform) = this()
    
    /* private */ var _dependentFields: js.Any = js.native
    
    def assemble(): FormulaTransform = js.native
    
    /* private */ val transform: js.Any = js.native
  }
  /* static members */
  object CalculateNode {
    
    @JSImport("vega-lite/build/src/compile/data/calculate", "CalculateNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseAllForSortIndex(parent: DataFlowNode, model: ModelWithField): DataFlowNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAllForSortIndex")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[DataFlowNode]
  }
  
  inline def sortArrayIndexField_binned(
    fieldDef: TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null],
    channel: SingleDefChannel
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sortArrayIndexField")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sortArrayIndexField_binned(
    fieldDef: TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null],
    channel: SingleDefChannel,
    opt: FieldRefOption
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sortArrayIndexField")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
}
