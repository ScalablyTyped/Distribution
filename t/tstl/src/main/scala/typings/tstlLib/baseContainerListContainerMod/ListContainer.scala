package typings
package tstlLib.baseContainerListContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerIDequeContainerMod.IDequeContainer because var conflicts: iterator. Inlined  */ @JSImport("tstl/base/container/ListContainer", "ListContainer")
@js.native
/**
  * Default Constructor.
  */
abstract class ListContainer[T, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT] */, IteratorT /* <: tstlLib.baseIteratorListIteratorMod.ListIterator[T, SourceT, IteratorT, ReverseIteratorT] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT] */] protected ()
  extends tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseIteratorT] {
  /**
    * @hidden
    */
  var _Insert_by_repeating_val: js.Any = js.native
  /**
    * @hidden
    */
  var `begin_`: js.Any = js.native
  /**
    * @hidden
    */
  var `end_`: js.Any = js.native
  /**
    * @hidden
    */
  var `size_`: js.Any = js.native
  /**
    * @hidden
    */
  /* protected */ def _Create_iterator(prev: IteratorT, next: IteratorT, `val`: T): IteratorT = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_range(first: IteratorT, last: IteratorT): IteratorT = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_range[U /* <: T */, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[U, InputIterator]] */](position: IteratorT, begin: InputIterator, end: InputIterator): IteratorT = js.native
  /**
    * @inheritDoc
    */
  def assign(n: scala.Double, `val`: T): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def back(): T = js.native
  /**
    * @inheritDoc
    */
  def back(`val`: T): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def front(): T = js.native
  /**
    * @inheritDoc
    */
  def front(`val`: T): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def insert(position: IteratorT, size: scala.Double, `val`: T): IteratorT = js.native
  /**
    * @inheritDoc
    */
  def insert[U /* <: T */, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[U, InputIterator]] */](position: IteratorT, begin: InputIterator, end: InputIterator): IteratorT = js.native
  /**
    * @inheritDoc
    */
  def pop_back(): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def pop_front(): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def push_back(`val`: T): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def push_front(`val`: T): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def resize(n: scala.Double): scala.Unit = js.native
}

