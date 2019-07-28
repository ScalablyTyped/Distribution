package typings.tstl.baseContainerSetElementListMod

import typings.tstl.baseContainerListContainerMod.ListContainer
import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.baseContainerSetElementListMod.SetElementListNs.Iterator
import typings.tstl.baseContainerSetElementListMod.SetElementListNs.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/SetElementList", "SetElementList")
@js.native
class SetElementList[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends ListContainer[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] {
  def this(associative: Source) = this()
  /**
    * @hidden
    */
  var associative_ : js.Any = js.native
  def associative(): Source = js.native
}

