package typings.vegaDashLite.buildSrcCompileDataDataflowMod

import typings.vegaDashLite.buildSrcUtilMod.StringSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/data/dataflow", "DataFlowNode")
@js.native
class DataFlowNode protected () extends js.Object {
  def this(parent: DataFlowNode) = this()
  def this(parent: DataFlowNode, debugName: String) = this()
  var _children: js.Any = js.native
  var _parent: js.Any = js.native
  val children: js.Array[DataFlowNode] = js.native
  val debugName: js.UndefOr[String] = js.native
  /**
    * Set the parent of the node and also add this not to the parent's children.
    */
  var parent: DataFlowNode = js.native
  def addChild(child: DataFlowNode): Unit = js.native
  def dependentFields(): StringSet = js.native
  /**
    * Insert another node as a parent of this node.
    */
  def insertAsParentOf(other: DataFlowNode): Unit = js.native
  def numChildren(): Double = js.native
  /**
    * Set of fields that are being created by this node.
    */
  def producedFields(): StringSet = js.native
  /**
    * Remove node from the dataflow.
    */
  def remove(): Unit = js.native
  def removeChild(oldChild: DataFlowNode): Unit = js.native
  def swapWithParent(): Unit = js.native
}

