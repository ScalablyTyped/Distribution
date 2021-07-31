package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IListOptionsCreated
  extends StObject
     with IListOptions {
  
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp, or it can
    * be a dictionary.
    */
  var created: js.UndefOr[String | IDateFilter] = js.undefined
}
object IListOptionsCreated {
  
  @scala.inline
  def apply(): IListOptionsCreated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListOptionsCreated]
  }
  
  @scala.inline
  implicit class IListOptionsCreatedMutableBuilder[Self <: IListOptionsCreated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: String | IDateFilter): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
  }
}
