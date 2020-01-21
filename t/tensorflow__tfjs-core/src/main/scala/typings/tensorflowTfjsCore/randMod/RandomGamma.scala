package typings.tensorflowTfjsCore.randMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomGamma extends js.Object {
  def nextValue(): Double
}

object RandomGamma {
  @scala.inline
  def apply(nextValue: () => Double): RandomGamma = {
    val __obj = js.Dynamic.literal(nextValue = js.Any.fromFunction0(nextValue))
  
    __obj.asInstanceOf[RandomGamma]
  }
}

