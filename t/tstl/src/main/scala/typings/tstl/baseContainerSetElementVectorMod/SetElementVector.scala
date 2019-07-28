package typings.tstl.baseContainerSetElementVectorMod

import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator
import typings.tstl.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator
import typings.tstl.baseContainerVectorContainerMod.VectorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/SetElementVector", "SetElementVector")
@js.native
class SetElementVector[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends VectorContainer[
      Key, 
      Source, 
      SetElementVector[Key, Unique, Source], 
      Iterator[Key, Unique, Source], 
      ReverseIterator[Key, Unique, Source], 
      Key
    ] {
  def this(associative: Source) = this()
  var associative_ : js.Any = js.native
  def associative(): Source = js.native
}

