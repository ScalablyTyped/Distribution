package typings.winrtUwp.Windows.Media.ContentRestrictions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
