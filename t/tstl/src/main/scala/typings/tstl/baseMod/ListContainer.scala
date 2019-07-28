package typings.tstl.baseMod

import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.baseIteratorListIteratorMod.ListIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base", "ListContainer")
@js.native
/**
  * Default Constructor.
  */
abstract class ListContainer[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseIteratorT, T] */, IteratorT /* <: ListIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */, ReverseIteratorT /* <: typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */] protected ()
  extends typings.tstl.baseContainerListContainerMod.ListContainer[T, SourceT, IteratorT, ReverseIteratorT]

