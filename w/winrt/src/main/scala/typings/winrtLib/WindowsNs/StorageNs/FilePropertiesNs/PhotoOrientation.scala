package typings
package winrtLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoOrientation extends js.Object

@JSGlobal("Windows.Storage.FileProperties.PhotoOrientation")
@js.native
object PhotoOrientation extends js.Object {
  @js.native
  sealed trait flipHorizontal
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  @js.native
  sealed trait flipVertical
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  @js.native
  sealed trait normal
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  @js.native
  sealed trait rotate180
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  @js.native
  sealed trait rotate270
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  @js.native
  sealed trait rotate90
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  @js.native
  sealed trait transpose
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  @js.native
  sealed trait transverse
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  @js.native
  sealed trait unspecified
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  /* 2 */ val flipHorizontal: flipHorizontal with scala.Double = js.native
  /* 4 */ val flipVertical: flipVertical with scala.Double = js.native
  /* 1 */ val normal: normal with scala.Double = js.native
  /* 3 */ val rotate180: rotate180 with scala.Double = js.native
  /* 6 */ val rotate270: rotate270 with scala.Double = js.native
  /* 8 */ val rotate90: rotate90 with scala.Double = js.native
  /* 5 */ val transpose: transpose with scala.Double = js.native
  /* 7 */ val transverse: transverse with scala.Double = js.native
  /* 0 */ val unspecified: unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation with scala.Double] = js.native
}

