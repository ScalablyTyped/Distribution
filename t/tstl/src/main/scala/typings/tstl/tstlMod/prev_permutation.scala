package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import typings.tstl.iteratorIFakeMod.General
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "prev_permutation")
@js.native
object prev_permutation extends js.Object {
  def apply[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator): Boolean = js.native
  def apply[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ ValueType[BidirectionalIterator], 
      /* y */ ValueType[BidirectionalIterator], 
      Boolean
    ]
  ): Boolean = js.native
}

