package typings.winrtDashUwp.Windows.Devices.SmartCards

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.SmartCards.SmartCardReaderKind.any
import typings.winrtDashUwp.Windows.Devices.SmartCards.SmartCardReaderKind.generic
import typings.winrtDashUwp.Windows.Devices.SmartCards.SmartCardReaderKind.nfc
import typings.winrtDashUwp.Windows.Devices.SmartCards.SmartCardReaderKind.tpm
import typings.winrtDashUwp.Windows.Devices.SmartCards.SmartCardReaderKind.uicc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmartCardReaderKind extends js.Object

/** Represents the smart card reader's type. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardReaderKind")
@js.native
object SmartCardReaderKind extends js.Object {
  /** This value is never returned. */
  @js.native
  sealed trait any extends SmartCardReaderKind
  
  /** A generic smart card reader. */
  @js.native
  sealed trait generic extends SmartCardReaderKind
  
  /** A near field communication (NFC) smart card reader. */
  @js.native
  sealed trait nfc extends SmartCardReaderKind
  
  /** A Trusted Platform Module (TPM) virtual smart card reader. */
  @js.native
  sealed trait tpm extends SmartCardReaderKind
  
  /** A Universal Integrated Circuit Card (UICC) smart card reader. */
  @js.native
  sealed trait uicc extends SmartCardReaderKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmartCardReaderKind with Double] = js.native
  /* 0 */ @js.native
  object any extends TopLevel[any with Double]
  
  /* 1 */ @js.native
  object generic extends TopLevel[generic with Double]
  
  /* 3 */ @js.native
  object nfc extends TopLevel[nfc with Double]
  
  /* 2 */ @js.native
  object tpm extends TopLevel[tpm with Double]
  
  /* 4 */ @js.native
  object uicc extends TopLevel[uicc with Double]
  
}

