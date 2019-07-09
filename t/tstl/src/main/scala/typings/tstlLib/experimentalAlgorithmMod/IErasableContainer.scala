package typings
package tstlLib.experimentalAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  */
trait IErasableContainer[Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */] extends js.Object {
  def begin(): Iterator
  def end(): Iterator
  def erase(first: Iterator, last: Iterator): Iterator
}

object IErasableContainer {
  @scala.inline
  def apply[Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](begin: () => Iterator, end: () => Iterator, erase: (Iterator, Iterator) => Iterator): IErasableContainer[Iterator] = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction0(begin), end = js.Any.fromFunction0(end), erase = js.Any.fromFunction2(erase))
  
    __obj.asInstanceOf[IErasableContainer[Iterator]]
  }
}

