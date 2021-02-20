package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyMapPcOptions extends StObject {
  
  var options: js.UndefOr[js.Any] = js.native
}
object KeyMapPcOptions {
  
  @scala.inline
  def apply(): KeyMapPcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyMapPcOptions]
  }
  
  @scala.inline
  implicit class KeyMapPcOptionsMutableBuilder[Self <: KeyMapPcOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
