package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClosedCaptionEdgeEffect extends js.Object

/** Specifies the edge effect of closed caption text. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect")
@js.native
object ClosedCaptionEdgeEffect extends js.Object {
  /** The default edge effect. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionEdgeEffect
  
  /** Depressed edge. */
  @js.native
  sealed trait depressed
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionEdgeEffect
  
  /** Drop shadow. */
  @js.native
  sealed trait dropShadow
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionEdgeEffect
  
  /** No edge effect. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionEdgeEffect
  
  /** Raised edge. */
  @js.native
  sealed trait raised
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionEdgeEffect
  
  /** Uniform edge */
  @js.native
  sealed trait uniform
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionEdgeEffect
  
  val default: default with java.lang.String = js.native
  val depressed: depressed with java.lang.String = js.native
  val dropShadow: dropShadow with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val raised: raised with java.lang.String = js.native
  val uniform: uniform with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionEdgeEffect with java.lang.String
  ] = js.native
}

