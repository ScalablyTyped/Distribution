package typings.tiffToPng.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleConvertResult extends js.Object {
  
  val converted: Converted = js.native
  
  val error: TiffConverterError = js.native
}
object SingleConvertResult {
  
  @scala.inline
  def apply(converted: Converted, error: TiffConverterError): SingleConvertResult = {
    val __obj = js.Dynamic.literal(converted = converted.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleConvertResult]
  }
  
  @scala.inline
  implicit class SingleConvertResultOps[Self <: SingleConvertResult] (val x: Self) extends AnyVal {
    
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
    def setConverted(value: Converted): Self = this.set("converted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: TiffConverterError): Self = this.set("error", value.asInstanceOf[js.Any])
  }
}
