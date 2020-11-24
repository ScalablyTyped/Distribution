package typings.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol extends js.Object {
  
  var baseline: Baseline = js.native
  
  var bbox: Bbox = js.native
  
  var block: Block = js.native
  
  var choices: js.Array[Choice] = js.native
  
  var confidence: Double = js.native
  
  var image: js.Any = js.native
  
  var is_dropcap: Boolean = js.native
  
  var is_subscript: Boolean = js.native
  
  var is_superscript: Boolean = js.native
  
  var line: Line = js.native
  
  var page: Page = js.native
  
  var paragraph: Paragraph = js.native
  
  var text: String = js.native
  
  var word: Word = js.native
}
object Symbol {
  
  @scala.inline
  def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    choices: js.Array[Choice],
    confidence: Double,
    image: js.Any,
    is_dropcap: Boolean,
    is_subscript: Boolean,
    is_superscript: Boolean,
    line: Line,
    page: Page,
    paragraph: Paragraph,
    text: String,
    word: Word
  ): Symbol = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], is_dropcap = is_dropcap.asInstanceOf[js.Any], is_subscript = is_subscript.asInstanceOf[js.Any], is_superscript = is_superscript.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
  
  @scala.inline
  implicit class SymbolOps[Self <: Symbol] (val x: Self) extends AnyVal {
    
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
    def setBaseline(value: Baseline): Self = this.set("baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBbox(value: Bbox): Self = this.set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlock(value: Block): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoicesVarargs(value: Choice*): Self = this.set("choices", js.Array(value :_*))
    
    @scala.inline
    def setChoices(value: js.Array[Choice]): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: js.Any): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_dropcap(value: Boolean): Self = this.set("is_dropcap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_subscript(value: Boolean): Self = this.set("is_subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_superscript(value: Boolean): Self = this.set("is_superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Line): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Page): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraph(value: Paragraph): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWord(value: Word): Self = this.set("word", value.asInstanceOf[js.Any])
  }
}
