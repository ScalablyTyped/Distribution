package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyBag extends StObject {
  
  /**
    * Generic store for test session data
    */
  var bag: StringDictionary[String]
}
object PropertyBag {
  
  inline def apply(bag: StringDictionary[String]): PropertyBag = {
    val __obj = js.Dynamic.literal(bag = bag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyBag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyBag] (val x: Self) extends AnyVal {
    
    inline def setBag(value: StringDictionary[String]): Self = StObject.set(x, "bag", value.asInstanceOf[js.Any])
  }
}
