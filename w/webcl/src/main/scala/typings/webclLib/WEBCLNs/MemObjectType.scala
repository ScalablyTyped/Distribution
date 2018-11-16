package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MemObjectType extends js.Object

/* cl_meobject_type */
@JSGlobal("WEBCL.MemObjectType")
@js.native
object MemObjectType extends js.Object {
  @js.native
  sealed trait MEM_OBJECT_BUFFER
    extends webclLib.WEBCLNs.MemObjectType
  
  @js.native
  sealed trait MEM_OBJECT_IMAGE2D
    extends webclLib.WEBCLNs.MemObjectType
  
  @js.native
  sealed trait MEM_OBJECT_IMAGE3D
    extends webclLib.WEBCLNs.MemObjectType
  
  /* 0x10F0 */ val MEM_OBJECT_BUFFER: MEM_OBJECT_BUFFER with scala.Double = js.native
  /* 0x10F1 */ val MEM_OBJECT_IMAGE2D: MEM_OBJECT_IMAGE2D with scala.Double = js.native
  /* 0x10F2 */ val MEM_OBJECT_IMAGE3D: MEM_OBJECT_IMAGE3D with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.MemObjectType with scala.Double] = js.native
}

