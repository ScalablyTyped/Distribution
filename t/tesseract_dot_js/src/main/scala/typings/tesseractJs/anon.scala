package typings.tesseractJs

import typings.tesseractJs.mod.OEM
import typings.tesseractJs.mod.PSM
import typings.tesseractJs.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<tesseract.js.tesseract.js.RecognizeOptions> */
  trait PartialRecognizeOptions extends StObject {
    
    var rectangle: js.UndefOr[Rectangle] = js.undefined
  }
  object PartialRecognizeOptions {
    
    inline def apply(): PartialRecognizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecognizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRecognizeOptions] (val x: Self) extends AnyVal {
      
      inline def setRectangle(value: Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    }
  }
  
  /* Inlined std.Partial<tesseract.js.tesseract.js.WorkerOptions> */
  trait PartialWorkerOptions extends StObject {
    
    var cacheMethod: js.UndefOr[String] = js.undefined
    
    var cachePath: js.UndefOr[String] = js.undefined
    
    var corePath: js.UndefOr[String] = js.undefined
    
    var dataPath: js.UndefOr[String] = js.undefined
    
    var errorHandler: js.UndefOr[js.Function1[/* arg */ Any, Unit]] = js.undefined
    
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    var langPath: js.UndefOr[String] = js.undefined
    
    var logger: js.UndefOr[js.Function1[/* arg */ Any, Unit]] = js.undefined
    
    var workerBlobURL: js.UndefOr[Boolean] = js.undefined
    
    var workerPath: js.UndefOr[String] = js.undefined
  }
  object PartialWorkerOptions {
    
    inline def apply(): PartialWorkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWorkerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialWorkerOptions] (val x: Self) extends AnyVal {
      
      inline def setCacheMethod(value: String): Self = StObject.set(x, "cacheMethod", value.asInstanceOf[js.Any])
      
      inline def setCacheMethodUndefined: Self = StObject.set(x, "cacheMethod", js.undefined)
      
      inline def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
      
      inline def setCachePathUndefined: Self = StObject.set(x, "cachePath", js.undefined)
      
      inline def setCorePath(value: String): Self = StObject.set(x, "corePath", value.asInstanceOf[js.Any])
      
      inline def setCorePathUndefined: Self = StObject.set(x, "corePath", js.undefined)
      
      inline def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
      
      inline def setDataPathUndefined: Self = StObject.set(x, "dataPath", js.undefined)
      
      inline def setErrorHandler(value: /* arg */ Any => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setLangPath(value: String): Self = StObject.set(x, "langPath", value.asInstanceOf[js.Any])
      
      inline def setLangPathUndefined: Self = StObject.set(x, "langPath", js.undefined)
      
      inline def setLogger(value: /* arg */ Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setWorkerBlobURL(value: Boolean): Self = StObject.set(x, "workerBlobURL", value.asInstanceOf[js.Any])
      
      inline def setWorkerBlobURLUndefined: Self = StObject.set(x, "workerBlobURL", js.undefined)
      
      inline def setWorkerPath(value: String): Self = StObject.set(x, "workerPath", value.asInstanceOf[js.Any])
      
      inline def setWorkerPathUndefined: Self = StObject.set(x, "workerPath", js.undefined)
    }
  }
  
  /* Inlined std.Partial<tesseract.js.tesseract.js.WorkerParams> */
  trait PartialWorkerParams extends StObject {
    
    var preserve_interword_spaces: js.UndefOr[String] = js.undefined
    
    var tessedit_char_whitelist: js.UndefOr[String] = js.undefined
    
    var tessedit_ocr_engine_mode: js.UndefOr[OEM] = js.undefined
    
    var tessedit_pageseg_mode: js.UndefOr[PSM] = js.undefined
    
    var tessjs_create_box: js.UndefOr[String] = js.undefined
    
    var tessjs_create_hocr: js.UndefOr[String] = js.undefined
    
    var tessjs_create_osd: js.UndefOr[String] = js.undefined
    
    var tessjs_create_tsv: js.UndefOr[String] = js.undefined
    
    var tessjs_create_unlv: js.UndefOr[String] = js.undefined
    
    var user_defined_dpi: js.UndefOr[String] = js.undefined
  }
  object PartialWorkerParams {
    
    inline def apply(): PartialWorkerParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWorkerParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialWorkerParams] (val x: Self) extends AnyVal {
      
      inline def setPreserve_interword_spaces(value: String): Self = StObject.set(x, "preserve_interword_spaces", value.asInstanceOf[js.Any])
      
      inline def setPreserve_interword_spacesUndefined: Self = StObject.set(x, "preserve_interword_spaces", js.undefined)
      
      inline def setTessedit_char_whitelist(value: String): Self = StObject.set(x, "tessedit_char_whitelist", value.asInstanceOf[js.Any])
      
      inline def setTessedit_char_whitelistUndefined: Self = StObject.set(x, "tessedit_char_whitelist", js.undefined)
      
      inline def setTessedit_ocr_engine_mode(value: OEM): Self = StObject.set(x, "tessedit_ocr_engine_mode", value.asInstanceOf[js.Any])
      
      inline def setTessedit_ocr_engine_modeUndefined: Self = StObject.set(x, "tessedit_ocr_engine_mode", js.undefined)
      
      inline def setTessedit_pageseg_mode(value: PSM): Self = StObject.set(x, "tessedit_pageseg_mode", value.asInstanceOf[js.Any])
      
      inline def setTessedit_pageseg_modeUndefined: Self = StObject.set(x, "tessedit_pageseg_mode", js.undefined)
      
      inline def setTessjs_create_box(value: String): Self = StObject.set(x, "tessjs_create_box", value.asInstanceOf[js.Any])
      
      inline def setTessjs_create_boxUndefined: Self = StObject.set(x, "tessjs_create_box", js.undefined)
      
      inline def setTessjs_create_hocr(value: String): Self = StObject.set(x, "tessjs_create_hocr", value.asInstanceOf[js.Any])
      
      inline def setTessjs_create_hocrUndefined: Self = StObject.set(x, "tessjs_create_hocr", js.undefined)
      
      inline def setTessjs_create_osd(value: String): Self = StObject.set(x, "tessjs_create_osd", value.asInstanceOf[js.Any])
      
      inline def setTessjs_create_osdUndefined: Self = StObject.set(x, "tessjs_create_osd", js.undefined)
      
      inline def setTessjs_create_tsv(value: String): Self = StObject.set(x, "tessjs_create_tsv", value.asInstanceOf[js.Any])
      
      inline def setTessjs_create_tsvUndefined: Self = StObject.set(x, "tessjs_create_tsv", js.undefined)
      
      inline def setTessjs_create_unlv(value: String): Self = StObject.set(x, "tessjs_create_unlv", value.asInstanceOf[js.Any])
      
      inline def setTessjs_create_unlvUndefined: Self = StObject.set(x, "tessjs_create_unlv", js.undefined)
      
      inline def setUser_defined_dpi(value: String): Self = StObject.set(x, "user_defined_dpi", value.asInstanceOf[js.Any])
      
      inline def setUser_defined_dpiUndefined: Self = StObject.set(x, "user_defined_dpi", js.undefined)
    }
  }
}
