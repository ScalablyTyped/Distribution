package typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs

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
  sealed trait allow extends ContentAccessRestrictionLevel
  
  /** Can be shown in the content catalog, but will be blocked by RequestContentAccessAsync . */
  @js.native
  sealed trait block extends ContentAccessRestrictionLevel
  
  /** Can't be shown in the content catalog. It's rating is higher than the user's settings, determined by MaxBrowsableAgeRating . */
  @js.native
  sealed trait hide extends ContentAccessRestrictionLevel
  
  /** (Xbox only) If multiple users are logged in and the content is blocked for at least one user, content is allowed with a warning displayed. */
  @js.native
  sealed trait warn extends ContentAccessRestrictionLevel
  
  /* 0 */ val allow: typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs.ContentAccessRestrictionLevel.allow with Double = js.native
  /* 2 */ val block: typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs.ContentAccessRestrictionLevel.block with Double = js.native
  /* 3 */ val hide: typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs.ContentAccessRestrictionLevel.hide with Double = js.native
  /* 1 */ val warn: typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs.ContentAccessRestrictionLevel.warn with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentAccessRestrictionLevel with Double] = js.native
}

