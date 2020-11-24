package typings.tstl.setContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object SetContainer {
  
  /**
    * Return type of {@link SetContainer.insert}
    */
  type InsertRet[Key, Unique /* <: scala.Boolean */, Source /* <: typings.tstl.setContainerMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: typings.tstl.setContainerMod.SetContainer.Iterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: typings.tstl.setContainerMod.SetContainer.ReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] = IteratorT | (typings.tstl.pairMod.Pair[IteratorT, scala.Boolean])
}
