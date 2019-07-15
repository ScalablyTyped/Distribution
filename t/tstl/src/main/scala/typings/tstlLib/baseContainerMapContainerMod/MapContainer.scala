package typings
package tstlLib.baseContainerMapContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerUnderscoreIAssociativeContainerMod._IAssociativeContainer because var conflicts: iterator. Inlined find, has, count */ @JSImport("tstl/base/container/MapContainer", "MapContainer")
@js.native
abstract class MapContainer[Key, T, Unique /* <: scala.Boolean */, Source /* <: MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: tstlLib.baseIteratorIMapIteratorMod.IMapIterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.baseIteratorIMapIteratorMod.IMapReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] protected ()
  extends tstlLib.baseContainerContainerMod.Container[
      tstlLib.utilityEntryMod.Entry[Key, T], 
      Source, 
      IteratorT, 
      ReverseT, 
      tstlLib.utilityIPairMod.IPair[Key, T]
    ] {
  /**
    * Default Constructor.
    */
  protected def this(factory: js.Function1[
      /* thisArg */ Source, 
      tstlLib.baseContainerILinearContainerMod.ILinearContainer[
        tstlLib.utilityEntryMod.Entry[Key, T], 
        Source, 
        IteratorT, 
        ReverseT, 
        tstlLib.utilityEntryMod.Entry[Key, T]
      ]
    ]) = this()
  /**
    * @hidden
    */
  var data_ : tstlLib.baseContainerILinearContainerMod.ILinearContainer[
    tstlLib.utilityEntryMod.Entry[Key, T], 
    Source, 
    IteratorT, 
    ReverseT, 
    tstlLib.utilityEntryMod.Entry[Key, T]
  ] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_key(key: Key): scala.Double = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_range(first: IteratorT): IteratorT = js.native
  /* protected */ def _Erase_by_range(first: IteratorT, last: IteratorT): IteratorT = js.native
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
  /* protected */ def _Insert_by_range[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): scala.Unit = js.native
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
  def emplace(key: Key, `val`: T): tstlLib.baseContainerMapContainerMod.MapContainerNs.InsertRet[Key, T, Unique, Source, IteratorT, ReverseT] = js.native
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
  def has(key: Key): scala.Boolean = js.native
  def insert(hint: IteratorT, pair: tstlLib.utilityIPairMod.IPair[Key, T]): IteratorT = js.native
  def insert(pair: tstlLib.utilityIPairMod.IPair[Key, T]): tstlLib.baseContainerMapContainerMod.MapContainerNs.InsertRet[Key, T, Unique, Source, IteratorT, ReverseT] = js.native
  def insert[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): scala.Unit = js.native
  /**
    * Merge two containers.
    *
    * @param source Source container to transfer.
    */
  def merge(source: Source): scala.Unit = js.native
}

