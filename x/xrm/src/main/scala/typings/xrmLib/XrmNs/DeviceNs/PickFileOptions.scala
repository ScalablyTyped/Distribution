package typings
package xrmLib.XrmNs.DeviceNs

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
  var allowMultipleFiles: scala.Boolean
  /**
    * Maximum size of the files(s) to be selected.
    */
  var maximumAllowedFileSize: scala.Double
}

object PickFileOptions {
  @scala.inline
  def apply(accept: PickFileTypes, allowMultipleFiles: scala.Boolean, maximumAllowedFileSize: scala.Double): PickFileOptions = {
    val __obj = js.Dynamic.literal(accept = accept, allowMultipleFiles = allowMultipleFiles, maximumAllowedFileSize = maximumAllowedFileSize)
  
    __obj.asInstanceOf[PickFileOptions]
  }
}

