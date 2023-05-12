package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputFormats extends StObject {
  
  var blocks: Boolean
  
  var box: Boolean
  
  var debug: Boolean
  
  var hocr: Boolean
  
  var imageBinary: Boolean
  
  var imageColor: Boolean
  
  var imageGrey: Boolean
  
  var osd: Boolean
  
  var pdf: Boolean
  
  var text: Boolean
  
  var tsv: Boolean
  
  var unlv: Boolean
}
object OutputFormats {
  
  inline def apply(
    blocks: Boolean,
    box: Boolean,
    debug: Boolean,
    hocr: Boolean,
    imageBinary: Boolean,
    imageColor: Boolean,
    imageGrey: Boolean,
    osd: Boolean,
    pdf: Boolean,
    text: Boolean,
    tsv: Boolean,
    unlv: Boolean
  ): OutputFormats = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], box = box.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], hocr = hocr.asInstanceOf[js.Any], imageBinary = imageBinary.asInstanceOf[js.Any], imageColor = imageColor.asInstanceOf[js.Any], imageGrey = imageGrey.asInstanceOf[js.Any], osd = osd.asInstanceOf[js.Any], pdf = pdf.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tsv = tsv.asInstanceOf[js.Any], unlv = unlv.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFormats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputFormats] (val x: Self) extends AnyVal {
    
    inline def setBlocks(value: Boolean): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBox(value: Boolean): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setHocr(value: Boolean): Self = StObject.set(x, "hocr", value.asInstanceOf[js.Any])
    
    inline def setImageBinary(value: Boolean): Self = StObject.set(x, "imageBinary", value.asInstanceOf[js.Any])
    
    inline def setImageColor(value: Boolean): Self = StObject.set(x, "imageColor", value.asInstanceOf[js.Any])
    
    inline def setImageGrey(value: Boolean): Self = StObject.set(x, "imageGrey", value.asInstanceOf[js.Any])
    
    inline def setOsd(value: Boolean): Self = StObject.set(x, "osd", value.asInstanceOf[js.Any])
    
    inline def setPdf(value: Boolean): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTsv(value: Boolean): Self = StObject.set(x, "tsv", value.asInstanceOf[js.Any])
    
    inline def setUnlv(value: Boolean): Self = StObject.set(x, "unlv", value.asInstanceOf[js.Any])
  }
}
