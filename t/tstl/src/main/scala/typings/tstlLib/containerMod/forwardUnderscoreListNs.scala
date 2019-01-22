package typings
package tstlLib.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container", "forward_list")
@js.native
object forwardUnderscoreListNs extends js.Object {
  /**
    * Iterator of the ForwardList.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  class Iterator[T] protected ()
    extends tstlLib.containerForwardListMod.forwardUnderscoreListNs.Iterator[T] {
    def this(source: tstlLib.functionalIPointerMod.IPointer[tstlLib.containerForwardListMod.ForwardList[T]], next: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T], value: T) = this()
  }
  
}

