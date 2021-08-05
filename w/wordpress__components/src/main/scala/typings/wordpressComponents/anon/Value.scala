package typings.wordpressComponents.anon

import typings.wordpressComponents.autocompleteMod.Autocomplete._OptionCompletion
import typings.wordpressComponents.wordpressComponentsStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with _OptionCompletion {
  
  var action: replace
  
  var value: typings.wordpressRichText.mod.Value
}
object Value {
  
  inline def apply(value: typings.wordpressRichText.mod.Value): Value = {
    val __obj = js.Dynamic.literal(action = "replace", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setAction(value: replace): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typings.wordpressRichText.mod.Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
