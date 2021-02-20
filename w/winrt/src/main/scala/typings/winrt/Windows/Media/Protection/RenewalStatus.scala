package typings.winrt.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RenewalStatus extends StObject
@JSGlobal("Windows.Media.Protection.RenewalStatus")
@js.native
object RenewalStatus extends StObject {
  
  @js.native
  sealed trait appComponentsMayNeedUpdating extends RenewalStatus
  
  @js.native
  sealed trait noComponentsFound extends RenewalStatus
  
  @js.native
  sealed trait notStarted extends RenewalStatus
  
  @js.native
  sealed trait updatesInProgress extends RenewalStatus
  
  @js.native
  sealed trait userCancelled extends RenewalStatus
}
