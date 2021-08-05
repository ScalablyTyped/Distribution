package typings.vegaLite

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaTypings.transformMod.FilterTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterinvalidMod {
  
  @JSImport("vega-lite/build/src/compile/data/filterinvalid", "FilterInvalidNode")
  @js.native
  class FilterInvalidNode protected () extends DataFlowNode {
    def this(
      parent: DataFlowNode,
      filter: Dict[TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null]]
    ) = this()
    
    /**
      * Create the VgTransforms for each of the filtered fields.
      */
    def assemble(): FilterTransform = js.native
    
    val filter: Dict[TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null]] = js.native
  }
  /* static members */
  object FilterInvalidNode {
    
    @JSImport("vega-lite/build/src/compile/data/filterinvalid", "FilterInvalidNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def make(parent: DataFlowNode, model: UnitModel): FilterInvalidNode = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[FilterInvalidNode]
  }
}
