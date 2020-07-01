package typings.tstl.mod.default

import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.ireversableiteratorMod.IReversableIterator
import typings.tstl.ireverseiteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "make_reverse_iterator")
@js.native
object makeReverseIterator extends js.Object {
  def apply[IteratorT /* <: IReversableIterator[ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
}

