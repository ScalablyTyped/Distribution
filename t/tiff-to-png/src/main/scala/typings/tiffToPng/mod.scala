package typings.tiffToPng

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.tiffToPng.tiffToPngBooleans.`true`
import typings.tiffToPng.tiffToPngNumbers.`1`
import typings.tiffToPng.tiffToPngNumbers.`2`
import typings.tiffToPng.tiffToPngStrings.A3
import typings.tiffToPng.tiffToPngStrings.A4
import typings.tiffToPng.tiffToPngStrings.jpg
import typings.tiffToPng.tiffToPngStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tiff-to-png", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with TiffConverter {
    def this(options: Options) = this()
  }
  @JSImport("tiff-to-png", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def call(command: String): js.Promise[`true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("call")(command.asInstanceOf[js.Any]).asInstanceOf[js.Promise[`true`]]
  
  @scala.inline
  def count(converted: js.Array[StringDictionary[js.Any]], key: String, value: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(converted.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  /* static member */
  @scala.inline
  def count(converted: StringDictionary[js.Any], key: String, value: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(converted.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def createDir(target: String, filename: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDir")(target.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * The complete callback will be called when the conversion of the final TIFF has finished.
    */
  type CompleteCallback = js.Function2[/* errors */ js.Array[String], /* total */ js.UndefOr[Double], Unit]
  
  trait ConvertResult extends StObject {
    
    val converted: js.Array[Converted]
    
    val errors: js.Array[TiffConverterError]
    
    val total: Double
  }
  object ConvertResult {
    
    @scala.inline
    def apply(converted: js.Array[Converted], errors: js.Array[TiffConverterError], total: Double): ConvertResult = {
      val __obj = js.Dynamic.literal(converted = converted.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertResult]
    }
    
    @scala.inline
    implicit class ConvertResultMutableBuilder[Self <: ConvertResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConverted(value: js.Array[Converted]): Self = StObject.set(x, "converted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertedVarargs(value: Converted*): Self = StObject.set(x, "converted", js.Array(value :_*))
      
      @scala.inline
      def setErrors(value: js.Array[TiffConverterError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: TiffConverterError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Converted extends StObject {
    
    val filename: String
    
    val success: Boolean
    
    val target: String
    
    val tiff: String
  }
  object Converted {
    
    @scala.inline
    def apply(filename: String, success: Boolean, target: String, tiff: String): Converted = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tiff = tiff.asInstanceOf[js.Any])
      __obj.asInstanceOf[Converted]
    }
    
    @scala.inline
    implicit class ConvertedMutableBuilder[Self <: Converted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiff(value: String): Self = StObject.set(x, "tiff", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Automatically removes all files from tmpPath prefixed with magick-*, this happens on process completion
      * @default false
      */
    var autoRemoveTmp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows the specification of the command path for use with binaries or aliased convert commands
      * @default null
      */
    var commandPath: js.UndefOr[String] = js.undefined
    
    /**
      * The level of the logs required. 0: Errors only, 1: Information
      * @default 0
      */
    var logLevel: js.UndefOr[Double] = js.undefined
    
    var page: js.UndefOr[A4 | A3] = js.undefined
    
    /**
      * The string that will be prepended to the file names of the pages converted. E.g. 'page': `page1.png`
      * @default 'page'
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    var saveFolder: js.UndefOr[String] = js.undefined
    
    /**
      * The image scene number
      * @default null
      */
    var scene: js.UndefOr[`1` | `2`] = js.undefined
    
    /**
      * The string that will be appended onto the end of the file names of the page converted. E.g. '_invoices': page1_invoices.png
      * @default ''
      */
    var suffix: js.UndefOr[String] = js.undefined
    
    /**
      * Overwrites the Imagemagick default tmp directory path
      * @default null
      */
    var tmpPath: js.UndefOr[String] = js.undefined
    
    /**
      * The file type of the converted files
      * @default 'png'
      */
    var `type`: js.UndefOr[png | jpg] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoRemoveTmp(value: Boolean): Self = StObject.set(x, "autoRemoveTmp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRemoveTmpUndefined: Self = StObject.set(x, "autoRemoveTmp", js.undefined)
      
      @scala.inline
      def setCommandPath(value: String): Self = StObject.set(x, "commandPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandPathUndefined: Self = StObject.set(x, "commandPath", js.undefined)
      
      @scala.inline
      def setLogLevel(value: Double): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setPage(value: A4 | A3): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSaveFolder(value: String): Self = StObject.set(x, "saveFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveFolderUndefined: Self = StObject.set(x, "saveFolder", js.undefined)
      
      @scala.inline
      def setScene(value: `1` | `2`): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTmpPath(value: String): Self = StObject.set(x, "tmpPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmpPathUndefined: Self = StObject.set(x, "tmpPath", js.undefined)
      
      @scala.inline
      def setType(value: png | jpg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /**
    * The complete callback will be called when the conversion of the final TIFF has finished.
    */
  type ProgressCallback = js.Function2[/* converted */ js.Array[Converted], /* total */ Double, Unit]
  
  trait SingleConvertResult extends StObject {
    
    val converted: Converted
    
    val error: TiffConverterError
  }
  object SingleConvertResult {
    
    @scala.inline
    def apply(converted: Converted, error: TiffConverterError): SingleConvertResult = {
      val __obj = js.Dynamic.literal(converted = converted.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleConvertResult]
    }
    
    @scala.inline
    implicit class SingleConvertResultMutableBuilder[Self <: SingleConvertResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConverted(value: Converted): Self = StObject.set(x, "converted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: TiffConverterError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TiffConverter extends StObject {
    
    def complete(errors: js.Array[String]): Unit = js.native
    def complete(errors: js.Array[String], total: Double): Unit = js.native
    @JSName("complete")
    var complete_Original: CompleteCallback = js.native
    
    def convert(tiff: String, isArray: Boolean, location: String): js.Promise[SingleConvertResult] = js.native
    
    def convertArray(tiffs: js.Array[String], location: String): js.Promise[ConvertResult] = js.native
    
    def convertOne(tiff: String, location: String): js.Promise[ConvertResult] = js.native
    
    /** @default '' */
    var location: String = js.native
    
    def onComplete(error: js.Array[Error], converted: js.Array[Converted], total: Double): js.Promise[Unit] = js.native
    def onComplete(error: js.Array[Error], converted: Converted, total: Double): js.Promise[Unit] = js.native
    
    /** @default {} */
    var options: Options = js.native
    
    def progress(converted: js.Array[Converted], total: Double): Unit = js.native
    @JSName("progress")
    var progress_Original: ProgressCallback = js.native
    
    def removePaths(): js.Promise[Unit] = js.native
    
    def unlink(file: String): js.Promise[Unit] = js.native
  }
  
  trait TiffConverterError extends StObject {
    
    var error: Error
    
    val filename: String
    
    val target: String
    
    val tiff: String
  }
  object TiffConverterError {
    
    @scala.inline
    def apply(error: Error, filename: String, target: String, tiff: String): TiffConverterError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tiff = tiff.asInstanceOf[js.Any])
      __obj.asInstanceOf[TiffConverterError]
    }
    
    @scala.inline
    implicit class TiffConverterErrorMutableBuilder[Self <: TiffConverterError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiff(value: String): Self = StObject.set(x, "tiff", value.asInstanceOf[js.Any])
    }
  }
}
