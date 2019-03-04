package typings
package tstlLib.iteratorIForwardIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'equals' ]: tstl.tstl/functional/IComparable.IComparable<Iterator>[P]} */ trait IForwardIterator[T, Iterator /* <: IForwardIterator[T, Iterator] */]
  extends tstlLib.functionalIPointerMod.IPointer[T] {
  /**
    * Get next iterator.
    *
    * @return The next iterator.
    */
  def next(): Iterator
}

object IForwardIterator {
  @scala.inline
  def apply[T, Iterator /* <: IForwardIterator[T, Iterator] */](equals: js.Function1[Iterator, scala.Boolean], next: js.Function0[Iterator], value: T): IForwardIterator[T, Iterator] = {
    val __obj = js.Dynamic.literal(equals = equals, next = next, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IForwardIterator[T, Iterator]]
  }
}

