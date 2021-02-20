package typings.winrtUwp.Windows.Gaming.XboxLive.Storage

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait GameSaveBlobGetResult extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: GameSaveErrorStatus = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var value: IMapView[String, IBuffer] = js.native
}
object GameSaveBlobGetResult {
  
  @scala.inline
  def apply(status: GameSaveErrorStatus, value: IMapView[String, IBuffer]): GameSaveBlobGetResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSaveBlobGetResult]
  }
  
  @scala.inline
  implicit class GameSaveBlobGetResultMutableBuilder[Self <: GameSaveBlobGetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: GameSaveErrorStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: IMapView[String, IBuffer]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
