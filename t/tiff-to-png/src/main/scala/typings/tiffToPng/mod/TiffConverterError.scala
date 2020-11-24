package typings.tiffToPng.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TiffConverterError extends js.Object {
  
  var error: Error = js.native
  
  val filename: String = js.native
  
  val target: String = js.native
  
  val tiff: String = js.native
}
object TiffConverterError {
  
  @scala.inline
  def apply(error: Error, filename: String, target: String, tiff: String): TiffConverterError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tiff = tiff.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiffConverterError]
  }
  
  @scala.inline
  implicit class TiffConverterErrorOps[Self <: TiffConverterError] (val x: Self) extends AnyVal {
    
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiff(value: String): Self = this.set("tiff", value.asInstanceOf[js.Any])
  }
}
