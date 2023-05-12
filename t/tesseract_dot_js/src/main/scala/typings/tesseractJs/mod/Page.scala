package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  var blocks: js.Array[Block] | Null
  
  var box: String | Null
  
  var confidence: Double
  
  var hocr: String | Null
  
  var imageBinary: String | Null
  
  var imageColor: String | Null
  
  var imageGrey: String | Null
  
  var lines: js.Array[Line]
  
  var oem: String
  
  var osd: String
  
  var paragraphs: js.Array[Paragraph]
  
  var pdf: js.Array[Double] | Null
  
  var psm: String
  
  var rotateRadians: Double | Null
  
  var sd: String | Null
  
  var symbols: js.Array[Symbol]
  
  var text: String
  
  var tsv: String | Null
  
  var unlv: String | Null
  
  var version: String
  
  var words: js.Array[Word]
}
object Page {
  
  inline def apply(
    confidence: Double,
    lines: js.Array[Line],
    oem: String,
    osd: String,
    paragraphs: js.Array[Paragraph],
    psm: String,
    symbols: js.Array[Symbol],
    text: String,
    version: String,
    words: js.Array[Word]
  ): Page = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], oem = oem.asInstanceOf[js.Any], osd = osd.asInstanceOf[js.Any], paragraphs = paragraphs.asInstanceOf[js.Any], psm = psm.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any], blocks = null, box = null, hocr = null, imageBinary = null, imageColor = null, imageGrey = null, pdf = null, rotateRadians = null, sd = null, tsv = null, unlv = null)
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    inline def setBlocks(value: js.Array[Block]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksNull: Self = StObject.set(x, "blocks", null)
    
    inline def setBlocksVarargs(value: Block*): Self = StObject.set(x, "blocks", js.Array(value*))
    
    inline def setBox(value: String): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    inline def setBoxNull: Self = StObject.set(x, "box", null)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setHocr(value: String): Self = StObject.set(x, "hocr", value.asInstanceOf[js.Any])
    
    inline def setHocrNull: Self = StObject.set(x, "hocr", null)
    
    inline def setImageBinary(value: String): Self = StObject.set(x, "imageBinary", value.asInstanceOf[js.Any])
    
    inline def setImageBinaryNull: Self = StObject.set(x, "imageBinary", null)
    
    inline def setImageColor(value: String): Self = StObject.set(x, "imageColor", value.asInstanceOf[js.Any])
    
    inline def setImageColorNull: Self = StObject.set(x, "imageColor", null)
    
    inline def setImageGrey(value: String): Self = StObject.set(x, "imageGrey", value.asInstanceOf[js.Any])
    
    inline def setImageGreyNull: Self = StObject.set(x, "imageGrey", null)
    
    inline def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setOem(value: String): Self = StObject.set(x, "oem", value.asInstanceOf[js.Any])
    
    inline def setOsd(value: String): Self = StObject.set(x, "osd", value.asInstanceOf[js.Any])
    
    inline def setParagraphs(value: js.Array[Paragraph]): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    inline def setParagraphsVarargs(value: Paragraph*): Self = StObject.set(x, "paragraphs", js.Array(value*))
    
    inline def setPdf(value: js.Array[Double]): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfNull: Self = StObject.set(x, "pdf", null)
    
    inline def setPdfVarargs(value: Double*): Self = StObject.set(x, "pdf", js.Array(value*))
    
    inline def setPsm(value: String): Self = StObject.set(x, "psm", value.asInstanceOf[js.Any])
    
    inline def setRotateRadians(value: Double): Self = StObject.set(x, "rotateRadians", value.asInstanceOf[js.Any])
    
    inline def setRotateRadiansNull: Self = StObject.set(x, "rotateRadians", null)
    
    inline def setSd(value: String): Self = StObject.set(x, "sd", value.asInstanceOf[js.Any])
    
    inline def setSdNull: Self = StObject.set(x, "sd", null)
    
    inline def setSymbols(value: js.Array[Symbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsVarargs(value: Symbol*): Self = StObject.set(x, "symbols", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTsv(value: String): Self = StObject.set(x, "tsv", value.asInstanceOf[js.Any])
    
    inline def setTsvNull: Self = StObject.set(x, "tsv", null)
    
    inline def setUnlv(value: String): Self = StObject.set(x, "unlv", value.asInstanceOf[js.Any])
    
    inline def setUnlvNull: Self = StObject.set(x, "unlv", null)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWords(value: js.Array[Word]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsVarargs(value: Word*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
