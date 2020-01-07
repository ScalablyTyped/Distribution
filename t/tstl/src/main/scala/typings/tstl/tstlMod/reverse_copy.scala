package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "reverse_copy")
@js.native
object reverse_copy extends js.Object {
  def apply[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<BidirectionalIterator>, OutputIterator>> */ js.Any */](first: BidirectionalIterator, last: BidirectionalIterator, output: OutputIterator): OutputIterator = js.native
}

