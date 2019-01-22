package typings
package tstlLib.baseContainerSetContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/SetContainer", "SetContainer")
@js.native
/**
  * Default Constructor.
  */
abstract class SetContainer[Key, Unique /* <: scala.Boolean */, Source /* <: SetContainer[Key, Unique, Source] */] protected ()
  extends tstlLib.baseContainerContainerMod.Container[
      Key, 
      Source, 
      tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source], 
      tstlLib.baseIteratorSetIteratorMod.SetReverseIterator[Key, Unique, Source]
    ]
     with tstlLib.baseContainerUnderscoreIAssociativeContainerMod._IAssociativeContainer[Key, tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source]] {
  /**
    * @hidden
    */
  var `data_`: js.Any = js.native
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
  /* protected */ def _Insert_by_range[U /* <: Key */, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[U, InputIterator]] */](begin: InputIterator, end: InputIterator): scala.Unit = js.native
  /**
    * Count elements with a specified key.
    *
    * @param key Key to search for.
    * @return Number of elements with the specified key.
    */
  /* CompleteClass */
  override def count(key: Key): scala.Double = js.native
  /**
    * Erase elements with a specified key.
    *
    * @param key Key to search for.
    * @return Number of erased elements.
    */
  /* CompleteClass */
  override def erase(key: Key): scala.Double = js.native
  /**
    * Get iterator to element.
    *
    * @param key Key to search for.
    * @return An iterator to the element, if the specified key is found, otherwise `this.end()`.
    */
  /* CompleteClass */
  override def find(key: Key): tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source] = js.native
  /**
    * Test whether a key exists.
    *
    * @param key Key to search for.
    * @return Whether the specified key exists.
    */
  /* CompleteClass */
  override def has(key: Key): scala.Boolean = js.native
  def insert(key: Key): tstlLib.baseContainerSetContainerMod.SetContainerNs.InsertRet[Key, Unique, Source] = js.native
  def insert[U /* <: Key */, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[U, InputIterator]] */](first: InputIterator, last: InputIterator): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def merge(source: Source): scala.Unit = js.native
}

