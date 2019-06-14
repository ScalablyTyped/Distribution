package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RatedContentCategory extends js.Object

/** Specifies the type of a piece of content. */
@JSGlobal("Windows.Media.ContentRestrictions.RatedContentCategory")
@js.native
object RatedContentCategory extends js.Object {
  /** Apps on Windows 8.1 and Xbox. */
  @js.native
  sealed trait application
    extends winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory
  
  /** Apps on Windows 8.1 and Xbox. */
  @js.native
  sealed trait game
    extends winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory
  
  /** In-app content for Windows 8.1 and Xbox apps. */
  @js.native
  sealed trait general
    extends winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory
  
  /** In-app content for Windows 8.1 and Xbox apps. */
  @js.native
  sealed trait movie
    extends winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory
  
  /** In-app content for Windows 8.1 and Xbox apps. */
  @js.native
  sealed trait music
    extends winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory
  
  /** In-app content for Windows 8.1 and Xbox apps. */
  @js.native
  sealed trait television
    extends winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory
  
  /* 1 */ val application: application with scala.Double = js.native
  /* 2 */ val game: game with scala.Double = js.native
  /* 0 */ val general: general with scala.Double = js.native
  /* 3 */ val movie: movie with scala.Double = js.native
  /* 5 */ val music: music with scala.Double = js.native
  /* 4 */ val television: television with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory with scala.Double
  ] = js.native
}

