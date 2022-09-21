package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerParams extends StObject {
  
  var preserve_interword_spaces: String
  
  var tessedit_char_whitelist: String
  
  var tessedit_ocr_engine_mode: OEM
  
  var tessedit_pageseg_mode: PSM
  
  var tessjs_create_box: String
  
  var tessjs_create_hocr: String
  
  var tessjs_create_osd: String
  
  var tessjs_create_tsv: String
  
  var tessjs_create_unlv: String
  
  var user_defined_dpi: String
}
object WorkerParams {
  
  inline def apply(
    preserve_interword_spaces: String,
    tessedit_char_whitelist: String,
    tessedit_ocr_engine_mode: OEM,
    tessedit_pageseg_mode: PSM,
    tessjs_create_box: String,
    tessjs_create_hocr: String,
    tessjs_create_osd: String,
    tessjs_create_tsv: String,
    tessjs_create_unlv: String,
    user_defined_dpi: String
  ): WorkerParams = {
    val __obj = js.Dynamic.literal(preserve_interword_spaces = preserve_interword_spaces.asInstanceOf[js.Any], tessedit_char_whitelist = tessedit_char_whitelist.asInstanceOf[js.Any], tessedit_ocr_engine_mode = tessedit_ocr_engine_mode.asInstanceOf[js.Any], tessedit_pageseg_mode = tessedit_pageseg_mode.asInstanceOf[js.Any], tessjs_create_box = tessjs_create_box.asInstanceOf[js.Any], tessjs_create_hocr = tessjs_create_hocr.asInstanceOf[js.Any], tessjs_create_osd = tessjs_create_osd.asInstanceOf[js.Any], tessjs_create_tsv = tessjs_create_tsv.asInstanceOf[js.Any], tessjs_create_unlv = tessjs_create_unlv.asInstanceOf[js.Any], user_defined_dpi = user_defined_dpi.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerParams]
  }
  
  extension [Self <: WorkerParams](x: Self) {
    
    inline def setPreserve_interword_spaces(value: String): Self = StObject.set(x, "preserve_interword_spaces", value.asInstanceOf[js.Any])
    
    inline def setTessedit_char_whitelist(value: String): Self = StObject.set(x, "tessedit_char_whitelist", value.asInstanceOf[js.Any])
    
    inline def setTessedit_ocr_engine_mode(value: OEM): Self = StObject.set(x, "tessedit_ocr_engine_mode", value.asInstanceOf[js.Any])
    
    inline def setTessedit_pageseg_mode(value: PSM): Self = StObject.set(x, "tessedit_pageseg_mode", value.asInstanceOf[js.Any])
    
    inline def setTessjs_create_box(value: String): Self = StObject.set(x, "tessjs_create_box", value.asInstanceOf[js.Any])
    
    inline def setTessjs_create_hocr(value: String): Self = StObject.set(x, "tessjs_create_hocr", value.asInstanceOf[js.Any])
    
    inline def setTessjs_create_osd(value: String): Self = StObject.set(x, "tessjs_create_osd", value.asInstanceOf[js.Any])
    
    inline def setTessjs_create_tsv(value: String): Self = StObject.set(x, "tessjs_create_tsv", value.asInstanceOf[js.Any])
    
    inline def setTessjs_create_unlv(value: String): Self = StObject.set(x, "tessjs_create_unlv", value.asInstanceOf[js.Any])
    
    inline def setUser_defined_dpi(value: String): Self = StObject.set(x, "user_defined_dpi", value.asInstanceOf[js.Any])
  }
}
