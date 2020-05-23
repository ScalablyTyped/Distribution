package typings.winrtUwp.Windows.Devices.SmartCards

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents info about, and operations for, configuring smart cards. */
trait SmartCardProvisioning extends js.Object {
  var getAuthorityKeyContainerNameAsync: js.Any
  /** Gets the configured smart card. */
  var smartCard: SmartCard
   /* unmapped type */ /**
    * Returns a smart card's authentication challenge/response context.
    * @return After the asynchronous operation completes, returns an instance of SmartCardChalllengeContext , representing the smart card's authentication challenge/response context.
    */
  def getChallengeContextAsync(): IPromiseWithIAsyncOperation[SmartCardChallengeContext]
  /**
    * Returns the smart card's ID.
    * @return After the asynchronous operation completes, returns the smart card's ID.
    */
  def getIdAsync(): IPromiseWithIAsyncOperation[String]
  /**
    * Returns the smart card's minidriver name.
    * @return After the asynchronous operation completes, returns the smart card's name.
    */
  def getNameAsync(): IPromiseWithIAsyncOperation[String]
  /**
    * Changes a smart card's personal identification number (PIN).
    * @return After the smart card PIN change attempt completes, returns true if the smart card's PIN was successfully changed; otherwise false.
    */
  def requestPinChangeAsync(): IPromiseWithIAsyncOperation[Boolean]
  /**
    * Resets a smart card's personal identification number (PIN).
    * @param handler The method that handles the smart card PIN reset.
    * @return After the smart card PIN reset attempt completes, returns true if the smart card's PIN was successfully reset; otherwise false.
    */
  def requestPinResetAsync(handler: SmartCardPinResetHandler): IPromiseWithIAsyncOperation[Boolean]
}

object SmartCardProvisioning {
  @scala.inline
  def apply(
    getAuthorityKeyContainerNameAsync: js.Any,
    getChallengeContextAsync: () => IPromiseWithIAsyncOperation[SmartCardChallengeContext],
    getIdAsync: () => IPromiseWithIAsyncOperation[String],
    getNameAsync: () => IPromiseWithIAsyncOperation[String],
    requestPinChangeAsync: () => IPromiseWithIAsyncOperation[Boolean],
    requestPinResetAsync: SmartCardPinResetHandler => IPromiseWithIAsyncOperation[Boolean],
    smartCard: SmartCard
  ): SmartCardProvisioning = {
    val __obj = js.Dynamic.literal(getAuthorityKeyContainerNameAsync = getAuthorityKeyContainerNameAsync.asInstanceOf[js.Any], getChallengeContextAsync = js.Any.fromFunction0(getChallengeContextAsync), getIdAsync = js.Any.fromFunction0(getIdAsync), getNameAsync = js.Any.fromFunction0(getNameAsync), requestPinChangeAsync = js.Any.fromFunction0(requestPinChangeAsync), requestPinResetAsync = js.Any.fromFunction1(requestPinResetAsync), smartCard = smartCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartCardProvisioning]
  }
}

