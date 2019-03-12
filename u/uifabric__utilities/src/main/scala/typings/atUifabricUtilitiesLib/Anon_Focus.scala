package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focus extends js.Object {
  def focus(): scala.Unit
}

object Anon_Focus {
  @scala.inline
  def apply(focus: () => scala.Unit): Anon_Focus = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
  
    __obj.asInstanceOf[Anon_Focus]
  }
}

