package typings.tstl.iteratorInsertIteratorMod

import typings.tstl.baseDisposableIPartialContainersMod._IInsert
import typings.tstl.baseIteratorUnderscoreInsertIteratorMod._InsertIterator
import typings.tstl.functionalIPointerMod.IPointerNs.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/InsertIterator", "InsertIterator")
@js.native
class InsertIterator[Container /* <: _IInsert[Iterator] */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] protected () extends _InsertIterator[ValueType[Iterator], InsertIterator[Container, Iterator]] {
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
  var container_ : js.Any = js.native
  /**
    * @hidden
    */
  var it_ : js.Any = js.native
}

