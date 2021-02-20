package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenFilePickerOptions extends FilePickerOptions {
  
  var multiple: js.UndefOr[Boolean] = js.native
}
object OpenFilePickerOptions {
  
  @scala.inline
  def apply(): OpenFilePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenFilePickerOptions]
  }
  
  @scala.inline
  implicit class OpenFilePickerOptionsMutableBuilder[Self <: OpenFilePickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
