package typings
package terminalDashKitLib.rectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit/Rect", JSImport.Namespace)
@js.native
class ^ protected () extends Rect {
  def this(options: AbsoluteOptions) = this()
  def this(options: Rect) = this()
  def this(options: Region) = this()
  def this(options: terminalDashKitLib.screenBufferMod.^) = this()
  def this(options: terminalDashKitLib.terminalMod.Terminal) = this()
  def this(options: terminalDashKitLib.textBufferMod.^) = this()
  def this(xmin: scala.Double, xmax: scala.Double, ymin: scala.Double, ymax: scala.Double) = this()
  /* CompleteClass */
  override val height: scala.Double = js.native
  /* CompleteClass */
  override val isNull: scala.Boolean = js.native
  /* CompleteClass */
  override val width: scala.Double = js.native
  /* CompleteClass */
  override val xmax: scala.Double = js.native
  /* CompleteClass */
  override val xmin: scala.Double = js.native
  /* CompleteClass */
  override val ymax: scala.Double = js.native
  /* CompleteClass */
  override val ymin: scala.Double = js.native
  /* CompleteClass */
  override def clip(dstRect: Rect, offsetX: scala.Double, offsetY: scala.Double, dstClipping: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def set(obj: Region): scala.Unit = js.native
}

@JSImport("terminal-kit/Rect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def wrappingRect(params: terminalDashKitLib.Anon_DstRect): scala.Unit = js.native
}

