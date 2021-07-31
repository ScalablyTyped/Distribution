package typings.winrtUwp.Windows.Gaming.XboxLive.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
trait GameSaveProviderGetResult extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var value: GameSaveProvider
}
object GameSaveProviderGetResult {
  
  @scala.inline
  def apply(status: GameSaveErrorStatus, value: GameSaveProvider): GameSaveProviderGetResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSaveProviderGetResult]
  }
  
  @scala.inline
  implicit class GameSaveProviderGetResultMutableBuilder[Self <: GameSaveProviderGetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: GameSaveErrorStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: GameSaveProvider): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
