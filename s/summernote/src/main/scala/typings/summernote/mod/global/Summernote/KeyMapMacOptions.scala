package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyMapMacOptions extends StObject {
  
  var options: js.UndefOr[js.Any] = js.native
}
object KeyMapMacOptions {
  
  @scala.inline
  def apply(): KeyMapMacOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyMapMacOptions]
  }
  
  @scala.inline
  implicit class KeyMapMacOptionsMutableBuilder[Self <: KeyMapMacOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
