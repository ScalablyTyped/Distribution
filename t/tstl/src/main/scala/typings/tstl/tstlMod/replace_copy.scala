package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIFakeMod.Writeonly
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "replace_copy")
@js.native
object replace_copy extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    old_val: ValueType[InputIterator],
    new_val: ValueType[InputIterator]
  ): OutputIterator = js.native
}

