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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("winston-daily-rotate-file", JSImport.Namespace)
  @js.native
  open class ^ () extends DailyRotateFile {
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
  
  trait GeneralDailyRotateFileTransportOptions
    extends StObject
       with TransportStreamOptions {
    
    /**
      * A string representing the name of the name of the audit file. (default: './hash-audit.json')
      */
    var auditFile: js.UndefOr[String] = js.undefined
    
    /**
      * Use specified hashing algorithm for audit. (default: 'sha256')
      */
    var auditHashType: js.UndefOr[String] = js.undefined
    
    /**
      * Create a tailable symlink to the current active log file. (default: false)
      */
    var createSymlink: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A string representing the moment.js date format to be used for rotating. The meta characters used in this string will dictate the frequency of the file rotation. For example, if your datePattern is simply 'HH' you will end up with 24 log files that are picked up and appended to every day. (default 'YYYY-MM-DD')
      */
    var datePattern: js.UndefOr[String] = js.undefined
    
    /**
      * The directory name to save log files to. (default: '.')
      */
    var dirname: js.UndefOr[String] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    /**
      * A string representing an extension to be added to the filename, if not included in the filename property. (default: '')
      */
    var `extension`: js.UndefOr[String] = js.undefined
    
    /**
      * Filename to be used to log to. This filename can include the %DATE% placeholder which will include the formatted datePattern at that point in the filename. (default: 'winston.log.%DATE%)
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * A string representing the frequency of rotation. (default: 'custom')
      */
    var frequency: js.UndefOr[String] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of logs to keep. If not set, no logs will be removed. This can be a number of files or number of days. If using days, add 'd' as the suffix. (default: null)
      */
    var maxFiles: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Maximum size of the file after which it will rotate. This can be a number of bytes, or units of kb, mb, and gb. If using the units, add 'k', 'm', or 'g' as the suffix. The units need to directly follow the number. (default: null)
      */
    var maxSize: js.UndefOr[String | Double] = js.undefined
    
    /**
      * An object resembling https://nodejs.org/api/fs.html#fs_fs_createwritestream_path_options indicating additional options that should be passed to the file stream. (default: `{ flags: 'a' }`)
      */
    var options: js.UndefOr[String | js.Object] = js.undefined
    
    /**
      * Write directly to a custom stream and bypass the rotation capabilities. (default: null)
      */
    var stream: js.UndefOr[WritableStream] = js.undefined
    
    /**
      * The name of the tailable symlink. (default: 'current.log')
      */
    var symlinkName: js.UndefOr[String] = js.undefined
    
    /**
      * A boolean whether or not to generate file name from "datePattern" in UTC format. (default: false)
      */
    var utc: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Watch the current file being written to and recreate it in case of accidental deletion. (default: FALSE)
      */
    var watchLog: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean to define whether or not to gzip archived log files. (default 'false')
      */
    var zippedArchive: js.UndefOr[Boolean] = js.undefined
  }
  object GeneralDailyRotateFileTransportOptions {
    
    inline def apply(): GeneralDailyRotateFileTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeneralDailyRotateFileTransportOptions]
    }
    
    extension [Self <: GeneralDailyRotateFileTransportOptions](x: Self) {
      
      inline def setAuditFile(value: String): Self = StObject.set(x, "auditFile", value.asInstanceOf[js.Any])
      
      inline def setAuditFileUndefined: Self = StObject.set(x, "auditFile", js.undefined)
      
      inline def setAuditHashType(value: String): Self = StObject.set(x, "auditHashType", value.asInstanceOf[js.Any])
      
      inline def setAuditHashTypeUndefined: Self = StObject.set(x, "auditHashType", js.undefined)
      
      inline def setCreateSymlink(value: Boolean): Self = StObject.set(x, "createSymlink", value.asInstanceOf[js.Any])
      
      inline def setCreateSymlinkUndefined: Self = StObject.set(x, "createSymlink", js.undefined)
      
      inline def setDatePattern(value: String): Self = StObject.set(x, "datePattern", value.asInstanceOf[js.Any])
      
      inline def setDatePatternUndefined: Self = StObject.set(x, "datePattern", js.undefined)
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFrequency(value: String): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMaxFiles(value: String | Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
      
      inline def setMaxSize(value: String | Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setOptions(value: String | js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setSymlinkName(value: String): Self = StObject.set(x, "symlinkName", value.asInstanceOf[js.Any])
      
      inline def setSymlinkNameUndefined: Self = StObject.set(x, "symlinkName", js.undefined)
      
      inline def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      inline def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
      
      inline def setWatchLog(value: Boolean): Self = StObject.set(x, "watchLog", value.asInstanceOf[js.Any])
      
      inline def setWatchLogUndefined: Self = StObject.set(x, "watchLog", js.undefined)
      
      inline def setZippedArchive(value: Boolean): Self = StObject.set(x, "zippedArchive", value.asInstanceOf[js.Any])
      
      inline def setZippedArchiveUndefined: Self = StObject.set(x, "zippedArchive", js.undefined)
    }
  }
  
  // referenced from https://stackoverflow.com/questions/40510611/typescript-interface-require-one-of-two-properties-to-exist
  type RequireOnlyOne[T, Keys /* <: /* keyof T */ String */] = (Pick[T, Exclude[/* keyof T */ String, Keys]]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Pick<T, K> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
  
  // merging into winston.transports
  /* augmented module */
  object winstonLibWinstonTransportsAugmentingMod {
    
    trait Transports extends StObject {
      
      var DailyRotateFile: Instantiable1[
            /* options */ js.UndefOr[DailyRotateFileTransportOptions], 
            typings.winstonDailyRotateFile.mod.DailyRotateFile
          ]
      
      var DailyRotateFileTransportOptions: typings.winstonDailyRotateFile.mod.DailyRotateFileTransportOptions
    }
    object Transports {
      
      inline def apply(
        DailyRotateFile: Instantiable1[/* options */ js.UndefOr[DailyRotateFileTransportOptions], DailyRotateFile],
        DailyRotateFileTransportOptions: DailyRotateFileTransportOptions
      ): Transports = {
        val __obj = js.Dynamic.literal(DailyRotateFile = DailyRotateFile.asInstanceOf[js.Any], DailyRotateFileTransportOptions = DailyRotateFileTransportOptions.asInstanceOf[js.Any])
        __obj.asInstanceOf[Transports]
      }
      
      extension [Self <: Transports](x: Self) {
        
        inline def setDailyRotateFile(value: Instantiable1[/* options */ js.UndefOr[DailyRotateFileTransportOptions], DailyRotateFile]): Self = StObject.set(x, "DailyRotateFile", value.asInstanceOf[js.Any])
        
        inline def setDailyRotateFileTransportOptions(value: DailyRotateFileTransportOptions): Self = StObject.set(x, "DailyRotateFileTransportOptions", value.asInstanceOf[js.Any])
      }
    }
  }
}
