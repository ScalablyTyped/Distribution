package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UriHandler extends js.Object {
  /**
    * Handle the provided system-wide [uri](#Uri).
    *
    * @see [window.registerUriHandler](#window.registerUriHandler).
    */
  def handleUri(uri: Uri): ProviderResult[Unit] = js.native
}

object UriHandler {
  @scala.inline
  def apply(handleUri: Uri => ProviderResult[Unit]): UriHandler = {
    val __obj = js.Dynamic.literal(handleUri = js.Any.fromFunction1(handleUri))
    __obj.asInstanceOf[UriHandler]
  }
  @scala.inline
  implicit class UriHandlerOps[Self <: UriHandler] (val x: Self) extends AnyVal {
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
    def setHandleUri(value: Uri => ProviderResult[Unit]): Self = this.set("handleUri", js.Any.fromFunction1(value))
  }
  
}

