package typings.tstl.tstlMod

import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.numericOperationsMod.BinaryOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "transform_inclusive_scan")
@js.native
object transform_inclusive_scan extends js.Object {
  def apply[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<Ret, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def apply[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<Ret, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret],
    init: T
  ): OutputIterator = js.native
}

