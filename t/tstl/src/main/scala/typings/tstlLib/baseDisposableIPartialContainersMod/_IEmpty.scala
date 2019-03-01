package typings
package tstlLib.baseDisposableIPartialContainersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IEmpty extends js.Object {
  /**
    * Test whether container is empty.
    */
  def empty(): scala.Boolean
}

object _IEmpty {
  @scala.inline
  def apply(empty: js.Function0[scala.Boolean]): _IEmpty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("empty")(empty)
    __obj.asInstanceOf[_IEmpty]
  }
}

