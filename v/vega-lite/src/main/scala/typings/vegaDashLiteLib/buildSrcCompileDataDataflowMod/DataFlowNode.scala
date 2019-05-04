package typings
package vegaDashLiteLib.buildSrcCompileDataDataflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/data/dataflow", "DataFlowNode")
@js.native
class DataFlowNode protected () extends js.Object {
  def this(parent: DataFlowNode) = this()
  def this(parent: DataFlowNode, debugName: java.lang.String) = this()
  var _children: js.Any = js.native
  var _parent: js.Any = js.native
  val children: js.Array[DataFlowNode] = js.native
  val debugName: js.UndefOr[java.lang.String] = js.native
  /**
    * Set the parent of the node and also add this not to the parent's children.
    */
  var parent: DataFlowNode = js.native
  def addChild(child: DataFlowNode): scala.Unit = js.native
  def dependentFields(): vegaDashLiteLib.buildSrcUtilMod.StringSet = js.native
  /**
    * Insert another node as a parent of this node.
    */
  def insertAsParentOf(other: DataFlowNode): scala.Unit = js.native
  def numChildren(): scala.Double = js.native
  /**
    * Set of fields that are being created by this node.
    */
  def producedFields(): vegaDashLiteLib.buildSrcUtilMod.StringSet = js.native
  /**
    * Remove node from the dataflow.
    */
  def remove(): scala.Unit = js.native
  def removeChild(oldChild: DataFlowNode): scala.Unit = js.native
  def swapWithParent(): scala.Unit = js.native
}

