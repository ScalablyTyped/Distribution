package typings.winrtUwp.Windows.Media.Editing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VideoFramePrecision extends js.Object
/** Used to specify the frame precision algorithm when retrieving a thumbnail. */
@JSGlobal("Windows.Media.Editing.VideoFramePrecision")
@js.native
object VideoFramePrecision extends js.Object {
  
  /** Use a more precise algorithm to get a thumbnail to the nearest frame. */
  @js.native
  sealed trait nearestFrame extends VideoFramePrecision
  
  /** Use a faster but less precise algorithm to get the thumbnail. */
  @js.native
  sealed trait nearestKeyFrame extends VideoFramePrecision
}
