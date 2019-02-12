package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "InsertIterator")
@js.native
class InsertIterator[Container /* <: tstlLib.baseDisposableIPartialContainersMod._IInsert[Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */] protected ()
  extends tstlLib.iteratorMod.InsertIterator[Container, Iterator] {
  /**
    * Initializer Constructor.
    *
    * @param container Target container to insert.
    * @param it Iterator to the position to insert.
    */
  def this(container: Container, it: Iterator) = this()
}

