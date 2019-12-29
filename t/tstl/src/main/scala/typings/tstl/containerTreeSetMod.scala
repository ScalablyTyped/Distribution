package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.baseContainerUniqueTreeSetMod.UniqueTreeSet
import typings.tstl.containerTreeSetMod.TreeSet.Iterator
import typings.tstl.containerTreeSetMod.TreeSet.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.tstlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/TreeSet", JSImport.Namespace)
@js.native
object containerTreeSetMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class TreeSet[Key] () extends UniqueTreeSet[Key, TreeSet[Key], Iterator[Key], ReverseIterator[Key]] {
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
    val Iterator: Instantiable0[
        typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val iterator: Instantiable0[
        typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val reverse_iterator: Instantiable0[
        typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    type Iterator[Key] = typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[Key, `true`, TreeSet[Key]]
    type ReverseIterator[Key] = typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[Key, `true`, TreeSet[Key]]
    type iterator[Key] = typings.tstl.containerTreeSetMod.TreeSet.Iterator[Key]
    type reverse_iterator[Key] = typings.tstl.containerTreeSetMod.TreeSet.ReverseIterator[Key]
  }
  
  @js.native
  object set extends js.Object {
    val Iterator: Instantiable0[
        typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val iterator: Instantiable0[
        typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val reverse_iterator: Instantiable0[
        typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
  }
  
}

