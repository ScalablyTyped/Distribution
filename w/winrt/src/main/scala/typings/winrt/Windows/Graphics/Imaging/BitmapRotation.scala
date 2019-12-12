package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Graphics.Imaging.BitmapRotation.clockwise180Degrees
import typings.winrt.Windows.Graphics.Imaging.BitmapRotation.clockwise270Degrees
import typings.winrt.Windows.Graphics.Imaging.BitmapRotation.clockwise90Degrees
import typings.winrt.Windows.Graphics.Imaging.BitmapRotation.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapRotation extends js.Object

@JSGlobal("Windows.Graphics.Imaging.BitmapRotation")
@js.native
object BitmapRotation extends js.Object {
  @js.native
  sealed trait clockwise180Degrees extends BitmapRotation
  
  @js.native
  sealed trait clockwise270Degrees extends BitmapRotation
  
  @js.native
  sealed trait clockwise90Degrees extends BitmapRotation
  
  @js.native
  sealed trait none extends BitmapRotation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapRotation with Double] = js.native
  /* 2 */ @js.native
  object clockwise180Degrees extends TopLevel[clockwise180Degrees with Double]
  
  /* 3 */ @js.native
  object clockwise270Degrees extends TopLevel[clockwise270Degrees with Double]
  
  /* 1 */ @js.native
  object clockwise90Degrees extends TopLevel[clockwise90Degrees with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

