package typings.symbolTree.symbolTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToArrayOptions[T /* <: js.Object */] extends js.Object {
  /**
    * The array to initialize the operation with.
    *
    * @default
    * ```ts
    * new Array(0);
    * ```
    */
  var array: js.UndefOr[js.Array[T]] = js.native
  /**
    * Function to test each object before it is added to the array.
    * Invoked with arguments (object).
    *
    * Should return `true` if an object is to be included.
    *
    * @param object
    */
  var filter: js.UndefOr[js.Function1[/* object */ T, _]] = js.native
  /** Value to use as `this` when executing `filter`. */
  var thisArg: js.UndefOr[js.Any] = js.native
}

object ToArrayOptions {
  @scala.inline
  def apply[/* <: js.Object */ T](): ToArrayOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToArrayOptions[T]]
  }
  @scala.inline
  implicit class ToArrayOptionsOps[Self <: ToArrayOptions[_], /* <: js.Object */ T] (val x: Self with ToArrayOptions[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArrayVarargs(value: T*): Self = this.set("array", js.Array(value :_*))
    @scala.inline
    def setArray(value: js.Array[T]): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    @scala.inline
    def setFilter(value: /* object */ T => _): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setThisArg(value: js.Any): Self = this.set("thisArg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThisArg: Self = this.set("thisArg", js.undefined)
  }
  
}

