package typings.virtualDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VirtualDOM {
  type EventHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
  type PatchFn[T /* <: typings.std.Element */] = js.Function3[
    /* rootNode */ T, 
    /* patches */ js.Array[typings.virtualDom.VirtualDOM.VPatch], 
    /* renderOptions */ typings.virtualDom.VirtualDOM.VPatchOptions[T], 
    T
  ]
  type VChild = (js.Array[java.lang.String | typings.virtualDom.VirtualDOM.VTree]) | typings.virtualDom.VirtualDOM.VTree | java.lang.String
}
