package typings.tstl.treeSetMod

import typings.tstl.comparatorMod.Comparator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.treeSetMod.TreeSet.Iterator
import typings.tstl.treeSetMod.TreeSet.ReverseIterator
import typings.tstl.uniqueTreeSetMod.UniqueTreeSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/TreeSet", "TreeSet")
@js.native
/**
  * Default Constructor.
  *
  * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
  */
class TreeSet_[Key] () extends UniqueTreeSet[Key, TreeSet[Key], Iterator[Key], ReverseIterator[Key]] {
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

