package typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs

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
  sealed trait application extends RatedContentCategory
  
  /** Apps on Windows 8.1 and Xbox. */
  @js.native
  sealed trait game extends RatedContentCategory
  
  /** In-app content for Windows 8.1 and Xbox apps. */
  @js.native
  sealed trait general extends RatedContentCategory
  
  /** In-app content for Windows 8.1 and Xbox apps. */
  @js.native
  sealed trait movie extends RatedContentCategory
  
  /** In-app content for Windows 8.1 and Xbox apps. */
  @js.native
  sealed trait music extends RatedContentCategory
  
  /** In-app content for Windows 8.1 and Xbox apps. */
  @js.native
  sealed trait television extends RatedContentCategory
  
  /* 1 */ val application: typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory.application with Double = js.native
  /* 2 */ val game: typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory.game with Double = js.native
  /* 0 */ val general: typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory.general with Double = js.native
  /* 3 */ val movie: typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory.movie with Double = js.native
  /* 5 */ val music: typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory.music with Double = js.native
  /* 4 */ val television: typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs.RatedContentCategory.television with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RatedContentCategory with Double] = js.native
}

