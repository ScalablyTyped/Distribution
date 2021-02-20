package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app sets the version of the application data in its app data store. */
@js.native
trait SetVersionRequest extends StObject {
  
  /** Gets the current version. */
  var currentVersion: Double = js.native
  
  /** Gets the requested version. */
  var desiredVersion: Double = js.native
  
  /**
    * Requests that the set version request be delayed.
    * @return The set version deferral.
    */
  def getDeferral(): SetVersionDeferral = js.native
}
object SetVersionRequest {
  
  @scala.inline
  def apply(currentVersion: Double, desiredVersion: Double, getDeferral: () => SetVersionDeferral): SetVersionRequest = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], desiredVersion = desiredVersion.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[SetVersionRequest]
  }
  
  @scala.inline
  implicit class SetVersionRequestMutableBuilder[Self <: SetVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredVersion(value: Double): Self = StObject.set(x, "desiredVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => SetVersionDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
