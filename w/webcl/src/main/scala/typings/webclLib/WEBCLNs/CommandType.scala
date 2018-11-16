package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommandType extends js.Object

/* cl_command_type */
@JSGlobal("WEBCL.CommandType")
@js.native
object CommandType extends js.Object {
  @js.native
  sealed trait COMMAND_COPY_BUFFER
    extends webclLib.WEBCLNs.CommandType
  
  @js.native
  sealed trait COMMAND_COPY_BUFFER_RECT
    extends webclLib.WEBCLNs.CommandType
  
  @js.native
  sealed trait COMMAND_COPY_BUFFER_TO_IMAGE
    extends webclLib.WEBCLNs.CommandType
  
  @js.native
  sealed trait COMMAND_COPY_IMAGE
    extends webclLib.WEBCLNs.CommandType
  
  @js.native
  sealed trait COMMAND_COPY_IMAGE_TO_BUFFER
    extends webclLib.WEBCLNs.CommandType
  
  //COMMAND_MAP_BUFFER                        = 0x11FB, // disallowed
  //COMMAND_MAP_IMAGE                         = 0x11FC, // disallowed
  //COMMAND_UNMAP_MEM_OBJECT                  = 0x11FD, // disallowed
  @js.native
  sealed trait COMMAND_MARKER
    extends webclLib.WEBCLNs.CommandType
  
  @js.native
  sealed trait COMMAND_NDRANGE_KERNEL
    extends webclLib.WEBCLNs.CommandType
  
  //COMMAND_NATIVE_KERNEL                     = 0x11F2, // disallowed
  @js.native
  sealed trait COMMAND_READ_BUFFER
    extends webclLib.WEBCLNs.CommandType
  
  //COMMAND_ACQUIRE_GL_OBJECTS                = 0x11FF, // moved to extension
  //COMMAND_RELEASE_GL_OBJECTS                = 0x1200, // moved to extension
  @js.native
  sealed trait COMMAND_READ_BUFFER_RECT
    extends webclLib.WEBCLNs.CommandType
  
  @js.native
  sealed trait COMMAND_READ_IMAGE
    extends webclLib.WEBCLNs.CommandType
  
  @js.native
  sealed trait COMMAND_TASK
    extends webclLib.WEBCLNs.CommandType
  
  @js.native
  sealed trait COMMAND_USER
    extends webclLib.WEBCLNs.CommandType
  
  @js.native
  sealed trait COMMAND_WRITE_BUFFER
    extends webclLib.WEBCLNs.CommandType
  
  @js.native
  sealed trait COMMAND_WRITE_BUFFER_RECT
    extends webclLib.WEBCLNs.CommandType
  
  @js.native
  sealed trait COMMAND_WRITE_IMAGE
    extends webclLib.WEBCLNs.CommandType
  
  /* 0x11F5 */ val COMMAND_COPY_BUFFER: COMMAND_COPY_BUFFER with scala.Double = js.native
  /* 0x1203 */ val COMMAND_COPY_BUFFER_RECT: COMMAND_COPY_BUFFER_RECT with scala.Double = js.native
  /* 0x11FA */ val COMMAND_COPY_BUFFER_TO_IMAGE: COMMAND_COPY_BUFFER_TO_IMAGE with scala.Double = js.native
  /* 0x11F8 */ val COMMAND_COPY_IMAGE: COMMAND_COPY_IMAGE with scala.Double = js.native
  /* 0x11F9 */ val COMMAND_COPY_IMAGE_TO_BUFFER: COMMAND_COPY_IMAGE_TO_BUFFER with scala.Double = js.native
  /* 0x11FE */ val COMMAND_MARKER: COMMAND_MARKER with scala.Double = js.native
  /* 0x11F0 */ val COMMAND_NDRANGE_KERNEL: COMMAND_NDRANGE_KERNEL with scala.Double = js.native
  /* 0x11F3 */ val COMMAND_READ_BUFFER: COMMAND_READ_BUFFER with scala.Double = js.native
  /* 0x1201 */ val COMMAND_READ_BUFFER_RECT: COMMAND_READ_BUFFER_RECT with scala.Double = js.native
  /* 0x11F6 */ val COMMAND_READ_IMAGE: COMMAND_READ_IMAGE with scala.Double = js.native
  /* 0x11F1 */ val COMMAND_TASK: COMMAND_TASK with scala.Double = js.native
  /* 0x1204 */ val COMMAND_USER: COMMAND_USER with scala.Double = js.native
  /* 0x11F4 */ val COMMAND_WRITE_BUFFER: COMMAND_WRITE_BUFFER with scala.Double = js.native
  /* 0x1202 */ val COMMAND_WRITE_BUFFER_RECT: COMMAND_WRITE_BUFFER_RECT with scala.Double = js.native
  /* 0x11F7 */ val COMMAND_WRITE_IMAGE: COMMAND_WRITE_IMAGE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.CommandType with scala.Double] = js.native
}

