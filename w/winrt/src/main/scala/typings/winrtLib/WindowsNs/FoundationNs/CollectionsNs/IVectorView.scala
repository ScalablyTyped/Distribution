package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVectorView[T] extends IIterable[T] {
  var length: scala.Double = js.native
  var size: scala.Double = js.native
  def concat(items: js.Array[T]*): js.Array[T] = js.native
  def every(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]
  ): scala.Boolean = js.native
  def every(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean],
    thisArg: js.Any
  ): scala.Boolean = js.native
  def filter(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]
  ): js.Array[T] = js.native
  def filter(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean],
    thisArg: js.Any
  ): js.Array[T] = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit]
  ): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def getAt(index: scala.Double): T = js.native
  def getMany(startIndex: scala.Double): winrtLib.Anon_ItemsReturnValueArrayT[T] = js.native
  def indexOf(value: T): winrtLib.Anon_Index = js.native
  def join(seperator: java.lang.String): java.lang.String = js.native
  def lastIndexOf(searchElement: T): scala.Double = js.native
  def lastIndexOf(searchElement: T, fromIndex: scala.Double): scala.Double = js.native
  def map(callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], _]): js.Array[_] = js.native
  def map(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], _],
    thisArg: js.Any
  ): js.Array[_] = js.native
  def pop(): T = js.native
  def push(items: T*): scala.Unit = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      _
    ]
  ): js.Any = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      _
    ],
    initialValue: js.Any
  ): js.Any = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      _
    ]
  ): js.Any = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      _
    ],
    initialValue: js.Any
  ): js.Any = js.native
  def reverse(): js.Array[T] = js.native
  def shift(): T = js.native
  def slice(start: scala.Double): js.Array[T] = js.native
  def slice(start: scala.Double, end: scala.Double): js.Array[T] = js.native
  def some(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]
  ): scala.Boolean = js.native
  def some(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean],
    thisArg: js.Any
  ): scala.Boolean = js.native
  def sort(): js.Array[T] = js.native
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, scala.Double]): js.Array[T] = js.native
  def splice(start: scala.Double): js.Array[T] = js.native
  def splice(start: scala.Double, deleteCount: scala.Double, items: T*): js.Array[T] = js.native
  def unshift(items: T*): scala.Double = js.native
}

