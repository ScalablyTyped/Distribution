package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIFakeMod.Writeonly
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "fill")
@js.native
object fill extends js.Object {
  def apply[ForwardIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): Unit = js.native
}

