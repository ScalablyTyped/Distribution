package typings.atTensorflowTfjsDashCore.distOpsRandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomBase extends js.Object {
  def nextValue(): Double
}

object RandomBase {
  @scala.inline
  def apply(nextValue: () => Double): RandomBase = {
    val __obj = js.Dynamic.literal(nextValue = js.Any.fromFunction0(nextValue))
  
    __obj.asInstanceOf[RandomBase]
  }
}

