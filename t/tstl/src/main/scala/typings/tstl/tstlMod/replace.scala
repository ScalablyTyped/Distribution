package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIFakeMod.General
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "replace")
@js.native
object replace extends js.Object {
  def apply[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    old_val: ValueType[InputIterator],
    new_val: ValueType[InputIterator]
  ): Unit = js.native
}

