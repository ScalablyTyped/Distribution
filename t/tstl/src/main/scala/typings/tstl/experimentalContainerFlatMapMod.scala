package typings.tstl

import typings.tstl.experimentalContainerFlatMapMod.FlatMap.Iterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/container/FlatMap", JSImport.Namespace)
@js.native
object experimentalContainerFlatMapMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniqueTreeMap<Key, T, FlatMap<Key, T>, FlatMap.Iterator<Key, T>, FlatMap.ReverseIterator<Key, T>> * / any */ @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class FlatMap[Key, T] () extends js.Object {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[IPair[Key, T]]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: FlatMap[Key, T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]]
    ) = this()
    def this(items: js.Array[IPair[Key, T]], comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
    /**
      * @hidden
      */
    var _Capsule_key: js.Any = js.native
    /**
      * @hidden
      */
    var key_comp_ : js.Any = js.native
    /**
      * @hidden
      */
    /* protected */ def _Handle_erase(has0: js.Object, has1: js.Object): Unit = js.native
    /**
      * @hidden
      */
    /* protected */ def _Handle_insert(has0: js.Object, has1: js.Object): Unit = js.native
    /**
      * @inheritDoc
      */
    def key_comp(): js.Function2[/* x */ Key, /* y */ Key, Boolean] = js.native
    /**
      * @inheritDoc
      */
    def lower_bound(key: Key): Iterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    def nth(index: Double): Iterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    def swap(obj: FlatMap[Key, T]): Unit = js.native
    /**
      * @inheritDoc
      */
    def upper_bound(key: Key): Iterator[Key, T] = js.native
  }
  
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class flat_map[Key, T] () extends FlatMap[Key, T] {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[IPair[Key, T]]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: FlatMap[Key, T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]]
    ) = this()
    def this(items: js.Array[IPair[Key, T]], comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
  }
  
  @js.native
  object FlatMap extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementVector.Iterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementVector.ReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementVector.Iterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementVector.ReverseIterator */ js.Any = js.native
    type Iterator[Key, T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementVector.Iterator<Key, T, true, FlatMap<Key, T>> */ js.Any
    type ReverseIterator[Key, T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementVector.ReverseIterator<Key, T, true, FlatMap<Key, T>> */ js.Any
    type iterator[Key, T] = typings.tstl.experimentalContainerFlatMapMod.FlatMap.Iterator[Key, T]
    type reverse_iterator[Key, T] = typings.tstl.experimentalContainerFlatMapMod.FlatMap.ReverseIterator[Key, T]
  }
  
  @js.native
  object flat_map extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementVector.Iterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementVector.ReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementVector.Iterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementVector.ReverseIterator */ js.Any = js.native
  }
  
}

