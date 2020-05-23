package typings.winrtUwp.Windows.Devices.SmartCards

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
  
}

