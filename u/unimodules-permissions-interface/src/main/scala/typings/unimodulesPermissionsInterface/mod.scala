package typings.unimodulesPermissionsInterface

import typings.unimodulesPermissionsInterface.unimodulesPermissionsInterfaceStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait PermissionStatus extends StObject
  @JSImport("unimodules-permissions-interface", "PermissionStatus")
  @js.native
  object PermissionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PermissionStatus & String] = js.native
    
    @js.native
    sealed trait DENIED
      extends StObject
         with PermissionStatus
    /* "denied" */ val DENIED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.DENIED & String = js.native
    
    @js.native
    sealed trait GRANTED
      extends StObject
         with PermissionStatus
    /* "granted" */ val GRANTED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.GRANTED & String = js.native
    
    @js.native
    sealed trait UNDETERMINED
      extends StObject
         with PermissionStatus
    /* "undetermined" */ val UNDETERMINED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.UNDETERMINED & String = js.native
  }
  
  type PermissionExpiration = never | Double
  
  trait PermissionResponse extends StObject {
    
    var canAskAgain: Boolean
    
    var expires: PermissionExpiration
    
    var granted: Boolean
    
    var status: PermissionStatus
  }
  object PermissionResponse {
    
    @scala.inline
    def apply(canAskAgain: Boolean, expires: PermissionExpiration, granted: Boolean, status: PermissionStatus): PermissionResponse = {
      val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionResponse]
    }
    
    @scala.inline
    implicit class PermissionResponseMutableBuilder[Self <: PermissionResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanAskAgain(value: Boolean): Self = StObject.set(x, "canAskAgain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires(value: PermissionExpiration): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranted(value: Boolean): Self = StObject.set(x, "granted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: PermissionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
