package typings.winrt.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoOrientation extends js.Object

@JSGlobal("Windows.Storage.FileProperties.PhotoOrientation")
@js.native
object PhotoOrientation extends js.Object {
  @js.native
  sealed trait flipHorizontal extends PhotoOrientation
  
  @js.native
  sealed trait flipVertical extends PhotoOrientation
  
  @js.native
  sealed trait normal extends PhotoOrientation
  
  @js.native
  sealed trait rotate180 extends PhotoOrientation
  
  @js.native
  sealed trait rotate270 extends PhotoOrientation
  
  @js.native
  sealed trait rotate90 extends PhotoOrientation
  
  @js.native
  sealed trait transpose extends PhotoOrientation
  
  @js.native
  sealed trait transverse extends PhotoOrientation
  
  @js.native
  sealed trait unspecified extends PhotoOrientation
  
  /* 2 */ val flipHorizontal: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation.flipHorizontal with Double = js.native
  /* 4 */ val flipVertical: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation.flipVertical with Double = js.native
  /* 1 */ val normal: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation.normal with Double = js.native
  /* 3 */ val rotate180: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation.rotate180 with Double = js.native
  /* 6 */ val rotate270: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation.rotate270 with Double = js.native
  /* 8 */ val rotate90: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation.rotate90 with Double = js.native
  /* 5 */ val transpose: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation.transpose with Double = js.native
  /* 7 */ val transverse: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation.transverse with Double = js.native
  /* 0 */ val unspecified: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoOrientation with Double] = js.native
}

