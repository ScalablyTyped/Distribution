package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "InsertIterator")
@js.native
class InsertIterator[T, Container /* <: tstlLib.baseDisposableIPartialContainersMod._IInsert[T, Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator] */] protected ()
  extends tstlLib.iteratorMod.InsertIterator[T, Container, Iterator] {
  /**
    * Initializer Constructor.
    *
    * @param container Target container to insert.
    * @param it Iterator to the position to insert.
    */
  def this(container: Container, it: Iterator) = this()
}

