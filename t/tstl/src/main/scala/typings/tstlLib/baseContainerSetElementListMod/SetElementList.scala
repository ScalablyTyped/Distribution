package typings
package tstlLib.baseContainerSetElementListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/SetElementList", "SetElementList")
@js.native
class SetElementList[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[
Key, 
Unique, 
Source, 
tstlLib.baseContainerSetElementListMod.SetElementListNs.Iterator[Key, Unique, Source], 
tstlLib.baseContainerSetElementListMod.SetElementListNs.ReverseIterator[Key, Unique, Source]] */] protected ()
  extends tstlLib.baseContainerListContainerMod.ListContainer[
      Key, 
      Source, 
      tstlLib.baseContainerSetElementListMod.SetElementListNs.Iterator[Key, Unique, Source], 
      tstlLib.baseContainerSetElementListMod.SetElementListNs.ReverseIterator[Key, Unique, Source]
    ] {
  def this(associative: Source) = this()
  /**
    * @hidden
    */
  var associative_ : js.Any = js.native
  def associative(): Source = js.native
}

