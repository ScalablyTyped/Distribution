package typings.tstl.baseContainerMapContainerMod

import typings.tstl.baseContainerContainerMod.Container
import typings.tstl.baseContainerILinearContainerMod.ILinearContainer
import typings.tstl.baseContainerMapContainerMod.MapContainerNs.InsertRet
import typings.tstl.baseIteratorIMapIteratorMod.IMapIterator
import typings.tstl.baseIteratorIMapIteratorMod.IMapReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.utilityEntryMod.Entry
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tstl.baseContainerUnderscoreIAssociativeContainerMod._IAssociativeContainer because var conflicts: iterator. Inlined find, has, count */ @JSImport("tstl/base/container/MapContainer", "MapContainer")
@js.native
abstract class MapContainer[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: IMapIterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: IMapReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] protected () extends Container[Entry[Key, T], Source, IteratorT, ReverseT, IPair[Key, T]] {
  /**
    * Default Constructor.
    */
  protected def this(factory: js.Function1[
        /* thisArg */ Source, 
        ILinearContainer[Entry[Key, T], Source, IteratorT, ReverseT, Entry[Key, T]]
      ]) = this()
  /**
    * @hidden
    */
  var data_ : ILinearContainer[Entry[Key, T], Source, IteratorT, ReverseT, Entry[Key, T]] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_key(key: Key): Double = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_range(first: IteratorT): IteratorT = js.native
  /* protected */ def _Erase_by_range(first: IteratorT, last: IteratorT): IteratorT = js.native
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
  /* protected */ def _Insert_by_range[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
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
  def emplace(key: Key, `val`: T): InsertRet[Key, T, Unique, Source, IteratorT, ReverseT] = js.native
  def emplace_hint(hint: IteratorT, key: Key, `val`: T): IteratorT = js.native
  /**
    * @inheritDoc
    */
  @JSName("erase")
  def erase_IteratorT(it: IteratorT): IteratorT = js.native
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
  def insert(hint: IteratorT, pair: IPair[Key, T]): IteratorT = js.native
  def insert(pair: IPair[Key, T]): InsertRet[Key, T, Unique, Source, IteratorT, ReverseT] = js.native
  def insert[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
  /**
    * Merge two containers.
    *
    * @param source Source container to transfer.
    */
  def merge(source: Source): Unit = js.native
}

