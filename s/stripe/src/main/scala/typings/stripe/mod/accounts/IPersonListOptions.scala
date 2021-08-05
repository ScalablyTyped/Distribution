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
  
  inline def apply(relationship: Executive): IPersonListOptions = {
    val __obj = js.Dynamic.literal(relationship = relationship.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonListOptions]
  }
  
  extension [Self <: IPersonListOptions](x: Self) {
    
    inline def setRelationship(value: Executive): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
  }
}
