package typings.winrtDashUwp.Windows.Foundation.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Platform extends js.Object

/** Specifies the platforms that a specified type should be supported in, as used by Windows Runtime attributes and metadata. */
@JSGlobal("Windows.Foundation.Metadata.Platform")
@js.native
object Platform extends js.Object {
  /** For use by Windows metadata. */
  @js.native
  sealed trait windows extends Platform
  
  /** For use by Windows Phone metadata. */
  @js.native
  sealed trait windowsPhone extends Platform
  
  /* 0 */ val windows: typings.winrtDashUwp.Windows.Foundation.Metadata.Platform.windows with Double = js.native
  /* 1 */ val windowsPhone: typings.winrtDashUwp.Windows.Foundation.Metadata.Platform.windowsPhone with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Platform with Double] = js.native
}

