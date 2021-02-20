package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISetVersionRequest extends StObject {
  
  var currentVersion: Double = js.native
  
  var desiredVersion: Double = js.native
  
  def getDeferral(): SetVersionDeferral = js.native
}
object ISetVersionRequest {
  
  @scala.inline
  def apply(currentVersion: Double, desiredVersion: Double, getDeferral: () => SetVersionDeferral): ISetVersionRequest = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], desiredVersion = desiredVersion.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[ISetVersionRequest]
  }
  
  @scala.inline
  implicit class ISetVersionRequestMutableBuilder[Self <: ISetVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredVersion(value: Double): Self = StObject.set(x, "desiredVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => SetVersionDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
