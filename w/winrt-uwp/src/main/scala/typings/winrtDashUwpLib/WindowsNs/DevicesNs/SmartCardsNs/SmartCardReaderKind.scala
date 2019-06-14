package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs

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
  sealed trait any
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardReaderKind
  
  /** A generic smart card reader. */
  @js.native
  sealed trait generic
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardReaderKind
  
  /** A near field communication (NFC) smart card reader. */
  @js.native
  sealed trait nfc
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardReaderKind
  
  /** A Trusted Platform Module (TPM) virtual smart card reader. */
  @js.native
  sealed trait tpm
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardReaderKind
  
  /** A Universal Integrated Circuit Card (UICC) smart card reader. */
  @js.native
  sealed trait uicc
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardReaderKind
  
  /* 0 */ val any: any with scala.Double = js.native
  /* 1 */ val generic: generic with scala.Double = js.native
  /* 3 */ val nfc: nfc with scala.Double = js.native
  /* 2 */ val tpm: tpm with scala.Double = js.native
  /* 4 */ val uicc: uicc with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardReaderKind with scala.Double
  ] = js.native
}

