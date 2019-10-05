package typings.winrt.Windows.Storage.FileProperties

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
  
  /* 2 */ val flipHorizontal: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.flipHorizontal with Double = js.native
  /* 4 */ val flipVertical: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.flipVertical with Double = js.native
  /* 1 */ val normal: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.normal with Double = js.native
  /* 3 */ val rotate180: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate180 with Double = js.native
  /* 6 */ val rotate270: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate270 with Double = js.native
  /* 8 */ val rotate90: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate90 with Double = js.native
  /* 5 */ val transpose: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.transpose with Double = js.native
  /* 7 */ val transverse: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.transverse with Double = js.native
  /* 0 */ val unspecified: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoOrientation with Double] = js.native
}

