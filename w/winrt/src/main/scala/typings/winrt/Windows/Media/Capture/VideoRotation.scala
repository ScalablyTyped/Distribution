package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Media.Capture.VideoRotation.clockwise180Degrees
import typings.winrt.Windows.Media.Capture.VideoRotation.clockwise270Degrees
import typings.winrt.Windows.Media.Capture.VideoRotation.clockwise90Degrees
import typings.winrt.Windows.Media.Capture.VideoRotation.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoRotation extends js.Object

@JSGlobal("Windows.Media.Capture.VideoRotation")
@js.native
object VideoRotation extends js.Object {
  @js.native
  sealed trait clockwise180Degrees extends VideoRotation
  
  @js.native
  sealed trait clockwise270Degrees extends VideoRotation
  
  @js.native
  sealed trait clockwise90Degrees extends VideoRotation
  
  @js.native
  sealed trait none extends VideoRotation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoRotation with Double] = js.native
  /* 2 */ @js.native
  object clockwise180Degrees extends TopLevel[clockwise180Degrees with Double]
  
  /* 3 */ @js.native
  object clockwise270Degrees extends TopLevel[clockwise270Degrees with Double]
  
  /* 1 */ @js.native
  object clockwise90Degrees extends TopLevel[clockwise90Degrees with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

