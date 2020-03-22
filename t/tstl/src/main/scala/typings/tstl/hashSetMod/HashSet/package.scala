package typings.tstl.hashSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HashSet {
  /**
    * Iterator of {@link HashSet}
    */
  type Iterator[Key] = typings.tstl.setElementListMod.SetElementList.Iterator[Key, typings.tstl.tstlBooleans.`true`, typings.tstl.hashSetMod.HashSet[Key]]
  /**
    * Reverse iterator of {@link HashSet}
    */
  type ReverseIterator[Key] = typings.tstl.setElementListMod.SetElementList.ReverseIterator[Key, typings.tstl.tstlBooleans.`true`, typings.tstl.hashSetMod.HashSet[Key]]
}
