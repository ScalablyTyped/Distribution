package typings.sugarCore.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sugarjs.Array")
@js.native
object Array extends js.Object {
  @js.native
  trait ChainableBase[T, RawValue] extends js.Object {
    var raw: RawValue = js.native
    def concat(items: (js.Array[T] | T)*): SugarDefaultChainable[js.Array[T]] = js.native
    def copyWithin(target: Double, start: Double): SugarDefaultChainable[this.type] = js.native
    def copyWithin(target: Double, start: Double, end: Double): SugarDefaultChainable[this.type] = js.native
    def every(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): SugarDefaultChainable[Boolean] = js.native
    def every(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: js.Any
    ): SugarDefaultChainable[Boolean] = js.native
    def fill(value: T): SugarDefaultChainable[this.type] = js.native
    def fill(value: T, start: js.UndefOr[scala.Nothing], end: Double): SugarDefaultChainable[this.type] = js.native
    def fill(value: T, start: Double): SugarDefaultChainable[this.type] = js.native
    def fill(value: T, start: Double, end: Double): SugarDefaultChainable[this.type] = js.native
    def filter(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _]): SugarDefaultChainable[js.Array[T]] = js.native
    def filter(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _],
      thisArg: js.Any
    ): SugarDefaultChainable[js.Array[T]] = js.native
    def find(predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], Boolean]): SugarDefaultChainable[js.UndefOr[T]] = js.native
    def find(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], Boolean],
      thisArg: js.Any
    ): SugarDefaultChainable[js.UndefOr[T]] = js.native
    def findIndex(predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], Boolean]): SugarDefaultChainable[Double] = js.native
    def findIndex(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], Boolean],
      thisArg: js.Any
    ): SugarDefaultChainable[Double] = js.native
    def forEach(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): SugarDefaultChainable[Unit] = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
      thisArg: js.Any
    ): SugarDefaultChainable[Unit] = js.native
    def indexOf(searchElement: T): SugarDefaultChainable[Double] = js.native
    def indexOf(searchElement: T, fromIndex: Double): SugarDefaultChainable[Double] = js.native
    def join(): SugarDefaultChainable[java.lang.String] = js.native
    def join(separator: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def lastIndexOf(searchElement: T): SugarDefaultChainable[Double] = js.native
    def lastIndexOf(searchElement: T, fromIndex: Double): SugarDefaultChainable[Double] = js.native
    def map[U](callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U]): SugarDefaultChainable[js.Array[U]] = js.native
    def map[U](
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U],
      thisArg: js.Any
    ): SugarDefaultChainable[js.Array[U]] = js.native
    def pop(): SugarDefaultChainable[js.UndefOr[T]] = js.native
    def push(items: T*): SugarDefaultChainable[Double] = js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          T
        ]
    ): SugarDefaultChainable[T] = js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          T
        ],
      initialValue: T
    ): SugarDefaultChainable[T] = js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          T
        ]
    ): SugarDefaultChainable[T] = js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          T
        ],
      initialValue: T
    ): SugarDefaultChainable[T] = js.native
    @JSName("reduceRight")
    def reduceRight_U[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          U
        ],
      initialValue: U
    ): SugarDefaultChainable[U] = js.native
    @JSName("reduce")
    def reduce_U[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          U
        ],
      initialValue: U
    ): SugarDefaultChainable[U] = js.native
    def reverse(): SugarDefaultChainable[js.Array[T]] = js.native
    def shift(): SugarDefaultChainable[js.UndefOr[T]] = js.native
    def slice(): SugarDefaultChainable[js.Array[T]] = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): SugarDefaultChainable[js.Array[T]] = js.native
    def slice(start: Double): SugarDefaultChainable[js.Array[T]] = js.native
    def slice(start: Double, end: Double): SugarDefaultChainable[js.Array[T]] = js.native
    def some(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): SugarDefaultChainable[Boolean] = js.native
    def some(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: js.Any
    ): SugarDefaultChainable[Boolean] = js.native
    def sort(): SugarDefaultChainable[this.type] = js.native
    def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): SugarDefaultChainable[this.type] = js.native
    def splice(start: Double): SugarDefaultChainable[js.Array[T]] = js.native
    def splice(start: Double, deleteCount: Double, items: T*): SugarDefaultChainable[js.Array[T]] = js.native
    def unshift(items: T*): SugarDefaultChainable[Double] = js.native
  }
  
  type Chainable[T, RawValue] = (ChainableBase[T, RawValue]) with typings.sugarCore.sugarjs.Object.ChainableBase[RawValue]
}

