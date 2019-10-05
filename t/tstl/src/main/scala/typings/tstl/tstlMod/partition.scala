package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import typings.tstl.iteratorIFakeMod.General
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "partition")
@js.native
object partition extends js.Object {
  def apply[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ ValueType[BidirectionalIterator], Boolean]
  ): BidirectionalIterator = js.native
}

