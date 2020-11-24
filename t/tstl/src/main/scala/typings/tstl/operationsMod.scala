package typings.tstl

import typings.tstl.generalMod.General
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/numeric/operations", JSImport.Namespace)
@js.native
object operationsMod extends js.Object {
  
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
  
  def gcd(x: Double, y: Double): Double = js.native
  
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
  
  def lcm(x: Double, y: Double): Double = js.native
  
  @JSName("partial_sum")
  def partialSum[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  @JSName("partial_sum")
  def partialSum[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    adder: Operator[InputIterator, InputIterator]
  ): OutputIterator = js.native
  
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
  
  type Operator[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator2], Iterator2] */] = js.Function2[/* x */ ValueType[Iterator1], /* y */ ValueType[Iterator2], ValueType[Iterator1]]
  
  type Transformer[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */] = js.Function1[/* val */ ValueType[InputIterator], ValueType[OutputIterator]]
}
