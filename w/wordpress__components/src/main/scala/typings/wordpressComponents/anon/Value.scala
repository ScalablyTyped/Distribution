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
  
  var value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Value */ Any
}
object Value {
  
  inline def apply(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Value */ Any
  ): Value = {
    val __obj = js.Dynamic.literal(action = "replace", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setAction(value: replace): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Value */ Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
