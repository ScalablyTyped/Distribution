package typings.winrt.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.SetVersionRequest")
@js.native
open class SetVersionRequest ()
  extends StObject
     with typings.winrt.Windows.Storage.SetVersionRequest {
  
  /* CompleteClass */
  var currentVersion: Double = js.native
  
  /* CompleteClass */
  var desiredVersion: Double = js.native
  
  /* CompleteClass */
  override def getDeferral(): typings.winrt.Windows.Storage.SetVersionDeferral = js.native
}
