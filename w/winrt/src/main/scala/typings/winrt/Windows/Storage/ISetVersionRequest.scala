package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISetVersionRequest extends StObject {
  
  var currentVersion: Double
  
  var desiredVersion: Double
  
  def getDeferral(): SetVersionDeferral
}
object ISetVersionRequest {
  
  inline def apply(currentVersion: Double, desiredVersion: Double, getDeferral: () => SetVersionDeferral): ISetVersionRequest = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], desiredVersion = desiredVersion.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[ISetVersionRequest]
  }
  
  extension [Self <: ISetVersionRequest](x: Self) {
    
    inline def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setDesiredVersion(value: Double): Self = StObject.set(x, "desiredVersion", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: () => SetVersionDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
