package typings.webgme.Global

import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.Path
import typings.webgme.GmePanel.Layout
import typings.webgme.Visualize.Visualizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Global.State")
@js.native
class State () extends js.Object {
  def clear(): Unit = js.native
  def clear(options: StateOptions): Unit = js.native
  def getActiveObject(): js.Any = js.native
  def off(message: String, handler: StateHandler): Unit = js.native
  def on(message: String, handler: StateHandler, target: js.Any): Unit = js.native
  def registerActiveBranchName(branchName: String): Unit = js.native
  def registerActiveCommit(activeCommitHash: MetadataHash): Unit = js.native
  def registerActiveObject(nodePath: Path): Unit = js.native
  def registerActiveSelection(selection: js.Array[String]): Unit = js.native
  def registerActiveVisualizer(vizualizer: Visualizer): Unit = js.native
  def registerLayout(layout: Layout): Unit = js.native
  def registerSuppressVisualizerFromNode(register: Boolean): Unit = js.native
  def set(update: State): Unit = js.native
  def toJSON(): js.Any = js.native
}

