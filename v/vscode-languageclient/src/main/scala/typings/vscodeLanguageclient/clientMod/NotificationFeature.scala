package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.anon.Send
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationFeature[T /* <: js.Function */] extends js.Object {
  /**
    * Triggers the corresponding RPC method.
    */
  def getProvider(document: typings.vscode.mod.TextDocument): Send[T] = js.native
}

object NotificationFeature {
  @scala.inline
  def apply[/* <: js.Function */ T](getProvider: typings.vscode.mod.TextDocument => Send[T]): NotificationFeature[T] = {
    val __obj = js.Dynamic.literal(getProvider = js.Any.fromFunction1(getProvider))
    __obj.asInstanceOf[NotificationFeature[T]]
  }
  @scala.inline
  implicit class NotificationFeatureOps[Self <: NotificationFeature[_], /* <: js.Function */ T] (val x: Self with NotificationFeature[T]) extends AnyVal {
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
    def setGetProvider(value: typings.vscode.mod.TextDocument => Send[T]): Self = this.set("getProvider", js.Any.fromFunction1(value))
  }
  
}

