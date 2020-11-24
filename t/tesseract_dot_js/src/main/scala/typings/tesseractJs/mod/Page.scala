package typings.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page extends js.Object {
  
  var blocks: js.Array[Block] = js.native
  
  var confidence: Double = js.native
  
  var html: String = js.native
  
  var lines: js.Array[Line] = js.native
  
  var oem: String = js.native
  
  var paragraphs: js.Array[Paragraph] = js.native
  
  var psm: String = js.native
  
  var symbols: js.Array[Symbol] = js.native
  
  var text: String = js.native
  
  var version: String = js.native
  
  var words: js.Array[Word] = js.native
}
object Page {
  
  @scala.inline
  def apply(
    blocks: js.Array[Block],
    confidence: Double,
    html: String,
    lines: js.Array[Line],
    oem: String,
    paragraphs: js.Array[Paragraph],
    psm: String,
    symbols: js.Array[Symbol],
    text: String,
    version: String,
    words: js.Array[Word]
  ): Page = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], oem = oem.asInstanceOf[js.Any], paragraphs = paragraphs.asInstanceOf[js.Any], psm = psm.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    
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
    def setBlocksVarargs(value: Block*): Self = this.set("blocks", js.Array(value :_*))
    
    @scala.inline
    def setBlocks(value: js.Array[Block]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesVarargs(value: Line*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[Line]): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOem(value: String): Self = this.set("oem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphsVarargs(value: Paragraph*): Self = this.set("paragraphs", js.Array(value :_*))
    
    @scala.inline
    def setParagraphs(value: js.Array[Paragraph]): Self = this.set("paragraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPsm(value: String): Self = this.set("psm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolsVarargs(value: Symbol*): Self = this.set("symbols", js.Array(value :_*))
    
    @scala.inline
    def setSymbols(value: js.Array[Symbol]): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsVarargs(value: Word*): Self = this.set("words", js.Array(value :_*))
    
    @scala.inline
    def setWords(value: js.Array[Word]): Self = this.set("words", value.asInstanceOf[js.Any])
  }
}
