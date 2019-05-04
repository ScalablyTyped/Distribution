package typings
package vegaDashLiteLib.buildSrcCompileDataSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/data/source", "SourceNode")
@js.native
class SourceNode protected ()
  extends vegaDashLiteLib.buildSrcCompileDataDataflowMod.DataFlowNode {
  def this(data: vegaDashLiteLib.buildSrcDataMod.Data) = this()
  var _data: js.Any = js.native
  var _hash: js.Any = js.native
  var _name: js.Any = js.native
  val data: stdLib.Partial[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgData] = js.native
  var dataName: java.lang.String = js.native
  def assemble(): vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgData = js.native
  def hasName(): scala.Boolean = js.native
  /**
    * Return a unique identifier for this data source.
    */
  def hash(): java.lang.String | scala.Double = js.native
}

