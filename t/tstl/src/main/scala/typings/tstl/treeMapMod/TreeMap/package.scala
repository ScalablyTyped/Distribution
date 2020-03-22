package typings.tstl.treeMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TreeMap {
  /**
    * Iterator of {@link TreeMap}
    */
  type Iterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, typings.tstl.tstlBooleans.`true`, typings.tstl.treeMapMod.TreeMap[Key, T]]
  /**
    * Reverse iterator of {@link TreeMap}
    */
  type ReverseIterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.ReverseIterator[Key, T, typings.tstl.tstlBooleans.`true`, typings.tstl.treeMapMod.TreeMap[Key, T]]
}
