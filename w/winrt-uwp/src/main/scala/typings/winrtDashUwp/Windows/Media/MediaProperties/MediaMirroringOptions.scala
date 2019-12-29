package typings.winrtDashUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaMirroringOptions extends js.Object

/** Defines the direction in of a mirror transform. */
@JSGlobal("Windows.Media.MediaProperties.MediaMirroringOptions")
@js.native
object MediaMirroringOptions extends js.Object {
  /** Mirror horizontally. */
  @js.native
  sealed trait horizontal extends MediaMirroringOptions
  
  /** No mirroring. */
  @js.native
  sealed trait none extends MediaMirroringOptions
  
  /** Mirror vertically. */
  @js.native
  sealed trait vertical extends MediaMirroringOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaMirroringOptions with Double] = js.native
  /* 1 */ @js.native
  object horizontal extends TopLevel[horizontal with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object vertical extends TopLevel[vertical with Double]
  
}

