package typings.winrtDashUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaPixelFormat extends js.Object

/** Defines values for media pixel formats. */
@JSGlobal("Windows.Media.MediaProperties.MediaPixelFormat")
@js.native
object MediaPixelFormat extends js.Object {
  /** BGRA8 media pixel format. */
  @js.native
  sealed trait bgra8 extends MediaPixelFormat
  
  /** NV12 media pixel format. */
  @js.native
  sealed trait nv12 extends MediaPixelFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaPixelFormat with Double] = js.native
  /* 1 */ @js.native
  object bgra8 extends TopLevel[bgra8 with Double]
  
  /* 0 */ @js.native
  object nv12 extends TopLevel[nv12 with Double]
  
}

