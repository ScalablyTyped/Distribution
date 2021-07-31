package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundTransferBehavior extends StObject
/** Defines values used to indicate if downloads and uploads within a BackgroundTransferGroup run in simultaneously or in serial. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior")
@js.native
object BackgroundTransferBehavior extends StObject {
  
  /** Background Transfer operations run simultaneously. */
  @js.native
  sealed trait parallel
    extends StObject
       with BackgroundTransferBehavior
  
  /** Background Transfer operations run in serial. */
  @js.native
  sealed trait serialized
    extends StObject
       with BackgroundTransferBehavior
}
