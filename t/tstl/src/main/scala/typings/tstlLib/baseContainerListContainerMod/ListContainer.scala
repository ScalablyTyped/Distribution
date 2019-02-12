package typings
package tstlLib.baseContainerListContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/ListContainer", "ListContainer")
@js.native
/**
  * Default Constructor.
  */
abstract class ListContainer[T, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT, T] */, IteratorT /* <: tstlLib.baseIteratorListIteratorMod.ListIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */] protected ()
  extends tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseIteratorT, T] {
  /**
    * @hidden
    */
  var _Insert_by_repeating_val: js.Any = js.native
  /**
    * @hidden
    */
  var `begin_`: IteratorT = js.native
  /**
    * @hidden
    */
  var `end_`: IteratorT = js.native
  /**
    * @hidden
    */
  var `size_`: js.Any = js.native
  /**
    * @hidden
    */
  /* protected */ def _Create_iterator(prev: IteratorT, next: IteratorT): IteratorT = js.native
  /* protected */ def _Create_iterator(prev: IteratorT, next: IteratorT, `val`: T): IteratorT = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_range(first: IteratorT, last: IteratorT): IteratorT = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_range[InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](position: IteratorT, begin: InputIterator, end: InputIterator): IteratorT = js.native
  /**
    * @inheritDoc
    */
  def assign(n: scala.Double, `val`: T): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def insert(position: IteratorT, size: scala.Double, `val`: T): IteratorT = js.native
  /**
    * @inheritDoc
    */
  def insert(position: IteratorT, `val`: T): IteratorT = js.native
  /**
    * @inheritDoc
    */
  def insert[InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](position: IteratorT, begin: InputIterator, end: InputIterator): IteratorT = js.native
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

