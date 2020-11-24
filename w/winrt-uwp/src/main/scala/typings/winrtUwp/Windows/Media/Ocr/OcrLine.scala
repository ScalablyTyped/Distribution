package typings.winrtUwp.Windows.Media.Ocr

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single line of text recognized by the OCR engine and returned as part of the OcrResult . */
@js.native
trait OcrLine extends js.Object {
  
  /** Gets the text of the recognized line. */
  var text: String = js.native
  
  /** Gets the collection of OcrWord objects that represents the words detected in the current line of text by the RecognizeAsync method. */
  var words: IVectorView[OcrWord] = js.native
}
object OcrLine {
  
  @scala.inline
  def apply(text: String, words: IVectorView[OcrWord]): OcrLine = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcrLine]
  }
  
  @scala.inline
  implicit class OcrLineOps[Self <: OcrLine] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords(value: IVectorView[OcrWord]): Self = this.set("words", value.asInstanceOf[js.Any])
  }
}
