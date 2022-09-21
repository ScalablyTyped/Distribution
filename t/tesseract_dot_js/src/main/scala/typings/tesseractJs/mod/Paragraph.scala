package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paragraph extends StObject {
  
  var baseline: Baseline
  
  var bbox: Bbox
  
  var block: Block
  
  var confidence: Double
  
  var is_ltr: Boolean
  
  var lines: js.Array[Line]
  
  var page: Page
  
  var symbols: js.Array[Symbol]
  
  var text: String
  
  var words: js.Array[Word]
}
object Paragraph {
  
  inline def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    confidence: Double,
    is_ltr: Boolean,
    lines: js.Array[Line],
    page: Page,
    symbols: js.Array[Symbol],
    text: String,
    words: js.Array[Word]
  ): Paragraph = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], is_ltr = is_ltr.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paragraph]
  }
  
  extension [Self <: Paragraph](x: Self) {
    
    inline def setBaseline(value: Baseline): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBbox(value: Bbox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setIs_ltr(value: Boolean): Self = StObject.set(x, "is_ltr", value.asInstanceOf[js.Any])
    
    inline def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setSymbols(value: js.Array[Symbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsVarargs(value: Symbol*): Self = StObject.set(x, "symbols", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWords(value: js.Array[Word]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsVarargs(value: Word*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
