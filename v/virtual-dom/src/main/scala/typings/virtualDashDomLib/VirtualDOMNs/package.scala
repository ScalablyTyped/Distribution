package typings
package virtualDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VirtualDOMNs {
  type EventHandler = js.Function1[/* repeated */js.Any, scala.Unit]
  type PatchFn[T /* <: stdLib.Element */] = js.Function3[
    /* rootNode */ T, 
    /* patches */ js.Array[VPatch], 
    /* renderOptions */ VPatchOptions[T], 
    T
  ]
  type VChild = js.Array[VTree] | VTree | js.Array[java.lang.String] | java.lang.String
  type VTree = VText | VNode | Widget | Thunk
}
