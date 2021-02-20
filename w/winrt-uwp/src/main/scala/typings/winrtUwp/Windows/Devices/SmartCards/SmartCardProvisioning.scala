package typings.winrtUwp.Windows.Devices.SmartCards

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents info about, and operations for, configuring smart cards. */
@js.native
trait SmartCardProvisioning extends StObject {
  
  var getAuthorityKeyContainerNameAsync: js.Any = js.native
  
  /* unmapped type */
  /**
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
  
  /** Gets the configured smart card. */
  var smartCard: SmartCard = js.native
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
  implicit class SmartCardProvisioningMutableBuilder[Self <: SmartCardProvisioning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAuthorityKeyContainerNameAsync(value: js.Any): Self = StObject.set(x, "getAuthorityKeyContainerNameAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetChallengeContextAsync(value: () => IPromiseWithIAsyncOperation[SmartCardChallengeContext]): Self = StObject.set(x, "getChallengeContextAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIdAsync(value: () => IPromiseWithIAsyncOperation[String]): Self = StObject.set(x, "getIdAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNameAsync(value: () => IPromiseWithIAsyncOperation[String]): Self = StObject.set(x, "getNameAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestPinChangeAsync(value: () => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "requestPinChangeAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestPinResetAsync(value: SmartCardPinResetHandler => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "requestPinResetAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSmartCard(value: SmartCard): Self = StObject.set(x, "smartCard", value.asInstanceOf[js.Any])
  }
}
