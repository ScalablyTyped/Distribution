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
  def apply(destructor: () => scala.Unit): Destruction = {
    val __obj = js.Dynamic.literal(destructor = js.Any.fromFunction0(destructor))
  
    __obj.asInstanceOf[Destruction]
  }
}

