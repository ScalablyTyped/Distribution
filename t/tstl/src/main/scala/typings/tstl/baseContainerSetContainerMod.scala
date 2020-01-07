package typings.tstl

import typings.tstl.baseContainerContainerMod.Container
import typings.tstl.baseContainerILinearContainerMod.ILinearContainer
import typings.tstl.baseContainerSetContainerMod.SetContainer.InsertRet
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/SetContainer", JSImport.Namespace)
@js.native
object baseContainerSetContainerMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IAssociativeContainer<Key, Key, Source, IteratorT, ReverseT, Key> * / any */ @js.native
  abstract class SetContainer[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetIterator<Key, Unique, Source, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetReverseIterator<Key, Unique, Source, IteratorT, ReverseT> */ js.Any */] protected () extends Container[Key, Source, IteratorT, ReverseT, Key] {
    /**
      * Default Constructor.
      */
    protected def this(factory: js.Function1[/* thisArg */ Source, ILinearContainer[Key, Source, IteratorT, ReverseT, Key]]) = this()
    /**
      * @hidden
      */
    var data_ : ILinearContainer[Key, Source, IteratorT, ReverseT, Key] = js.native
    /**
      * @hidden
      */
    /* protected */ def _Erase_by_range(first: IteratorT): IteratorT = js.native
    /* protected */ def _Erase_by_range(first: IteratorT, last: IteratorT): IteratorT = js.native
    /**
      * @hidden
      */
    /* protected */ def _Erase_by_val(key: Key): Double = js.native
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
    /* protected */ def _Insert_by_hint(hint: IteratorT, key: Key): IteratorT = js.native
    /**
      * @hidden
      */
    /* protected */ def _Insert_by_key(key: Key): InsertRet[Key, Unique, Source, IteratorT, ReverseT] = js.native
    /**
      * @hidden
      */
    /* protected */ def _Insert_by_range[InputIterator /* <: IForwardIterator[Key, InputIterator] */](begin: InputIterator, end: InputIterator): Unit = js.native
    /**
      * @inheritDoc
      */
    def count(key: Key): Double = js.native
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
    def insert(hint: IteratorT, key: Key): IteratorT = js.native
    def insert(key: Key): InsertRet[Key, Unique, Source, IteratorT, ReverseT] = js.native
    @JSName("insert")
    def insert_InputIterator_IForwardIteratorKeyInputIterator_Unit[InputIterator /* <: IForwardIterator[Key, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * @inheritDoc
      */
    def merge(source: Source): Unit = js.native
  }
  
  @js.native
  object SetContainer extends js.Object {
    type InsertRet[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetIterator<Key, Unique, Source, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISetReverseIterator<Key, Unique, Source, IteratorT, ReverseT> */ js.Any */] = IteratorT | (Pair[IteratorT, Boolean])
  }
  
}

