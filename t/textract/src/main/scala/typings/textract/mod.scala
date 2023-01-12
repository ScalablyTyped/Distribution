package typings.textract

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.childProcessMod.ExecException
import typings.node.urlMod.URL_
import typings.textract.anon.Cmd
import typings.textract.anon.Crop
import typings.textract.anon.Lang
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("textract", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromBufferWithMime(
    mimeType: String,
    buffer: Buffer,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBufferWithMime")(mimeType.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromBufferWithMime(
    mimeType: String,
    buffer: Buffer,
    config: Config,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBufferWithMime")(mimeType.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fromBufferWithName(
    name: String,
    buffer: Buffer,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBufferWithName")(name.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromBufferWithName(
    name: String,
    buffer: Buffer,
    config: Config,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBufferWithName")(name.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fromFileWithMimeAndPath(
    mimeType: String,
    filePath: String,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFileWithMimeAndPath")(mimeType.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromFileWithMimeAndPath(
    mimeType: String,
    filePath: String,
    config: Config,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFileWithMimeAndPath")(mimeType.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fromFileWithPath(filePath: String, callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFileWithPath")(filePath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromFileWithPath(
    filePath: String,
    config: Config,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFileWithPath")(filePath.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fromUrl(url: String, callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromUrl(
    url: String,
    config: URLConfig,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromUrl(url: URL_, callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromUrl(
    url: URL_,
    config: URLConfig,
    callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Config extends StObject {
    
    /**
      * Doc extractor options for non OS X.
      * See `drawingtotext` manual for available options
      */
    var doc: js.UndefOr[extractorExecOpts] = js.undefined
    
    /**
      * DXF extractor options.
      * See `antiword` manual for available options
      */
    var dxf: js.UndefOr[extractorExecOpts] = js.undefined
    
    /**
      * Some extractors (dxf) use node's exec functionality.
      * This setting allows for providing config to exec execution.
      * One reason you might want to provide this config is if you are dealing with very large files.
      * You might want to increase the exec maxBuffer setting.
      */
    var exec: js.UndefOr[ExecException] = js.undefined
    
    /**
      * Images (png, jpg, gif) extractor options.
      * See `tesseract` manual for available options
      */
    var images: js.UndefOr[extractorExecOpts] = js.undefined
    
    /**
      * When extracting HTML, whether or not to include `alt` text with the extracted text.
      * @default false
      */
    var includeAltText: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This is a proxy options object to the library textract uses for pdf extraction: pdf-text-extract.
      * Options include ownerPassword, userPassword if you are extracting text from password protected PDFs.
      * IMPORTANT: textract modifies the pdf-text-extract layout default so that, instead of layout: layout, it uses layout:raw.
      * It is not suggested you modify this without understanding what trouble that might get you in.
      * See [this GH issue](https://github.com/dbashford/textract/issues/75) for why textract overrides that library's default.
      */
    var pdftotextOptions: js.UndefOr[Crop] = js.undefined
    
    /**
      * Pass this in as true and textract will not strip any line breaks.
      * @default false
      */
    var preserveLineBreaks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Some extractors, like PDF, insert line breaks at the end of every line, even if the middle of a sentence.
      * If this option is set to true, then any instances of a single line break are removed but multiple line breaks are preserved.
      * Check your output with this option, though, this doesn't preserve paragraphs unless there are multiple breaks.
      * @default false
      */
    var preserveOnlyMultipleLineBreaks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * RTF extractor options.
      * See `unrtf` manual for available options
      */
    var rtf: js.UndefOr[extractorExecOpts] = js.undefined
    
    var tesseract: js.UndefOr[Lang | Cmd] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setDoc(value: extractorExecOpts): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      inline def setDxf(value: extractorExecOpts): Self = StObject.set(x, "dxf", value.asInstanceOf[js.Any])
      
      inline def setDxfUndefined: Self = StObject.set(x, "dxf", js.undefined)
      
      inline def setExec(value: ExecException): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      inline def setImages(value: extractorExecOpts): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setIncludeAltText(value: Boolean): Self = StObject.set(x, "includeAltText", value.asInstanceOf[js.Any])
      
      inline def setIncludeAltTextUndefined: Self = StObject.set(x, "includeAltText", js.undefined)
      
      inline def setPdftotextOptions(value: Crop): Self = StObject.set(x, "pdftotextOptions", value.asInstanceOf[js.Any])
      
      inline def setPdftotextOptionsUndefined: Self = StObject.set(x, "pdftotextOptions", js.undefined)
      
      inline def setPreserveLineBreaks(value: Boolean): Self = StObject.set(x, "preserveLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setPreserveLineBreaksUndefined: Self = StObject.set(x, "preserveLineBreaks", js.undefined)
      
      inline def setPreserveOnlyMultipleLineBreaks(value: Boolean): Self = StObject.set(x, "preserveOnlyMultipleLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setPreserveOnlyMultipleLineBreaksUndefined: Self = StObject.set(x, "preserveOnlyMultipleLineBreaks", js.undefined)
      
      inline def setRtf(value: extractorExecOpts): Self = StObject.set(x, "rtf", value.asInstanceOf[js.Any])
      
      inline def setRtfUndefined: Self = StObject.set(x, "rtf", js.undefined)
      
      inline def setTesseract(value: Lang | Cmd): Self = StObject.set(x, "tesseract", value.asInstanceOf[js.Any])
      
      inline def setTesseractUndefined: Self = StObject.set(x, "tesseract", js.undefined)
    }
  }
  
  trait URLConfig
    extends StObject
       with Config {
    
    /**
      * Used with fromUrl, if set, rather than using the content-type from the URL request, will use the provided typeOverride.
      */
    var typeOverride: js.UndefOr[String] = js.undefined
  }
  object URLConfig {
    
    inline def apply(): URLConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URLConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URLConfig] (val x: Self) extends AnyVal {
      
      inline def setTypeOverride(value: String): Self = StObject.set(x, "typeOverride", value.asInstanceOf[js.Any])
      
      inline def setTypeOverrideUndefined: Self = StObject.set(x, "typeOverride", js.undefined)
    }
  }
  
  trait extractorExecOpts extends StObject {
    
    var exec: StringDictionary[String]
  }
  object extractorExecOpts {
    
    inline def apply(exec: StringDictionary[String]): extractorExecOpts = {
      val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any])
      __obj.asInstanceOf[extractorExecOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: extractorExecOpts] (val x: Self) extends AnyVal {
      
      inline def setExec(value: StringDictionary[String]): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    }
  }
}
