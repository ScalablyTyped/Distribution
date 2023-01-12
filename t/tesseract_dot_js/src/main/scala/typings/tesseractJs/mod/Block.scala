package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block extends StObject {
  
  var baseline: Baseline
  
  var bbox: Bbox
  
  var blocktype: String
  
  var confidence: Double
  
  var lines: js.Array[Line]
  
  var page: Page
  
  var paragraphs: js.Array[Paragraph]
  
  var polygon: Any
  
  var symbols: js.Array[Symbol]
  
  var text: String
  
  var words: js.Array[Word]
}
object Block {
  
  inline def apply(
    baseline: Baseline,
    bbox: Bbox,
    blocktype: String,
    confidence: Double,
    lines: js.Array[Line],
    page: Page,
    paragraphs: js.Array[Paragraph],
    polygon: Any,
    symbols: js.Array[Symbol],
    text: String,
    words: js.Array[Word]
  ): Block = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], blocktype = blocktype.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], paragraphs = paragraphs.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    inline def setBaseline(value: Baseline): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBbox(value: Bbox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setBlocktype(value: String): Self = StObject.set(x, "blocktype", value.asInstanceOf[js.Any])
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setParagraphs(value: js.Array[Paragraph]): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    inline def setParagraphsVarargs(value: Paragraph*): Self = StObject.set(x, "paragraphs", js.Array(value*))
    
    inline def setPolygon(value: Any): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    inline def setSymbols(value: js.Array[Symbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsVarargs(value: Symbol*): Self = StObject.set(x, "symbols", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWords(value: js.Array[Word]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsVarargs(value: Word*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
