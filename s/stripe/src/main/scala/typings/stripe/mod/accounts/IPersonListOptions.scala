package typings.stripe.mod.accounts

import typings.stripe.anon.Executive
import typings.stripe.mod.IListOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonListOptions
  extends StObject
     with IListOptions {
  
  var relationship: Executive
}
object IPersonListOptions {
  
  @scala.inline
  def apply(relationship: Executive): IPersonListOptions = {
    val __obj = js.Dynamic.literal(relationship = relationship.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonListOptions]
  }
  
  @scala.inline
  implicit class IPersonListOptionsMutableBuilder[Self <: IPersonListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelationship(value: Executive): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
  }
}
