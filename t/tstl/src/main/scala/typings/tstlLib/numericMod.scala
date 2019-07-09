package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/numeric", JSImport.Namespace)
@js.native
object numericMod extends js.Object {
  def accumulate[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, init: T): T = js.native
  def accumulate[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    init: T,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): T = js.native
  def adjacent_difference[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def adjacent_difference[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): OutputIterator = js.native
  def assoc_laguerre(n: scala.Double, m: scala.Double, x: scala.Double): scala.Double = js.native
  def assoc_legendre(n: scala.Double, m: scala.Double, x: scala.Double): scala.Double = js.native
  def beta(x: scala.Double, y: scala.Double): scala.Double = js.native
  def comp_ellint_1(k: scala.Double): scala.Double = js.native
  def comp_ellint_2(k: scala.Double): scala.Double = js.native
  def comp_ellint_3(k: scala.Double, n: scala.Double): scala.Double = js.native
  def cyl_bessel_i(n: scala.Double, x: scala.Double): scala.Double = js.native
  def cyl_bessel_j(n: scala.Double, x: scala.Double): scala.Double = js.native
  def cyl_bessel_k(n: scala.Double, x: scala.Double): scala.Double = js.native
  def cyl_neumann(v: scala.Double, x: scala.Double): scala.Double = js.native
  def divides[X /* <: tstlLib.numericOperatorsMod.Param[Y, Ret, tstlLib.tstlLibStrings.divides] */, Y, Ret](x: X, y: Y): Ret = js.native
  def ellint_1(k: scala.Double, phi: scala.Double): scala.Double = js.native
  def ellint_2(k: scala.Double, phi: scala.Double): scala.Double = js.native
  def ellint_3(k: scala.Double, v: scala.Double, phi: scala.Double): scala.Double = js.native
  def exclusive_scan[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, init: T): OutputIterator = js.native
  def exclusive_scan[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): OutputIterator = js.native
  def expint(x: scala.Double): scala.Double = js.native
  def gcd(x: scala.Double, y: scala.Double): scala.Double = js.native
  def hermite(n: scala.Double, x: scala.Double): scala.Double = js.native
  def inclusive_scan[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def inclusive_scan[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): OutputIterator = js.native
  def inclusive_scan[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T],
    init: T
  ): OutputIterator = js.native
  def inner_product[X, Y, InputIterator1 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Y, InputIterator2]] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, value: X): X = js.native
  def inner_product[X, Y, InputIterator1 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Y, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: tstlLib.numericOperationsMod.BinaryOperator[X, X]
  ): X = js.native
  def inner_product[X, Y, InputIterator1 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Y, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: tstlLib.numericOperationsMod.BinaryOperator[X, X],
    op2: tstlLib.numericOperationsMod.BinaryOperator[X, Y]
  ): X = js.native
  def iota[ForwardIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[scala.Double, ForwardIterator]
  ] */](first: ForwardIterator, last: ForwardIterator, value: scala.Double): scala.Unit = js.native
  def laguerre(n: scala.Double, x: scala.Double): scala.Double = js.native
  def lcm(x: scala.Double, y: scala.Double): scala.Double = js.native
  def legendre(n: scala.Double, x: scala.Double): scala.Double = js.native
  def lgamma(x: scala.Double): scala.Double = js.native
  def minus[X /* <: tstlLib.numericOperatorsMod.Param[Y, Ret, tstlLib.tstlLibStrings.minus] */, Y, Ret](x: X, y: Y): Ret = js.native
  def modules[X /* <: tstlLib.numericOperatorsMod.Param[Y, Ret, tstlLib.tstlLibStrings.modules] */, Y, Ret](x: X, y: Y): Ret = js.native
  def multiplies[X /* <: tstlLib.numericOperatorsMod.Param[Y, Ret, tstlLib.tstlLibStrings.multiplies] */, Y, Ret](x: X, y: Y): Ret = js.native
  def negate[Ret](x: scala.Double): Ret = js.native
  def negate[Ret](x: tstlLib.numericINegatableMod.INegatable[Ret]): Ret = js.native
  def partial_sum[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def partial_sum[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    op: tstlLib.numericOperationsMod.BinaryOperator[T, T]
  ): OutputIterator = js.native
  def plus[Y, Ret](x: java.lang.String, y: Y): Ret = js.native
  def plus[Y, Ret](x: scala.Double, y: Y): Ret = js.native
  def plus[X /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in 'plus' ]: tstl.tstl/numeric/IComputable.IComputable<Y, Ret>[P]}
    */ tstlLib.tstlLibStrings.plus with (tstlLib.numericIComputableMod.IComputable[Y, Ret]) */, Y, Ret](x: X, y: Y): Ret = js.native
  def riemann_zeta(arg: scala.Double): scala.Double = js.native
  def sph_bessel(n: scala.Double, x: scala.Double): scala.Double = js.native
  def sph_neumann(n: scala.Double, x: scala.Double): scala.Double = js.native
  def tgamma(x: scala.Double): scala.Double = js.native
  def transform_exclusive_scan[T, Ret, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    binary: tstlLib.numericOperationsMod.BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform_inclusive_scan[T, Ret, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: tstlLib.numericOperationsMod.BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform_inclusive_scan[T, Ret, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: tstlLib.numericOperationsMod.BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret],
    init: T
  ): OutputIterator = js.native
}

