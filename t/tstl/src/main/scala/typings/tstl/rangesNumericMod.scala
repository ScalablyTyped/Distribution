package typings.tstl

import typings.tstl.internalFunctionalWriteonlyMod.Writeonly
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.ValueType
import typings.tstl.rangesNumericOperationsMod.BinaryTransformer
import typings.tstl.rangesNumericOperationsMod.Operator
import typings.tstl.rangesNumericOperationsMod.UnaryTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/numeric", JSImport.Namespace)
@js.native
object rangesNumericMod extends js.Object {
  def accumulate[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, init: ValueType[Range]): ValueType[Range] = js.native
  def accumulate[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, init: ValueType[Range], op: Operator[Range, Range]): ValueType[Range] = js.native
  def adjacent_difference[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  def adjacent_difference[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, subtracter: Operator[Range, Range]): OutputIterator = js.native
  def exclusive_scan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, init: ValueType[Range]): OutputIterator = js.native
  def exclusive_scan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, init: ValueType[Range], adder: Operator[Range, Range]): OutputIterator = js.native
  def inclusive_scan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  def inclusive_scan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, adder: Operator[Range, Range]): OutputIterator = js.native
  def inclusive_scan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, adder: Operator[Range, Range], init: ValueType[Range]): OutputIterator = js.native
  def inner_product[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, value: ValueType[Range1]): ValueType[Range1] = js.native
  def inner_product[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, value: ValueType[Range1], adder: Operator[Range1, Range1]): ValueType[Range1] = js.native
  def inner_product[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: Range2,
    value: ValueType[Range1],
    adder: Operator[Range1, Range1],
    multiplier: Operator[Range1, Range2]
  ): ValueType[Range1] = js.native
  def iota[Range /* <: js.Array[_] | (IForwardContainer[IForwardIterator[Double, _]]) */](range: Range, value: Double): Unit = js.native
  def partial_sum[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  def partial_sum[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, adder: Operator[Range, Range]): OutputIterator = js.native
  def transform_exclusive_scan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: IForwardIterator[
    typings.tstl.functionalIPointerMod.IPointer.ValueType[OutputIterator], 
    OutputIterator
  ] */](
    range: Range,
    output: OutputIterator,
    init: ValueType[Range],
    binary: BinaryTransformer[OutputIterator],
    unary: UnaryTransformer[Range, OutputIterator]
  ): OutputIterator = js.native
  def transform_inclusive_scan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: IForwardIterator[
    typings.tstl.functionalIPointerMod.IPointer.ValueType[OutputIterator], 
    OutputIterator
  ] */](
    range: Range,
    output: OutputIterator,
    binary: BinaryTransformer[OutputIterator],
    unary: UnaryTransformer[Range, OutputIterator]
  ): OutputIterator = js.native
  def transform_inclusive_scan[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: IForwardIterator[
    typings.tstl.functionalIPointerMod.IPointer.ValueType[OutputIterator], 
    OutputIterator
  ] */](
    range: Range,
    output: OutputIterator,
    binary: BinaryTransformer[OutputIterator],
    unary: UnaryTransformer[Range, OutputIterator],
    init: ValueType[Range]
  ): OutputIterator = js.native
}

