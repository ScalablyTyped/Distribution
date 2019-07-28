package typings.vegaDashLite.buildSrcCompileDataSourceMod

import typings.std.Partial
import typings.vegaDashLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaDashLite.buildSrcDataMod.Data
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/data/source", "SourceNode")
@js.native
class SourceNode protected () extends DataFlowNode {
  def this(data: Data) = this()
  var _data: js.Any = js.native
  var _hash: js.Any = js.native
  var _name: js.Any = js.native
  val data: Partial[VgData] = js.native
  var dataName: String = js.native
  def assemble(): VgData = js.native
  def hasName(): Boolean = js.native
  /**
    * Return a unique identifier for this data source.
    */
  def hash(): String | Double = js.native
}

