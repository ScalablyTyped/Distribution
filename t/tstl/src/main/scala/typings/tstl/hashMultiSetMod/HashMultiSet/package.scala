package typings.tstl.hashMultiSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HashMultiSet {
  /**
    * Iterator of {@link HashMultiSet}
    */
  type Iterator[Key] = typings.tstl.setElementListMod.SetElementList.Iterator[
    Key, 
    typings.tstl.tstlBooleans.`false`, 
    typings.tstl.hashMultiSetMod.HashMultiSet[Key]
  ]
  /**
    * Reverse iterator of {@link HashMultiSet}
    */
  type ReverseIterator[Key] = typings.tstl.setElementListMod.SetElementList.ReverseIterator[
    Key, 
    typings.tstl.tstlBooleans.`false`, 
    typings.tstl.hashMultiSetMod.HashMultiSet[Key]
  ]
}
