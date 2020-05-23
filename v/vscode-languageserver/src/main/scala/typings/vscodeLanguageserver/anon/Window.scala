package typings.vscodeLanguageserver.anon

import typings.vscodeLanguageserver.mod.RemoteWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var window: RemoteWindow
}

object Window {
  @scala.inline
  def apply(window: RemoteWindow): Window = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

