package typings.tstl.mod

import typings.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "reverse_copy")
@js.native
object reverseCopy extends js.Object {
  def apply[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[BidirectionalIterator], OutputIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator, output: OutputIterator): OutputIterator = js.native
}

