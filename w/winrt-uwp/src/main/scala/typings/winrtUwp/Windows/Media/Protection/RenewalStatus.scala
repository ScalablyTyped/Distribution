package typings.winrtUwp.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RenewalStatus extends StObject
/** Defines the possible values returned from RenewSystemComponentsAsync . */
@JSGlobal("Windows.Media.Protection.RenewalStatus")
@js.native
object RenewalStatus extends StObject {
  
  /** Specifies that no system components were detected that need updating. But app components may need to be updated, in which case the user may need to get an updated application from the store. */
  @js.native
  sealed trait appComponentsMayNeedUpdating extends RenewalStatus
  
  /** Specifies that no components were found that need to be updated. */
  @js.native
  sealed trait noComponentsFound extends RenewalStatus
  
  /** Specifies that renewal has not started. */
  @js.native
  sealed trait notStarted extends RenewalStatus
  
  /** Specifies that there are updates and the user has allowed updated to proceed */
  @js.native
  sealed trait updatesInProgress extends RenewalStatus
  
  /** Specifies that the user declined to allow updates to proceed. */
  @js.native
  sealed trait userCancelled extends RenewalStatus
}
