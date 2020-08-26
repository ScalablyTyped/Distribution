package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentSyncOptions extends js.Object {
  /**
    * Change notifications are sent to the server. See TextDocumentSyncKind.None, TextDocumentSyncKind.Full
    * and TextDocumentSyncKind.Incremental. If omitted it defaults to TextDocumentSyncKind.None.
    */
  var change: js.UndefOr[TextDocumentSyncKind] = js.native
  /**
    * Open and close notifications are sent to the server. If omitted open close notification should not
    * be sent.
    */
  var openClose: js.UndefOr[Boolean] = js.native
  /**
    * If present save notifications are sent to the server. If omitted the notification should not be
    * sent.
    */
  var save: js.UndefOr[SaveOptions] = js.native
  /**
    * If present will save notifications are sent to the server. If omitted the notification should not be
    * sent.
    */
  var willSave: js.UndefOr[Boolean] = js.native
  /**
    * If present will save wait until requests are sent to the server. If omitted the request should not be
    * sent.
    */
  var willSaveWaitUntil: js.UndefOr[Boolean] = js.native
}

object TextDocumentSyncOptions {
  @scala.inline
  def apply(): TextDocumentSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentSyncOptions]
  }
  @scala.inline
  implicit class TextDocumentSyncOptionsOps[Self <: TextDocumentSyncOptions] (val x: Self) extends AnyVal {
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
    def setChange(value: TextDocumentSyncKind): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setOpenClose(value: Boolean): Self = this.set("openClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenClose: Self = this.set("openClose", js.undefined)
    @scala.inline
    def setSave(value: SaveOptions): Self = this.set("save", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setWillSave(value: Boolean): Self = this.set("willSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWillSave: Self = this.set("willSave", js.undefined)
    @scala.inline
    def setWillSaveWaitUntil(value: Boolean): Self = this.set("willSaveWaitUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWillSaveWaitUntil: Self = this.set("willSaveWaitUntil", js.undefined)
  }
  
}

