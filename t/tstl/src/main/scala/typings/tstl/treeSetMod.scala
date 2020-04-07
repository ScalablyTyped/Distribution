package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.comparatorMod.Comparator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.setContainerMod.SetContainer
import typings.tstl.treeSetMod.TreeSet.Iterator
import typings.tstl.treeSetMod.TreeSet.ReverseIterator
import typings.tstl.tstlBooleans.`true`
import typings.tstl.uniqueTreeSetMod.UniqueTreeSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/TreeSet", JSImport.Namespace)
@js.native
object treeSetMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class TreeSet[Key] () extends UniqueTreeSet[Key, TreeSet[Key], Iterator[Key], ReverseIterator[Key]] {
    def this(comp: Comparator[Key, Key]) = this()
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
    def this(items: js.Array[Key], comp: Comparator[Key, Key]) = this()
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]],
      comp: Comparator[Key, Key]
    ) = this()
    var tree_ : js.Any = js.native
  }
  
  @js.native
  object TreeSet extends js.Object {
    val Iterator: Instantiable0[
        typings.tstl.setElementListMod.SetElementList.Iterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            Iteratoranyanyany, 
            typings.tstl.setElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        typings.tstl.setElementListMod.SetElementList.ReverseIterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            Iteratoranyanyany, 
            typings.tstl.setElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    /**
      * Iterator of {@link TreeSet}
      */
    type Iterator[Key] = typings.tstl.setElementListMod.SetElementList.Iterator[Key, `true`, TreeSet[Key]]
    /**
      * Reverse iterator of {@link TreeSet}
      */
    type ReverseIterator[Key] = typings.tstl.setElementListMod.SetElementList.ReverseIterator[Key, `true`, TreeSet[Key]]
  }
  
}

