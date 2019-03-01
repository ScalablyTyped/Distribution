package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destruction extends js.Object {
  def destructor(): scala.Unit
}

object Destruction {
  @scala.inline
  def apply(destructor: js.Function0[scala.Unit]): Destruction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destructor")(destructor)
    __obj.asInstanceOf[Destruction]
  }
}

