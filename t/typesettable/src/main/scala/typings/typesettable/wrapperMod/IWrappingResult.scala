package typings.typesettable.wrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWrappingResult extends js.Object {
  
  var noBrokeWords: Double = js.native
  
  var noLines: Double = js.native
  
  var originalText: String = js.native
  
  var truncatedText: String = js.native
  
  var wrappedText: String = js.native
}
object IWrappingResult {
  
  @scala.inline
  def apply(
    noBrokeWords: Double,
    noLines: Double,
    originalText: String,
    truncatedText: String,
    wrappedText: String
  ): IWrappingResult = {
    val __obj = js.Dynamic.literal(noBrokeWords = noBrokeWords.asInstanceOf[js.Any], noLines = noLines.asInstanceOf[js.Any], originalText = originalText.asInstanceOf[js.Any], truncatedText = truncatedText.asInstanceOf[js.Any], wrappedText = wrappedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWrappingResult]
  }
  
  @scala.inline
  implicit class IWrappingResultOps[Self <: IWrappingResult] (val x: Self) extends AnyVal {
    
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
    def setNoBrokeWords(value: Double): Self = this.set("noBrokeWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLines(value: Double): Self = this.set("noLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalText(value: String): Self = this.set("originalText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncatedText(value: String): Self = this.set("truncatedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrappedText(value: String): Self = this.set("wrappedText", value.asInstanceOf[js.Any])
  }
}
