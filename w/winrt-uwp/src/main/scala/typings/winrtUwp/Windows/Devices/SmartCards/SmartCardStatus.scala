package typings.winrtUwp.Windows.Devices.SmartCards

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmartCardStatus extends StObject
/** Specifies the smart card's status. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardStatus")
@js.native
object SmartCardStatus extends StObject {
  
  /** The smart card is disconnected. */
  @js.native
  sealed trait disconnected
    extends StObject
       with SmartCardStatus
  
  /** The smart card is allocated for exclusive use by another app. */
  @js.native
  sealed trait exclusive
    extends StObject
       with SmartCardStatus
  
  /** The smart card is ready. */
  @js.native
  sealed trait ready
    extends StObject
       with SmartCardStatus
  
  /** The smart card can be used by multiple apps. */
  @js.native
  sealed trait shared
    extends StObject
       with SmartCardStatus
  
  /** The smart card is unresponsive. */
  @js.native
  sealed trait unresponsive
    extends StObject
       with SmartCardStatus
}
