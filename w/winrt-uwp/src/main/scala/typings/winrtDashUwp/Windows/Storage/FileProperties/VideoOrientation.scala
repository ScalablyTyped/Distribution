package typings.winrtDashUwp.Windows.Storage.FileProperties

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Storage.FileProperties.VideoOrientation.normal
import typings.winrtDashUwp.Windows.Storage.FileProperties.VideoOrientation.rotate180
import typings.winrtDashUwp.Windows.Storage.FileProperties.VideoOrientation.rotate270
import typings.winrtDashUwp.Windows.Storage.FileProperties.VideoOrientation.rotate90
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoOrientation extends js.Object

/** Indicates how to rotate the video to display it correctly. */
@JSGlobal("Windows.Storage.FileProperties.VideoOrientation")
@js.native
object VideoOrientation extends js.Object {
  /** No rotation needed. The video can be displayed using its current orientation. */
  @js.native
  sealed trait normal extends VideoOrientation
  
  /** Rotate the video counter-clockwise 180 degrees. */
  @js.native
  sealed trait rotate180 extends VideoOrientation
  
  /** Rotate the video counter-clockwise 270 degrees. */
  @js.native
  sealed trait rotate270 extends VideoOrientation
  
  /** Rotate the video 90 degrees. */
  @js.native
  sealed trait rotate90 extends VideoOrientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoOrientation with Double] = js.native
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 2 */ @js.native
  object rotate180 extends TopLevel[rotate180 with Double]
  
  /* 3 */ @js.native
  object rotate270 extends TopLevel[rotate270 with Double]
  
  /* 1 */ @js.native
  object rotate90 extends TopLevel[rotate90 with Double]
  
}

