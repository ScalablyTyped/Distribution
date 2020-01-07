package typings.tstl

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/partition", JSImport.Namespace)
@js.native
object algorithmPartitionMod extends js.Object {
  def is_partitioned[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    pred: js.Function1[/* x */ ValueType[ForwardIterator], Boolean]
  ): Boolean = js.native
  def partition[BidirectionalIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IBidirectionalIterator<IPointer.ValueType<BidirectionalIterator>, BidirectionalIterator>> */ js.Any */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ ValueType[BidirectionalIterator], Boolean]
  ): BidirectionalIterator = js.native
  def partition_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator1 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator1>> */ js.Any */, OutputIterator2 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator2>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: js.Function1[/* val */ ValueType[InputIterator], ValueType[InputIterator]]
  ): Pair[OutputIterator1, OutputIterator2] = js.native
  def partition_point[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    pred: js.Function1[/* x */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
  def stable_partition[BidirectionalIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IBidirectionalIterator<IPointer.ValueType<BidirectionalIterator>, BidirectionalIterator>> */ js.Any */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ ValueType[BidirectionalIterator], Boolean]
  ): BidirectionalIterator = js.native
}

