package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Symbol extends StObject {
  
  var baseline: Baseline
  
  var bbox: Bbox
  
  var block: Block
  
  var choices: js.Array[Choice]
  
  var confidence: Double
  
  var image: Any
  
  var is_dropcap: Boolean
  
  var is_subscript: Boolean
  
  var is_superscript: Boolean
  
  var line: Line
  
  var page: Page
  
  var paragraph: Paragraph
  
  var text: String
  
  var word: Word
}
object Symbol {
  
  inline def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    choices: js.Array[Choice],
    confidence: Double,
    image: Any,
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
  implicit open class MutableBuilder[Self <: Symbol] (val x: Self) extends AnyVal {
    
    inline def setBaseline(value: Baseline): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBbox(value: Bbox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setChoices(value: js.Array[Choice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesVarargs(value: Choice*): Self = StObject.set(x, "choices", js.Array(value*))
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setIs_dropcap(value: Boolean): Self = StObject.set(x, "is_dropcap", value.asInstanceOf[js.Any])
    
    inline def setIs_subscript(value: Boolean): Self = StObject.set(x, "is_subscript", value.asInstanceOf[js.Any])
    
    inline def setIs_superscript(value: Boolean): Self = StObject.set(x, "is_superscript", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setParagraph(value: Paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWord(value: Word): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
  }
}
