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
  
  val application: application with java.lang.String = js.native
  val game: game with java.lang.String = js.native
  val general: general with java.lang.String = js.native
  val movie: movie with java.lang.String = js.native
  val music: music with java.lang.String = js.native
  val television: television with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory with java.lang.String
  ] = js.native
}

