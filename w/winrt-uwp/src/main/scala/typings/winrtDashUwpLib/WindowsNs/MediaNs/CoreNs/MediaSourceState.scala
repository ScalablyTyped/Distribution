package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaSourceState extends js.Object

/** Specifies the state of a MediaSource . */
@JSGlobal("Windows.Media.Core.MediaSourceState")
@js.native
object MediaSourceState extends js.Object {
  /** The MediaSource has been closed. */
  @js.native
  sealed trait closed
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSourceState
  
  /** The MediaSource failed to open the associated media content. */
  @js.native
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSourceState
  
  /** The MediaSource has been initialized. */
  @js.native
  sealed trait initial
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSourceState
  
  /** The MediaSource has successfully opened the associated media content. */
  @js.native
  sealed trait opened
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSourceState
  
  /** The MediaSource is in the process of opening the associated media content. */
  @js.native
  sealed trait opening
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSourceState
  
  val closed: closed with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val initial: initial with java.lang.String = js.native
  val opened: opened with java.lang.String = js.native
  val opening: opening with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaSourceState with java.lang.String] = js.native
}

