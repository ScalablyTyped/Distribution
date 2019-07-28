package typings.tstl.baseDisposableIPartialContainersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IEmpty extends js.Object {
  /**
    * Test whether container is empty.
    */
  def empty(): Boolean
}

object _IEmpty {
  @scala.inline
  def apply(empty: () => Boolean): _IEmpty = {
    val __obj = js.Dynamic.literal(empty = js.Any.fromFunction0(empty))
  
    __obj.asInstanceOf[_IEmpty]
  }
}

