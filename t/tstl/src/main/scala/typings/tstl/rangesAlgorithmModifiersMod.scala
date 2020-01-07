package typings.tstl

import typings.tstl.internalFunctionalBinaryPredicatorMod.BinaryPredicator
import typings.tstl.internalFunctionalUnaryPredicatorMod.UnaryPredicator
import typings.tstl.internalFunctionalWriteonlyMod.Writeonly
import typings.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.rangesContainerIBidirectionalContainerMod.IBidirectionalContainer
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.IteratorType
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer.ValueType
import typings.tstl.rangesContainerIRandomAccessContainerMod.IRandomAccessContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/modifiers", JSImport.Namespace)
@js.native
object rangesAlgorithmModifiersMod extends js.Object {
  def copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  def copy_backward[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */, OutputIterator /* <: Writeonly[
    IBidirectionalIterator[
      typings.tstl.rangesContainerIBidirectionalContainerMod.IBidirectionalContainer.ValueType[Range], 
      OutputIterator
    ]
  ] */](range: Range, output: OutputIterator): OutputIterator = js.native
  def copy_if[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, pred: UnaryPredicator[ValueType[Range]]): OutputIterator = js.native
  def copy_n[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, n: Double, output: OutputIterator): OutputIterator = js.native
  def fill[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, value: ValueType[Range]): Unit = js.native
  def fill_n[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, n: Double, value: ValueType[Range]): IteratorType[Range] = js.native
  def generate[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, gen: js.Function0[ValueType[Range]]): Unit = js.native
  def generate_n[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, n: Double, gen: js.Function0[ValueType[Range]]): IteratorType[Range] = js.native
  def remove[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  def remove_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, `val`: ValueType[Range]): OutputIterator = js.native
  def remove_copy_if[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, pred: UnaryPredicator[ValueType[Range]]): OutputIterator = js.native
  def remove_if[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  def replace[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, old_val: ValueType[Range], new_val: ValueType[Range]): Unit = js.native
  def replace_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, old_val: ValueType[Range], new_val: ValueType[Range]): OutputIterator = js.native
  def replace_copy_if[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](
    range: Range,
    output: OutputIterator,
    pred: UnaryPredicator[ValueType[Range]],
    new_val: ValueType[Range]
  ): OutputIterator = js.native
  def replace_if[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]], new_val: ValueType[Range]): Unit = js.native
  def reverse[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range): Unit = js.native
  def reverse_copy[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  def rotate[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, middle: IteratorType[Range]): IteratorType[Range] = js.native
  def rotate_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, middle: IteratorType[Range], output: OutputIterator): OutputIterator = js.native
  def shift_left[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, n: Double): Unit = js.native
  def shift_right[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, n: Double): Unit = js.native
  def shuffle[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  def swap_ranges[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): IteratorType[js.Array[ValueType[Range1]]] = js.native
  def swap_ranges[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): IteratorType[IForwardContainer[IForwardIterator[ValueType[Range1], _]]] = js.native
  def transform[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[
      typings.tstl.functionalIPointerMod.IPointer.ValueType[OutputIterator], 
      OutputIterator
    ]
  ] */](range: Range, result: OutputIterator, op: UnaryOperatorInferrer[Range, OutputIterator]): OutputIterator = js.native
  def transform[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[
      typings.tstl.functionalIPointerMod.IPointer.ValueType[OutputIterator], 
      OutputIterator
    ]
  ] */](
    range: Range1,
    first: Range2,
    result: OutputIterator,
    op: BinaryOperatorInferrer[Range1, Range2, OutputIterator]
  ): OutputIterator = js.native
  def unique[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  def unique[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: BinaryPredicator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  def unique_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  def unique_copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, pred: BinaryPredicator[ValueType[Range], ValueType[Range]]): OutputIterator = js.native
  type BinaryOperatorInferrer[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[
      typings.tstl.functionalIPointerMod.IPointer.ValueType[OutputIterator], 
      OutputIterator
    ]
  ] */] = js.Function2[
    /* x */ ValueType[Range1], 
    /* y */ ValueType[Range2], 
    typings.tstl.functionalIPointerMod.IPointer.ValueType[OutputIterator]
  ]
  type UnaryOperatorInferrer[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[
      typings.tstl.functionalIPointerMod.IPointer.ValueType[OutputIterator], 
      OutputIterator
    ]
  ] */] = js.Function1[
    /* val */ ValueType[Range], 
    typings.tstl.functionalIPointerMod.IPointer.ValueType[OutputIterator]
  ]
}

