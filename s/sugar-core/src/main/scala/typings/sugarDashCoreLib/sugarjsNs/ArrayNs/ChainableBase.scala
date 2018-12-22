package typings
package sugarDashCoreLib.sugarjsNs.ArrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[T, RawValue] extends js.Object {
  var raw: RawValue = js.native
  def concat(items: (js.Array[T] | T)*): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def copyWithin(target: scala.Double, start: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def copyWithin(target: scala.Double, start: scala.Double, end: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def every(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def every(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean],
    thisArg: js.Any
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def fill(value: T): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def fill(value: T, start: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def fill(value: T, start: scala.Double, end: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def filter(callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], _]): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def filter(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], _],
    thisArg: js.Any
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def find(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ js.Array[T], scala.Boolean]
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.UndefOr[T]] = js.native
  def find(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ js.Array[T], scala.Boolean],
    thisArg: js.Any
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.UndefOr[T]] = js.native
  def findIndex(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ js.Array[T], scala.Boolean]
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def findIndex(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ js.Array[T], scala.Boolean],
    thisArg: js.Any
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit]
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Unit] = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit],
    thisArg: js.Any
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Unit] = js.native
  def indexOf(searchElement: T): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def indexOf(searchElement: T, fromIndex: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def join(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def join(separator: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def lastIndexOf(searchElement: T): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def lastIndexOf(searchElement: T, fromIndex: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def map[U](callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], U]): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[U]] = js.native
  def map[U](
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], U],
    thisArg: js.Any
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[U]] = js.native
  def pop(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.UndefOr[T]] = js.native
  def push(items: T*): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ]
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ],
    initialValue: T
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ]
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ],
    initialValue: T
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  @JSName("reduceRight")
  def reduceRight_U[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      U
    ],
    initialValue: U
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[U] = js.native
  @JSName("reduce")
  def reduce_U[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      U
    ],
    initialValue: U
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[U] = js.native
  def reverse(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def shift(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.UndefOr[T]] = js.native
  def slice(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def slice(start: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def slice(start: scala.Double, end: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def some(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def some(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean],
    thisArg: js.Any
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def sort(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, scala.Double]): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[this.type] = js.native
  def splice(start: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def splice(start: scala.Double, deleteCount: scala.Double, items: T*): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def unshift(items: T*): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
}

