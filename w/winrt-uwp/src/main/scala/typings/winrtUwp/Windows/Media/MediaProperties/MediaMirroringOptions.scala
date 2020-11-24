package typings.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
