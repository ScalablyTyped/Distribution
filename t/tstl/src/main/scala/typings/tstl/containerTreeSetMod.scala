package typings.tstl

import typings.tstl.containerTreeSetMod.TreeSet.Iterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/TreeSet", JSImport.Namespace)
@js.native
object containerTreeSetMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniqueTreeSet<Key, TreeSet<Key>, TreeSet.Iterator<Key>, TreeSet.ReverseIterator<Key>> * / any */ @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class TreeSet[Key] () extends js.Object {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(container: TreeSet[Key]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[Key]) = this()
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
    var tree_ : js.Any = js.native
    /**
      * @hidden
      */
    /* protected */ def _Handle_erase(first: Iterator[Key], last: Iterator[Key]): Unit = js.native
    /**
      * @hidden
      */
    /* protected */ def _Handle_insert(first: Iterator[Key], last: Iterator[Key]): Unit = js.native
    /**
      * @inheritDoc
      */
    def clear(): Unit = js.native
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
    def swap(obj: TreeSet[Key]): Unit = js.native
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
  class set[Key] () extends TreeSet[Key] {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(container: TreeSet[Key]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[Key]) = this()
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
  object TreeSet extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.Iterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.ReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.Iterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.ReverseIterator */ js.Any = js.native
    type Iterator[Key] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.Iterator<Key, true, TreeSet<Key>> */ js.Any
    type ReverseIterator[Key] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.ReverseIterator<Key, true, TreeSet<Key>> */ js.Any
    type iterator[Key] = typings.tstl.containerTreeSetMod.TreeSet.Iterator[Key]
    type reverse_iterator[Key] = typings.tstl.containerTreeSetMod.TreeSet.ReverseIterator[Key]
  }
  
  @js.native
  object set extends js.Object {
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.Iterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.ReverseIterator */ js.Any = js.native
    val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.Iterator */ js.Any = js.native
    val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.ReverseIterator */ js.Any = js.native
  }
  
}

