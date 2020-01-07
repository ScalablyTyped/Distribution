package typings.tstl.tstlMod

import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "HashMultiSet")
@js.native
/**
  * Default Constructor.
  *
  * @param hash An unary function returns hash code. Default is {hash}.
  * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
  */
class HashMultiSet[Key] ()
  extends typings.tstl.containerMod.HashMultiSet[Key] {
  def this(hash: js.Function1[/* key */ Key, Double]) = this()
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(items: js.Array[Key]) = this()
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: typings.tstl.containerHashMultiSetMod.HashMultiSet[Key]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(
    first: IForwardIterator[Key, IForwardIterator[Key, _]],
    last: IForwardIterator[Key, IForwardIterator[Key, _]]
  ) = this()
  def this(hash: js.Function1[/* key */ Key, Double], equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
  def this(items: js.Array[Key], hash: js.Function1[/* key */ Key, Double]) = this()
  def this(
    first: IForwardIterator[Key, IForwardIterator[Key, _]],
    last: IForwardIterator[Key, IForwardIterator[Key, _]],
    hash: js.Function1[/* key */ Key, Double]
  ) = this()
  def this(
    items: js.Array[Key],
    hash: js.Function1[/* key */ Key, Double],
    equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
  ) = this()
  def this(
    first: IForwardIterator[Key, IForwardIterator[Key, _]],
    last: IForwardIterator[Key, IForwardIterator[Key, _]],
    hash: js.Function1[/* key */ Key, Double],
    equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
  ) = this()
}

@JSImport("tstl", "HashMultiSet")
@js.native
object HashMultiSet extends js.Object {
  val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.Iterator */ js.Any = js.native
  val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.ReverseIterator */ js.Any = js.native
  val iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.Iterator */ js.Any = js.native
  val reverse_iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.ReverseIterator */ js.Any = js.native
}

