package typings.tstl

import typings.tstl.iteratorIFakeMod.General
import typings.tstl.iteratorIFakeMod.Writeonly
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.numericIComputableMod.IComputable
import typings.tstl.numericINegatableMod.INegatable
import typings.tstl.numericOperationsMod.BinaryOperator
import typings.tstl.numericOperatorsMod.Param
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/numeric", JSImport.Namespace)
@js.native
object numericMod extends js.Object {
  def accumulate[T, InputIterator /* <: General[IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, init: T): T = js.native
  def accumulate[T, InputIterator /* <: General[IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, init: T, op: BinaryOperator[T, T]): T = js.native
  def adjacent_difference[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def adjacent_difference[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, op: BinaryOperator[T, T]): OutputIterator = js.native
  def assoc_laguerre(n: Double, m: Double, x: Double): Double = js.native
  def assoc_legendre(n: Double, m: Double, x: Double): Double = js.native
  def beta(x: Double, y: Double): Double = js.native
  def comp_ellint_1(k: Double): Double = js.native
  def comp_ellint_2(k: Double): Double = js.native
  def comp_ellint_3(k: Double, n: Double): Double = js.native
  def cyl_bessel_i(n: Double, x: Double): Double = js.native
  def cyl_bessel_j(n: Double, x: Double): Double = js.native
  def cyl_bessel_k(n: Double, x: Double): Double = js.native
  def cyl_neumann(v: Double, x: Double): Double = js.native
  def divides[X /* <: Param[Y, Ret, typings.tstl.tstlStrings.divides] */, Y, Ret](x: X, y: Y): Ret = js.native
  def ellint_1(k: Double, phi: Double): Double = js.native
  def ellint_2(k: Double, phi: Double): Double = js.native
  def ellint_3(k: Double, v: Double, phi: Double): Double = js.native
  def exclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, init: T): OutputIterator = js.native
  def exclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    op: BinaryOperator[T, T]
  ): OutputIterator = js.native
  def expint(x: Double): Double = js.native
  def gcd(x: Double, y: Double): Double = js.native
  def hermite(n: Double, x: Double): Double = js.native
  def inclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def inclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, op: BinaryOperator[T, T]): OutputIterator = js.native
  def inclusive_scan[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: BinaryOperator[T, T],
    init: T
  ): OutputIterator = js.native
  def inner_product[X, Y, InputIterator1 /* <: General[IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[Y, InputIterator2]] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, value: X): X = js.native
  def inner_product[X, Y, InputIterator1 /* <: General[IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[Y, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: BinaryOperator[X, X]
  ): X = js.native
  def inner_product[X, Y, InputIterator1 /* <: General[IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[Y, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: BinaryOperator[X, X],
    op2: BinaryOperator[X, Y]
  ): X = js.native
  def iota[ForwardIterator /* <: General[IForwardIterator[Double, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, value: Double): Unit = js.native
  def laguerre(n: Double, x: Double): Double = js.native
  def lcm(x: Double, y: Double): Double = js.native
  def legendre(n: Double, x: Double): Double = js.native
  def lgamma(x: Double): Double = js.native
  def minus[X /* <: Param[Y, Ret, typings.tstl.tstlStrings.minus] */, Y, Ret](x: X, y: Y): Ret = js.native
  def modules[X /* <: Param[Y, Ret, typings.tstl.tstlStrings.modules] */, Y, Ret](x: X, y: Y): Ret = js.native
  def multiplies[X /* <: Param[Y, Ret, typings.tstl.tstlStrings.multiplies] */, Y, Ret](x: X, y: Y): Ret = js.native
  def negate[Ret](x: Double): Ret = js.native
  def negate[Ret](x: INegatable[Ret]): Ret = js.native
  def partial_sum[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def partial_sum[T, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, op: BinaryOperator[T, T]): OutputIterator = js.native
  def plus[Y, Ret](x: String, y: Y): Ret = js.native
  def plus[Y, Ret](x: Double, y: Y): Ret = js.native
  def plus[X /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in 'plus' ]: tstl.tstl/numeric/IComputable.IComputable<Y, Ret>[P]}
    */ typings.tstl.tstlStrings.plus with (IComputable[Y, Ret]) */, Y, Ret](x: X, y: Y): Ret = js.native
  def riemann_zeta(arg: Double): Double = js.native
  def sph_bessel(n: Double, x: Double): Double = js.native
  def sph_neumann(n: Double, x: Double): Double = js.native
  def tgamma(x: Double): Double = js.native
  def transform_exclusive_scan[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: General[IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform_inclusive_scan[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform_inclusive_scan[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret],
    init: T
  ): OutputIterator = js.native
}

