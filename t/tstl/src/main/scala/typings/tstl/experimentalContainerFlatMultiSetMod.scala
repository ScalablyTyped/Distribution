package typings.tstl

import typings.tstl.experimentalContainerFlatMultiSetMod.FlatMultiSet.Iterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/container/FlatMultiSet", JSImport.Namespace)
@js.native
object experimentalContainerFlatMultiSetMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiTreeSet<Key, FlatMultiSet<Key>, FlatMultiSet.Iterator<Key>, FlatMultiSet.ReverseIterator<Key>> * / any */ @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class FlatMultiSet[Key] () extends js.Object {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[Key]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: FlatMultiSet[Key]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]]
    ) = this()
    def this(items: js.Array[Key], comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]],
      comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
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
    def lower_bound(key: Key): Iterator[Key] = js.native
    /**
      * @inheritDoc
      */
    def nth(index: Double): Iterator[Key] = js.native
    /**
      * @inheritDoc
      */
    def swap(obj: FlatMultiSet[Key]): Unit = js.native
    /**
      * @inheritDoc
      */
    def upper_bound(key: Key): Iterator[Key] = js.native
  }
  
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class flat_multiset[Key] () extends FlatMultiSet[Key] {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[Key]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: FlatMultiSet[Key]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]]
    ) = this()
    def this(items: js.Array[Key], comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]],
      comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
  }
  
  @js.native
  object FlatMultiSet extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementVector.Iterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementVector.ReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementVector.Iterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementVector.ReverseIterator */ js.Any = js.native
    type Iterator[Key] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementVector.Iterator<Key, false, FlatMultiSet<Key>> */ js.Any
    type ReverseIterator[Key] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementVector.ReverseIterator<Key, false, FlatMultiSet<Key>> */ js.Any
    type iterator[Key] = typings.tstl.experimentalContainerFlatMultiSetMod.FlatMultiSet.Iterator[Key]
    type reverse_iterator[Key] = typings.tstl.experimentalContainerFlatMultiSetMod.FlatMultiSet.ReverseIterator[Key]
  }
  
  @js.native
  object flat_multiset extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementVector.Iterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementVector.ReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementVector.Iterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementVector.ReverseIterator */ js.Any = js.native
  }
  
}

