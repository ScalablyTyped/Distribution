package typings.terminalKit.rectMod

import typings.terminalKit.anon.DstRect
import typings.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit/Rect", JSImport.Namespace)
@js.native
class ^ protected () extends Rect {
  def this(options: AbsoluteOptions) = this()
  def this(options: Rect) = this()
  def this(options: Region) = this()
  def this(options: typings.terminalKit.screenBufferMod.^) = this()
  def this(options: Terminal) = this()
  def this(options: typings.terminalKit.textBufferMod.^) = this()
  def this(xmin: Double, xmax: Double, ymin: Double, ymax: Double) = this()
  /* CompleteClass */
  override val height: Double = js.native
  /* CompleteClass */
  override val isNull: Boolean = js.native
  /* CompleteClass */
  override val width: Double = js.native
  /* CompleteClass */
  override val xmax: Double = js.native
  /* CompleteClass */
  override val xmin: Double = js.native
  /* CompleteClass */
  override val ymax: Double = js.native
  /* CompleteClass */
  override val ymin: Double = js.native
  /* CompleteClass */
  override def clip(dstRect: Rect, offsetX: Double, offsetY: Double, dstClipping: Boolean): Unit = js.native
  /* CompleteClass */
  override def set(obj: Region): Unit = js.native
}

@JSImport("terminal-kit/Rect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def wrappingRect(params: DstRect): Unit = js.native
}

