package typings.winrtUwp.Windows.Devices.SmartCards

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a smart card authentication challenge/response operation. */
@js.native
trait SmartCardChallengeContext extends js.Object {
  
  /** Gets the smart card's challenge value. */
  var challenge: IBuffer = js.native
  
  /**
    * Changes the smart card's admin key (also known as an administrator PIN or unblock PIN).
    * @param response The response to a smart card authentication challenge/response operation.
    * @param newAdministrativeKey The new smart card admin key.
    * @return An asynchronous action that completes after the admin key change attempt is done.
    */
  def changeAdministrativeKeyAsync(response: IBuffer, newAdministrativeKey: IBuffer): IPromiseWithIAsyncAction = js.native
  
  /** Completes the smart card authentication challenge/response operation and frees associated system resources. */
  def close(): Unit = js.native
  
  /**
    * Reconfigures an existing, configured smart card with a new response. Optionally, formats the smart card.
    * @param response The new response to a smart card authentication challenge/response operation.
    * @param formatCard True to format the smart card; otherwise false.
    * @return An asynchronous action that completes after the smart card reconfiguration attempt is done.
    */
  def provisionAsync(response: IBuffer, formatCard: Boolean): IPromiseWithIAsyncAction = js.native
  /**
    * Reconfigures an existing, configured smart card with a new response and ID. Optionally, formats the smart card.
    * @param response The new response to a smart card authentication challenge/response operation.
    * @param formatCard True to format the smart card; otherwise false.
    * @param newCardId The new smart card ID.
    * @return An asynchronous action that completes after the smart card reconfiguration attempt is done.
    */
  def provisionAsync(response: IBuffer, formatCard: Boolean, newCardId: String): IPromiseWithIAsyncAction = js.native
  
  /**
    * Verifies the response to the smart card challenge request.
    * @param response The response to the smart card challenge request.
    * @return After the verification attempt is done, true if the response was successfully verified; otherwise false.
    */
  def verifyResponseAsync(response: IBuffer): IPromiseWithIAsyncOperation[Boolean] = js.native
}
