package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "next_permutation")
@js.native
object next_permutation extends js.Object {
  def apply[BidirectionalIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IBidirectionalIterator<IPointer.ValueType<BidirectionalIterator>, BidirectionalIterator>> */ js.Any */](first: BidirectionalIterator, last: BidirectionalIterator): Boolean = js.native
  def apply[BidirectionalIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IBidirectionalIterator<IPointer.ValueType<BidirectionalIterator>, BidirectionalIterator>> */ js.Any */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ ValueType[BidirectionalIterator], 
      /* y */ ValueType[BidirectionalIterator], 
      Boolean
    ]
  ): Boolean = js.native
}

