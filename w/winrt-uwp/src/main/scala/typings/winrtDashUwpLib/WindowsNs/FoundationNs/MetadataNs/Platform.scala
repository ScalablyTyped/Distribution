package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs

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
  sealed trait windows
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.Platform
  
  /** For use by Windows Phone metadata. */
  @js.native
  sealed trait windowsPhone
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.Platform
  
  val windows: windows with java.lang.String = js.native
  val windowsPhone: windowsPhone with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.Platform with java.lang.String] = js.native
}

