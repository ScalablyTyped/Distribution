package typings.yeomanDashGenerator

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Adapter extends js.Object {
  var adapter: Anon_PromptModule
  def error(e: Error*): Unit
}

object Anon_Adapter {
  @scala.inline
  def apply(adapter: Anon_PromptModule, error: /* repeated */ Error => Unit): Anon_Adapter = {
    val __obj = js.Dynamic.literal(adapter = adapter, error = js.Any.fromFunction1(error))
  
    __obj.asInstanceOf[Anon_Adapter]
  }
}

