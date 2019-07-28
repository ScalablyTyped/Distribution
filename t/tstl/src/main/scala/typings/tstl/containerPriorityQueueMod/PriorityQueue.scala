package typings.tstl.containerPriorityQueueMod

import typings.tstl.baseContainerAdaptorContainerMod.AdaptorContainer
import typings.tstl.containerVectorMod.Vector
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/PriorityQueue", "PriorityQueue")
@js.native
/**
  * Default Constructor.
  *
  * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
  */
class PriorityQueue[T] () extends AdaptorContainer[T, Vector[T], PriorityQueue[T]] {
  def this(comp: js.Function2[/* x */ T, /* y */ T, Boolean]) = this()
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: PriorityQueue[T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  def this(
    first: IForwardIterator[T, IForwardIterator[T, _]],
    last: IForwardIterator[T, IForwardIterator[T, _]]
  ) = this()
  def this(
    first: IForwardIterator[T, IForwardIterator[T, _]],
    last: IForwardIterator[T, IForwardIterator[T, _]],
    comp: js.Function2[/* x */ T, /* y */ T, Boolean]
  ) = this()
  /**
    * @hidden
    */
  var comp_ : js.Any = js.native
  /**
    * Get top element.
    */
  def top(): T = js.native
  /**
    * Get value comparison function.
    */
  def value_comp(): js.Function2[/* x */ T, /* y */ T, Boolean] = js.native
}

