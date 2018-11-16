package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WxRenderingContext")
@js.native
class WxRenderingContext ()
  extends stdLib.CanvasRenderingContext2D {
  /* CompleteClass */
  override var direction: stdLib.CanvasDirection = js.native
  /* CompleteClass */
  override var fillStyle: java.lang.String | stdLib.CanvasGradient | stdLib.CanvasPattern = js.native
  /* CompleteClass */
  override var filter: java.lang.String = js.native
  /* CompleteClass */
  override var font: java.lang.String = js.native
  /* CompleteClass */
  override var globalAlpha: scala.Double = js.native
  /* CompleteClass */
  override var globalCompositeOperation: java.lang.String = js.native
  /* CompleteClass */
  override var imageSmoothingEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var imageSmoothingQuality: stdLib.ImageSmoothingQuality = js.native
  /* CompleteClass */
  override var lineCap: stdLib.CanvasLineCap = js.native
  /* CompleteClass */
  override var lineDashOffset: scala.Double = js.native
  /* CompleteClass */
  override var lineJoin: stdLib.CanvasLineJoin = js.native
  /* CompleteClass */
  override var lineWidth: scala.Double = js.native
  /* CompleteClass */
  override var miterLimit: scala.Double = js.native
  /* CompleteClass */
  override var shadowBlur: scala.Double = js.native
  /* CompleteClass */
  override var shadowColor: java.lang.String = js.native
  /* CompleteClass */
  override var shadowOffsetX: scala.Double = js.native
  /* CompleteClass */
  override var shadowOffsetY: scala.Double = js.native
  /* CompleteClass */
  override var strokeStyle: java.lang.String | stdLib.CanvasGradient | stdLib.CanvasPattern = js.native
  /* CompleteClass */
  override var textAlign: stdLib.CanvasTextAlign = js.native
  /* CompleteClass */
  override var textBaseline: stdLib.CanvasTextBaseline = js.native
  /* CompleteClass */
  override def clearRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def createLinearGradient(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: scala.Double): stdLib.CanvasGradient = js.native
  /* CompleteClass */
  override def createPattern(image: stdLib.CanvasImageSource, repetition: java.lang.String): stdLib.CanvasPattern | scala.Null = js.native
  /* CompleteClass */
  override def createRadialGradient(
    x0: scala.Double,
    y0: scala.Double,
    r0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double
  ): stdLib.CanvasGradient = js.native
  /* CompleteClass */
  override def fillRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def getLineDash(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def restore(): scala.Unit = js.native
  /* CompleteClass */
  override def save(): scala.Unit = js.native
  /* CompleteClass */
  override def setLineDash(segments: js.Array[scala.Double]): scala.Unit = js.native
  /* CompleteClass */
  override def strokeRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
}

