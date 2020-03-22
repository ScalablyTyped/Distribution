package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentSyncOptions extends js.Object {
  /**
    * Change notifications are sent to the server. See TextDocumentSyncKind.None, TextDocumentSyncKind.Full
    * and TextDocumentSyncKind.Incremental. If omitted it defaults to TextDocumentSyncKind.None.
    */
  var change: js.UndefOr[TextDocumentSyncKind] = js.undefined
  /**
    * Open and close notifications are sent to the server. If omitted open close notification should not
    * be sent.
    */
  var openClose: js.UndefOr[Boolean] = js.undefined
  /**
    * If present save notifications are sent to the server. If omitted the notification should not be
    * sent.
    */
  var save: js.UndefOr[SaveOptions] = js.undefined
  /**
    * If present will save notifications are sent to the server. If omitted the notification should not be
    * sent.
    */
  var willSave: js.UndefOr[Boolean] = js.undefined
  /**
    * If present will save wait until requests are sent to the server. If omitted the request should not be
    * sent.
    */
  var willSaveWaitUntil: js.UndefOr[Boolean] = js.undefined
}

object TextDocumentSyncOptions {
  @scala.inline
  def apply(
    change: TextDocumentSyncKind = null,
    openClose: js.UndefOr[Boolean] = js.undefined,
    save: SaveOptions = null,
    willSave: js.UndefOr[Boolean] = js.undefined,
    willSaveWaitUntil: js.UndefOr[Boolean] = js.undefined
  ): TextDocumentSyncOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change.asInstanceOf[js.Any])
    if (!js.isUndefined(openClose)) __obj.updateDynamic("openClose")(openClose.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    if (!js.isUndefined(willSave)) __obj.updateDynamic("willSave")(willSave.asInstanceOf[js.Any])
    if (!js.isUndefined(willSaveWaitUntil)) __obj.updateDynamic("willSaveWaitUntil")(willSaveWaitUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentSyncOptions]
  }
}

