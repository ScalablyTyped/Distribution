package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileContentMetadata extends StObject {
  
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
  implicit class FileContentMetadataMutableBuilder[Self <: FileContentMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: Double): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBinary(value: Boolean): Self = StObject.set(x, "isBinary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsImage(value: Boolean): Self = StObject.set(x, "isImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVsLink(value: String): Self = StObject.set(x, "vsLink", value.asInstanceOf[js.Any])
  }
}
