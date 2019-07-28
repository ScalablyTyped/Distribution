package typings.tstl.baseContainerSetContainerMod

import typings.tstl.baseContainerContainerMod.Container
import typings.tstl.baseContainerILinearContainerMod.ILinearContainer
import typings.tstl.baseContainerSetContainerMod.SetContainerNs.InsertRet
import typings.tstl.baseIteratorISetIteratorMod.ISetIterator
import typings.tstl.baseIteratorISetIteratorMod.ISetReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tstl.baseContainerUnderscoreIAssociativeContainerMod._IAssociativeContainer because var conflicts: iterator. Inlined find, has, count */ @JSImport("tstl/base/container/SetContainer", "SetContainer")
@js.native
abstract class SetContainer[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: ISetIterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ISetReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] protected () extends Container[Key, Source, IteratorT, ReverseT, Key] {
  /**
    * Default Constructor.
    */
  protected def this(factory: js.Function1[/* thisArg */ Source, ILinearContainer[Key, Source, IteratorT, ReverseT, Key]]) = this()
  /**
    * @hidden
    */
  var data_ : ILinearContainer[Key, Source, IteratorT, ReverseT, Key] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_range(first: IteratorT): IteratorT = js.native
  /* protected */ def _Erase_by_range(first: IteratorT, last: IteratorT): IteratorT = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_val(key: Key): Double = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_erase(first: IteratorT, last: IteratorT): Unit = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_insert(first: IteratorT, last: IteratorT): Unit = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_hint(hint: IteratorT, key: Key): IteratorT = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_key(key: Key): InsertRet[Key, Unique, Source, IteratorT, ReverseT] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_range[InputIterator /* <: IForwardIterator[Key, InputIterator] */](begin: InputIterator, end: InputIterator): Unit = js.native
  /**
    * @inheritDoc
    */
  /**
    * Count elements with a specified key.
    *
    * @param key Key to search for.
    * @return Number of elements with the specified key.
    */
  def count(key: Key): Double = js.native
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
  def has(key: Key): Boolean = js.native
  def insert(hint: IteratorT, key: Key): IteratorT = js.native
  def insert(key: Key): InsertRet[Key, Unique, Source, IteratorT, ReverseT] = js.native
  @JSName("insert")
  def insert_InputIterator_IForwardIteratorKeyInputIterator_Unit[InputIterator /* <: IForwardIterator[Key, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
  /**
    * @inheritDoc
    */
  def merge(source: Source): Unit = js.native
}

