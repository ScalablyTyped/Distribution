package typings.tstl.treeMultiSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TreeMultiSet {
  /**
    * Iterator of {@link TreeMultiSet}
    */
  type Iterator[Key] = typings.tstl.setElementListMod.SetElementList.Iterator[
    Key, 
    typings.tstl.tstlBooleans.`false`, 
    typings.tstl.treeMultiSetMod.TreeMultiSet[Key]
  ]
  /**
    * Reverse iterator of {@link TreeMultiSet}
    */
  type ReverseIterator[Key] = typings.tstl.setElementListMod.SetElementList.ReverseIterator[
    Key, 
    typings.tstl.tstlBooleans.`false`, 
    typings.tstl.treeMultiSetMod.TreeMultiSet[Key]
  ]
}
