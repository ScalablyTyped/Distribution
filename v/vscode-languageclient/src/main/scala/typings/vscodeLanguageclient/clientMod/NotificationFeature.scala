package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.anon.Send
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationFeature[T /* <: js.Function */] extends js.Object {
  /**
    * Triggers the corresponding RPC method.
    */
  def getProvider(document: typings.vscode.mod.TextDocument): Send[T]
}

object NotificationFeature {
  @scala.inline
  def apply[/* <: js.Function */ T](getProvider: typings.vscode.mod.TextDocument => Send[T]): NotificationFeature[T] = {
    val __obj = js.Dynamic.literal(getProvider = js.Any.fromFunction1(getProvider))
    __obj.asInstanceOf[NotificationFeature[T]]
  }
}

