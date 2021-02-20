package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeleteConfirmation extends StObject {
  
  var deleted: Boolean = js.native
  
  var id: String = js.native
  
  var `object`: String = js.native
}
object IDeleteConfirmation {
  
  @scala.inline
  def apply(deleted: Boolean, id: String, `object`: String): IDeleteConfirmation = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteConfirmation]
  }
  
  @scala.inline
  implicit class IDeleteConfirmationMutableBuilder[Self <: IDeleteConfirmation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
