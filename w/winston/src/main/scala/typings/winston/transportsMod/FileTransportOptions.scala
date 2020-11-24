package typings.winston.transportsMod

import typings.node.NodeJS.WritableStream
import typings.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileTransportOptions extends TransportStreamOptions {
  
  var dirname: js.UndefOr[String] = js.native
  
  var eol: js.UndefOr[String] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var maxFiles: js.UndefOr[Double] = js.native
  
  var maxsize: js.UndefOr[Double] = js.native
  
  var options: js.UndefOr[js.Object] = js.native
  
  var rotationFormat: js.UndefOr[js.Function] = js.native
  
  var stream: js.UndefOr[WritableStream] = js.native
  
  var tailable: js.UndefOr[Boolean] = js.native
  
  var zippedArchive: js.UndefOr[Boolean] = js.native
}
object FileTransportOptions {
  
  @scala.inline
  def apply(): FileTransportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileTransportOptions]
  }
  
  @scala.inline
  implicit class FileTransportOptionsOps[Self <: FileTransportOptions] (val x: Self) extends AnyVal {
    
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
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirname: Self = this.set("dirname", js.undefined)
    
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setMaxFiles(value: Double): Self = this.set("maxFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFiles: Self = this.set("maxFiles", js.undefined)
    
    @scala.inline
    def setMaxsize(value: Double): Self = this.set("maxsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxsize: Self = this.set("maxsize", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setRotationFormat(value: js.Function): Self = this.set("rotationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationFormat: Self = this.set("rotationFormat", js.undefined)
    
    @scala.inline
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setTailable(value: Boolean): Self = this.set("tailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTailable: Self = this.set("tailable", js.undefined)
    
    @scala.inline
    def setZippedArchive(value: Boolean): Self = this.set("zippedArchive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZippedArchive: Self = this.set("zippedArchive", js.undefined)
  }
}
