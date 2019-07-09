package typings
package tstlLib.baseContainerMultiSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MultiSet", "MultiSet")
@js.native
abstract class MultiSet[Key, Source /* <: MultiSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: tstlLib.baseIteratorISetIteratorMod.ISetIterator[Key, tstlLib.tstlLibNumbers.`false`, Source, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.baseIteratorISetIteratorMod.ISetReverseIterator[Key, tstlLib.tstlLibNumbers.`false`, Source, IteratorT, ReverseT] */] ()
  extends tstlLib.baseContainerSetContainerMod.SetContainer[Key, tstlLib.tstlLibNumbers.`false`, Source, IteratorT, ReverseT] {
  /**
    * @hidden
    */
  /* protected */ def _Key_eq(x: Key, y: Key): scala.Boolean = js.native
}

