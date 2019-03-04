package typings
package tstlLib.baseIteratorSetIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/SetIterator", "SetIterator")
@js.native
class SetIterator[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source] */] protected ()
  extends tstlLib.baseIteratorListIteratorMod.ListIterator[
      Key, 
      Source, 
      SetIterator[Key, Unique, Source], 
      SetReverseIterator[Key, Unique, Source], 
      Key
    ] {
  /**
    * @hidden
    */
  def this(list: tstlLib.baseContainerUnderscoreSetElementListMod._SetElementList[Key, Unique, Source], prev: SetIterator[Key, Unique, Source], next: SetIterator[Key, Unique, Source], key: Key) = this()
  /**
    * @hidden
    */
  var source_ : js.Any = js.native
}

