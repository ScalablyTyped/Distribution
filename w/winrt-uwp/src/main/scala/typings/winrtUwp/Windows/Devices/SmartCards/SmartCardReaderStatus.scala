package typings.winrtUwp.Windows.Devices.SmartCards

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmartCardReaderStatus extends js.Object

/** Specifies the smart card reader's status. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardReaderStatus")
@js.native
object SmartCardReaderStatus extends js.Object {
  /** The smart card reader is disconnected. */
  @js.native
  sealed trait disconnected extends SmartCardReaderStatus
  
  /** The smart card reader is allocated for exclusive use by another app. */
  @js.native
  sealed trait exclusive extends SmartCardReaderStatus
  
  /** The smart card reader is ready. */
  @js.native
  sealed trait ready extends SmartCardReaderStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmartCardReaderStatus with Double] = js.native
  /* 0 */ @js.native
  object disconnected extends TopLevel[disconnected with Double]
  
  /* 2 */ @js.native
  object exclusive extends TopLevel[exclusive with Double]
  
  /* 1 */ @js.native
  object ready extends TopLevel[ready with Double]
  
}

