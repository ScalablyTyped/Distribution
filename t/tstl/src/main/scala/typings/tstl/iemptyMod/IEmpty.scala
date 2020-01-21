package typings.tstl.iemptyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmpty extends js.Object {
  /**
    * Test whether container is empty.
    */
  def empty(): Boolean
}

object IEmpty {
  @scala.inline
  def apply(empty: () => Boolean): IEmpty = {
    val __obj = js.Dynamic.literal(empty = js.Any.fromFunction0(empty))
  
    __obj.asInstanceOf[IEmpty]
  }
}

