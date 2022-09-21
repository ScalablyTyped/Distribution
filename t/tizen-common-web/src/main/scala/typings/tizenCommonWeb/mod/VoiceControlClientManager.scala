package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceControlClientManager extends StObject {
  
  /**
    * Requests voice control Client instance.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/recorder
    *
    * @remark This method always returns the static voice control client object. That is, if you call a method
    * using one of voice control client objects, it affects other objects.
    *
    * @returns The object to manage voice control.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def getVoiceControlClient(): VoiceControlClient
}
object VoiceControlClientManager {
  
  inline def apply(getVoiceControlClient: () => VoiceControlClient): VoiceControlClientManager = {
    val __obj = js.Dynamic.literal(getVoiceControlClient = js.Any.fromFunction0(getVoiceControlClient))
    __obj.asInstanceOf[VoiceControlClientManager]
  }
  
  extension [Self <: VoiceControlClientManager](x: Self) {
    
    inline def setGetVoiceControlClient(value: () => VoiceControlClient): Self = StObject.set(x, "getVoiceControlClient", js.Any.fromFunction0(value))
  }
}
