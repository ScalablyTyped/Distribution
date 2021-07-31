package typings.vegaLite

import typings.vegaLite.compileFacetMod.FacetModel
import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.vegaSchemaMod.VgData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facetMod {
  
  @JSImport("vega-lite/build/src/compile/data/facet", "FacetNode")
  @js.native
  class FacetNode protected () extends DataFlowNode {
    /**
      * @param model The facet model.
      * @param name The name that this facet source will have.
      * @param data The source data for this facet data.
      */
    def this(parent: DataFlowNode, model: FacetModel, name: String, data: String) = this()
    
    def assemble(): js.Array[VgData] = js.native
    
    var assembleFacetHeaderData: js.Any = js.native
    
    var assembleRowColumnHeaderData: js.Any = js.native
    
    val childModel: js.Any = js.native
    
    val column: js.Any = js.native
    
    var data: String = js.native
    
    val facet: js.Any = js.native
    
    def fields: js.Array[String] = js.native
    
    var getChildIndependentFieldsWithStep: js.Any = js.native
    
    /**
      * The name to reference this source is its name.
      */
    def getSource(): String = js.native
    
    val model: FacetModel = js.native
    
    val name: String = js.native
    
    val row: js.Any = js.native
  }
}
