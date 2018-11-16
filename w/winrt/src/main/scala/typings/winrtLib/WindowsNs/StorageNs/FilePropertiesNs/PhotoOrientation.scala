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
  
  val flipHorizontal: flipHorizontal with java.lang.String = js.native
  val flipVertical: flipVertical with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val rotate180: rotate180 with java.lang.String = js.native
  val rotate270: rotate270 with java.lang.String = js.native
  val rotate90: rotate90 with java.lang.String = js.native
  val transpose: transpose with java.lang.String = js.native
  val transverse: transverse with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation with java.lang.String
  ] = js.native
}

