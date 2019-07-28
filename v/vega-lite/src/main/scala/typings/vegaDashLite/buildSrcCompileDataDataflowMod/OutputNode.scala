package typings.vegaDashLite.buildSrcCompileDataDataflowMod

import typings.vegaDashLite.buildSrcDataMod.DataSourceType
import typings.vegaDashLite.buildSrcUtilMod.Dict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/data/dataflow", "OutputNode")
@js.native
class OutputNode protected () extends DataFlowNode {
  /**
    * @param source The name of the source. Will change in assemble.
    * @param type The type of the output node.
    * @param refCounts A global ref counter map.
    */
  def this(parent: DataFlowNode, source: String, `type`: DataSourceType, refCounts: Dict[Double]) = this()
  var _name: js.Any = js.native
  var _source: js.Any = js.native
  val refCounts: js.Any = js.native
  val `type`: DataSourceType = js.native
  /**
    * Request the datasource name and increase the ref counter.
    *
    * During the parsing phase, this will return the simple name such as 'main' or 'raw'.
    * It is crucial to request the name from an output node to mark it as a required node.
    * If nobody ever requests the name, this datasource will not be instantiated in the assemble phase.
    *
    * In the assemble phase, this will return the correct name.
    */
  def getSource(): String = js.native
  def isRequired(): Boolean = js.native
  def setSource(source: String): Unit = js.native
}

