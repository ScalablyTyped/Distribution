package typings
package tstlLib.baseContainerUniqueSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/UniqueSet", "UniqueSet")
@js.native
abstract class UniqueSet[Key, Source /* <: UniqueSet[Key, Source] */] ()
  extends tstlLib.baseContainerSetContainerMod.SetContainer[Key, tstlLib.tstlLibNumbers.`true`, Source] {
  /**
    * @hidden
    */
  var _Extract_by_iterator: js.Any = js.native
  /**
    * @hidden
    */
  var _Extract_by_val: js.Any = js.native
  /**
    * Extract an element by iterator.
    *
    * @param pos The iterator to the element for extraction.
    * @return Iterator following the *pos*, strained by the extraction.
    */
  def extract(it: tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, tstlLib.tstlLibNumbers.`true`, Source]): tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, tstlLib.tstlLibNumbers.`true`, Source] = js.native
  /**
    * Extract an element by key.
    *
    * @param key Key to search for.
    * @return The extracted element.
    */
  def extract(key: Key): Key = js.native
}

