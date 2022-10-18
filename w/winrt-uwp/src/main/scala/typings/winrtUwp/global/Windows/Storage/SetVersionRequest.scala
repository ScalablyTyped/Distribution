package typings.winrtUwp.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app sets the version of the application data in its app data store. */
/* note: abstract class */ @JSGlobal("Windows.Storage.SetVersionRequest")
@js.native
open class SetVersionRequest ()
  extends StObject
     with typings.winrtUwp.Windows.Storage.SetVersionRequest {
  
  /** Gets the current version. */
  /* CompleteClass */
  var currentVersion: Double = js.native
  
  /** Gets the requested version. */
  /* CompleteClass */
  var desiredVersion: Double = js.native
  
  /**
    * Requests that the set version request be delayed.
    * @return The set version deferral.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.Storage.SetVersionDeferral = js.native
}
