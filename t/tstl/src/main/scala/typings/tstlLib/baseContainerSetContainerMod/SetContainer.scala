package typings
package tstlLib.baseContainerSetContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerUnderscoreIAssociativeContainerMod._IAssociativeContainer because var conflicts: iterator. Inlined find, has, count */ @JSImport("tstl/base/container/SetContainer", "SetContainer")
@js.native
abstract class SetContainer[Key, Unique /* <: scala.Boolean */, Source /* <: SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: tstlLib.baseIteratorISetIteratorMod.ISetIterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.baseIteratorISetIteratorMod.ISetReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] protected ()
  extends tstlLib.baseContainerContainerMod.Container[Key, Source, IteratorT, ReverseT, Key] {
  /**
    * Default Constructor.
    */
  protected def this(factory: js.Function1[
      /* thisArg */ Source, 
      tstlLib.baseContainerILinearContainerMod.ILinearContainer[Key, Source, IteratorT, ReverseT, Key]
    ]) = this()
  /**
    * @hidden
    */
  var data_ : tstlLib.baseContainerILinearContainerMod.ILinearContainer[Key, Source, IteratorT, ReverseT, Key] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_range(first: IteratorT): IteratorT = js.native
  /* protected */ def _Erase_by_range(first: IteratorT, last: IteratorT): IteratorT = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_val(key: Key): scala.Double = js.native
  /**
    * @hidden
    */
  /* protected */ def _Get_iterator_type(): js.Any = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_erase(first: IteratorT, last: IteratorT): scala.Unit = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_insert(first: IteratorT, last: IteratorT): scala.Unit = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_hint(hint: IteratorT, key: Key): IteratorT = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_key(key: Key): tstlLib.baseContainerSetContainerMod.SetContainerNs.InsertRet[Key, Unique, Source, IteratorT, ReverseT] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_range[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, InputIterator] */](begin: InputIterator, end: InputIterator): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  /**
    * Count elements with a specified key.
    *
    * @param key Key to search for.
    * @return Number of elements with the specified key.
    */
  def count(key: Key): scala.Double = js.native
  /**
    * @inheritDoc
    */
  @JSName("erase")
  def erase_IteratorT(pos: IteratorT): IteratorT = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get iterator to element.
    *
    * @param key Key to search for.
    * @return An iterator to the element, if the specified key is found, otherwise `this.end()`.
    */
  def find(key: Key): IteratorT = js.native
  /**
    * @inheritDoc
    */
  /**
    * Test whether a key exists.
    *
    * @param key Key to search for.
    * @return Whether the specified key exists.
    */
  def has(key: Key): scala.Boolean = js.native
  def insert(hint: IteratorT, key: Key): IteratorT = js.native
  def insert(key: Key): tstlLib.baseContainerSetContainerMod.SetContainerNs.InsertRet[Key, Unique, Source, IteratorT, ReverseT] = js.native
  @JSName("insert")
  def insert_InputIteratorIForwardIteratorUnit[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, InputIterator] */](first: InputIterator, last: InputIterator): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def merge(source: Source): scala.Unit = js.native
}

