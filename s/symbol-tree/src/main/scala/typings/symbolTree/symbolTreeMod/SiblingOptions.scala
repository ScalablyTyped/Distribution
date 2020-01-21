package typings.symbolTree.symbolTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiblingOptions[T /* <: js.Object */] extends js.Object {
  /**
  		 * Used to constrain the operation to a subtree.
  		 *
  		 * When `null`, the whole tree is walked to the real root.
  		 *
  		 * @default null
  		 */
  var root: js.UndefOr[T | Null] = js.undefined
  /**
  		 * If set, ignore the children of `object`
  		 *
  		 * @default false
  		 */
  var skipChildren: js.UndefOr[Boolean] = js.undefined
}

object SiblingOptions {
  @scala.inline
  def apply[T /* <: js.Object */](root: T = null, skipChildren: js.UndefOr[Boolean] = js.undefined): SiblingOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(skipChildren)) __obj.updateDynamic("skipChildren")(skipChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiblingOptions[T]]
  }
}

