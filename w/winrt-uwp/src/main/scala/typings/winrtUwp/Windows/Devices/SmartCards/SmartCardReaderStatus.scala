package typings.winrtUwp.Windows.Devices.SmartCards

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmartCardReaderStatus extends StObject
/** Specifies the smart card reader's status. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardReaderStatus")
@js.native
object SmartCardReaderStatus extends StObject {
  
  /** The smart card reader is disconnected. */
  @js.native
  sealed trait disconnected
    extends StObject
       with SmartCardReaderStatus
  
  /** The smart card reader is allocated for exclusive use by another app. */
  @js.native
  sealed trait exclusive
    extends StObject
       with SmartCardReaderStatus
  
  /** The smart card reader is ready. */
  @js.native
  sealed trait ready
    extends StObject
       with SmartCardReaderStatus
}
