package typings.webgme.GmePanel

import typings.webgme.Global.GmeLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel.PanelBase")
@js.native
class PanelBase protected () extends js.Object {
  def this(options: Options) = this()
  var OPTIONS: Options = js.native
  var control: js.Any = js.native
  var logger: GmeLogger = js.native
  def afterAppend(): Unit = js.native
  def clear(): Unit = js.native
  def destroy(): Unit = js.native
  def isReadOnly(): Boolean = js.native
  def onReadOnlyChanged(isReadOnly: Boolean): Unit = js.native
  def onResize(width: Double, height: Double): Unit = js.native
  def setContainerUpdateFn(currentLayout: Layout, sizeUpdateFn: js.Function1[/* layout */ Layout, Double]): Unit = js.native
  def setReadOnly(isReadOnly: Boolean): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
}

