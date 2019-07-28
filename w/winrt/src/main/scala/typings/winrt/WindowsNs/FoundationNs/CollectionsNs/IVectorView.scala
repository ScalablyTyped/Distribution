package typings.winrt.WindowsNs.FoundationNs.CollectionsNs

import typings.winrt.Anon_Index
import typings.winrt.Anon_Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVectorView[T] extends IIterable[T] {
  var length: Double = js.native
  var size: Double = js.native
  def concat(items: js.Array[T]*): js.Array[T] = js.native
  def every(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
  def every(
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
    thisArg: js.Any
  ): Boolean = js.native
  def filter(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): js.Array[T] = js.native
  def filter(
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
    thisArg: js.Any
  ): js.Array[T] = js.native
  def forEach(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
    thisArg: js.Any
  ): Unit = js.native
  def getAt(index: Double): T = js.native
  def getMany(startIndex: Double): Anon_Items[T] = js.native
  def indexOf(value: T): Anon_Index = js.native
  def join(seperator: String): String = js.native
  def lastIndexOf(searchElement: T): Double = js.native
  def lastIndexOf(searchElement: T, fromIndex: Double): Double = js.native
  def map(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _]): js.Array[_] = js.native
  def map(
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _],
    thisArg: js.Any
  ): js.Array[_] = js.native
  def pop(): T = js.native
  def push(items: T*): Unit = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      _
    ]
  ): js.Any = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      _
    ],
    initialValue: js.Any
  ): js.Any = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      _
    ]
  ): js.Any = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      _
    ],
    initialValue: js.Any
  ): js.Any = js.native
  def reverse(): js.Array[T] = js.native
  def shift(): T = js.native
  def slice(start: Double): js.Array[T] = js.native
  def slice(start: Double, end: Double): js.Array[T] = js.native
  def some(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
  def some(
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
    thisArg: js.Any
  ): Boolean = js.native
  def sort(): js.Array[T] = js.native
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
  def splice(start: Double): js.Array[T] = js.native
  def splice(start: Double, deleteCount: Double, items: T*): js.Array[T] = js.native
  def unshift(items: T*): Double = js.native
}

