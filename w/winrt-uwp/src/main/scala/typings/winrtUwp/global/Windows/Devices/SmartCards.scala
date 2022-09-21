package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption
import typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinResetHandler
import typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind
import typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets info about smart card readers and smart cards; configures physical smart cards; and creates, configures, and deletes Trusted Platform Module (TPM) virtual smart cards. */
object SmartCards {
  
  /** Provides data for the CardAdded event. */
  @JSGlobal("Windows.Devices.SmartCards.CardAddedEventArgs")
  @js.native
  abstract class CardAddedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.SmartCards.CardAddedEventArgs {
    
    /** Gets info about the smart card that was inserted into the smart card reader. */
    /* CompleteClass */
    var smartCard: typings.winrtUwp.Windows.Devices.SmartCards.SmartCard = js.native
  }
  
  /** Provides data for the CardRemoved event. */
  @JSGlobal("Windows.Devices.SmartCards.CardRemovedEventArgs")
  @js.native
  abstract class CardRemovedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.SmartCards.CardRemovedEventArgs {
    
    /** Gets info about the smart card that was taken out of the smart card reader. */
    /* CompleteClass */
    var smartCard: typings.winrtUwp.Windows.Devices.SmartCards.SmartCard = js.native
  }
  
  /** Represents info about a smart card. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCard")
  @js.native
  abstract class SmartCard ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.SmartCards.SmartCard {
    
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
    
    /** Gets info about the smart card reader into which the smart card is inserted. */
    /* CompleteClass */
    var reader: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReader = js.native
  }
  
  /** Represents a smart card authentication challenge/response operation. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardChallengeContext")
  @js.native
  abstract class SmartCardChallengeContext ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.SmartCards.SmartCardChallengeContext
  
  /** Represents a connection to a smart card. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardConnection")
  @js.native
  abstract class SmartCardConnection ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.SmartCards.SmartCardConnection {
    
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
  
  /** Specifies the rules for characters in a smart card personal identification number (PIN). */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption")
  @js.native
  object SmartCardPinCharacterPolicyOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption & Double
      ] = js.native
    
    /* 0 */ val allow: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption.allow & Double = js.native
    
    /* 2 */ val disallow: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption.disallow & Double = js.native
    
    /* 1 */ val requireAtLeastOne: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption.requireAtLeastOne & Double = js.native
  }
  
  /** Represents a set of personal identification number (PIN) rules on a Trusted Platform Module (TPM) virtual smart card. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardPinPolicy")
  @js.native
  /** Creates and initializes a new instance of a set of personal identification number (PIN) rules on a Trusted Platform Module (TPM) virtual smart card. */
  open class SmartCardPinPolicy ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinPolicy {
    
    /** Gets or sets whether number characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
    /* CompleteClass */
    var digits: SmartCardPinCharacterPolicyOption = js.native
    
    /** Gets or sets whether lowercase letter characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
    /* CompleteClass */
    var lowercaseLetters: SmartCardPinCharacterPolicyOption = js.native
    
    /** Gets or sets the maximum character length for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
    /* CompleteClass */
    var maxLength: Double = js.native
    
    /** Gets or sets the minimum character length for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
    /* CompleteClass */
    var minLength: Double = js.native
    
    /** Gets or sets whether special characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
    /* CompleteClass */
    var specialCharacters: SmartCardPinCharacterPolicyOption = js.native
    
    /** Gets or sets whether uppercase letter characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
    /* CompleteClass */
    var uppercaseLetters: SmartCardPinCharacterPolicyOption = js.native
  }
  
  /** Represents a wait time for a requested smart card personal identification number (PIN) reset. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardPinResetDeferral")
  @js.native
  abstract class SmartCardPinResetDeferral ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinResetDeferral {
    
    /** Returns a wait time completion for a smart card personal identification number (PIN) reset. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Represents a smart card personal identification number (PIN) reset request. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardPinResetRequest")
  @js.native
  abstract class SmartCardPinResetRequest ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinResetRequest {
    
    /** Gets the smart card's challenge value. */
    /* CompleteClass */
    var challenge: IBuffer = js.native
    
    /** Gets the length of time to wait before requesting the smart card personal identification number (PIN) reset. */
    /* CompleteClass */
    var deadline: js.Date = js.native
    
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
  @JSGlobal("Windows.Devices.SmartCards.SmartCardProvisioning")
  @js.native
  abstract class SmartCardProvisioning ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning {
    
    /* CompleteClass */
    var getAuthorityKeyContainerNameAsync: Any = js.native
    
    /* unmapped type */
    /**
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
    
    /** Gets the configured smart card. */
    /* CompleteClass */
    var smartCard: typings.winrtUwp.Windows.Devices.SmartCards.SmartCard = js.native
  }
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
    inline def fromSmartCardAsync(card: typings.winrtUwp.Windows.Devices.SmartCards.SmartCard): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSmartCardAsync")(card.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning]]
    
    /* static member */
    @JSGlobal("Windows.Devices.SmartCards.SmartCardProvisioning.requestAttestedVirtualSmartCardCreationAsync")
    @js.native
    def requestAttestedVirtualSmartCardCreationAsync: Any = js.native
    inline def requestAttestedVirtualSmartCardCreationAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAttestedVirtualSmartCardCreationAsync")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a Trusted Platform Module (TPM) virtual smart card with a given human-readable name, admin key, and personal identification number (PIN) rules set.
      * @param friendlyName The smart card's human-readable name.
      * @param administrativeKey The smart card's admin key (also known as an administrator PIN or unblock PIN).
      * @param pinPolicy The smart card's PIN rules set.
      * @return After the operation completes, returns an instance of SmartCardProvisioning , representing the configured TPM virtual smart card.
      */
    /* static member */
    inline def requestVirtualSmartCardCreationAsync(
      friendlyName: String,
      administrativeKey: IBuffer,
      pinPolicy: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinPolicy
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestVirtualSmartCardCreationAsync")(friendlyName.asInstanceOf[js.Any], administrativeKey.asInstanceOf[js.Any], pinPolicy.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning]]
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
    inline def requestVirtualSmartCardCreationAsync(
      friendlyName: String,
      administrativeKey: IBuffer,
      pinPolicy: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardPinPolicy,
      cardId: String
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestVirtualSmartCardCreationAsync")(friendlyName.asInstanceOf[js.Any], administrativeKey.asInstanceOf[js.Any], pinPolicy.asInstanceOf[js.Any], cardId.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning]]
    
    /**
      * Deletes a Trusted Platform Module (TPM) virtual smart card.
      * @param card The TPM virtual smart card to delete.
      * @return After the deletion attempt completes, returns true if the TPM virtual smart card was successfully deleted; otherwise false.
      */
    /* static member */
    inline def requestVirtualSmartCardDeletionAsync(card: typings.winrtUwp.Windows.Devices.SmartCards.SmartCard): IPromiseWithIAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestVirtualSmartCardDeletionAsync")(card.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  }
  
  /** Represents info about a smart card reader. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardReader")
  @js.native
  abstract class SmartCardReader ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReader
  object SmartCardReader {
    
    @JSGlobal("Windows.Devices.SmartCards.SmartCardReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a smart card reader that matches the specified device ID.
      * @param deviceId The smart card reader's device ID.
      * @return The matching smart card reader.
      */
    /* static member */
    inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReader]]
    
    /**
      * Returns an Advanced Query Syntax (AQS) string representing all smart card readers connected to the device. This string is passed to the FindAllAsync method to enumerate the given set of smart card readers.
      * @return The Advanced Query Syntax (AQS) string representing all smart card readers connected to the device.
      */
    /* static member */
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
    /**
      * Returns an Advanced Query Syntax (AQS) string representing a set of a specific type of smart card readers connected to the device. This string is passed to the FindAllAsync method to enumerate the given set of smart card readers.
      * @param kind One of the enumeration values, representing a specific smart card reader type.
      * @return The Advanced Query Syntax (AQS) string representing a set of the specified type of smart card readers connected to the device.
      */
    /* static member */
    inline def getDeviceSelector(kind: SmartCardReaderKind): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /** Represents the smart card reader's type. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardReaderKind")
  @js.native
  object SmartCardReaderKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind & Double] = js.native
    
    /* 0 */ val any: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.any & Double = js.native
    
    /* 1 */ val generic: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.generic & Double = js.native
    
    /* 3 */ val nfc: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.nfc & Double = js.native
    
    /* 2 */ val tpm: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.tpm & Double = js.native
    
    /* 4 */ val uicc: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderKind.uicc & Double = js.native
  }
  
  /** Specifies the smart card reader's status. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardReaderStatus")
  @js.native
  object SmartCardReaderStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus & Double] = js.native
    
    /* 0 */ val disconnected: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus.disconnected & Double = js.native
    
    /* 2 */ val exclusive: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus.exclusive & Double = js.native
    
    /* 1 */ val ready: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardReaderStatus.ready & Double = js.native
  }
  
  /** Specifies the smart card's status. */
  @JSGlobal("Windows.Devices.SmartCards.SmartCardStatus")
  @js.native
  object SmartCardStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus & Double] = js.native
    
    /* 0 */ val disconnected: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.disconnected & Double = js.native
    
    /* 3 */ val exclusive: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.exclusive & Double = js.native
    
    /* 1 */ val ready: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.ready & Double = js.native
    
    /* 2 */ val shared: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.shared & Double = js.native
    
    /* 4 */ val unresponsive: typings.winrtUwp.Windows.Devices.SmartCards.SmartCardStatus.unresponsive & Double = js.native
  }
}
