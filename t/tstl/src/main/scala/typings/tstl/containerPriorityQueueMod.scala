package typings.tstl

import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/PriorityQueue", JSImport.Namespace)
@js.native
object containerPriorityQueueMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AdaptorContainer<T, Vector<T>, PriorityQueue<T>> * / any */ @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class PriorityQueue[T] () extends js.Object {
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
      * @inheritDoc
      */
    def pop(): Unit = js.native
    /**
      * @inheritDoc
      */
    def push(elems: T*): Double = js.native
    /**
      * @inheritDoc
      */
    def swap(obj: PriorityQueue[T]): Unit = js.native
    /**
      * Get top element.
      */
    def top(): T = js.native
    /**
      * Get value comparison function.
      */
    def value_comp(): js.Function2[/* x */ T, /* y */ T, Boolean] = js.native
  }
  
}

