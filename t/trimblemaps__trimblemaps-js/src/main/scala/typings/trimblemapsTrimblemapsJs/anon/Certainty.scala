package typings.trimblemapsTrimblemapsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certainty extends StObject {
  
  // TODO add values
  var certainty: js.UndefOr[String] = js.undefined
  
  // TODO add values
  var eventNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var isVisible: js.UndefOr[Boolean] = js.undefined
  
  var severity: js.UndefOr[String] = js.undefined
  
  // TODO add values
  var urgency: js.UndefOr[String] = js.undefined
}
object Certainty {
  
  inline def apply(): Certainty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certainty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Certainty] (val x: Self) extends AnyVal {
    
    inline def setCertainty(value: String): Self = StObject.set(x, "certainty", value.asInstanceOf[js.Any])
    
    inline def setCertaintyUndefined: Self = StObject.set(x, "certainty", js.undefined)
    
    inline def setEventNames(value: js.Array[String]): Self = StObject.set(x, "eventNames", value.asInstanceOf[js.Any])
    
    inline def setEventNamesUndefined: Self = StObject.set(x, "eventNames", js.undefined)
    
    inline def setEventNamesVarargs(value: String*): Self = StObject.set(x, "eventNames", js.Array(value*))
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setUrgency(value: String): Self = StObject.set(x, "urgency", value.asInstanceOf[js.Any])
    
    inline def setUrgencyUndefined: Self = StObject.set(x, "urgency", js.undefined)
  }
}
