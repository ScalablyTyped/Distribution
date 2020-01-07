package typings.tstl.tstlMod

import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "multimap")
@js.native
/**
  * Default Constructor.
  *
  * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
  */
class multimap[Key, T] ()
  extends typings.tstl.containerMod.multimap[Key, T] {
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
  def this(obj: typings.tstl.containerTreeMultiMapMod.TreeMultiMap[Key, T]) = this()
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

@JSImport("tstl", "multimap")
@js.native
object multimap extends js.Object {
  val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.Iterator */ js.Any = js.native
  val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.ReverseIterator */ js.Any = js.native
  val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.Iterator */ js.Any = js.native
  val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.ReverseIterator */ js.Any = js.native
}

