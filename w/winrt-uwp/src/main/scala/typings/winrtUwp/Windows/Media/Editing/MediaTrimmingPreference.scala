package typings.winrtUwp.Windows.Media.Editing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaTrimmingPreference extends js.Object

/** Used to specify if media trimming should use a faster or a more precise algorithm during transcoding. */
@JSGlobal("Windows.Media.Editing.MediaTrimmingPreference")
@js.native
object MediaTrimmingPreference extends js.Object {
  /** Use the faster trimming algorithm during transcoding. */
  @js.native
  sealed trait fast extends MediaTrimmingPreference
  
  /** Use the more precise trimming algorithm during transcoding. */
  @js.native
  sealed trait precise extends MediaTrimmingPreference
  
}

