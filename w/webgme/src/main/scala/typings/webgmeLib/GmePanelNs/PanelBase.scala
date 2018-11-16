package typings
package webgmeLib.GmePanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel.PanelBase")
@js.native
class PanelBase protected () extends js.Object {
  def this(options: Options) = this()
  var OPTIONS: Options = js.native
  var control: js.Any = js.native
  var logger: webgmeLib.GlobalNs.GmeLogger = js.native
  def afterAppend(): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def isReadOnly(): scala.Boolean = js.native
  def onReadOnlyChanged(isReadOnly: scala.Boolean): scala.Unit = js.native
  def onResize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setContainerUpdateFn(currentLayout: Layout, sizeUpdateFn: js.Function1[/* layout */ Layout, scala.Double]): scala.Unit = js.native
  def setReadOnly(isReadOnly: scala.Boolean): scala.Unit = js.native
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
}

