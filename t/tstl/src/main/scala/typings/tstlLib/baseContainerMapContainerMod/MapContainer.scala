package typings
package tstlLib.baseContainerMapContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerUnderscoreIAssociativeContainerMod._IAssociativeContainer because var conflicts: iterator. Inlined find, has, count, erase, erase, erase */ @JSImport("tstl/base/container/MapContainer", "MapContainer")
@js.native
/**
  * Default Constructor.
  */
abstract class MapContainer[Key, T, Unique /* <: scala.Boolean */, Source /* <: MapContainer[Key, T, Unique, Source] */] protected ()
  extends tstlLib.baseContainerContainerMod.Container[
      tstlLib.utilityEntryMod.Entry[Key, T], 
      Source, 
      tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source], 
      tstlLib.baseIteratorMapIteratorMod.MapReverseIterator[Key, T, Unique, Source], 
      tstlLib.utilityIPairMod.IPair[Key, T]
    ] {
  /**
    * @hidden
    */
  var data_ : tstlLib.baseContainerUnderscoreMapElementListMod._MapElementList[Key, T, Unique, Source] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_key(key: Key): scala.Double = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_range(first: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source]): tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source] = js.native
  /* protected */ def _Erase_by_range(
    first: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source],
    last: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source]
  ): tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_erase(
    first: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source],
    last: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source]
  ): scala.Unit = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_insert(
    first: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source],
    last: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source]
  ): scala.Unit = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_range[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], InputIterator]
  ] */](first: InputIterator, last: InputIterator): scala.Unit = js.native
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
  def emplace(key: Key, `val`: T): tstlLib.baseContainerMapContainerMod.MapContainerNs.InsertRet[Key, T, Unique, Source] = js.native
  def emplace_hint(hint: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source], key: Key, `val`: T): tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source] = js.native
  /**
    * @inheritDoc
    */
  /**
    * Erase elements with a specified key.
    *
    * @param key Key to search for.
    * @return Number of erased elements.
    */
  def erase(key: Key): scala.Double = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get iterator to element.
    *
    * @param key Key to search for.
    * @return An iterator to the element, if the specified key is found, otherwise `this.end()`.
    */
  def find(key: Key): tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source] = js.native
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
  def insert(
    hint: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source],
    pair: tstlLib.utilityIPairMod.IPair[Key, T]
  ): tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source] = js.native
  def insert(pair: tstlLib.utilityIPairMod.IPair[Key, T]): tstlLib.baseContainerMapContainerMod.MapContainerNs.InsertRet[Key, T, Unique, Source] = js.native
  def insert[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], InputIterator]
  ] */](first: InputIterator, last: InputIterator): scala.Unit = js.native
  /**
    * Merge two containers.
    *
    * @param source Source container to transfer.
    */
  def merge(source: Source): scala.Unit = js.native
}

