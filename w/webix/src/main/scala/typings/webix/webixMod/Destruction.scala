package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destruction extends js.Object {
  def destructor(): Unit
}

object Destruction {
  @scala.inline
  def apply(destructor: () => Unit): Destruction = {
    val __obj = js.Dynamic.literal(destructor = js.Any.fromFunction0(destructor))
  
    __obj.asInstanceOf[Destruction]
  }
}

