package typings
package tstlLib.baseDisposableIForwardContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IForwardContainer[Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */] extends js.Object {
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  def begin(): Iterator
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  def end(): Iterator
}

