package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentSyncClientCapabilities extends js.Object {
  /**
    * The client supports did save notifications.
    */
  var didSave: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether text document synchronization supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * The client supports sending will save notifications.
    */
  var willSave: js.UndefOr[Boolean] = js.undefined
  /**
    * The client supports sending a will save request and
    * waits for a response providing text edits which will
    * be applied to the document before it is saved.
    */
  var willSaveWaitUntil: js.UndefOr[Boolean] = js.undefined
}

object TextDocumentSyncClientCapabilities {
  @scala.inline
  def apply(
    didSave: js.UndefOr[Boolean] = js.undefined,
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    willSave: js.UndefOr[Boolean] = js.undefined,
    willSaveWaitUntil: js.UndefOr[Boolean] = js.undefined
  ): TextDocumentSyncClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(didSave)) __obj.updateDynamic("didSave")(didSave.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(willSave)) __obj.updateDynamic("willSave")(willSave.get.asInstanceOf[js.Any])
    if (!js.isUndefined(willSaveWaitUntil)) __obj.updateDynamic("willSaveWaitUntil")(willSaveWaitUntil.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentSyncClientCapabilities]
  }
}

