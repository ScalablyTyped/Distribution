package typings.tesseractJs.mod

import typings.tesseractJs.anon.CorePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TesseractStatic extends js.Object {
  
  def create(paths: CorePath): TesseractStatic = js.native
  
  def detect(image: ImageLike): TesseractJob = js.native
  
  def recognize(image: ImageLike): TesseractJob = js.native
  def recognize(image: ImageLike, options: js.Any): TesseractJob = js.native
}
