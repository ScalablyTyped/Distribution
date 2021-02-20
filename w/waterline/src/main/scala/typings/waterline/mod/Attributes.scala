package typings.waterline.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends /* index */ StringDictionary[Attribute] {
  
  var toJSON: js.UndefOr[js.Function0[String]] = js.native
  
  var toObject: js.UndefOr[js.Function0[_]] = js.native
}
object Attributes {
  
  @scala.inline
  def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    @scala.inline
    def setToObject(value: () => _): Self = StObject.set(x, "toObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToObjectUndefined: Self = StObject.set(x, "toObject", js.undefined)
  }
}
