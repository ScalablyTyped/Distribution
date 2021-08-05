package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddUserOptions extends StObject {
  
  /**
    * Custom data associated with the user (only Mongodb 2.6 or higher).
    */
  var customData: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Specify a file sync write concern.
    */
  var fsync: Boolean
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Roles associated with the created user (only Mongodb 2.6 or higher).
    */
  var roles: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[scala.Double | String] = js.undefined
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[scala.Double] = js.undefined
}
object AddUserOptions {
  
  inline def apply(fsync: Boolean): AddUserOptions = {
    val __obj = js.Dynamic.literal(fsync = fsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddUserOptions]
  }
  
  extension [Self <: AddUserOptions](x: Self) {
    
    inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    inline def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
    
    inline def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    inline def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    inline def setRoles(value: js.Array[js.Object]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: js.Object*): Self = StObject.set(x, "roles", js.Array(value :_*))
    
    inline def setW(value: scala.Double | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setWtimeout(value: scala.Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    inline def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
