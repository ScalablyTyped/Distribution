package typings
package tstlLib.iteratorInsertIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/InsertIterator", "InsertIterator")
@js.native
class InsertIterator[Container /* <: tstlLib.baseDisposableIPartialContainersMod._IInsert[Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */] protected ()
  extends tstlLib.baseIteratorUnderscoreInsertIteratorMod._InsertIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
      InsertIterator[Container, Iterator]
    ] {
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

