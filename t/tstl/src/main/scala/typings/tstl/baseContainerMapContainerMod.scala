package typings.tstl

import typings.tstl.baseContainerContainerMod.Container
import typings.tstl.baseContainerILinearContainerMod.ILinearContainer
import typings.tstl.baseContainerMapContainerMod.MapContainer.InsertRet
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.utilityEntryMod.Entry
import typings.tstl.utilityIPairMod.IPair
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MapContainer", JSImport.Namespace)
@js.native
object baseContainerMapContainerMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IAssociativeContainer<Key, Entry<Key, T>, Source, IteratorT, ReverseT, IPair<Key, T>> * / any */ @js.native
  abstract class MapContainer[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMapIterator<Key, T, Unique, Source, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMapReverseIterator<Key, T, Unique, Source, IteratorT, ReverseT> */ js.Any */] protected () extends Container[Entry[Key, T], Source, IteratorT, ReverseT, IPair[Key, T]] {
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
    def count(key: Key): Double = js.native
    def emplace(key: Key, `val`: T): InsertRet[Key, T, Unique, Source, IteratorT, ReverseT] = js.native
    def emplace_hint(hint: IteratorT, key: Key, `val`: T): IteratorT = js.native
    /**
      * @inheritDoc
      */
    @JSName("erase")
    def erase_Double(key: Key): Double = js.native
    /**
      * @inheritDoc
      */
    def find(key: Key): IteratorT = js.native
    /**
      * @inheritDoc
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
  
  @js.native
  object MapContainer extends js.Object {
    type InsertRet[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[Key, T, Unique, Source, Iterator, Reverse] */, Iterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMapIterator<Key, T, Unique, Source, Iterator, Reverse> */ js.Any */, Reverse /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IMapReverseIterator<Key, T, Unique, Source, Iterator, Reverse> */ js.Any */] = Iterator | (Pair[Iterator, Boolean])
  }
  
}

