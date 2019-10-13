package typings.tstl.tstlMod

import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.baseContainerILinearContainerMod.ILinearContainer
import typings.tstl.baseIteratorArrayIteratorBaseMod.ArrayIteratorBase
import typings.tstl.baseIteratorArrayIteratorBaseMod.ArrayReverseIteratorBase
import typings.tstl.baseIteratorIMapIteratorMod.IMapIterator
import typings.tstl.baseIteratorIMapIteratorMod.IMapReverseIterator
import typings.tstl.baseIteratorISetIteratorMod.ISetIterator
import typings.tstl.baseIteratorISetIteratorMod.ISetReverseIterator
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.baseIteratorListIteratorMod.ListIterator
import typings.tstl.baseIteratorReverseIteratorMod.IReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.tstlNumbers.`false`
import typings.tstl.tstlNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "base")
@js.native
object base extends js.Object {
  @js.native
  abstract class ArrayContainer[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: typings.tstl.baseContainerArrayContainerMod.ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] ()
    extends typings.tstl.baseContainerArrayContainerMod.ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT]
  
  @js.native
  class ArrayIterator[T, SourceT /* <: typings.tstl.baseContainerArrayContainerMod.ArrayContainer[
    T, 
    SourceT, 
    SourceT, 
    typings.tstl.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT], 
    typings.tstl.baseIteratorArrayIteratorMod.ArrayReverseIterator[T, SourceT], 
    T
  ] */] ()
    extends typings.tstl.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT]
  
  @js.native
  class ArrayReverseIterator[T, SourceT /* <: typings.tstl.baseContainerArrayContainerMod.ArrayContainer[
    T, 
    SourceT, 
    SourceT, 
    typings.tstl.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT], 
    typings.tstl.baseIteratorArrayIteratorMod.ArrayReverseIterator[T, SourceT], 
    T
  ] */] ()
    extends typings.tstl.baseIteratorArrayIteratorMod.ArrayReverseIterator[T, SourceT]
  
  @js.native
  abstract class Container[T /* <: Elem */, SourceT /* <: typings.tstl.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem] ()
    extends typings.tstl.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseIteratorT, Elem]
  
  @js.native
  class ForOfAdaptor[T, InputIterator /* <: IForwardIterator[T, InputIterator] */] protected ()
    extends typings.tstl.baseMod.ForOfAdaptor[T, InputIterator] {
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
  abstract class ListContainer[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseIteratorT, T] */, IteratorT /* <: ListIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */, ReverseIteratorT /* <: typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */] protected ()
    extends typings.tstl.baseMod.ListContainer[T, SourceT, IteratorT, ReverseIteratorT]
  
  @js.native
  abstract class MapContainer[Key, T, Unique /* <: Boolean */, Source /* <: typings.tstl.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: IMapIterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: IMapReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] protected ()
    extends typings.tstl.baseMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] {
    /**
      * Default Constructor.
      */
    protected def this(factory: js.Function1[
            /* thisArg */ Source, 
            ILinearContainer[
              typings.tstl.utilityEntryMod.Entry[Key, T], 
              Source, 
              IteratorT, 
              ReverseT, 
              typings.tstl.utilityEntryMod.Entry[Key, T]
            ]
          ]) = this()
  }
  
  @js.native
  abstract class MultiMap[Key, T, Source /* <: typings.tstl.baseContainerMultiMapMod.MultiMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: IMapIterator[Key, T, `false`, Source, Iterator, Reverse] */, Reverse /* <: IMapReverseIterator[Key, T, `false`, Source, Iterator, Reverse] */] ()
    extends typings.tstl.baseContainerMultiMapMod.MultiMap[Key, T, Source, Iterator, Reverse]
  
  @js.native
  abstract class MultiSet[Key, Source /* <: typings.tstl.baseContainerMultiSetMod.MultiSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: ISetIterator[Key, `false`, Source, IteratorT, ReverseT] */, ReverseT /* <: ISetReverseIterator[Key, `false`, Source, IteratorT, ReverseT] */] ()
    extends typings.tstl.baseContainerMultiSetMod.MultiSet[Key, Source, IteratorT, ReverseT]
  
  @js.native
  abstract class ReverseIterator[T /* <: Elem */, Source /* <: IContainer[T, Source, Base, This, Elem] */, Base /* <: Iterator[T, Source, Base, This, Elem] */, This /* <: typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator[T, Source, Base, This, Elem] */, Elem] protected ()
    extends typings.tstl.baseMod.ReverseIterator[T, Source, Base, This, Elem] {
    /**
      * Initializer Constructor.
      *
      * @param base The base iterator.
      */
    def this(base: Base) = this()
  }
  
  @js.native
  abstract class SetContainer[Key, Unique /* <: Boolean */, Source /* <: typings.tstl.baseContainerSetContainerMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: ISetIterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ISetReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] protected ()
    extends typings.tstl.baseMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] {
    /**
      * Default Constructor.
      */
    protected def this(factory: js.Function1[/* thisArg */ Source, ILinearContainer[Key, Source, IteratorT, ReverseT, Key]]) = this()
  }
  
  @js.native
  abstract class UniqueMap[Key, T, Source /* <: typings.tstl.baseContainerUniqueMapMod.UniqueMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: IMapIterator[Key, T, `true`, Source, Iterator, Reverse] */, Reverse /* <: IMapReverseIterator[Key, T, `true`, Source, Iterator, Reverse] */] ()
    extends typings.tstl.baseContainerUniqueMapMod.UniqueMap[Key, T, Source, Iterator, Reverse]
  
  @js.native
  abstract class UniqueSet[Key, Source /* <: typings.tstl.baseContainerUniqueSetMod.UniqueSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: ISetIterator[Key, `true`, Source, IteratorT, ReverseT] */, ReverseT /* <: ISetReverseIterator[Key, `true`, Source, IteratorT, ReverseT] */] ()
    extends typings.tstl.baseContainerUniqueSetMod.UniqueSet[Key, Source, IteratorT, ReverseT]
  
}

