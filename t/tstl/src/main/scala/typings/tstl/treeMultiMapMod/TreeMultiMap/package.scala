package typings.tstl.treeMultiMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TreeMultiMap {
  /**
    * Iterator of {@link TreeMultiMap}
    */
  type Iterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.Iterator[
    Key, 
    T, 
    typings.tstl.tstlBooleans.`false`, 
    typings.tstl.treeMultiMapMod.TreeMultiMap[Key, T]
  ]
  /**
    * Iterator of {@link TreeMultiMap}
    */
  type ReverseIterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
    Key, 
    T, 
    typings.tstl.tstlBooleans.`false`, 
    typings.tstl.treeMultiMapMod.TreeMultiMap[Key, T]
  ]
}
