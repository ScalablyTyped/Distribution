package typings
package tesseractDotJsLib.tesseractDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TesseractStatic extends js.Object {
  def create(paths: tesseractDotJsLib.Anon_CorePath): TesseractStatic = js.native
  def detect(image: ImageLike): TesseractJob = js.native
  def recognize(image: ImageLike): TesseractJob = js.native
  def recognize(image: ImageLike, options: js.Any): TesseractJob = js.native
}

