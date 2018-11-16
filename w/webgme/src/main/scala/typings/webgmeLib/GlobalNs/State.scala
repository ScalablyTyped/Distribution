package typings
package webgmeLib.GlobalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Global.State")
@js.native
class State () extends js.Object {
  def clear(): scala.Unit = js.native
  def clear(options: StateOptions): scala.Unit = js.native
  def getActiveObject(): js.Any = js.native
  def off(message: java.lang.String, handler: StateHandler): scala.Unit = js.native
  def on(message: java.lang.String, handler: StateHandler, target: js.Any): scala.Unit = js.native
  def registerActiveBranchName(branchName: java.lang.String): scala.Unit = js.native
  def registerActiveCommit(activeCommitHash: webgmeLib.GmeCommonNs.MetadataHash): scala.Unit = js.native
  def registerActiveObject(nodePath: webgmeLib.GmeCommonNs.Path): scala.Unit = js.native
  def registerActiveSelection(selection: js.Array[java.lang.String]): scala.Unit = js.native
  def registerActiveVisualizer(vizualizer: webgmeLib.VisualizeNs.Visualizer): scala.Unit = js.native
  def registerLayout(layout: webgmeLib.GmePanelNs.Layout): scala.Unit = js.native
  def registerSuppressVisualizerFromNode(register: scala.Boolean): scala.Unit = js.native
  def set(update: State): scala.Unit = js.native
  def toJSON(): js.Any = js.native
}

