package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a user attribute privilege.
  */
trait Privilege extends StObject {
  
  /**
    * True if the user can create.
    */
  var canCreate: Boolean
  
  /**
    * True if the user can read.
    */
  var canRead: Boolean
  
  /**
    * True if the user can update.
    */
  var canUpdate: Boolean
}
object Privilege {
  
  inline def apply(canCreate: Boolean, canRead: Boolean, canUpdate: Boolean): Privilege = {
    val __obj = js.Dynamic.literal(canCreate = canCreate.asInstanceOf[js.Any], canRead = canRead.asInstanceOf[js.Any], canUpdate = canUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Privilege]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Privilege] (val x: Self) extends AnyVal {
    
    inline def setCanCreate(value: Boolean): Self = StObject.set(x, "canCreate", value.asInstanceOf[js.Any])
    
    inline def setCanRead(value: Boolean): Self = StObject.set(x, "canRead", value.asInstanceOf[js.Any])
    
    inline def setCanUpdate(value: Boolean): Self = StObject.set(x, "canUpdate", value.asInstanceOf[js.Any])
  }
}
