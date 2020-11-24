package typings.tstl

import typings.tstl.binaryPredicatorMod.BinaryPredicator
import typings.tstl.comparatorMod.Comparator
import typings.tstl.iforwardcontainerMod.IForwardContainer
import typings.tstl.iforwardcontainerMod.IForwardContainer.IteratorType
import typings.tstl.iforwardcontainerMod.IForwardContainer.ValueType
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.pairMod.Pair
import typings.tstl.unaryPredicatorMod.UnaryPredicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/ranges/algorithm/iterations", JSImport.Namespace)
@js.native
object algorithmIterationsMod extends js.Object {
  
  @JSName("adjacent_find")
  def adjacentFind[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  @JSName("adjacent_find")
  def adjacentFind[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("all_of")
  def allOf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  
  @JSName("any_of")
  def anyOf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  
  def count[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): Double = js.native
  
  @JSName("count_if")
  def countIf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Double = js.native
  
  def equal[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Boolean = js.native
  def equal[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Boolean = js.native
  def equal[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): Boolean = js.native
  
  def find[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  
  @JSName("find_end")
  def findEnd[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): IteratorType[Range1] = js.native
  @JSName("find_end")
  def findEnd[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): IteratorType[Range1] = js.native
  @JSName("find_end")
  def findEnd[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): IteratorType[Range1] = js.native
  
  @JSName("find_first_of")
  def findFirstOf[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): IteratorType[Range1] = js.native
  @JSName("find_first_of")
  def findFirstOf[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): IteratorType[Range1] = js.native
  @JSName("find_first_of")
  def findFirstOf[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): IteratorType[Range1] = js.native
  
  @JSName("find_if")
  def findIf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("find_if_not")
  def findIfNot[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("for_each")
  def forEach[Range /* <: js.Array[_] | IForwardContainer[_] */, Func /* <: js.Function1[/* val */ ValueType[Range], _] */](range: Range, fn: Func): Func = js.native
  
  @JSName("for_each_n")
  def forEachN[Range /* <: js.Array[_] | IForwardContainer[_] */, Func /* <: js.Function1[/* val */ ValueType[Range], _] */](range: Range, n: Double, fn: Func): IteratorType[Range] = js.native
  
  @JSName("lexicographical_compare")
  def lexicographicalCompare[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Boolean = js.native
  @JSName("lexicographical_compare")
  def lexicographicalCompare[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    comp: BinaryPredicatorInferrer[Range1, Range1]
  ): Boolean = js.native
  @JSName("lexicographical_compare")
  def lexicographicalCompare[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Boolean = js.native
  @JSName("lexicographical_compare")
  def lexicographicalCompare[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    comp: BinaryPredicatorInferrer[Range1, Range1]
  ): Boolean = js.native
  
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Pair[IteratorType[Range1], IteratorType[js.Array[ValueType[Range1]]]] = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Pair[
    IteratorType[Range1], 
    IteratorType[IForwardContainer[IForwardIterator[ValueType[Range1], _]]]
  ] = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] */](range1: Range1, range2: Range2): Pair[IteratorType[Range1], IteratorType[Range2]] = js.native
  def mismatch[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): Pair[IteratorType[Range1], IteratorType[Range2]] = js.native
  
  @JSName("none_of")
  def noneOf[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  
  def search[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): IteratorType[Range1] = js.native
  def search[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): IteratorType[Range1] = js.native
  def search[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] */](range1: Range1, range2: Range2): IteratorType[Range1] = js.native
  def search[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: Range2, pred: BinaryPredicatorInferrer[Range1, Range2]): IteratorType[Range1] = js.native
  
  @JSName("search_n")
  def searchN[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, count: Double, `val`: ValueType[Range]): IteratorType[Range] = js.native
  @JSName("search_n")
  def searchN[Range /* <: js.Array[_] | IForwardContainer[_] */](
    range: Range,
    count: Double,
    `val`: ValueType[Range],
    pred: Comparator[ValueType[Range], ValueType[Range]]
  ): IteratorType[Range] = js.native
  
  type BinaryPredicatorInferrer[Range1 /* <: js.Array[_] | IForwardContainer[_] */, Range2 /* <: js.Array[_] | IForwardContainer[_] */] = BinaryPredicator[ValueType[Range1], ValueType[Range2]]
}
