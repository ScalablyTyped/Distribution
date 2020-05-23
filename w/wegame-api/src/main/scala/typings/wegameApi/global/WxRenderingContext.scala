package typings.wegameApi.global

import typings.std.CanvasDirection
import typings.std.CanvasRenderingContext2D
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import typings.std.ImageSmoothingQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WxRenderingContext")
@js.native
class WxRenderingContext () extends CanvasRenderingContext2D {
  /* CompleteClass */
  override var direction: CanvasDirection = js.native
  /* CompleteClass */
  override var filter: String = js.native
  /* CompleteClass */
  override var font: String = js.native
  /* CompleteClass */
  override var globalAlpha: Double = js.native
  /* CompleteClass */
  override var globalCompositeOperation: String = js.native
  /* CompleteClass */
  override var imageSmoothingEnabled: Boolean = js.native
  /* CompleteClass */
  override var imageSmoothingQuality: ImageSmoothingQuality = js.native
  /* CompleteClass */
  override var shadowBlur: Double = js.native
  /* CompleteClass */
  override var shadowColor: String = js.native
  /* CompleteClass */
  override var shadowOffsetX: Double = js.native
  /* CompleteClass */
  override var shadowOffsetY: Double = js.native
  /* CompleteClass */
  override var textAlign: CanvasTextAlign = js.native
  /* CompleteClass */
  override var textBaseline: CanvasTextBaseline = js.native
  /* CompleteClass */
  override def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  /* CompleteClass */
  override def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  /* CompleteClass */
  override def restore(): Unit = js.native
  /* CompleteClass */
  override def save(): Unit = js.native
  /* CompleteClass */
  override def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
}

