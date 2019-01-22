package typings
package tstlLib.iteratorInsertIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/InsertIterator", "InsertIterator")
@js.native
class InsertIterator[T, Container /* <: tstlLib.baseDisposableIPartialContainersMod._IInsert[T, Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator] */] protected ()
  extends tstlLib.baseIteratorUnderscoreInsertIteratorMod._InsertIterator[T, InsertIterator[T, Container, Iterator]] {
  /**
    * Initializer Constructor.
    *
    * @param container Target container to insert.
    * @param it Iterator to the position to insert.
    */
  def this(container: Container, it: Iterator) = this()
  /**
    * @hidden
    */
  var `container_`: js.Any = js.native
  /**
    * @hidden
    */
  var `it_`: js.Any = js.native
}

