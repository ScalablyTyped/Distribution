package typings.tstl.iteratorIForwardIteratorMod

import typings.tstl.functionalIPointerMod.IPointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'equals' ]: tstl.tstl/functional/IComparable.IComparable<Iterator>[P]} */ trait IForwardIterator[T, Iterator /* <: IForwardIterator[T, Iterator] */] extends IPointer[T] {
  /**
    * Get next iterator.
    *
    * @return The next iterator.
    */
  def next(): Iterator
}

object IForwardIterator {
  @scala.inline
  def apply[T, Iterator /* <: IForwardIterator[T, Iterator] */](next: () => Iterator, value: T): IForwardIterator[T, Iterator] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IForwardIterator[T, Iterator]]
  }
}

