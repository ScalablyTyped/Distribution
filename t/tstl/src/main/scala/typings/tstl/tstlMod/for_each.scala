package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "for_each")
@js.native
object for_each extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, Func /* <: js.Function1[/* val */ ValueType[InputIterator], _] */](first: InputIterator, last: InputIterator, fn: Func): Func = js.native
}

