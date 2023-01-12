package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overloads extends StObject {
  
  var overloads: Type
  
  var privacies: Enum
  
  var tags: Properties
}
object Overloads {
  
  inline def apply(overloads: Type, privacies: Enum, tags: Properties): Overloads = {
    val __obj = js.Dynamic.literal(overloads = overloads.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overloads]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Overloads] (val x: Self) extends AnyVal {
    
    inline def setOverloads(value: Type): Self = StObject.set(x, "overloads", value.asInstanceOf[js.Any])
    
    inline def setPrivacies(value: Enum): Self = StObject.set(x, "privacies", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Properties): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
