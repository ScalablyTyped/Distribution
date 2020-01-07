package typings.tstl

import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/numeric/operations", JSImport.Namespace)
@js.native
object numericOperationsMod extends js.Object {
  def accumulate[T, InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<T, InputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, init: T): T = js.native
  def accumulate[T, InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<T, InputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, init: T, op: BinaryOperator[T, T]): T = js.native
  def adjacent_difference[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<T, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def adjacent_difference[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<T, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator, op: BinaryOperator[T, T]): OutputIterator = js.native
  def exclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<T, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator, init: T): OutputIterator = js.native
  def exclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<T, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    op: BinaryOperator[T, T]
  ): OutputIterator = js.native
  def gcd(x: Double, y: Double): Double = js.native
  def inclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<T, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def inclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<T, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator, op: BinaryOperator[T, T]): OutputIterator = js.native
  def inclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<T, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: BinaryOperator[T, T],
    init: T
  ): OutputIterator = js.native
  def inner_product[X, Y, InputIterator1 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<X, InputIterator1>> */ js.Any */, InputIterator2 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<Y, InputIterator2>> */ js.Any */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, value: X): X = js.native
  def inner_product[X, Y, InputIterator1 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<X, InputIterator1>> */ js.Any */, InputIterator2 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<Y, InputIterator2>> */ js.Any */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: BinaryOperator[X, X]
  ): X = js.native
  def inner_product[X, Y, InputIterator1 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<X, InputIterator1>> */ js.Any */, InputIterator2 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<Y, InputIterator2>> */ js.Any */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: BinaryOperator[X, X],
    op2: BinaryOperator[X, Y]
  ): X = js.native
  def iota[ForwardIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<number, ForwardIterator>> */ js.Any */](first: ForwardIterator, last: ForwardIterator, value: Double): Unit = js.native
  def lcm(x: Double, y: Double): Double = js.native
  def partial_sum[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<T, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def partial_sum[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<T, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator, op: BinaryOperator[T, T]): OutputIterator = js.native
  def transform_exclusive_scan[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<Ret, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform_inclusive_scan[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<Ret, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform_inclusive_scan[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<Ret, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret],
    init: T
  ): OutputIterator = js.native
  /**
    * @hidden
    */
  type BinaryOperator[X, Y] = js.Function2[/* x */ X, /* y */ Y, X]
}

