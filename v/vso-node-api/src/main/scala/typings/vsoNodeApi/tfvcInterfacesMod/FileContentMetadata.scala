package typings.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileContentMetadata extends js.Object {
  
  var contentType: String = js.native
  
  var encoding: Double = js.native
  
  var extension: String = js.native
  
  var fileName: String = js.native
  
  var isBinary: Boolean = js.native
  
  var isImage: Boolean = js.native
  
  var vsLink: String = js.native
}
object FileContentMetadata {
  
  @scala.inline
  def apply(
    contentType: String,
    encoding: Double,
    extension: String,
    fileName: String,
    isBinary: Boolean,
    isImage: Boolean,
    vsLink: String
  ): FileContentMetadata = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], isBinary = isBinary.asInstanceOf[js.Any], isImage = isImage.asInstanceOf[js.Any], vsLink = vsLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileContentMetadata]
  }
  
  @scala.inline
  implicit class FileContentMetadataOps[Self <: FileContentMetadata] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: Double): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBinary(value: Boolean): Self = this.set("isBinary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsImage(value: Boolean): Self = this.set("isImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVsLink(value: String): Self = this.set("vsLink", value.asInstanceOf[js.Any])
  }
}
