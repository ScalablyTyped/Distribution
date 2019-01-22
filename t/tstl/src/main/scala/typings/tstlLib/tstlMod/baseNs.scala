package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "base")
@js.native
object baseNs extends js.Object {
  @js.native
  abstract class ArrayContainer[T, SourceT /* <: tstlLib.baseContainerArrayContainerMod.ArrayContainer[T, SourceT] */] ()
    extends tstlLib.baseMod.ArrayContainer[T, SourceT]
  
  @js.native
  class ArrayIterator[T, Source /* <: tstlLib.baseContainerArrayContainerMod.ArrayContainer[T, Source] */] protected ()
    extends tstlLib.baseMod.ArrayIterator[T, Source] {
    /**
      * Initializer Constructor.
      *
      * @param source Source container.
      * @param index Index number.
      */
    def this(source: Source, index: scala.Double) = this()
  }
  
  @js.native
  class ArrayReverseIterator[T, Source /* <: tstlLib.baseContainerArrayContainerMod.ArrayContainer[T, Source] */] protected ()
    extends tstlLib.baseMod.ArrayReverseIterator[T, Source] {
    /**
      * Initializer Constructor.
      *
      * @param base The base iterator.
      */
    def this(base: tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, Source]) = this()
  }
  
  @js.native
  abstract class Container[T, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT] */] ()
    extends tstlLib.baseMod.Container[T, SourceT, IteratorT, ReverseIteratorT]
  
  @js.native
  class ForOfAdaptor[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */] protected ()
    extends tstlLib.baseMod.ForOfAdaptor[T, InputIterator] {
    /**
      * Initializer Constructor.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    def this(first: InputIterator, last: InputIterator) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ListContainer[T, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT] */, IteratorT /* <: tstlLib.baseIteratorListIteratorMod.ListIterator[T, SourceT, IteratorT, ReverseIteratorT] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT] */] protected ()
    extends tstlLib.baseMod.ListContainer[T, SourceT, IteratorT, ReverseIteratorT]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class MapContainer[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source] */] protected ()
    extends tstlLib.baseMod.MapContainer[Key, T, Unique, Source]
  
  @js.native
  class MapIterator[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source] */] protected ()
    extends tstlLib.baseMod.MapIterator[Key, T, Unique, Source] {
    /**
      * @hidden
      */
    def this(list: tstlLib.baseContainerUnderscoreMapElementListMod._MapElementList[Key, T, Unique, Source], prev: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source], next: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source], `val`: tstlLib.utilityEntryMod.Entry[Key, T]) = this()
  }
  
  @js.native
  class MapReverseIterator[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source] */] protected ()
    extends tstlLib.baseMod.MapReverseIterator[Key, T, Unique, Source] {
    /**
      * Initializer Constructor.
      *
      * @param base The base iterator.
      */
    def this(base: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source]) = this()
  }
  
  @js.native
  abstract class MultiMap[Key, T, Source /* <: tstlLib.baseContainerMultiMapMod.MultiMap[Key, T, Source] */] ()
    extends tstlLib.baseMod.MultiMap[Key, T, Source]
  
  @js.native
  abstract class MultiSet[Key, Source /* <: tstlLib.baseContainerMultiSetMod.MultiSet[Key, Source] */] ()
    extends tstlLib.baseMod.MultiSet[Key, Source]
  
  @js.native
  abstract class ReverseIterator[T, Source /* <: tstlLib.baseContainerIContainerMod.IContainer[T, Source, Base, This] */, Base /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, Source, Base, This] */, This /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, Source, Base, This] */] protected ()
    extends tstlLib.baseMod.ReverseIterator[T, Source, Base, This] {
    /**
      * Initializer Constructor.
      *
      * @param base The base iterator.
      */
    protected def this(base: Base) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SetContainer[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source] */] protected ()
    extends tstlLib.baseMod.SetContainer[Key, Unique, Source]
  
  @js.native
  class SetIterator[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source] */] protected ()
    extends tstlLib.baseMod.SetIterator[Key, Unique, Source] {
    /**
      * @hidden
      */
    def this(list: tstlLib.baseContainerUnderscoreSetElementListMod._SetElementList[Key, Unique, Source], prev: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source], next: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source], key: Key) = this()
  }
  
  @js.native
  class SetReverseIterator[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source] */] protected ()
    extends tstlLib.baseMod.SetReverseIterator[Key, Unique, Source] {
    /**
      * Initializer Constructor.
      *
      * @param base The base iterator.
      */
    def this(base: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source]) = this()
  }
  
  @js.native
  abstract class UniqueMap[Key, T, Source /* <: tstlLib.baseContainerUniqueMapMod.UniqueMap[Key, T, Source] */] ()
    extends tstlLib.baseMod.UniqueMap[Key, T, Source]
  
  @js.native
  abstract class UniqueSet[Key, Source /* <: tstlLib.baseContainerUniqueSetMod.UniqueSet[Key, Source] */] ()
    extends tstlLib.baseMod.UniqueSet[Key, Source]
  
}

