package typings.xrm.Xrm.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Xrm.Device.pickFile options
  */
trait PickFileOptions extends js.Object {
  /**
    * Image file types to select.
    */
  var accept: PickFileTypes
  /**
    * Indicates whether to allow selecting multiple files.
    */
  var allowMultipleFiles: Boolean
  /**
    * Maximum size of the files(s) to be selected.
    */
  var maximumAllowedFileSize: Double
}

object PickFileOptions {
  @scala.inline
  def apply(accept: PickFileTypes, allowMultipleFiles: Boolean, maximumAllowedFileSize: Double): PickFileOptions = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], allowMultipleFiles = allowMultipleFiles.asInstanceOf[js.Any], maximumAllowedFileSize = maximumAllowedFileSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickFileOptions]
  }
}

