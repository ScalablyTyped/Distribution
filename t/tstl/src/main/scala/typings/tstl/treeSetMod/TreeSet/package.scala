package typings.tstl.treeSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TreeSet {
  /**
    * Iterator of {@link TreeSet}
    */
  type Iterator[Key] = typings.tstl.setElementListMod.SetElementList.Iterator[Key, typings.tstl.tstlBooleans.`true`, typings.tstl.treeSetMod.TreeSet[Key]]
  /**
    * Reverse iterator of {@link TreeSet}
    */
  type ReverseIterator[Key] = typings.tstl.setElementListMod.SetElementList.ReverseIterator[Key, typings.tstl.tstlBooleans.`true`, typings.tstl.treeSetMod.TreeSet[Key]]
}
