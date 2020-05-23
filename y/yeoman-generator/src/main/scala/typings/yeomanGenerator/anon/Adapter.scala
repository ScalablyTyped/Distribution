package typings.yeomanGenerator.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  var adapter: PromptModule
  def error(e: Error*): Unit
}

object Adapter {
  @scala.inline
  def apply(adapter: PromptModule, error: /* repeated */ Error => Unit): Adapter = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], error = js.Any.fromFunction1(error))
    __obj.asInstanceOf[Adapter]
  }
}

