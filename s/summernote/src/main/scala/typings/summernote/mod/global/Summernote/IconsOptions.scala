package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconsOptions extends StObject {
  
  var options: js.UndefOr[Any] = js.undefined
}
object IconsOptions {
  
  inline def apply(): IconsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconsOptions] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
