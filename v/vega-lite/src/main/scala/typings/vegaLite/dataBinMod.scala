package typings.vegaLite

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.modelMod.Model
import typings.vegaLite.modelMod.ModelWithField
import typings.vegaLite.transformMod.BinTransform
import typings.vegaLite.utilMod.Dict
import typings.vegaTypings.transformMod.Transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataBinMod {
  
  @JSImport("vega-lite/build/src/compile/data/bin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/data/bin", "BinNode")
  @js.native
  class BinNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, bins: Dict[BinComponent]) = this()
    
    def assemble(): js.Array[Transforms] = js.native
    
    /* private */ var bins: js.Any = js.native
    
    /**
      * Merge bin nodes. This method either integrates the bin config from the other node
      * or if this node already has a bin config, renames the corresponding signal in the model.
      */
    def merge(other: BinNode, renameSignal: js.Function2[/* s1 */ String, /* s2 */ String, Unit]): Unit = js.native
  }
  /* static members */
  object BinNode {
    
    @JSImport("vega-lite/build/src/compile/data/bin", "BinNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def makeFromEncoding(parent: DataFlowNode, model: ModelWithField): BinNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromEncoding")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[BinNode]
    
    /**
      * Creates a bin node from BinTransform.
      * The optional parameter should provide
      */
    inline def makeFromTransform(parent: DataFlowNode, t: BinTransform, model: Model): BinNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromTransform")(parent.asInstanceOf[js.Any], t.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[BinNode]
  }
  
  inline def getBinSignalName(model: Model, field: String, bin: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBinSignalName")(model.asInstanceOf[js.Any], field.asInstanceOf[js.Any], bin.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getBinSignalName(model: Model, field: String, bin: BinParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBinSignalName")(model.asInstanceOf[js.Any], field.asInstanceOf[js.Any], bin.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait BinComponent extends StObject {
    
    /** Pairs of strings of the names of start and end signals */
    var as: js.Array[js.Tuple2[String, String]]
    
    var bin: BinParams
    
    var extentSignal: js.UndefOr[String] = js.undefined
    
    var field: FieldName
    
    var formula: js.UndefOr[String] = js.undefined
    
    var formulaAs: js.UndefOr[String] = js.undefined
    
    var signal: js.UndefOr[String] = js.undefined
    
    var span: js.UndefOr[String] = js.undefined
  }
  object BinComponent {
    
    inline def apply(as: js.Array[js.Tuple2[String, String]], bin: BinParams, field: FieldName): BinComponent = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinComponent]
    }
    
    extension [Self <: BinComponent](x: Self) {
      
      inline def setAs(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "as", js.Array(value :_*))
      
      inline def setBin(value: BinParams): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setExtentSignal(value: String): Self = StObject.set(x, "extentSignal", value.asInstanceOf[js.Any])
      
      inline def setExtentSignalUndefined: Self = StObject.set(x, "extentSignal", js.undefined)
      
      inline def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
      
      inline def setFormulaAs(value: String): Self = StObject.set(x, "formulaAs", value.asInstanceOf[js.Any])
      
      inline def setFormulaAsUndefined: Self = StObject.set(x, "formulaAs", js.undefined)
      
      inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
      
      inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSpan(value: String): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    }
  }
}
