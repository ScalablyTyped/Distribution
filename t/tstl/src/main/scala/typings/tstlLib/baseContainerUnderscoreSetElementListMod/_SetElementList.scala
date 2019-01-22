package typings
package tstlLib.baseContainerUnderscoreSetElementListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/_SetElementList", "_SetElementList")
@js.native
class _SetElementList[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source] */] protected ()
  extends tstlLib.baseContainerListContainerMod.ListContainer[
      Key, 
      Source, 
      tstlLib.baseIteratorSetIteratorMod.SetIterator[Key, Unique, Source], 
      tstlLib.baseIteratorSetIteratorMod.SetReverseIterator[Key, Unique, Source]
    ] {
  def this(associative: Source) = this()
  /**
    * @hidden
    */
  var `associative_`: js.Any = js.native
  def associative(): Source = js.native
}

