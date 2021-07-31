package typings.stripe.anon

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.mod.IObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Previousattributes extends StObject {
  
  /**
    * describes the object the event is about. For example, an
    * invoice.created event will have a full invoice object as the value of
    * the object key.
    */
  var `object`: IObject
  
  var previous_attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object Previousattributes {
  
  @scala.inline
  def apply(`object`: IObject): Previousattributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Previousattributes]
  }
  
  @scala.inline
  implicit class PreviousattributesMutableBuilder[Self <: Previousattributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: IObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious_attributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "previous_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious_attributesUndefined: Self = StObject.set(x, "previous_attributes", js.undefined)
  }
}
