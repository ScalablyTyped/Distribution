package typings
package vegaDashLiteLib.buildSrcCompileDataFacetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/data/facet", "FacetNode")
@js.native
class FacetNode protected ()
  extends vegaDashLiteLib.buildSrcCompileDataDataflowMod.DataFlowNode {
  /**
    * @param model The facet model.
    * @param name The name that this facet source will have.
    * @param data The source data for this facet data.
    */
  def this(parent: vegaDashLiteLib.buildSrcCompileDataDataflowMod.DataFlowNode, model: vegaDashLiteLib.buildSrcCompileFacetMod.FacetModel, name: java.lang.String, data: java.lang.String) = this()
  var assembleRowColumnData: js.Any = js.native
  val childModel: js.Any = js.native
  val column: js.Any = js.native
  var data: java.lang.String = js.native
  val fields: js.Array[java.lang.String] = js.native
  var getChildIndependentFieldsWithStep: js.Any = js.native
  val model: vegaDashLiteLib.buildSrcCompileFacetMod.FacetModel = js.native
  val name: java.lang.String = js.native
  val row: js.Any = js.native
  def assemble(): js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgData] = js.native
  /**
    * The name to reference this source is its name.
    */
  def getSource(): java.lang.String = js.native
}

