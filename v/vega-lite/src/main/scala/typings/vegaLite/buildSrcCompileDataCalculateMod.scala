package typings.vegaLite

import typings.vegaLite.buildSrcBinMod.BinParams
import typings.vegaLite.buildSrcChannelMod.SingleDefChannel
import typings.vegaLite.buildSrcChanneldefMod.FieldRefOption
import typings.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcCompileModelMod.ModelWithField
import typings.vegaLite.buildSrcTransformMod.CalculateTransform
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaTypings.typesSpecTransformMod.FormulaTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataCalculateMod {
  
  @JSImport("vega-lite/build/src/compile/data/calculate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/data/calculate", "CalculateNode")
  @js.native
  open class CalculateNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: CalculateTransform) = this()
    
    /* private */ var _dependentFields: Any = js.native
    
    def assemble(): FormulaTransform = js.native
    
    /* private */ val transform: Any = js.native
  }
  /* static members */
  object CalculateNode {
    
    @JSImport("vega-lite/build/src/compile/data/calculate", "CalculateNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseAllForSortIndex(parent: DataFlowNode, model: ModelWithField): DataFlowNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAllForSortIndex")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[DataFlowNode]
  }
  
  inline def sortArrayIndexField_binned(
    fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    channel: SingleDefChannel
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sortArrayIndexField")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sortArrayIndexField_binned(
    fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    channel: SingleDefChannel,
    opt: FieldRefOption
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sortArrayIndexField")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
}
