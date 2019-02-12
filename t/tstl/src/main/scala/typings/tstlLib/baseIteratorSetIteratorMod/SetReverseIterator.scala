package typings
package tstlLib.baseIteratorSetIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/SetIterator", "SetReverseIterator")
@js.native
class SetReverseIterator[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source] */] protected ()
  extends tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[
      Key, 
      Source, 
      SetIterator[Key, Unique, Source], 
      SetReverseIterator[Key, Unique, Source], 
      Key
    ] {
  /**
    * Initializer Constructor.
    *
    * @param base The base iterator.
    */
  def this(base: SetIterator[Key, Unique, Source]) = this()
}

