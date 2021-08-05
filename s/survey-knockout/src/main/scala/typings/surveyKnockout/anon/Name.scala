package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: String
  
  var onGetTextCallback: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
}
object Name {
  
  inline def apply(name: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnGetTextCallback(value: /* str */ String => String): Self = StObject.set(x, "onGetTextCallback", js.Any.fromFunction1(value))
    
    inline def setOnGetTextCallbackUndefined: Self = StObject.set(x, "onGetTextCallback", js.undefined)
  }
}
