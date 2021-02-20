package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundAccessStatus extends StObject
@JSGlobal("Windows.ApplicationModel.Background.BackgroundAccessStatus")
@js.native
object BackgroundAccessStatus extends StObject {
  
  @js.native
  sealed trait allowedMayUseActiveRealTimeConnectivity extends BackgroundAccessStatus
  
  @js.native
  sealed trait allowedWithAlwaysOnRealTimeConnectivity extends BackgroundAccessStatus
  
  @js.native
  sealed trait denied extends BackgroundAccessStatus
  
  @js.native
  sealed trait unspecified extends BackgroundAccessStatus
}
