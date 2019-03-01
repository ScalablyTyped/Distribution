package typings
package yeomanDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  def error(e: nodeLib.Error*): scala.Unit
}

object Anon_E {
  @scala.inline
  def apply(error: js.Function1[/* repeated */ nodeLib.Error, scala.Unit]): Anon_E = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Anon_E]
  }
}

