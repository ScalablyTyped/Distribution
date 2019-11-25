package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileContentMetadata extends js.Object {
  var contentType: String
  var encoding: Double
  var extension: String
  var fileName: String
  var isBinary: Boolean
  var isImage: Boolean
  var vsLink: String
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
}

