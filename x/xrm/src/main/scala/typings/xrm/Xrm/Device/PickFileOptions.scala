package typings.xrm.Xrm.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for Xrm.Device.pickFile options
  */
@js.native
trait PickFileOptions extends js.Object {
  
  /**
    * Image file types to select.
    */
  var accept: PickFileTypes = js.native
  
  /**
    * Indicates whether to allow selecting multiple files.
    */
  var allowMultipleFiles: Boolean = js.native
  
  /**
    * Maximum size of the files(s) to be selected.
    */
  var maximumAllowedFileSize: Double = js.native
}
object PickFileOptions {
  
  @scala.inline
  def apply(accept: PickFileTypes, allowMultipleFiles: Boolean, maximumAllowedFileSize: Double): PickFileOptions = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], allowMultipleFiles = allowMultipleFiles.asInstanceOf[js.Any], maximumAllowedFileSize = maximumAllowedFileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickFileOptions]
  }
  
  @scala.inline
  implicit class PickFileOptionsOps[Self <: PickFileOptions] (val x: Self) extends AnyVal {
    
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
    def setAccept(value: PickFileTypes): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultipleFiles(value: Boolean): Self = this.set("allowMultipleFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumAllowedFileSize(value: Double): Self = this.set("maximumAllowedFileSize", value.asInstanceOf[js.Any])
  }
}
