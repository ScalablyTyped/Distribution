package typings.tstl.mod

import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "for_each")
@js.native
object forEach extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, Func /* <: js.Function1[/* val */ ValueType[InputIterator], _] */](first: InputIterator, last: InputIterator, fn: Func): Func = js.native
}

