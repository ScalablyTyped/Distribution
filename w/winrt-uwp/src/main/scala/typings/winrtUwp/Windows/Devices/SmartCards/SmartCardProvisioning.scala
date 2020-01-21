package typings.winrtUwp.Windows.Devices.SmartCards

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents info about, and operations for, configuring smart cards. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardProvisioning")
@js.native
abstract class SmartCardProvisioning () extends js.Object {
  var getAuthorityKeyContainerNameAsync: js.Any = js.native
  /** Gets the configured smart card. */
  var smartCard: SmartCard = js.native
   /* unmapped type */ /**
    * Returns a smart card's authentication challenge/response context.
    * @return After the asynchronous operation completes, returns an instance of SmartCardChalllengeContext , representing the smart card's authentication challenge/response context.
    */
  def getChallengeContextAsync(): IPromiseWithIAsyncOperation[SmartCardChallengeContext] = js.native
  /**
    * Returns the smart card's ID.
    * @return After the asynchronous operation completes, returns the smart card's ID.
    */
  def getIdAsync(): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Returns the smart card's minidriver name.
    * @return After the asynchronous operation completes, returns the smart card's name.
    */
  def getNameAsync(): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Changes a smart card's personal identification number (PIN).
    * @return After the smart card PIN change attempt completes, returns true if the smart card's PIN was successfully changed; otherwise false.
    */
  def requestPinChangeAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Resets a smart card's personal identification number (PIN).
    * @param handler The method that handles the smart card PIN reset.
    * @return After the smart card PIN reset attempt completes, returns true if the smart card's PIN was successfully reset; otherwise false.
    */
  def requestPinResetAsync(handler: SmartCardPinResetHandler): IPromiseWithIAsyncOperation[Boolean] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.SmartCards.SmartCardProvisioning")
@js.native
object SmartCardProvisioning extends js.Object {
  var requestAttestedVirtualSmartCardCreationAsync: js.Any = js.native
  /**
    * Returns a smart card to be configured.
    * @param card The specified smart card.
    * @return An instance of SmartCardProvisioning , representing the smart card to be configured.
    */
  def fromSmartCardAsync(card: SmartCard): IPromiseWithIAsyncOperation[SmartCardProvisioning] = js.native
  /**
    * Creates a Trusted Platform Module (TPM) virtual smart card with a given human-readable name, admin key, and personal identification number (PIN) rules set.
    * @param friendlyName The smart card's human-readable name.
    * @param administrativeKey The smart card's admin key (also known as an administrator PIN or unblock PIN).
    * @param pinPolicy The smart card's PIN rules set.
    * @return After the operation completes, returns an instance of SmartCardProvisioning , representing the configured TPM virtual smart card.
    */
  def requestVirtualSmartCardCreationAsync(friendlyName: String, administrativeKey: IBuffer, pinPolicy: SmartCardPinPolicy): IPromiseWithIAsyncOperation[SmartCardProvisioning] = js.native
   /* unmapped type */ /**
    * Creates a Trusted Platform Module (TPM) virtual smart card with a given human-readable name, admin key, personal identification number (PIN) rules set, and ID.
    * @param friendlyName The smart card's human-readable name.
    * @param administrativeKey The smart card's admin key (also known as an administrator PIN or unblock PIN).
    * @param pinPolicy The smart card's PIN rules set.
    * @param cardId The smart card's ID.
    * @return After the operation completes, returns an instance of SmartCardProvisioning , representing the configured TPM virtual smart card.
    */
  def requestVirtualSmartCardCreationAsync(friendlyName: String, administrativeKey: IBuffer, pinPolicy: SmartCardPinPolicy, cardId: String): IPromiseWithIAsyncOperation[SmartCardProvisioning] = js.native
  /**
    * Deletes a Trusted Platform Module (TPM) virtual smart card.
    * @param card The TPM virtual smart card to delete.
    * @return After the deletion attempt completes, returns true if the TPM virtual smart card was successfully deleted; otherwise false.
    */
  def requestVirtualSmartCardDeletionAsync(card: SmartCard): IPromiseWithIAsyncOperation[Boolean] = js.native
}

