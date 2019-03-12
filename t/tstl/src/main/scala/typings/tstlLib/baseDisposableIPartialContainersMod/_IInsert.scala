package typings
package tstlLib.baseDisposableIPartialContainersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IInsert[Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */] extends js.Object {
  def insert(it: Iterator, value: tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator]): Iterator
}

object _IInsert {
  @scala.inline
  def apply[Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](insert: (Iterator, tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator]) => Iterator): _IInsert[Iterator] = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction2(insert))
  
    __obj.asInstanceOf[_IInsert[Iterator]]
  }
}

