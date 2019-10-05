package typings.winrtDashUwp.Windows.Media.MediaProperties

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
  
  /* 1 */ val horizontal: typings.winrtDashUwp.Windows.Media.MediaProperties.MediaMirroringOptions.horizontal with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Media.MediaProperties.MediaMirroringOptions.none with Double = js.native
  /* 2 */ val vertical: typings.winrtDashUwp.Windows.Media.MediaProperties.MediaMirroringOptions.vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaMirroringOptions with Double] = js.native
}

