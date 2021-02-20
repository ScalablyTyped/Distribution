package typings.winstonDailyRotateFile

import org.scalablytyped.runtime.Instantiable1
import typings.node.NodeJS.WritableStream
import typings.std.Exclude
import typings.std.Pick
import typings.winstonDailyRotateFile.winstonDailyRotateFileStrings.filename
import typings.winstonDailyRotateFile.winstonDailyRotateFileStrings.stream
import typings.winstonTransport.mod.TransportStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("winston-daily-rotate-file", JSImport.Namespace)
  @js.native
  class ^ () extends DailyRotateFile {
    def this(options: DailyRotateFileTransportOptions) = this()
  }
  
  @js.native
  trait DailyRotateFile
    extends typings.winstonTransport.mod.^ {
    
    var dirname: String = js.native
    
    var filename: String = js.native
    
    var logStream: WritableStream = js.native
    
    var options: DailyRotateFileTransportOptions = js.native
  }
  
  type DailyRotateFileTransportOptions = RequireOnlyOne[GeneralDailyRotateFileTransportOptions, filename | stream]
  
  @js.native
  trait GeneralDailyRotateFileTransportOptions extends TransportStreamOptions {
    
    /**
      * A string representing the name of the name of the audit file. (default: './hash-audit.json')
      */
    var auditFile: js.UndefOr[String] = js.native
    
    /**
      * Create a tailable symlink to the current active log file. (default: false)
      */
    var createSymlink: js.UndefOr[Boolean] = js.native
    
    /**
      * A string representing the moment.js date format to be used for rotating. The meta characters used in this string will dictate the frequency of the file rotation. For example, if your datePattern is simply 'HH' you will end up with 24 log files that are picked up and appended to every day. (default 'YYYY-MM-DD')
      */
    var datePattern: js.UndefOr[String] = js.native
    
    /**
      * The directory name to save log files to. (default: '.')
      */
    var dirname: js.UndefOr[String] = js.native
    
    var eol: js.UndefOr[String] = js.native
    
    /**
      * A string representing an extension to be added to the filename, if not included in the filename property. (default: '')
      */
    var extension: js.UndefOr[String] = js.native
    
    /**
      * Filename to be used to log to. This filename can include the %DATE% placeholder which will include the formatted datePattern at that point in the filename. (default: 'winston.log.%DATE%)
      */
    var filename: js.UndefOr[String] = js.native
    
    /**
      * A string representing the frequency of rotation. (default: 'custom')
      */
    var frequency: js.UndefOr[String] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
    
    /**
      * Maximum number of logs to keep. If not set, no logs will be removed. This can be a number of files or number of days. If using days, add 'd' as the suffix. (default: null)
      */
    var maxFiles: js.UndefOr[String | Double] = js.native
    
    /**
      * Maximum size of the file after which it will rotate. This can be a number of bytes, or units of kb, mb, and gb. If using the units, add 'k', 'm', or 'g' as the suffix. The units need to directly follow the number. (default: null)
      */
    var maxSize: js.UndefOr[String | Double] = js.native
    
    /**
      * An object resembling https://nodejs.org/api/fs.html#fs_fs_createwritestream_path_options indicating additional options that should be passed to the file stream. (default: `{ flags: 'a' }`)
      */
    var options: js.UndefOr[String | js.Object] = js.native
    
    /**
      * Write directly to a custom stream and bypass the rotation capabilities. (default: null)
      */
    var stream: js.UndefOr[WritableStream] = js.native
    
    /**
      * The name of the tailable symlink. (default: 'current.log')
      */
    var symlinkName: js.UndefOr[String] = js.native
    
    /**
      * A boolean whether or not to generate file name from "datePattern" in UTC format. (default: false)
      */
    var utc: js.UndefOr[Boolean] = js.native
    
    /**
      * A boolean to define whether or not to gzip archived log files. (default 'false')
      */
    var zippedArchive: js.UndefOr[Boolean] = js.native
  }
  object GeneralDailyRotateFileTransportOptions {
    
    @scala.inline
    def apply(): GeneralDailyRotateFileTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeneralDailyRotateFileTransportOptions]
    }
    
    @scala.inline
    implicit class GeneralDailyRotateFileTransportOptionsMutableBuilder[Self <: GeneralDailyRotateFileTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuditFile(value: String): Self = StObject.set(x, "auditFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuditFileUndefined: Self = StObject.set(x, "auditFile", js.undefined)
      
      @scala.inline
      def setCreateSymlink(value: Boolean): Self = StObject.set(x, "createSymlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateSymlinkUndefined: Self = StObject.set(x, "createSymlink", js.undefined)
      
      @scala.inline
      def setDatePattern(value: String): Self = StObject.set(x, "datePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePatternUndefined: Self = StObject.set(x, "datePattern", js.undefined)
      
      @scala.inline
      def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setFrequency(value: String): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setMaxFiles(value: String | Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
      
      @scala.inline
      def setMaxSize(value: String | Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setOptions(value: String | js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setSymlinkName(value: String): Self = StObject.set(x, "symlinkName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymlinkNameUndefined: Self = StObject.set(x, "symlinkName", js.undefined)
      
      @scala.inline
      def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
      
      @scala.inline
      def setZippedArchive(value: Boolean): Self = StObject.set(x, "zippedArchive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZippedArchiveUndefined: Self = StObject.set(x, "zippedArchive", js.undefined)
    }
  }
  
  // referenced from https://stackoverflow.com/questions/40510611/typescript-interface-require-one-of-two-properties-to-exist
  type RequireOnlyOne[T, Keys /* <: /* keyof T */ String */] = (Pick[T, Exclude[/* keyof T */ String, Keys]]) with (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Required<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
  
  // merging into winston.transports
  object winstonLibWinstonTransportsAugmentingMod {
    
    @js.native
    trait Transports extends StObject {
      
      var DailyRotateFile: Instantiable1[
            /* options */ js.UndefOr[DailyRotateFileTransportOptions], 
            typings.winstonDailyRotateFile.mod.DailyRotateFile
          ] = js.native
      
      var DailyRotateFileTransportOptions: typings.winstonDailyRotateFile.mod.DailyRotateFileTransportOptions = js.native
    }
    object Transports {
      
      @scala.inline
      def apply(
        DailyRotateFile: Instantiable1[/* options */ js.UndefOr[DailyRotateFileTransportOptions], DailyRotateFile],
        DailyRotateFileTransportOptions: DailyRotateFileTransportOptions
      ): Transports = {
        val __obj = js.Dynamic.literal(DailyRotateFile = DailyRotateFile.asInstanceOf[js.Any], DailyRotateFileTransportOptions = DailyRotateFileTransportOptions.asInstanceOf[js.Any])
        __obj.asInstanceOf[Transports]
      }
      
      @scala.inline
      implicit class TransportsMutableBuilder[Self <: Transports] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDailyRotateFile(value: Instantiable1[/* options */ js.UndefOr[DailyRotateFileTransportOptions], DailyRotateFile]): Self = StObject.set(x, "DailyRotateFile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDailyRotateFileTransportOptions(value: DailyRotateFileTransportOptions): Self = StObject.set(x, "DailyRotateFileTransportOptions", value.asInstanceOf[js.Any])
      }
    }
  }
}
