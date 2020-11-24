package typings.winrtUwp.Windows.Media.Ocr

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the results of Optical Character Recognition (OCR). */
@js.native
trait OcrResult extends js.Object {
  
  /** Gets the collection of OcrLine objects that represents the lines of text detected in the image by the RecognizeAsync method. */
  var lines: IVectorView[OcrLine] = js.native
  
  /** Gets the recognized text. */
  var text: String = js.native
  
  /** Gets the clockwise rotation of the recognized text, in degrees, around the center of the image. */
  var textAngle: Double = js.native
}
object OcrResult {
  
  @scala.inline
  def apply(lines: IVectorView[OcrLine], text: String, textAngle: Double): OcrResult = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textAngle = textAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcrResult]
  }
  
  @scala.inline
  implicit class OcrResultOps[Self <: OcrResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLines(value: IVectorView[OcrLine]): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAngle(value: Double): Self = this.set("textAngle", value.asInstanceOf[js.Any])
  }
}
