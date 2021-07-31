package typings.winrtUwp.Windows.Devices.SmartCards

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmartCardReaderKind extends StObject
/** Represents the smart card reader's type. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardReaderKind")
@js.native
object SmartCardReaderKind extends StObject {
  
  /** This value is never returned. */
  @js.native
  sealed trait any
    extends StObject
       with SmartCardReaderKind
  
  /** A generic smart card reader. */
  @js.native
  sealed trait generic
    extends StObject
       with SmartCardReaderKind
  
  /** A near field communication (NFC) smart card reader. */
  @js.native
  sealed trait nfc
    extends StObject
       with SmartCardReaderKind
  
  /** A Trusted Platform Module (TPM) virtual smart card reader. */
  @js.native
  sealed trait tpm
    extends StObject
       with SmartCardReaderKind
  
  /** A Universal Integrated Circuit Card (UICC) smart card reader. */
  @js.native
  sealed trait uicc
    extends StObject
       with SmartCardReaderKind
}
