package typings
package yeomanDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Adapter extends js.Object {
  var adapter: Anon_PromptModule
  def error(e: stdLib.Error*): scala.Unit
}

object Anon_Adapter {
  @scala.inline
  def apply(adapter: Anon_PromptModule, error: /* repeated */ stdLib.Error => scala.Unit): Anon_Adapter = {
    val __obj = js.Dynamic.literal(adapter = adapter, error = js.Any.fromFunction1(error))
  
    __obj.asInstanceOf[Anon_Adapter]
  }
}

