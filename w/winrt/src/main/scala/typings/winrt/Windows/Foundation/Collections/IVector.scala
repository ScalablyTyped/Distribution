package typings.winrt.Windows.Foundation.Collections

import typings.winrt.anon.Index
import typings.winrt.anon.Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVector[T] extends IIterable[T] {
  var length: Double = js.native
  var size: Double = js.native
  def append(value: T): Unit = js.native
  def clear(): Unit = js.native
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
  def getMany(startIndex: Double): Items[T] = js.native
  def getView(): IVectorView[T] = js.native
  def indexOf(value: T): Index = js.native
  def insertAt(index: Double, value: T): Unit = js.native
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
  def removeAt(index: Double): Unit = js.native
  def removeAtEnd(): Unit = js.native
  def replaceAll(items: js.Array[T]): Unit = js.native
  def reverse(): js.Array[T] = js.native
  def setAt(index: Double, value: T): Unit = js.native
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

