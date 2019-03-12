package typings
package yeomanDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  def error(e: stdLib.Error*): scala.Unit
}

object Anon_E {
  @scala.inline
  def apply(error: /* repeated */ stdLib.Error => scala.Unit): Anon_E = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
  
    __obj.asInstanceOf[Anon_E]
  }
}

