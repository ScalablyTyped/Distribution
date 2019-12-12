package typings.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.flipHorizontal
import typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.flipVertical
import typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.normal
import typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate180
import typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate270
import typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate90
import typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.transpose
import typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.transverse
import typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.unspecified
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoOrientation with Double] = js.native
  /* 2 */ @js.native
  object flipHorizontal extends TopLevel[flipHorizontal with Double]
  
  /* 4 */ @js.native
  object flipVertical extends TopLevel[flipVertical with Double]
  
  /* 1 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 3 */ @js.native
  object rotate180 extends TopLevel[rotate180 with Double]
  
  /* 6 */ @js.native
  object rotate270 extends TopLevel[rotate270 with Double]
  
  /* 8 */ @js.native
  object rotate90 extends TopLevel[rotate90 with Double]
  
  /* 5 */ @js.native
  object transpose extends TopLevel[transpose with Double]
  
  /* 7 */ @js.native
  object transverse extends TopLevel[transverse with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

