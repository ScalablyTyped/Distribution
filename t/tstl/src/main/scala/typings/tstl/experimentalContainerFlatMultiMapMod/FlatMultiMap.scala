package typings.tstl.experimentalContainerFlatMultiMapMod

import typings.tstl.baseContainerMultiTreeMapMod.MultiTreeMap
import typings.tstl.experimentalContainerFlatMultiMapMod.FlatMultiMapNs.Iterator
import typings.tstl.experimentalContainerFlatMultiMapMod.FlatMultiMapNs.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/container/FlatMultiMap", "FlatMultiMap")
@js.native
/**
  * Default Constructor.
  *
  * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
  */
class FlatMultiMap[Key, T] () extends MultiTreeMap[Key, T, FlatMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
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
  def this(obj: FlatMultiMap[Key, T]) = this()
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
  def nth(index: Double): Iterator[Key, T] = js.native
}

