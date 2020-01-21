package typings.tstl

import typings.tstl.containerContainerMod.Container
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ilinearcontainerbaseMod.ILinearContainerBase
import typings.tstl.pairMod.Pair
import typings.tstl.setContainerMod.SetContainer.InsertRet
import typings.tstl.setContainerMod.SetContainer.Iterator
import typings.tstl.setContainerMod.SetContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/SetContainer", JSImport.Namespace)
@js.native
object setContainerMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.isizeMod.ISize because Already inherited
  - typings.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typings.tstl.ipushMod.IPush because Already inherited
  - typings.tstl.iemptyMod.IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.icontainerMod.IContainer because Already inherited
  - typings.tstl.iassociativecontainerMod.IAssociativeContainer because var conflicts: iterator. Inlined find, has, count */ @js.native
  abstract class SetContainer[Key, Unique /* <: Boolean */, SourceT /* <: SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] protected () extends Container[Key, SourceT, IteratorT, ReverseT, Key] {
    /**
      * Default Constructor.
      */
    protected def this(factory: js.Function1[
            /* thisArg */ SourceT, 
            ILinearContainerBase[Key, SourceT, IteratorT, ReverseT, Key]
          ]) = this()
    var data_ : ILinearContainerBase[Key, SourceT, IteratorT, ReverseT, Key] = js.native
    /* protected */ def _Erase_by_range(first: IteratorT): IteratorT = js.native
    /* protected */ def _Erase_by_range(first: IteratorT, last: IteratorT): IteratorT = js.native
    /* protected */ def _Erase_by_val(key: Key): Double = js.native
    /* protected */ def _Handle_erase(first: IteratorT, last: IteratorT): Unit = js.native
    /* protected */ def _Handle_insert(first: IteratorT, last: IteratorT): Unit = js.native
    /* protected */ def _Insert_by_hint(hint: IteratorT, key: Key): IteratorT = js.native
    /* protected */ def _Insert_by_key(key: Key): InsertRet[Key, Unique, SourceT, IteratorT, ReverseT] = js.native
    /* protected */ def _Insert_by_range[InputIterator /* <: IForwardIterator[Key, InputIterator] */](begin: InputIterator, end: InputIterator): Unit = js.native
    /**
      * @inheritDoc
      */
    /**
      * Count elements with a specified key.
      *
      * @param key Key to search for.
      * @return Number of elements with the specified key.
      */
    def count(key: Key): Double = js.native
    /**
      * @inheritDoc
      */
    @JSName("erase")
    def erase_IteratorT(pos: IteratorT): IteratorT = js.native
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
    def has(key: Key): Boolean = js.native
    def insert(hint: IteratorT, key: Key): IteratorT = js.native
    def insert(key: Key): InsertRet[Key, Unique, SourceT, IteratorT, ReverseT] = js.native
    @JSName("insert")
    def insert_InputIterator_IForwardIteratorKeyInputIterator_Unit[InputIterator /* <: IForwardIterator[Key, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * @inheritDoc
      */
    def merge(source: SourceT): Unit = js.native
  }
  
  @js.native
  object SetContainer extends js.Object {
    /**
      * Return type of {@link SetContainer.insert}
      */
    type InsertRet[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] = IteratorT | (Pair[IteratorT, Boolean])
    /**
      * Iterator of {@link SetContainer}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type Iterator[Key, Unique /* <: Boolean */, SourceT /* <: SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/SetContainer.SetContainer.Iterator<Key, Unique, SourceT, IteratorT, ReverseT> */ js.Object */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] = typings.tstl.icontainerMod.IContainer.Iterator[Key, SourceT, IteratorT, ReverseT, Key]
    /**
      * Reverse iterator of {@link SetContainer}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type ReverseIterator[Key, Unique /* <: Boolean */, SourceT /* <: SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/SetContainer.SetContainer.ReverseIterator<Key, Unique, SourceT, IteratorT, ReverseT> */ js.Object */] = typings.tstl.icontainerMod.IContainer.ReverseIterator[Key, SourceT, IteratorT, ReverseT, Key]
  }
  
}

