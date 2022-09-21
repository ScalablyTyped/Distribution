package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Word extends StObject {
  
  var baseline: Baseline
  
  var bbox: Bbox
  
  var block: Block
  
  var choices: js.Array[Choice]
  
  var confidence: Double
  
  var direction: String
  
  var font_id: Double
  
  var font_name: String
  
  var font_size: Double
  
  var in_dictionary: Boolean
  
  var is_bold: Boolean
  
  var is_italic: Boolean
  
  var is_monospace: Boolean
  
  var is_numeric: Boolean
  
  var is_serif: Boolean
  
  var is_smallcaps: Boolean
  
  var is_underlined: Boolean
  
  var language: String
  
  var line: Line
  
  var page: Page
  
  var paragraph: Paragraph
  
  var symbols: js.Array[Symbol]
  
  var text: String
}
object Word {
  
  inline def apply(
    baseline: Baseline,
    bbox: Bbox,
    block: Block,
    choices: js.Array[Choice],
    confidence: Double,
    direction: String,
    font_id: Double,
    font_name: String,
    font_size: Double,
    in_dictionary: Boolean,
    is_bold: Boolean,
    is_italic: Boolean,
    is_monospace: Boolean,
    is_numeric: Boolean,
    is_serif: Boolean,
    is_smallcaps: Boolean,
    is_underlined: Boolean,
    language: String,
    line: Line,
    page: Page,
    paragraph: Paragraph,
    symbols: js.Array[Symbol],
    text: String
  ): Word = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], font_id = font_id.asInstanceOf[js.Any], font_name = font_name.asInstanceOf[js.Any], font_size = font_size.asInstanceOf[js.Any], in_dictionary = in_dictionary.asInstanceOf[js.Any], is_bold = is_bold.asInstanceOf[js.Any], is_italic = is_italic.asInstanceOf[js.Any], is_monospace = is_monospace.asInstanceOf[js.Any], is_numeric = is_numeric.asInstanceOf[js.Any], is_serif = is_serif.asInstanceOf[js.Any], is_smallcaps = is_smallcaps.asInstanceOf[js.Any], is_underlined = is_underlined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Word]
  }
  
  extension [Self <: Word](x: Self) {
    
    inline def setBaseline(value: Baseline): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBbox(value: Bbox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setChoices(value: js.Array[Choice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesVarargs(value: Choice*): Self = StObject.set(x, "choices", js.Array(value*))
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setFont_id(value: Double): Self = StObject.set(x, "font_id", value.asInstanceOf[js.Any])
    
    inline def setFont_name(value: String): Self = StObject.set(x, "font_name", value.asInstanceOf[js.Any])
    
    inline def setFont_size(value: Double): Self = StObject.set(x, "font_size", value.asInstanceOf[js.Any])
    
    inline def setIn_dictionary(value: Boolean): Self = StObject.set(x, "in_dictionary", value.asInstanceOf[js.Any])
    
    inline def setIs_bold(value: Boolean): Self = StObject.set(x, "is_bold", value.asInstanceOf[js.Any])
    
    inline def setIs_italic(value: Boolean): Self = StObject.set(x, "is_italic", value.asInstanceOf[js.Any])
    
    inline def setIs_monospace(value: Boolean): Self = StObject.set(x, "is_monospace", value.asInstanceOf[js.Any])
    
    inline def setIs_numeric(value: Boolean): Self = StObject.set(x, "is_numeric", value.asInstanceOf[js.Any])
    
    inline def setIs_serif(value: Boolean): Self = StObject.set(x, "is_serif", value.asInstanceOf[js.Any])
    
    inline def setIs_smallcaps(value: Boolean): Self = StObject.set(x, "is_smallcaps", value.asInstanceOf[js.Any])
    
    inline def setIs_underlined(value: Boolean): Self = StObject.set(x, "is_underlined", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setParagraph(value: Paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setSymbols(value: js.Array[Symbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsVarargs(value: Symbol*): Self = StObject.set(x, "symbols", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
