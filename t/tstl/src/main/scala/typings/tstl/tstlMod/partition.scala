package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "partition")
@js.native
object partition extends js.Object {
  def apply[BidirectionalIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IBidirectionalIterator<IPointer.ValueType<BidirectionalIterator>, BidirectionalIterator>> */ js.Any */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ ValueType[BidirectionalIterator], Boolean]
  ): BidirectionalIterator = js.native
}

