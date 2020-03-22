package typings.tstl.hashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HashMap {
  /**
    * Iterator of {@link HashMap}
    */
  type Iterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, typings.tstl.tstlBooleans.`true`, typings.tstl.hashMapMod.HashMap[Key, T]]
  /**
    * Reverse iterator of {@link HashMap}
    */
  type ReverseIterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.ReverseIterator[Key, T, typings.tstl.tstlBooleans.`true`, typings.tstl.hashMapMod.HashMap[Key, T]]
}
