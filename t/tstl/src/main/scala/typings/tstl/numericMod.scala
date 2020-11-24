package typings.tstl

import org.scalablytyped.runtime.TopLevel
import typings.tstl.generalMod.General
import typings.tstl.icomputableMod.IComputable
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.inegatableMod.INegatable
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.operationsMod.Operator
import typings.tstl.operationsMod.Transformer
import typings.tstl.operatorsMod.Param
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/numeric", JSImport.Namespace)
@js.native
object numericMod extends js.Object {
  
  def accumulate[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, last: InputIterator, init: ValueType[InputIterator]): ValueType[InputIterator] = js.native
  def accumulate[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    init: ValueType[InputIterator],
    op: Operator[InputIterator, InputIterator]
  ): ValueType[InputIterator] = js.native
  
  @JSName("adjacent_difference")
  def adjacentDifference[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  @JSName("adjacent_difference")
  def adjacentDifference[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    subtracter: Operator[InputIterator, InputIterator]
  ): OutputIterator = js.native
  
  @JSName("assoc_laguerre")
  def assocLaguerre(n: Double, m: Double, x: Double): Double = js.native
  
  @JSName("assoc_legendre")
  def assocLegendre(n: Double, m: Double, x: Double): Double = js.native
  
  def beta(x: Double, y: Double): Double = js.native
  
  @JSName("comp_ellint_1")
  def compEllint1(k: Double): Double = js.native
  
  @JSName("comp_ellint_2")
  def compEllint2(k: Double): Double = js.native
  
  @JSName("comp_ellint_3")
  def compEllint3(k: Double, n: Double): Double = js.native
  
  @JSName("cyl_bessel_i")
  def cylBesselI(n: Double, x: Double): Double = js.native
  
  @JSName("cyl_bessel_j")
  def cylBesselJ(n: Double, x: Double): Double = js.native
  
  @JSName("cyl_bessel_k")
  def cylBesselK(n: Double, x: Double): Double = js.native
  
  @JSName("cyl_neumann")
  def cylNeumann(v: Double, x: Double): Double = js.native
  
  def divides[X /* <: Param[Y, Ret, typings.tstl.tstlStrings.divides] */, Y, Ret](x: X, y: Y): Ret = js.native
  
  @JSName("ellint_1")
  def ellint1(k: Double, phi: Double): Double = js.native
  
  @JSName("ellint_2")
  def ellint2(k: Double, phi: Double): Double = js.native
  
  @JSName("ellint_3")
  def ellint3(k: Double, v: Double, phi: Double): Double = js.native
  
  @JSName("exclusive_scan")
  def exclusiveScan[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, init: ValueType[InputIterator]): OutputIterator = js.native
  @JSName("exclusive_scan")
  def exclusiveScan[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: ValueType[InputIterator],
    op: Operator[InputIterator, InputIterator]
  ): OutputIterator = js.native
  
  def expint(x: Double): Double = js.native
  
  def gcd(x: Double, y: Double): Double = js.native
  
  def hermite(n: Double, x: Double): Double = js.native
  
  @JSName("inclusive_scan")
  def inclusiveScan[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  @JSName("inclusive_scan")
  def inclusiveScan[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    adder: js.UndefOr[scala.Nothing],
    init: ValueType[InputIterator]
  ): OutputIterator = js.native
  @JSName("inclusive_scan")
  def inclusiveScan[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    adder: Operator[InputIterator, InputIterator]
  ): OutputIterator = js.native
  @JSName("inclusive_scan")
  def inclusiveScan[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    adder: Operator[InputIterator, InputIterator],
    init: ValueType[InputIterator]
  ): OutputIterator = js.native
  
  @JSName("inner_product")
  def innerProduct[InputIterator1 /* <: General[IForwardIterator[ValueType[InputIterator1], InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[ValueType[InputIterator2], InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: ValueType[InputIterator1]
  ): ValueType[InputIterator1] = js.native
  @JSName("inner_product")
  def innerProduct[InputIterator1 /* <: General[IForwardIterator[ValueType[InputIterator1], InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[ValueType[InputIterator2], InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: ValueType[InputIterator1],
    adder: js.UndefOr[scala.Nothing],
    multiplier: Operator[InputIterator1, InputIterator2]
  ): ValueType[InputIterator1] = js.native
  @JSName("inner_product")
  def innerProduct[InputIterator1 /* <: General[IForwardIterator[ValueType[InputIterator1], InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[ValueType[InputIterator2], InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: ValueType[InputIterator1],
    adder: Operator[InputIterator1, InputIterator1]
  ): ValueType[InputIterator1] = js.native
  @JSName("inner_product")
  def innerProduct[InputIterator1 /* <: General[IForwardIterator[ValueType[InputIterator1], InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[ValueType[InputIterator2], InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: ValueType[InputIterator1],
    adder: Operator[InputIterator1, InputIterator1],
    multiplier: Operator[InputIterator1, InputIterator2]
  ): ValueType[InputIterator1] = js.native
  
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
  
  @JSName("partial_sum")
  def partialSum[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  @JSName("partial_sum")
  def partialSum[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    adder: Operator[InputIterator, InputIterator]
  ): OutputIterator = js.native
  
  def plus[Y, Ret](x: String, y: Y): Ret = js.native
  def plus[Y, Ret](x: Double, y: Y): Ret = js.native
  def plus[X /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in 'plus' ]: tstl.tstl/numeric/IComputable.IComputable<Y, Ret>[P]}
    */ typings.tstl.tstlStrings.plus with (TopLevel[IComputable[Y, Ret]]) */, Y, Ret](x: X, y: Y): Ret = js.native
  
  @JSName("riemann_zeta")
  def riemannZeta(arg: Double): Double = js.native
  
  @JSName("sph_bessel")
  def sphBessel(n: Double, x: Double): Double = js.native
  
  @JSName("sph_neumann")
  def sphNeumann(n: Double, x: Double): Double = js.native
  
  def tgamma(x: Double): Double = js.native
  
  @JSName("transform_exclusive_scan")
  def transformExclusiveScan[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: ValueType[InputIterator],
    binary: Operator[OutputIterator, OutputIterator],
    unary: Transformer[InputIterator, OutputIterator]
  ): OutputIterator = js.native
  
  @JSName("transform_inclusive_scan")
  def transformInclusiveScan[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: Operator[OutputIterator, OutputIterator],
    unary: Transformer[InputIterator, OutputIterator]
  ): OutputIterator = js.native
  @JSName("transform_inclusive_scan")
  def transformInclusiveScan[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: Operator[OutputIterator, OutputIterator],
    unary: Transformer[InputIterator, OutputIterator],
    init: ValueType[InputIterator]
  ): OutputIterator = js.native
}
