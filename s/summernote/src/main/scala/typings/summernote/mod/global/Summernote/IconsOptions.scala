package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconsOptions extends StObject {
  
  var options: js.UndefOr[js.Any] = js.undefined
}
object IconsOptions {
  
  @scala.inline
  def apply(): IconsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconsOptions]
  }
  
  @scala.inline
  implicit class IconsOptionsMutableBuilder[Self <: IconsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
