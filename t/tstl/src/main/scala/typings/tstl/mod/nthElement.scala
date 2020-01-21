package typings.tstl.mod

import typings.tstl.comparatorMod.Comparator
import typings.tstl.generalMod.General
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.irandomaccessiteratorMod.IRandomAccessIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "nth_element")
@js.native
object nthElement extends js.Object {
  def apply[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, nth: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def apply[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    nth: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): Unit = js.native
}

