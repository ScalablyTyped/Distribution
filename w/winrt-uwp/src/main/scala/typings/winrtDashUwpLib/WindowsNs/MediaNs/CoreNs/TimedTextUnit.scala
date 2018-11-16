package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedTextUnit extends js.Object

/** Specifies the units in which timed a timed text style value is expressed. */
@JSGlobal("Windows.Media.Core.TimedTextUnit")
@js.native
object TimedTextUnit extends js.Object {
  /** The style value is expressed as a percentage. */
  @js.native
  sealed trait percentage
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextUnit
  
  /** The style value is expressed in pixels. */
  @js.native
  sealed trait pixels
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextUnit
  
  val percentage: percentage with java.lang.String = js.native
  val pixels: pixels with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextUnit with java.lang.String] = js.native
}

