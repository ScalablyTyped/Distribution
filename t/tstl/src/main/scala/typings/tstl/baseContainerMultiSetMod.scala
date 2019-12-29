package typings.tstl

import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.baseIteratorISetIteratorMod.ISetIterator
import typings.tstl.baseIteratorISetIteratorMod.ISetReverseIterator
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MultiSet", JSImport.Namespace)
@js.native
object baseContainerMultiSetMod extends js.Object {
  @js.native
  abstract class MultiSet[Key, Source /* <: MultiSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: ISetIterator[Key, `false`, Source, IteratorT, ReverseT] */, ReverseT /* <: ISetReverseIterator[Key, `false`, Source, IteratorT, ReverseT] */] () extends SetContainer[Key, `false`, Source, IteratorT, ReverseT] {
    /**
      * @hidden
      */
    /* protected */ def _Key_eq(x: Key, y: Key): Boolean = js.native
  }
  
}

