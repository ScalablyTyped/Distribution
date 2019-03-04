package typings
package tstlLib.containerPriorityQueueMod

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
class PriorityQueue[T] ()
  extends tstlLib.baseContainerAdaptorContainerMod.AdaptorContainer[T, tstlLib.containerVectorMod.Vector[T], PriorityQueue[T]] {
  def this(comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]) = this()
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
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, _]]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, _]]
    ]) = this()
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, _]]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, _]]
    ], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]) = this()
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
  def value_comp(): js.Function2[/* x */ T, /* y */ T, scala.Boolean] = js.native
}

