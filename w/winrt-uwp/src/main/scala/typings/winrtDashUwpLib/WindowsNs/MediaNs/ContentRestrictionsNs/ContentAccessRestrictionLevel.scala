package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentAccessRestrictionLevel extends js.Object

/** Specifies how the content is treated, based on the user's content settings. */
@JSGlobal("Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel")
@js.native
object ContentAccessRestrictionLevel extends js.Object {
  /** Can be shown in the content catalog and consumed. */
  @js.native
  sealed trait allow
    extends winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs.ContentAccessRestrictionLevel
  
  /** Can be shown in the content catalog, but will be blocked by RequestContentAccessAsync . */
  @js.native
  sealed trait block
    extends winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs.ContentAccessRestrictionLevel
  
  /** Can't be shown in the content catalog. It's rating is higher than the user's settings, determined by MaxBrowsableAgeRating . */
  @js.native
  sealed trait hide
    extends winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs.ContentAccessRestrictionLevel
  
  /** (Xbox only) If multiple users are logged in and the content is blocked for at least one user, content is allowed with a warning displayed. */
  @js.native
  sealed trait warn
    extends winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs.ContentAccessRestrictionLevel
  
  /* 0 */ val allow: allow with scala.Double = js.native
  /* 2 */ val block: block with scala.Double = js.native
  /* 3 */ val hide: hide with scala.Double = js.native
  /* 1 */ val warn: warn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs.ContentAccessRestrictionLevel with scala.Double
  ] = js.native
}

