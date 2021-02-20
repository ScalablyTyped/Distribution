package typings.winrtUwp.Windows.Gaming.XboxLive.Storage

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait GameSaveBlobInfoGetResult extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: GameSaveErrorStatus = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var value: IVectorView[GameSaveBlobInfo] = js.native
}
object GameSaveBlobInfoGetResult {
  
  @scala.inline
  def apply(status: GameSaveErrorStatus, value: IVectorView[GameSaveBlobInfo]): GameSaveBlobInfoGetResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSaveBlobInfoGetResult]
  }
  
  @scala.inline
  implicit class GameSaveBlobInfoGetResultMutableBuilder[Self <: GameSaveBlobInfoGetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: GameSaveErrorStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: IVectorView[GameSaveBlobInfo]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
