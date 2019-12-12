package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Graphics.Imaging.ExifOrientationMode.ignoreExifOrientation
import typings.winrt.Windows.Graphics.Imaging.ExifOrientationMode.respectExifOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExifOrientationMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.ExifOrientationMode")
@js.native
object ExifOrientationMode extends js.Object {
  @js.native
  sealed trait ignoreExifOrientation extends ExifOrientationMode
  
  @js.native
  sealed trait respectExifOrientation extends ExifOrientationMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExifOrientationMode with Double] = js.native
  /* 0 */ @js.native
  object ignoreExifOrientation extends TopLevel[ignoreExifOrientation with Double]
  
  /* 1 */ @js.native
  object respectExifOrientation extends TopLevel[respectExifOrientation with Double]
  
}

