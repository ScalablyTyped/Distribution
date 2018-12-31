package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentSyncOptions extends js.Object {
  /**
    * Change notifications are sent to the server. See TextDocumentSyncKind.None, TextDocumentSyncKind.Full
    * and TextDocumentSyncKind.Incremental.
    */
  var change: js.UndefOr[TextDocumentSyncKind] = js.undefined
  /**
    * Open and close notifications are sent to the server.
    */
  var openClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Save notifications are sent to the server.
    */
  var save: js.UndefOr[SaveOptions] = js.undefined
  /**
    * Will save notifications are sent to the server.
    */
  var willSave: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Will save wait until requests are sent to the server.
    */
  var willSaveWaitUntil: js.UndefOr[scala.Boolean] = js.undefined
}

