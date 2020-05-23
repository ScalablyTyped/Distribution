package typings.winrtUwp.global.Windows.Devices

import typings.std.Date
import typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption
import typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinResetHandler
import typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind
import typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets info about smart card readers and smart cards; configures physical smart cards; and creates, configures, and deletes Trusted Platform Module (TPM) virtual smart cards. */
@JSGlobal("Windows.Devices.SmartCards")
@js.native
object SmartCards extends js.Object {
  /** Provides data for the CardAdded event. */
  @js.native
  abstract class CardAddedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.CardAddedEventArgs {
    /** Gets info about the smart card that was inserted into the smart card reader. */
    /* CompleteClass */
    override var smartCard: typings.winrtUwp.Windows.Devices.SmartCards.SmartCard = js.native
  }
  
  /** Provides data for the CardRemoved event. */
  @js.native
  abstract class CardRemovedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.CardRemovedEventArgs {
    /** Gets info about the smart card that was taken out of the smart card reader. */
    /* CompleteClass */
    override var smartCard: typings.winrtUwp.Windows.Devices.SmartCards.SmartCard = js.native
  }
  
  /** Represents info about a smart card. */
  @js.native
  abstract class SmartCard ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCard {
    /** Gets info about the smart card reader into which the smart card is inserted. */
    /* CompleteClass */
    override var reader: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReader = js.native
    /**
      * Establishes a connection to the smart card and returns a SmartCardConnection object representing the connection.
      * @return Asynchronous operation that, when complete, returns the SmartCardConnection object representing the connection.
      */
    /* CompleteClass */
    override def connectAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardConnection] = js.native
    /**
      * Returns the smart card's Answer to Reset (ATR), a standard series of bytes that contains info about the smart card's characteristics, behaviors, and state.
      * @return The smart card's ATR byte set.
      */
    /* CompleteClass */
    override def getAnswerToResetAsync(): IPromiseWithIAsyncOperation[IBuffer] = js.native
    /**
      * Returns the smart card's status.
      * @return One of the SmartCardStatus enumeration values, representing the smart card's status.
      */
    /* CompleteClass */
    override def getStatusAsync(): IPromiseWithIAsyncOperation[SmartCardStatus] = js.native
  }
  
  /** Represents a smart card authentication challenge/response operation. */
  @js.native
  abstract class SmartCardChallengeContext ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardChallengeContext
  
  /** Represents a connection to a smart card. */
  @js.native
  abstract class SmartCardConnection ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardConnection {
    /** Completes the smart card authentication challenge/response operation and frees associated system resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    /**
      * Asynchronously transmits the supplied application protocol data unit (APDU) command and returns the response.
      * @param command The APDU command to transmit to the smart card.
      * @return An asynchronous operation that, when completed, returns the response to the command that was transmitted.
      */
    /* CompleteClass */
    override def transmitAsync(command: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = js.native
  }
  
  /** Represents a set of personal identification number (PIN) rules on a Trusted Platform Module (TPM) virtual smart card. */
  @js.native
  /** Creates and initializes a new instance of a set of personal identification number (PIN) rules on a Trusted Platform Module (TPM) virtual smart card. */
  class SmartCardPinPolicy ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinPolicy {
    /** Gets or sets whether number characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
    /* CompleteClass */
    override var digits: SmartCardPinCharacterPolicyOption = js.native
    /** Gets or sets whether lowercase letter characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
    /* CompleteClass */
    override var lowercaseLetters: SmartCardPinCharacterPolicyOption = js.native
    /** Gets or sets the maximum character length for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
    /* CompleteClass */
    override var maxLength: Double = js.native
    /** Gets or sets the minimum character length for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
    /* CompleteClass */
    override var minLength: Double = js.native
    /** Gets or sets whether special characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
    /* CompleteClass */
    override var specialCharacters: SmartCardPinCharacterPolicyOption = js.native
    /** Gets or sets whether uppercase letter characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
    /* CompleteClass */
    override var uppercaseLetters: SmartCardPinCharacterPolicyOption = js.native
  }
  
  /** Represents a wait time for a requested smart card personal identification number (PIN) reset. */
  @js.native
  abstract class SmartCardPinResetDeferral ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinResetDeferral {
    /** Returns a wait time completion for a smart card personal identification number (PIN) reset. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Represents a smart card personal identification number (PIN) reset request. */
  @js.native
  abstract class SmartCardPinResetRequest ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinResetRequest {
    /** Gets the smart card's challenge value. */
    /* CompleteClass */
    override var challenge: IBuffer = js.native
    /** Gets the length of time to wait before requesting the smart card personal identification number (PIN) reset. */
    /* CompleteClass */
    override var deadline: Date = js.native
    /**
      * Gets an instance of a wait time for a requested smart card personal identification number (PIN) reset.
      * @return An instance of a wait time for a requested smart card PIN reset.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinResetDeferral = js.native
    /**
      * Sets the response to a smart card authentication challenge/response operation.
      * @param response The response to a smart card authentication challenge/response operation.
      */
    /* CompleteClass */
    override def setResponse(response: IBuffer): Unit = js.native
  }
  
  /** Represents info about, and operations for, configuring smart cards. */
  @js.native
  abstract class SmartCardProvisioning ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning {
    /* CompleteClass */
    override var getAuthorityKeyContainerNameAsync: js.Any = js.native
    /** Gets the configured smart card. */
    /* CompleteClass */
    override var smartCard: typings.winrtUwp.Windows.Devices.SmartCards.SmartCard = js.native
     /* unmapped type */ /**
      * Returns a smart card's authentication challenge/response context.
      * @return After the asynchronous operation completes, returns an instance of SmartCardChalllengeContext , representing the smart card's authentication challenge/response context.
      */
    /* CompleteClass */
    override def getChallengeContextAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardChallengeContext] = js.native
    /**
      * Returns the smart card's ID.
      * @return After the asynchronous operation completes, returns the smart card's ID.
      */
    /* CompleteClass */
    override def getIdAsync(): IPromiseWithIAsyncOperation[String] = js.native
    /**
      * Returns the smart card's minidriver name.
      * @return After the asynchronous operation completes, returns the smart card's name.
      */
    /* CompleteClass */
    override def getNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
    /**
      * Changes a smart card's personal identification number (PIN).
      * @return After the smart card PIN change attempt completes, returns true if the smart card's PIN was successfully changed; otherwise false.
      */
    /* CompleteClass */
    override def requestPinChangeAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
    /**
      * Resets a smart card's personal identification number (PIN).
      * @param handler The method that handles the smart card PIN reset.
      * @return After the smart card PIN reset attempt completes, returns true if the smart card's PIN was successfully reset; otherwise false.
      */
    /* CompleteClass */
    override def requestPinResetAsync(handler: SmartCardPinResetHandler): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
  
  /** Represents info about a smart card reader. */
  @js.native
  abstract class SmartCardReader ()
    extends typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReader
  
  /** Specifies the rules for characters in a smart card personal identification number (PIN). */
  @js.native
  object SmartCardPinCharacterPolicyOption extends js.Object {
    /* 0 */ val allow: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption.allow with Double = js.native
    /* 2 */ val disallow: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption.disallow with Double = js.native
    /* 1 */ val requireAtLeastOne: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption.requireAtLeastOne with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object SmartCardProvisioning extends js.Object {
    var requestAttestedVirtualSmartCardCreationAsync: js.Any = js.native
    /**
      * Returns a smart card to be configured.
      * @param card The specified smart card.
      * @return An instance of SmartCardProvisioning , representing the smart card to be configured.
      */
    def fromSmartCardAsync(card: typings.winrtUwp.Windows.Devices.SmartCards.SmartCard): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning] = js.native
    /**
      * Creates a Trusted Platform Module (TPM) virtual smart card with a given human-readable name, admin key, and personal identification number (PIN) rules set.
      * @param friendlyName The smart card's human-readable name.
      * @param administrativeKey The smart card's admin key (also known as an administrator PIN or unblock PIN).
      * @param pinPolicy The smart card's PIN rules set.
      * @return After the operation completes, returns an instance of SmartCardProvisioning , representing the configured TPM virtual smart card.
      */
    def requestVirtualSmartCardCreationAsync(
      friendlyName: String,
      administrativeKey: IBuffer,
      pinPolicy: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinPolicy
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning] = js.native
     /* unmapped type */ /**
      * Creates a Trusted Platform Module (TPM) virtual smart card with a given human-readable name, admin key, personal identification number (PIN) rules set, and ID.
      * @param friendlyName The smart card's human-readable name.
      * @param administrativeKey The smart card's admin key (also known as an administrator PIN or unblock PIN).
      * @param pinPolicy The smart card's PIN rules set.
      * @param cardId The smart card's ID.
      * @return After the operation completes, returns an instance of SmartCardProvisioning , representing the configured TPM virtual smart card.
      */
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
    def requestVirtualSmartCardDeletionAsync(card: typings.winrtUwp.Windows.Devices.SmartCards.SmartCard): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
  
  /* static members */
  @js.native
  object SmartCardReader extends js.Object {
    /**
      * Returns a smart card reader that matches the specified device ID.
      * @param deviceId The smart card reader's device ID.
      * @return The matching smart card reader.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReader] = js.native
    /**
      * Returns an Advanced Query Syntax (AQS) string representing all smart card readers connected to the device. This string is passed to the FindAllAsync method to enumerate the given set of smart card readers.
      * @return The Advanced Query Syntax (AQS) string representing all smart card readers connected to the device.
      */
    def getDeviceSelector(): String = js.native
    /**
      * Returns an Advanced Query Syntax (AQS) string representing a set of a specific type of smart card readers connected to the device. This string is passed to the FindAllAsync method to enumerate the given set of smart card readers.
      * @param kind One of the enumeration values, representing a specific smart card reader type.
      * @return The Advanced Query Syntax (AQS) string representing a set of the specified type of smart card readers connected to the device.
      */
    def getDeviceSelector(kind: SmartCardReaderKind): String = js.native
  }
  
  /** Represents the smart card reader's type. */
  @js.native
  object SmartCardReaderKind extends js.Object {
    /* 0 */ val any: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.any with Double = js.native
    /* 1 */ val generic: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.generic with Double = js.native
    /* 3 */ val nfc: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.nfc with Double = js.native
    /* 2 */ val tpm: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.tpm with Double = js.native
    /* 4 */ val uicc: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.uicc with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind with Double] = js.native
  }
  
  /** Specifies the smart card reader's status. */
  @js.native
  object SmartCardReaderStatus extends js.Object {
    /* 0 */ val disconnected: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus.disconnected with Double = js.native
    /* 2 */ val exclusive: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus.exclusive with Double = js.native
    /* 1 */ val ready: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus.ready with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus with Double] = js.native
  }
  
  /** Specifies the smart card's status. */
  @js.native
  object SmartCardStatus extends js.Object {
    /* 0 */ val disconnected: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.disconnected with Double = js.native
    /* 3 */ val exclusive: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.exclusive with Double = js.native
    /* 1 */ val ready: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.ready with Double = js.native
    /* 2 */ val shared: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.shared with Double = js.native
    /* 4 */ val unresponsive: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.unresponsive with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus with Double] = js.native
  }
  
}

