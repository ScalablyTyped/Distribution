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
  
  val any: any with java.lang.String = js.native
  val generic: generic with java.lang.String = js.native
  val nfc: nfc with java.lang.String = js.native
  val tpm: tpm with java.lang.String = js.native
  val uicc: uicc with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardReaderKind with java.lang.String
  ] = js.native
}

