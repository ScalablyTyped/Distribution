package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyBag extends StObject {
  
  /**
    * Generic store for test session data
    */
  var bag: StringDictionary[String] = js.native
}
object PropertyBag {
  
  @scala.inline
  def apply(bag: StringDictionary[String]): PropertyBag = {
    val __obj = js.Dynamic.literal(bag = bag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyBag]
  }
  
  @scala.inline
  implicit class PropertyBagMutableBuilder[Self <: PropertyBag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBag(value: StringDictionary[String]): Self = StObject.set(x, "bag", value.asInstanceOf[js.Any])
  }
}
