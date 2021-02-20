package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets info about smart card readers and smart cards; configures physical smart cards; and creates, configures, and deletes Trusted Platform Module (TPM) virtual smart cards. */
object SmartCards {
  
  /** Provides data for the CardAdded event. */
  @JSGlobal("Windows.Devices.SmartCards.CardAddedEventArgs")
  @js.native
  abstract class CardAddedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.CardAddedEventArgs
  
  /** Provides data for the CardRemoved event. */
  @JSGlobal("Windows.Devices.SmartCards.CardRemovedEventArgs")
  @js.native
  abstract class CardRemovedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.CardRemovedEventArgs
  
  /** Represents info about a smart card. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCard")
  @js.native
  abstract class SmartCard ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCard
  
  /** Represents a smart card authentication challenge/response operation. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardChallengeContext")
  @js.native
  abstract class SmartCardChallengeContext ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardChallengeContext
  
  /** Represents a connection to a smart card. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardConnection")
  @js.native
  abstract class SmartCardConnection ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardConnection
  
  /** Specifies the rules for characters in a smart card personal identification number (PIN). */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption")
  @js.native
  object SmartCardPinCharacterPolicyOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption with Double
      ] = js.native
    
    /* 0 */ val allow: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption.allow with Double = js.native
    
    /* 2 */ val disallow: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption.disallow with Double = js.native
    
    /* 1 */ val requireAtLeastOne: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption.requireAtLeastOne with Double = js.native
  }
  
  /** Represents a set of personal identification number (PIN) rules on a Trusted Platform Module (TPM) virtual smart card. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardPinPolicy")
  @js.native
  /** Creates and initializes a new instance of a set of personal identification number (PIN) rules on a Trusted Platform Module (TPM) virtual smart card. */
  class SmartCardPinPolicy ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinPolicy
  
  /** Represents a wait time for a requested smart card personal identification number (PIN) reset. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardPinResetDeferral")
  @js.native
  abstract class SmartCardPinResetDeferral ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinResetDeferral
  
  /** Represents a smart card personal identification number (PIN) reset request. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardPinResetRequest")
  @js.native
  abstract class SmartCardPinResetRequest ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinResetRequest
  
  /** Represents info about, and operations for, configuring smart cards. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardProvisioning")
  @js.native
  abstract class SmartCardProvisioning ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning
  object SmartCardProvisioning {
    
    @JSGlobal("Windows.Devices.SmartCards.SmartCardProvisioning")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a smart card to be configured.
      * @param card The specified smart card.
      * @return An instance of SmartCardProvisioning , representing the smart card to be configured.
      */
    /* static member */
    @JSGlobal("Windows.Devices.SmartCards.SmartCardProvisioning.fromSmartCardAsync")
    @js.native
    def fromSmartCardAsync(card: typings.winrtUwp.Windows.Devices.SmartCards.SmartCard): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning] = js.native
    
    /* static member */
    @JSGlobal("Windows.Devices.SmartCards.SmartCardProvisioning.requestAttestedVirtualSmartCardCreationAsync")
    @js.native
    def requestAttestedVirtualSmartCardCreationAsync: js.Any = js.native
    @scala.inline
    def requestAttestedVirtualSmartCardCreationAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAttestedVirtualSmartCardCreationAsync")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a Trusted Platform Module (TPM) virtual smart card with a given human-readable name, admin key, and personal identification number (PIN) rules set.
      * @param friendlyName The smart card's human-readable name.
      * @param administrativeKey The smart card's admin key (also known as an administrator PIN or unblock PIN).
      * @param pinPolicy The smart card's PIN rules set.
      * @return After the operation completes, returns an instance of SmartCardProvisioning , representing the configured TPM virtual smart card.
      */
    /* static member */
    @JSGlobal("Windows.Devices.SmartCards.SmartCardProvisioning.requestVirtualSmartCardCreationAsync")
    @js.native
    def requestVirtualSmartCardCreationAsync(
      friendlyName: String,
      administrativeKey: IBuffer,
      pinPolicy: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinPolicy
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning] = js.native
    /* unmapped type */
    /**
      * Creates a Trusted Platform Module (TPM) virtual smart card with a given human-readable name, admin key, personal identification number (PIN) rules set, and ID.
      * @param friendlyName The smart card's human-readable name.
      * @param administrativeKey The smart card's admin key (also known as an administrator PIN or unblock PIN).
      * @param pinPolicy The smart card's PIN rules set.
      * @param cardId The smart card's ID.
      * @return After the operation completes, returns an instance of SmartCardProvisioning , representing the configured TPM virtual smart card.
      */
    /* static member */
    @JSGlobal("Windows.Devices.SmartCards.SmartCardProvisioning.requestVirtualSmartCardCreationAsync")
    @js.native
    def requestVirtualSmartCardCreationAsync(
      friendlyName: String,
      administrativeKey: IBuffer,
      pinPolicy: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinPolicy,
      cardId: String
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning] = js.native
    
    /**
      * Deletes a Trusted Platform Module (TPM) virtual smart card.
      * @param card The TPM virtual smart card to delete.
      * @return After the deletion attempt completes, returns true if the TPM virtual smart card was successfully deleted; otherwise false.
      */
    /* static member */
    @JSGlobal("Windows.Devices.SmartCards.SmartCardProvisioning.requestVirtualSmartCardDeletionAsync")
    @js.native
    def requestVirtualSmartCardDeletionAsync(card: typings.winrtUwp.Windows.Devices.SmartCards.SmartCard): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
  
  /** Represents info about a smart card reader. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardReader")
  @js.native
  abstract class SmartCardReader ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReader
  object SmartCardReader {
    
    /**
      * Returns a smart card reader that matches the specified device ID.
      * @param deviceId The smart card reader's device ID.
      * @return The matching smart card reader.
      */
    /* static member */
    @JSGlobal("Windows.Devices.SmartCards.SmartCardReader.fromIdAsync")
    @js.native
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReader] = js.native
    
    /**
      * Returns an Advanced Query Syntax (AQS) string representing all smart card readers connected to the device. This string is passed to the FindAllAsync method to enumerate the given set of smart card readers.
      * @return The Advanced Query Syntax (AQS) string representing all smart card readers connected to the device.
      */
    /* static member */
    @JSGlobal("Windows.Devices.SmartCards.SmartCardReader.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
    /**
      * Returns an Advanced Query Syntax (AQS) string representing a set of a specific type of smart card readers connected to the device. This string is passed to the FindAllAsync method to enumerate the given set of smart card readers.
      * @param kind One of the enumeration values, representing a specific smart card reader type.
      * @return The Advanced Query Syntax (AQS) string representing a set of the specified type of smart card readers connected to the device.
      */
    /* static member */
    @JSGlobal("Windows.Devices.SmartCards.SmartCardReader.getDeviceSelector")
    @js.native
    def getDeviceSelector(kind: SmartCardReaderKind): String = js.native
  }
  
  /** Represents the smart card reader's type. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardReaderKind")
  @js.native
  object SmartCardReaderKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind with Double] = js.native
    
    /* 0 */ val any: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.any with Double = js.native
    
    /* 1 */ val generic: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.generic with Double = js.native
    
    /* 3 */ val nfc: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.nfc with Double = js.native
    
    /* 2 */ val tpm: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.tpm with Double = js.native
    
    /* 4 */ val uicc: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.uicc with Double = js.native
  }
  
  /** Specifies the smart card reader's status. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardReaderStatus")
  @js.native
  object SmartCardReaderStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus with Double] = js.native
    
    /* 0 */ val disconnected: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus.disconnected with Double = js.native
    
    /* 2 */ val exclusive: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus.exclusive with Double = js.native
    
    /* 1 */ val ready: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus.ready with Double = js.native
  }
  
  /** Specifies the smart card's status. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardStatus")
  @js.native
  object SmartCardStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus with Double] = js.native
    
    /* 0 */ val disconnected: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.disconnected with Double = js.native
    
    /* 3 */ val exclusive: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.exclusive with Double = js.native
    
    /* 1 */ val ready: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.ready with Double = js.native
    
    /* 2 */ val shared: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.shared with Double = js.native
    
    /* 4 */ val unresponsive: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.unresponsive with Double = js.native
  }
}
