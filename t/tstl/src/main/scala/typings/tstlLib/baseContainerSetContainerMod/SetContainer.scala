package typings
package tstlLib.baseContainerSetContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerUnderscoreIAssociativeContainerMod._IAssociativeContainer because var conflicts: iterator. Inlined find, has, count, erase, erase, erase */ @JSImport("tstl/base/container/SetContainer", "SetContainer")
@js.native
/**
  * Default Constructor.
  */
abstract class SetContainer[Key, Unique /* <: scala.Boolean */, Source /* <: SetContainer[Key, Unique, Source] */] protected ()
  extends tstlLib.baseContainerContainerMod.Container[
      Key, 
      Source, 
      tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source], 
      tstlLib.baseIteratorSetIteratorMod.SetReverseIterator[Key, Unique, Source], 
      Key
    ] {
  /**
    * @hidden
    */
  var data_ : tstlLib.baseContainerUnderscoreSetElementListMod._SetElementList[Key, Unique, Source] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_range(first: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source]): tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source] = js.native
  /* protected */ def _Erase_by_range(
    first: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source],
    last: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source]
  ): tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_val(key: Key): scala.Double = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_erase(
    first: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source],
    last: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source]
  ): scala.Unit = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_insert(
    first: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source],
    last: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source]
  ): scala.Unit = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_hint(hint: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source], key: Key): tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_key(key: Key): tstlLib.baseContainerSetContainerMod.SetContainerNs.InsertRet[Key, Unique, Source] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_range[InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, InputIterator]] */](begin: InputIterator, end: InputIterator): scala.Unit = js.native
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
  def find(key: Key): tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source] = js.native
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
  def insert(hint: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source], key: Key): tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source] = js.native
  def insert(key: Key): tstlLib.baseContainerSetContainerMod.SetContainerNs.InsertRet[Key, Unique, Source] = js.native
  def insert[InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, InputIterator]] */](first: InputIterator, last: InputIterator): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def merge(source: Source): scala.Unit = js.native
}

