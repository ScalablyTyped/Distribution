package typings.xrm.Xrm.Navigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDetails extends js.Object {
  /**
    * Contents of the file.
    */
  var fileContent: String
  /**
    * Name of the file.
    */
  var fileName: String
  /**
    * Size of the file in KB.
    */
  var fileSize: Double
  /**
    * String. MIME type of the file.
    */
  var mimeType: String
}

object FileDetails {
  @scala.inline
  def apply(fileContent: String, fileName: String, fileSize: Double, mimeType: String): FileDetails = {
    val __obj = js.Dynamic.literal(fileContent = fileContent.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileDetails]
  }
}

