package typings.vegaDashLite.buildSrcCompileDataFacetMod

import typings.vegaDashLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaDashLite.buildSrcCompileFacetMod.FacetModel
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/data/facet", "FacetNode")
@js.native
class FacetNode protected () extends DataFlowNode {
  /**
    * @param model The facet model.
    * @param name The name that this facet source will have.
    * @param data The source data for this facet data.
    */
  def this(parent: DataFlowNode, model: FacetModel, name: String, data: String) = this()
  var assembleRowColumnData: js.Any = js.native
  val childModel: js.Any = js.native
  val column: js.Any = js.native
  var data: String = js.native
  val fields: js.Array[String] = js.native
  var getChildIndependentFieldsWithStep: js.Any = js.native
  val model: FacetModel = js.native
  val name: String = js.native
  val row: js.Any = js.native
  def assemble(): js.Array[VgData] = js.native
  /**
    * The name to reference this source is its name.
    */
  def getSource(): String = js.native
}

