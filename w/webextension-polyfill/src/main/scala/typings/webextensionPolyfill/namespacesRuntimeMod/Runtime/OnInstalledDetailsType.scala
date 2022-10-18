package typings.webextensionPolyfill.namespacesRuntimeMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnInstalledDetailsType extends StObject {
  
  /**
    * Indicates the previous version of the extension, which has just been updated. This is present only if 'reason' is
    * 'update'.
    * Optional.
    */
  var previousVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The reason that this event is being dispatched.
    */
  var reason: OnInstalledReason
  
  /**
    * Indicates whether the addon is installed as a temporary extension.
    */
  var temporary: Boolean
}
object OnInstalledDetailsType {
  
  inline def apply(reason: OnInstalledReason, temporary: Boolean): OnInstalledDetailsType = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], temporary = temporary.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnInstalledDetailsType]
  }
  
  extension [Self <: OnInstalledDetailsType](x: Self) {
    
    inline def setPreviousVersion(value: String): Self = StObject.set(x, "previousVersion", value.asInstanceOf[js.Any])
    
    inline def setPreviousVersionUndefined: Self = StObject.set(x, "previousVersion", js.undefined)
    
    inline def setReason(value: OnInstalledReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
  }
}
