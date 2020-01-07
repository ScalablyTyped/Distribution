package typings.tstl.tstlMod

import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.numericOperationsMod.BinaryOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "exclusive_scan")
@js.native
object exclusive_scan extends js.Object {
  def apply[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<T, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator, init: T): OutputIterator = js.native
  def apply[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<T, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    op: BinaryOperator[T, T]
  ): OutputIterator = js.native
}

