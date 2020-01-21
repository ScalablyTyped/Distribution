package typings.tstl

import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.iinsertMod.IInsert
import typings.tstl.insertIteratorBaseMod.InsertIteratorBase
import typings.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/InsertIterator", JSImport.Namespace)
@js.native
object insertIteratorMod extends js.Object {
  @js.native
  class InsertIterator[Container /* <: IInsert[Iterator] */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] protected () extends InsertIteratorBase[ValueType[Iterator], InsertIterator[Container, Iterator]] {
    /**
      * Initializer Constructor.
      *
      * @param container Target container to insert.
      * @param it Iterator to the position to insert.
      */
    def this(container: Container, it: Iterator) = this()
    var container_ : js.Any = js.native
    var it_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    @JSName("value")
    def value_MInsertIterator(`val`: ValueType[Iterator]): js.Any = js.native
  }
  
}

