package typings.tstl

import typings.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/InsertIteratorBase", JSImport.Namespace)
@js.native
object insertIteratorBaseMod extends js.Object {
  @js.native
  abstract class InsertIteratorBase[T, This /* <: InsertIteratorBase[T, This] */] () extends IForwardIterator[T, This] {
    /**
      * Set value.
      *
      * @param val The value to set.
      */
    @JSName("value")
    def value_MInsertIteratorBase(`val`: T): js.Any = js.native
  }
  
}

