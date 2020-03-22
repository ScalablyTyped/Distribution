package typings.tstl.hashMultiMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HashMultiMap {
  /**
    * Iterator of {@link HashMultiMap}
    */
  type Iterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.Iterator[
    Key, 
    T, 
    typings.tstl.tstlBooleans.`false`, 
    typings.tstl.hashMultiMapMod.HashMultiMap[Key, T]
  ]
  /**
    * Reverse iterator of {@link HashMultiMap}
    */
  type ReverseIterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
    Key, 
    T, 
    typings.tstl.tstlBooleans.`false`, 
    typings.tstl.hashMultiMapMod.HashMultiMap[Key, T]
  ]
}
