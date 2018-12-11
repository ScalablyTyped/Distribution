package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageBitmapRenderingContext extends js.Object {
  /**
       * Returns the canvas element that the context is bound to.
       */
  val canvas: HTMLCanvasElement = js.native
  /**
       * Replaces contents of the canvas element to which context
       * is bound with a transparent black bitmap whose size corresponds to the width and height
       * content attributes of the canvas element.
       */
  def transferFromImageBitmap(): scala.Unit = js.native
  /**
       * Replaces contents of the canvas element to which context
       * is bound with a transparent black bitmap whose size corresponds to the width and height
       * content attributes of the canvas element.
       */
  def transferFromImageBitmap(bitmap: ImageBitmap): scala.Unit = js.native
}

@JSGlobal("ImageBitmapRenderingContext")
@js.native
object ImageBitmapRenderingContext
  extends ScalablyTyped.runtime.Instantiable0[ImageBitmapRenderingContext]

