package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIFakeMod.Writeonly
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "remove_copy")
@js.native
object remove_copy extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, `val`: ValueType[InputIterator]): OutputIterator = js.native
}

