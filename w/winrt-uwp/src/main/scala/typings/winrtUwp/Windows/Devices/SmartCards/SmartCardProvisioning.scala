package typings.winrtUwp.Windows.Devices.SmartCards

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents info about, and operations for, configuring smart cards. */
@js.native
trait SmartCardProvisioning extends js.Object {
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
  @scala.inline
  implicit class SmartCardProvisioningOps[Self <: SmartCardProvisioning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetAuthorityKeyContainerNameAsync(value: js.Any): Self = this.set("getAuthorityKeyContainerNameAsync", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetChallengeContextAsync(value: () => IPromiseWithIAsyncOperation[SmartCardChallengeContext]): Self = this.set("getChallengeContextAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIdAsync(value: () => IPromiseWithIAsyncOperation[String]): Self = this.set("getIdAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNameAsync(value: () => IPromiseWithIAsyncOperation[String]): Self = this.set("getNameAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setRequestPinChangeAsync(value: () => IPromiseWithIAsyncOperation[Boolean]): Self = this.set("requestPinChangeAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setRequestPinResetAsync(value: SmartCardPinResetHandler => IPromiseWithIAsyncOperation[Boolean]): Self = this.set("requestPinResetAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setSmartCard(value: SmartCard): Self = this.set("smartCard", value.asInstanceOf[js.Any])
  }
  
}

