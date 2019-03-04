package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileContentMetadata extends js.Object {
  var contentType: java.lang.String
  var encoding: scala.Double
  var extension: java.lang.String
  var fileName: java.lang.String
  var isBinary: scala.Boolean
  var isImage: scala.Boolean
  var vsLink: java.lang.String
}

object FileContentMetadata {
  @scala.inline
  def apply(
    contentType: java.lang.String,
    encoding: scala.Double,
    extension: java.lang.String,
    fileName: java.lang.String,
    isBinary: scala.Boolean,
    isImage: scala.Boolean,
    vsLink: java.lang.String
  ): FileContentMetadata = {
    val __obj = js.Dynamic.literal(contentType = contentType, encoding = encoding, extension = extension, fileName = fileName, isBinary = isBinary, isImage = isImage, vsLink = vsLink)
  
    __obj.asInstanceOf[FileContentMetadata]
  }
}

