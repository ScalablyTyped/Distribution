package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "inplace_merge")
@js.native
object inplace_merge extends js.Object {
  def apply[BidirectionalIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IBidirectionalIterator<IPointer.ValueType<BidirectionalIterator>, BidirectionalIterator>> */ js.Any */](first: BidirectionalIterator, middle: BidirectionalIterator, last: BidirectionalIterator): Unit = js.native
  def apply[BidirectionalIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IBidirectionalIterator<IPointer.ValueType<BidirectionalIterator>, BidirectionalIterator>> */ js.Any */](
    first: BidirectionalIterator,
    middle: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ ValueType[BidirectionalIterator], 
      /* y */ ValueType[BidirectionalIterator], 
      Boolean
    ]
  ): Unit = js.native
}

