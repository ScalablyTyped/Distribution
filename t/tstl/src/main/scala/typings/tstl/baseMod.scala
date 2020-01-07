package typings.tstl

import typings.std.Iterator
import typings.tstl.baseContainerILinearContainerMod.ILinearContainer
import typings.tstl.utilityEntryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  @js.native
  abstract class Container[T /* <: Elem */, SourceT /* <: typings.tstl.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseIteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IReverseIterator<T, SourceT, IteratorT, ReverseIteratorT, Elem> */ js.Any */, Elem] ()
    extends typings.tstl.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseIteratorT, Elem]
  
  @js.native
  abstract class MapContainer[Key, T, Unique /* <: Boolean */, Source /* <: typings.tstl.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMapIterator<Key, T, Unique, Source, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMapReverseIterator<Key, T, Unique, Source, IteratorT, ReverseT> */ js.Any */] protected ()
    extends typings.tstl.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] {
    /**
      * Default Constructor.
      */
    protected def this(factory: js.Function1[
            /* thisArg */ Source, 
            ILinearContainer[Entry[Key, T], Source, IteratorT, ReverseT, Entry[Key, T]]
          ]) = this()
  }
  
  @js.native
  abstract class MultiMap[Key, T, Source /* <: typings.tstl.baseContainerMultiMapMod.MultiMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMapIterator<Key, T, false, Source, Iterator, Reverse> */ js.Any */, Reverse /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMapReverseIterator<Key, T, false, Source, Iterator, Reverse> */ js.Any */] ()
    extends typings.tstl.baseContainerMultiMapMod.MultiMap[Key, T, Source, Iterator, Reverse]
  
  @js.native
  abstract class MultiSet[Key, Source /* <: typings.tstl.baseContainerMultiSetMod.MultiSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetIterator<Key, false, Source, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetReverseIterator<Key, false, Source, IteratorT, ReverseT> */ js.Any */] ()
    extends typings.tstl.baseContainerMultiSetMod.MultiSet[Key, Source, IteratorT, ReverseT]
  
  @js.native
  abstract class SetContainer[Key, Unique /* <: Boolean */, Source /* <: typings.tstl.baseContainerSetContainerMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetIterator<Key, Unique, Source, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetReverseIterator<Key, Unique, Source, IteratorT, ReverseT> */ js.Any */] protected ()
    extends typings.tstl.baseContainerSetContainerMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] {
    /**
      * Default Constructor.
      */
    protected def this(factory: js.Function1[/* thisArg */ Source, ILinearContainer[Key, Source, IteratorT, ReverseT, Key]]) = this()
  }
  
  @js.native
  abstract class UniqueMap[Key, T, Source /* <: typings.tstl.baseContainerUniqueMapMod.UniqueMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMapIterator<Key, T, true, Source, Iterator, Reverse> */ js.Any */, Reverse /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMapReverseIterator<Key, T, true, Source, Iterator, Reverse> */ js.Any */] ()
    extends typings.tstl.baseContainerUniqueMapMod.UniqueMap[Key, T, Source, Iterator, Reverse]
  
  @js.native
  abstract class UniqueSet[Key, Source /* <: typings.tstl.baseContainerUniqueSetMod.UniqueSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetIterator<Key, true, Source, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetReverseIterator<Key, true, Source, IteratorT, ReverseT> */ js.Any */] ()
    extends typings.tstl.baseContainerUniqueSetMod.UniqueSet[Key, Source, IteratorT, ReverseT]
  
}

