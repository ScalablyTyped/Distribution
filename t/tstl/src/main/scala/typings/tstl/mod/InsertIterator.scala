package typings.tstl.mod

import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.iinsertMod.IInsert
import typings.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "InsertIterator")
@js.native
class InsertIterator[Container /* <: IInsert[Iterator] */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] protected ()
  extends typings.tstl.tstlModuleMod.InsertIterator[Container, Iterator] {
  /**
    * Initializer Constructor.
    *
    * @param container Target container to insert.
    * @param it Iterator to the position to insert.
    */
  def this(container: Container, it: Iterator) = this()
}

