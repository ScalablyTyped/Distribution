package typings.tstl.baseContainerSetContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SetContainerNs {
  import typings.tstl.baseContainerSetContainerMod.SetContainer
  import typings.tstl.baseIteratorISetIteratorMod.ISetIterator
  import typings.tstl.baseIteratorISetIteratorMod.ISetReverseIterator
  import typings.tstl.utilityPairMod.Pair

  type InsertRet[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: ISetIterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ISetReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] = IteratorT | (Pair[IteratorT, Boolean])
}
