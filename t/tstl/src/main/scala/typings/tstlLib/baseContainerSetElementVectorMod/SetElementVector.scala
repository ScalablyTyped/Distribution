package typings
package tstlLib.baseContainerSetElementVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/SetElementVector", "SetElementVector")
@js.native
class SetElementVector[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[
Key, 
Unique, 
Source, 
tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[Key, Unique, Source], 
tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[Key, Unique, Source]] */] protected ()
  extends tstlLib.baseContainerVectorContainerMod.VectorContainer[
      Key, 
      Source, 
      SetElementVector[Key, Unique, Source], 
      tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[Key, Unique, Source], 
      tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[Key, Unique, Source], 
      Key
    ] {
  def this(associative: Source) = this()
  var associative_ : js.Any = js.native
  def associative(): Source = js.native
}

