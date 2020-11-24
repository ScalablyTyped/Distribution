package typings.winstonDailyRotateFile.mod

import typings.node.NodeJS.WritableStream
import typings.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class GeneralDailyRotateFileTransportOptionsOps[Self <: GeneralDailyRotateFileTransportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuditFile(value: String): Self = this.set("auditFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuditFile: Self = this.set("auditFile", js.undefined)
    
    @scala.inline
    def setCreateSymlink(value: Boolean): Self = this.set("createSymlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateSymlink: Self = this.set("createSymlink", js.undefined)
    
    @scala.inline
    def setDatePattern(value: String): Self = this.set("datePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatePattern: Self = this.set("datePattern", js.undefined)
    
    @scala.inline
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirname: Self = this.set("dirname", js.undefined)
    
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFrequency(value: String): Self = this.set("frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setMaxFiles(value: String | Double): Self = this.set("maxFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFiles: Self = this.set("maxFiles", js.undefined)
    
    @scala.inline
    def setMaxSize(value: String | Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setOptions(value: String | js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setSymlinkName(value: String): Self = this.set("symlinkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymlinkName: Self = this.set("symlinkName", js.undefined)
    
    @scala.inline
    def setUtc(value: Boolean): Self = this.set("utc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtc: Self = this.set("utc", js.undefined)
    
    @scala.inline
    def setZippedArchive(value: Boolean): Self = this.set("zippedArchive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZippedArchive: Self = this.set("zippedArchive", js.undefined)
  }
}
