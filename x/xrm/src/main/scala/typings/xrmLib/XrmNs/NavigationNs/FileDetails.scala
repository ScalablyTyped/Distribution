package typings
package xrmLib.XrmNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDetails extends js.Object {
  /**
    * Contents of the file.
    */
  var fileContent: java.lang.String
  /**
    * Name of the file.
    */
  var fileName: java.lang.String
  /**
    * Size of the file in KB.
    */
  var fileSize: scala.Double
  /**
    * String. MIME type of the file.
    */
  var mimeType: java.lang.String
}

object FileDetails {
  @scala.inline
  def apply(
    fileContent: java.lang.String,
    fileName: java.lang.String,
    fileSize: scala.Double,
    mimeType: java.lang.String
  ): FileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileContent")(fileContent)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("fileSize")(fileSize)
    __obj.updateDynamic("mimeType")(mimeType)
    __obj.asInstanceOf[FileDetails]
  }
}

