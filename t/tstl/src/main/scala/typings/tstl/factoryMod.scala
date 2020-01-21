package typings.tstl

import typings.tstl.backInsertIteratorMod.BackInsertIterator
import typings.tstl.backInsertIteratorMod.BackInsertIterator.SourceType
import typings.tstl.frontInsertIteratorMod.FrontInsertIterator
import typings.tstl.frontInsertIteratorMod.FrontInsertIterator.ValueType
import typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.ReverseIteratorType
import typings.tstl.iforwardcontainerMod.IForwardContainer
import typings.tstl.iforwardcontainerMod.IForwardContainer.IteratorType
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.iinsertMod.IInsert
import typings.tstl.insertIteratorMod.InsertIterator
import typings.tstl.ipushbackMod.IPushBack
import typings.tstl.ipushfrontMod.IPushFront
import typings.tstl.ireversableiteratorMod.IReversableIterator
import typings.tstl.ireverseiteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  @JSName("back_inserter")
  def backInserter[Source /* <: js.Array[_] | IPushBack[_] */](source: Source): BackInsertIterator[SourceType[Source]] = js.native
  def begin[Container /* <: js.Array[_] | IForwardContainer[_] */](container: Container): IteratorType[Container] = js.native
  def end[Container /* <: js.Array[_] | IForwardContainer[_] */](container: Container): IteratorType[Container] = js.native
  @JSName("front_inserter")
  def frontInserter[Source /* <: IPushFront[ValueType[Source]] */](source: Source): FrontInsertIterator[Source] = js.native
  def inserter[Container /* <: IInsert[Iterator] */, Iterator /* <: IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[Iterator], Iterator] */](container: Container, it: Iterator): InsertIterator[Container, Iterator] = js.native
  @JSName("make_reverse_iterator")
  def makeReverseIterator[IteratorT /* <: IReversableIterator[typings.tstl.ipointerMod.IPointer.ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[typings.tstl.ipointerMod.IPointer.ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def rbegin[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](container: Container): ReverseIteratorType[Container] = js.native
  def rend[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](container: Container): ReverseIteratorType[Container] = js.native
}

