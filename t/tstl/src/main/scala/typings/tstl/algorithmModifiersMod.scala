package typings.tstl

import typings.tstl.binaryPredicatorMod.BinaryPredicator
import typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typings.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typings.tstl.iforwardcontainerMod.IForwardContainer
import typings.tstl.iforwardcontainerMod.IForwardContainer.IteratorType
import typings.tstl.iforwardcontainerMod.IForwardContainer.ValueType
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.irandomaccesscontainerMod.IRandomAccessContainer
import typings.tstl.unaryPredicatorMod.UnaryPredicator
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/modifiers", JSImport.Namespace)
@js.native
object algorithmModifiersMod extends js.Object {
  def copy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  @JSName("copy_backward")
  def copyBackward[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */, OutputIterator /* <: Writeonly[
    IBidirectionalIterator[
      typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.ValueType[Range], 
      OutputIterator
    ]
  ] */](range: Range, output: OutputIterator): OutputIterator = js.native
  @JSName("copy_if")
  def copyIf[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, pred: UnaryPredicator[ValueType[Range]]): OutputIterator = js.native
  @JSName("copy_n")
  def copyN[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, n: Double, output: OutputIterator): OutputIterator = js.native
  def fill[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, value: ValueType[Range]): Unit = js.native
  @JSName("fill_n")
  def fillN[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, n: Double, value: ValueType[Range]): IteratorType[Range] = js.native
  def generate[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, gen: js.Function0[ValueType[Range]]): Unit = js.native
  @JSName("generate_n")
  def generateN[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, n: Double, gen: js.Function0[ValueType[Range]]): IteratorType[Range] = js.native
  def remove[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  @JSName("remove_copy")
  def removeCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, `val`: ValueType[Range]): OutputIterator = js.native
  @JSName("remove_copy_if")
  def removeCopyIf[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, pred: UnaryPredicator[ValueType[Range]]): OutputIterator = js.native
  @JSName("remove_if")
  def removeIf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  def replace[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, old_val: ValueType[Range], new_val: ValueType[Range]): Unit = js.native
  @JSName("replace_copy")
  def replaceCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, old_val: ValueType[Range], new_val: ValueType[Range]): OutputIterator = js.native
  @JSName("replace_copy_if")
  def replaceCopyIf[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](
    range: Range,
    output: OutputIterator,
    pred: UnaryPredicator[ValueType[Range]],
    new_val: ValueType[Range]
  ): OutputIterator = js.native
  @JSName("replace_if")
  def replaceIf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]], new_val: ValueType[Range]): Unit = js.native
  def reverse[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range): Unit = js.native
  @JSName("reverse_copy")
  def reverseCopy[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  def rotate[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, middle: IteratorType[Range]): IteratorType[Range] = js.native
  @JSName("rotate_copy")
  def rotateCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, middle: IteratorType[Range], output: OutputIterator): OutputIterator = js.native
  @JSName("shift_left")
  def shiftLeft[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, n: Double): Unit = js.native
  @JSName("shift_right")
  def shiftRight[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, n: Double): Unit = js.native
  def shuffle[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  @JSName("swap_ranges")
  def swapRanges[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): IteratorType[js.Array[ValueType[Range1]]] = js.native
  @JSName("swap_ranges")
  def swapRanges[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): IteratorType[IForwardContainer[IForwardIterator[ValueType[Range1], _]]] = js.native
  def transform[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], OutputIterator]
  ] */](range: Range, result: OutputIterator, op: UnaryOperatorInferrer[Range, OutputIterator]): OutputIterator = js.native
  def transform[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], OutputIterator]
  ] */](
    range: Range1,
    first: Range2,
    result: OutputIterator,
    op: BinaryOperatorInferrer[Range1, Range2, OutputIterator]
  ): OutputIterator = js.native
  def unique[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  def unique[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: BinaryPredicator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  @JSName("unique_copy")
  def uniqueCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator): OutputIterator = js.native
  @JSName("unique_copy")
  def uniqueCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator]] */](range: Range, output: OutputIterator, pred: BinaryPredicator[ValueType[Range], ValueType[Range]]): OutputIterator = js.native
  type BinaryOperatorInferrer[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], OutputIterator]
  ] */] = js.Function2[
    /* x */ ValueType[Range1], 
    /* y */ ValueType[Range2], 
    typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator]
  ]
  type UnaryOperatorInferrer[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[
    IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator], OutputIterator]
  ] */] = js.Function1[
    /* val */ ValueType[Range], 
    typings.tstl.ipointerMod.IPointer.ValueType[OutputIterator]
  ]
}

