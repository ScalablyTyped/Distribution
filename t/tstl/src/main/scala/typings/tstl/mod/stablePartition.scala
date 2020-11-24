package typings.tstl.mod

import typings.tstl.generalMod.General
import typings.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.unaryPredicatorMod.UnaryPredicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "stable_partition")
@js.native
object stablePartition extends js.Object {
  
  def apply[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: UnaryPredicator[ValueType[BidirectionalIterator]]
  ): BidirectionalIterator = js.native
}
