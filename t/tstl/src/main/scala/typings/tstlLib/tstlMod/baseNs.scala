package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "base")
@js.native
object baseNs extends js.Object {
  @js.native
  abstract class ArrayContainer[T /* <: ElemT */, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: tstlLib.baseContainerArrayContainerMod.ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: tstlLib.baseIteratorArrayIteratorBaseMod.ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: tstlLib.baseIteratorArrayIteratorBaseMod.ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] ()
    extends tstlLib.baseMod.ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT]
  
  @js.native
  class ArrayIterator[T, SourceT /* <: tstlLib.baseContainerArrayContainerMod.ArrayContainer[
    T, 
    SourceT, 
    SourceT, 
    tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[T, SourceT], 
    T
  ] */] ()
    extends tstlLib.baseMod.ArrayIterator[T, SourceT]
  
  @js.native
  class ArrayReverseIterator[T, SourceT /* <: tstlLib.baseContainerArrayContainerMod.ArrayContainer[
    T, 
    SourceT, 
    SourceT, 
    tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[T, SourceT], 
    T
  ] */] ()
    extends tstlLib.baseMod.ArrayReverseIterator[T, SourceT]
  
  @js.native
  abstract class Container[T /* <: Elem */, SourceT /* <: tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem] ()
    extends tstlLib.baseMod.Container[T, SourceT, IteratorT, ReverseIteratorT, Elem]
  
  @js.native
  class ForOfAdaptor[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */] protected ()
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
  abstract class ListContainer[T, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT, T] */, IteratorT /* <: tstlLib.baseIteratorListIteratorMod.ListIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */] protected ()
    extends tstlLib.baseMod.ListContainer[T, SourceT, IteratorT, ReverseIteratorT]
  
  @js.native
  abstract class MapContainer[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: tstlLib.baseIteratorIMapIteratorMod.IMapIterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.baseIteratorIMapIteratorMod.IMapReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] protected ()
    extends tstlLib.baseMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] {
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
  }
  
  @js.native
  abstract class MultiMap[Key, T, Source /* <: tstlLib.baseContainerMultiMapMod.MultiMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: tstlLib.baseIteratorIMapIteratorMod.IMapIterator[Key, T, tstlLib.tstlLibNumbers.`false`, Source, Iterator, Reverse] */, Reverse /* <: tstlLib.baseIteratorIMapIteratorMod.IMapReverseIterator[Key, T, tstlLib.tstlLibNumbers.`false`, Source, Iterator, Reverse] */] ()
    extends tstlLib.baseMod.MultiMap[Key, T, Source, Iterator, Reverse]
  
  @js.native
  abstract class MultiSet[Key, Source /* <: tstlLib.baseContainerMultiSetMod.MultiSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: tstlLib.baseIteratorISetIteratorMod.ISetIterator[Key, tstlLib.tstlLibNumbers.`false`, Source, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.baseIteratorISetIteratorMod.ISetReverseIterator[Key, tstlLib.tstlLibNumbers.`false`, Source, IteratorT, ReverseT] */] ()
    extends tstlLib.baseMod.MultiSet[Key, Source, IteratorT, ReverseT]
  
  @js.native
  abstract class ReverseIterator[T /* <: Elem */, Source /* <: tstlLib.baseContainerIContainerMod.IContainer[T, Source, Base, This, Elem] */, Base /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, Source, Base, This, Elem] */, This /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, Source, Base, This, Elem] */, Elem] protected ()
    extends tstlLib.baseMod.ReverseIterator[T, Source, Base, This, Elem] {
    /**
      * Initializer Constructor.
      *
      * @param base The base iterator.
      */
    def this(base: Base) = this()
  }
  
  @js.native
  abstract class SetContainer[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: tstlLib.baseIteratorISetIteratorMod.ISetIterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.baseIteratorISetIteratorMod.ISetReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] protected ()
    extends tstlLib.baseMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] {
    /**
      * Default Constructor.
      */
    protected def this(factory: js.Function1[
          /* thisArg */ Source, 
          tstlLib.baseContainerILinearContainerMod.ILinearContainer[Key, Source, IteratorT, ReverseT, Key]
        ]) = this()
  }
  
  @js.native
  abstract class UniqueMap[Key, T, Source /* <: tstlLib.baseContainerUniqueMapMod.UniqueMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: tstlLib.baseIteratorIMapIteratorMod.IMapIterator[Key, T, tstlLib.tstlLibNumbers.`true`, Source, Iterator, Reverse] */, Reverse /* <: tstlLib.baseIteratorIMapIteratorMod.IMapReverseIterator[Key, T, tstlLib.tstlLibNumbers.`true`, Source, Iterator, Reverse] */] ()
    extends tstlLib.baseMod.UniqueMap[Key, T, Source, Iterator, Reverse]
  
  @js.native
  abstract class UniqueSet[Key, Source /* <: tstlLib.baseContainerUniqueSetMod.UniqueSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: tstlLib.baseIteratorISetIteratorMod.ISetIterator[Key, tstlLib.tstlLibNumbers.`true`, Source, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.baseIteratorISetIteratorMod.ISetReverseIterator[Key, tstlLib.tstlLibNumbers.`true`, Source, IteratorT, ReverseT] */] ()
    extends tstlLib.baseMod.UniqueSet[Key, Source, IteratorT, ReverseT]
  
}

