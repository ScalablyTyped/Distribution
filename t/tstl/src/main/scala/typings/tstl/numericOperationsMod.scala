package typings.tstl

import typings.tstl.iforwardcontainerMod.IForwardContainer
import typings.tstl.iforwardcontainerMod.IForwardContainer.ValueType
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/numeric/operations", JSImport.Namespace)
@js.native
object numericOperationsMod extends js.Object {
  def accumulate[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, init: ValueType[Range]): ValueType[Range] = js.native
  def accumulate[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, init: ValueType[Range], op: Operator[Range, Range]): ValueType[Range] = js.native
  @JSName("adjacent_difference")
  def adjacentDifference[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  @JSName("adjacent_difference")
  def adjacentDifference[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, subtracter: Operator[Range, Range]): OutputIterator = js.native
  @JSName("exclusive_scan")
  def exclusiveScan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, init: ValueType[Range]): OutputIterator = js.native
  @JSName("exclusive_scan")
  def exclusiveScan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, init: ValueType[Range], adder: Operator[Range, Range]): OutputIterator = js.native
  @JSName("inclusive_scan")
  def inclusiveScan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  @JSName("inclusive_scan")
  def inclusiveScan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, adder: Operator[Range, Range]): OutputIterator = js.native
  @JSName("inclusive_scan")
  def inclusiveScan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, adder: Operator[Range, Range], init: ValueType[Range]): OutputIterator = js.native
  @JSName("inner_product")
  def innerProduct[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, value: ValueType[Range1]): ValueType[Range1] = js.native
  @JSName("inner_product")
  def innerProduct[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, value: ValueType[Range1], adder: Operator[Range1, Range1]): ValueType[Range1] = js.native
  @JSName("inner_product")
  def innerProduct[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: Range2,
    value: ValueType[Range1],
    adder: Operator[Range1, Range1],
    multiplier: Operator[Range1, Range2]
  ): ValueType[Range1] = js.native
  def iota[Range /* <: js.Array[_] | (IForwardContainer[IForwardIterator[Double, _]]) */](range: Range, value: Double): Unit = js.native
  @JSName("partial_sum")
  def partialSum[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  @JSName("partial_sum")
  def partialSum[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, adder: Operator[Range, Range]): OutputIterator = js.native
  @JSName("transform_exclusive_scan")
  def transformExclusiveScan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], OutputIterator] */](
    range: Range,
    output: OutputIterator,
    init: ValueType[Range],
    binary: BinaryTransformer[OutputIterator],
    unary: UnaryTransformer[Range, OutputIterator]
  ): OutputIterator = js.native
  @JSName("transform_inclusive_scan")
  def transformInclusiveScan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], OutputIterator] */](
    range: Range,
    output: OutputIterator,
    binary: BinaryTransformer[OutputIterator],
    unary: UnaryTransformer[Range, OutputIterator]
  ): OutputIterator = js.native
  @JSName("transform_inclusive_scan")
  def transformInclusiveScan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], OutputIterator] */](
    range: Range,
    output: OutputIterator,
    binary: BinaryTransformer[OutputIterator],
    unary: UnaryTransformer[Range, OutputIterator],
    init: ValueType[Range]
  ): OutputIterator = js.native
  type BinaryTransformer[OutputIterator /* <: IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], OutputIterator] */] = js.Function2[
    /* x */ typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], 
    /* y */ typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], 
    typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator]
  ]
  type Operator[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */] = js.Function2[/* x */ ValueType[Range1], /* y */ ValueType[Range2], ValueType[Range1]]
  type UnaryTransformer[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], OutputIterator] */] = js.Function1[
    /* val */ ValueType[Range], 
    typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator]
  ]
}

