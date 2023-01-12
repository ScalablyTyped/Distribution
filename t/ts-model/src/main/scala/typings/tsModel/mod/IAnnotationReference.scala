package typings.tsModel.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnnotationReference extends StObject {
  
  var name: String
  
  def value(key: String): Value
  
  var values: StringDictionary[Value]
}
object IAnnotationReference {
  
  inline def apply(name: String, value: String => Value, values: StringDictionary[Value]): IAnnotationReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = js.Any.fromFunction1(value), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnotationReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAnnotationReference] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String => Value): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    
    inline def setValues(value: StringDictionary[Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
