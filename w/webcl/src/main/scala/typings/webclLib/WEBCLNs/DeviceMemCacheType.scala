package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceMemCacheType extends js.Object

/* cl_device_MEM_CACHE_type */
@JSGlobal("WEBCL.DeviceMemCacheType")
@js.native
object DeviceMemCacheType extends js.Object {
  @js.native
  sealed trait NONE
    extends webclLib.WEBCLNs.DeviceMemCacheType
  
  @js.native
  sealed trait READ_ONLY_CACHE
    extends webclLib.WEBCLNs.DeviceMemCacheType
  
  @js.native
  sealed trait READ_WRITE_CACHE
    extends webclLib.WEBCLNs.DeviceMemCacheType
  
  /* 0x0 */ val NONE: NONE with scala.Double = js.native
  /* 0x1 */ val READ_ONLY_CACHE: READ_ONLY_CACHE with scala.Double = js.native
  /* 0x2 */ val READ_WRITE_CACHE: READ_WRITE_CACHE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.DeviceMemCacheType with scala.Double] = js.native
}

