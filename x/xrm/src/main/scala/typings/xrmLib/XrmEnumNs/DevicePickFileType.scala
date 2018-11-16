package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DevicePickFileType extends js.Object

/**
     * Constant Enum: Posible file types for Xrm.Device.pickFile options
     * @see {@link Xrm.Device.PickFileTypes}
     */
@JSGlobal("XrmEnum.DevicePickFileType")
@js.native
object DevicePickFileType extends js.Object {
  @js.native
  sealed trait Audio
    extends xrmLib.XrmEnumNs.DevicePickFileType
  
  @js.native
  sealed trait Image
    extends xrmLib.XrmEnumNs.DevicePickFileType
  
  @js.native
  sealed trait Video
    extends xrmLib.XrmEnumNs.DevicePickFileType
  
  /* "audio" */ val Audio: Audio with java.lang.String = js.native
  /* "image" */ val Image: Image with java.lang.String = js.native
  /* "vidoe" */ val Video: Video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.DevicePickFileType with java.lang.String] = js.native
}

