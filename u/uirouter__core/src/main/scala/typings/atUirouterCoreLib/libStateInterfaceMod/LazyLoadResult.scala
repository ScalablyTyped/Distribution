package typings
package atUirouterCoreLib.libStateInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyLoadResult extends js.Object {
  var states: js.UndefOr[js.Array[StateDeclaration]] = js.undefined
}

object LazyLoadResult {
  @scala.inline
  def apply(states: js.Array[StateDeclaration] = null): LazyLoadResult = {
    val __obj = js.Dynamic.literal()
    if (states != null) __obj.updateDynamic("states")(states)
    __obj.asInstanceOf[LazyLoadResult]
  }
}

