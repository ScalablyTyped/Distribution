package typings.yeomanGenerator

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdapter extends js.Object {
  var adapter: AnonPromptModule
  def error(e: Error*): Unit
}

object AnonAdapter {
  @scala.inline
  def apply(adapter: AnonPromptModule, error: /* repeated */ Error => Unit): AnonAdapter = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], error = js.Any.fromFunction1(error))
    __obj.asInstanceOf[AnonAdapter]
  }
}

