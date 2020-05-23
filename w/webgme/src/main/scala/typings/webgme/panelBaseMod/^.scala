package typings.webgme.panelBaseMod

import typings.webgme.Global_.GmeLogger
import typings.webgme.GmePanel.Layout
import typings.webgme.GmePanel.Options
import typings.webgme.GmePanel.PanelBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js/PanelBase/PanelBase", JSImport.Namespace)
@js.native
class ^ protected () extends PanelBase {
  def this(options: Options) = this()
  /* CompleteClass */
  override var OPTIONS: Options = js.native
  /* CompleteClass */
  override var control: js.Any = js.native
  /* CompleteClass */
  override var logger: GmeLogger = js.native
  /* CompleteClass */
  override def afterAppend(): Unit = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def isReadOnly(): Boolean = js.native
  /* CompleteClass */
  override def onReadOnlyChanged(isReadOnly: Boolean): Unit = js.native
  /* CompleteClass */
  override def onResize(width: Double, height: Double): Unit = js.native
  /* CompleteClass */
  override def setContainerUpdateFn(currentLayout: Layout, sizeUpdateFn: js.Function1[/* layout */ Layout, Double]): Unit = js.native
  /* CompleteClass */
  override def setReadOnly(isReadOnly: Boolean): Unit = js.native
  /* CompleteClass */
  override def setSize(width: Double, height: Double): Unit = js.native
}

