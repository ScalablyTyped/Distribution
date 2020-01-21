package typings.symbolTree.symbolTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToArrayOptions[T /* <: js.Object */] extends js.Object {
  /**
  		 * The array to initialize the operation with.
  		 *
  		 * @default
  		 * ```ts
  		 * new Array(0);
  		 * ```
  		 */
  var array: js.UndefOr[js.Array[T]] = js.undefined
  /**
  		 * Function to test each object before it is added to the array.
  		 * Invoked with arguments (object).
  		 *
  		 * Should return `true` if an object is to be included.
  		 *
  		 * @param object
  		 */
  var filter: js.UndefOr[js.Function1[/* object */ T, _]] = js.undefined
  /** Value to use as `this` when executing `filter`. */
  var thisArg: js.UndefOr[js.Any] = js.undefined
}

object ToArrayOptions {
  @scala.inline
  def apply[T /* <: js.Object */](array: js.Array[T] = null, filter: /* object */ T => _ = null, thisArg: js.Any = null): ToArrayOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (array != null) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (thisArg != null) __obj.updateDynamic("thisArg")(thisArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToArrayOptions[T]]
  }
}

