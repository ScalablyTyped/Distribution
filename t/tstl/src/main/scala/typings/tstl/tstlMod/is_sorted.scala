package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "is_sorted")
@js.native
object is_sorted extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): Boolean = js.native
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): Boolean = js.native
}

