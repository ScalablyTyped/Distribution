package typings
package tstlLib.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container", "ForwardList")
@js.native
object ForwardListNs extends js.Object {
  /**
    * Iterator of the ForwardList.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  class Iterator[T] protected ()
    extends tstlLib.containerForwardListMod.ForwardListNs.Iterator[T] {
    def this(source: tstlLib.functionalIPointerMod.IPointer[tstlLib.containerForwardListMod.ForwardList[T]], next: tstlLib.containerForwardListMod.ForwardListNs.Iterator[T], value: T) = this()
  }
  
}

