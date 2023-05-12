package typings.tesseractJs

import typings.tesseractJs.mod.OEM
import typings.tesseractJs.mod.PSM
import typings.tesseractJs.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<tesseract.js.tesseract.js.InitOptions> */
  trait PartialInitOptions extends StObject {
    
    var load_bigram_dawg: js.UndefOr[String] = js.undefined
    
    var load_freq_dawg: js.UndefOr[String] = js.undefined
    
    var load_number_dawg: js.UndefOr[String] = js.undefined
    
    var load_punc_dawg: js.UndefOr[String] = js.undefined
    
    var load_system_dawg: js.UndefOr[String] = js.undefined
    
    var load_unambig_dawg: js.UndefOr[String] = js.undefined
  }
  object PartialInitOptions {
    
    inline def apply(): PartialInitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInitOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialInitOptions] (val x: Self) extends AnyVal {
      
      inline def setLoad_bigram_dawg(value: String): Self = StObject.set(x, "load_bigram_dawg", value.asInstanceOf[js.Any])
      
      inline def setLoad_bigram_dawgUndefined: Self = StObject.set(x, "load_bigram_dawg", js.undefined)
      
      inline def setLoad_freq_dawg(value: String): Self = StObject.set(x, "load_freq_dawg", value.asInstanceOf[js.Any])
      
      inline def setLoad_freq_dawgUndefined: Self = StObject.set(x, "load_freq_dawg", js.undefined)
      
      inline def setLoad_number_dawg(value: String): Self = StObject.set(x, "load_number_dawg", value.asInstanceOf[js.Any])
      
      inline def setLoad_number_dawgUndefined: Self = StObject.set(x, "load_number_dawg", js.undefined)
      
      inline def setLoad_punc_dawg(value: String): Self = StObject.set(x, "load_punc_dawg", value.asInstanceOf[js.Any])
      
      inline def setLoad_punc_dawgUndefined: Self = StObject.set(x, "load_punc_dawg", js.undefined)
      
      inline def setLoad_system_dawg(value: String): Self = StObject.set(x, "load_system_dawg", value.asInstanceOf[js.Any])
      
      inline def setLoad_system_dawgUndefined: Self = StObject.set(x, "load_system_dawg", js.undefined)
      
      inline def setLoad_unambig_dawg(value: String): Self = StObject.set(x, "load_unambig_dawg", value.asInstanceOf[js.Any])
      
      inline def setLoad_unambig_dawgUndefined: Self = StObject.set(x, "load_unambig_dawg", js.undefined)
    }
  }
  
  /* Inlined std.Partial<tesseract.js.tesseract.js.OutputFormats> */
  trait PartialOutputFormats extends StObject {
    
    var blocks: js.UndefOr[Boolean] = js.undefined
    
    var box: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var hocr: js.UndefOr[Boolean] = js.undefined
    
    var imageBinary: js.UndefOr[Boolean] = js.undefined
    
    var imageColor: js.UndefOr[Boolean] = js.undefined
    
    var imageGrey: js.UndefOr[Boolean] = js.undefined
    
    var osd: js.UndefOr[Boolean] = js.undefined
    
    var pdf: js.UndefOr[Boolean] = js.undefined
    
    var text: js.UndefOr[Boolean] = js.undefined
    
    var tsv: js.UndefOr[Boolean] = js.undefined
    
    var unlv: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOutputFormats {
    
    inline def apply(): PartialOutputFormats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOutputFormats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOutputFormats] (val x: Self) extends AnyVal {
      
      inline def setBlocks(value: Boolean): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
      
      inline def setBox(value: Boolean): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setHocr(value: Boolean): Self = StObject.set(x, "hocr", value.asInstanceOf[js.Any])
      
      inline def setHocrUndefined: Self = StObject.set(x, "hocr", js.undefined)
      
      inline def setImageBinary(value: Boolean): Self = StObject.set(x, "imageBinary", value.asInstanceOf[js.Any])
      
      inline def setImageBinaryUndefined: Self = StObject.set(x, "imageBinary", js.undefined)
      
      inline def setImageColor(value: Boolean): Self = StObject.set(x, "imageColor", value.asInstanceOf[js.Any])
      
      inline def setImageColorUndefined: Self = StObject.set(x, "imageColor", js.undefined)
      
      inline def setImageGrey(value: Boolean): Self = StObject.set(x, "imageGrey", value.asInstanceOf[js.Any])
      
      inline def setImageGreyUndefined: Self = StObject.set(x, "imageGrey", js.undefined)
      
      inline def setOsd(value: Boolean): Self = StObject.set(x, "osd", value.asInstanceOf[js.Any])
      
      inline def setOsdUndefined: Self = StObject.set(x, "osd", js.undefined)
      
      inline def setPdf(value: Boolean): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
      
      inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
      
      inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTsv(value: Boolean): Self = StObject.set(x, "tsv", value.asInstanceOf[js.Any])
      
      inline def setTsvUndefined: Self = StObject.set(x, "tsv", js.undefined)
      
      inline def setUnlv(value: Boolean): Self = StObject.set(x, "unlv", value.asInstanceOf[js.Any])
      
      inline def setUnlvUndefined: Self = StObject.set(x, "unlv", js.undefined)
    }
  }
  
  /* Inlined std.Partial<tesseract.js.tesseract.js.RecognizeOptions> */
  trait PartialRecognizeOptions extends StObject {
    
    var pdfTextOnly: js.UndefOr[Boolean] = js.undefined
    
    var pdfTitle: js.UndefOr[String] = js.undefined
    
    var rectangle: js.UndefOr[Rectangle] = js.undefined
    
    var rotateAuto: js.UndefOr[Boolean] = js.undefined
    
    var rotateRadians: js.UndefOr[Double] = js.undefined
  }
  object PartialRecognizeOptions {
    
    inline def apply(): PartialRecognizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecognizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRecognizeOptions] (val x: Self) extends AnyVal {
      
      inline def setPdfTextOnly(value: Boolean): Self = StObject.set(x, "pdfTextOnly", value.asInstanceOf[js.Any])
      
      inline def setPdfTextOnlyUndefined: Self = StObject.set(x, "pdfTextOnly", js.undefined)
      
      inline def setPdfTitle(value: String): Self = StObject.set(x, "pdfTitle", value.asInstanceOf[js.Any])
      
      inline def setPdfTitleUndefined: Self = StObject.set(x, "pdfTitle", js.undefined)
      
      inline def setRectangle(value: Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
      
      inline def setRotateAuto(value: Boolean): Self = StObject.set(x, "rotateAuto", value.asInstanceOf[js.Any])
      
      inline def setRotateAutoUndefined: Self = StObject.set(x, "rotateAuto", js.undefined)
      
      inline def setRotateRadians(value: Double): Self = StObject.set(x, "rotateRadians", value.asInstanceOf[js.Any])
      
      inline def setRotateRadiansUndefined: Self = StObject.set(x, "rotateRadians", js.undefined)
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
