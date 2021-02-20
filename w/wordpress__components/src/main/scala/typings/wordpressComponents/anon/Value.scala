package typings.wordpressComponents.anon

import typings.wordpressComponents.autocompleteMod.Autocomplete._OptionCompletion
import typings.wordpressComponents.wordpressComponentsStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends _OptionCompletion {
  
  var action: replace = js.native
  
  var value: typings.wordpressRichText.mod.Value = js.native
}
object Value {
  
  @scala.inline
  def apply(action: replace, value: typings.wordpressRichText.mod.Value): Value = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: replace): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: typings.wordpressRichText.mod.Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
