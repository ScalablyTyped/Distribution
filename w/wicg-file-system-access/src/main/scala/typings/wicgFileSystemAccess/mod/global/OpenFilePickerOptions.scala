package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenFilePickerOptions
  extends StObject
     with FilePickerOptions {
  
  var multiple: js.UndefOr[Boolean] = js.undefined
}
object OpenFilePickerOptions {
  
  inline def apply(): OpenFilePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenFilePickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenFilePickerOptions] (val x: Self) extends AnyVal {
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
