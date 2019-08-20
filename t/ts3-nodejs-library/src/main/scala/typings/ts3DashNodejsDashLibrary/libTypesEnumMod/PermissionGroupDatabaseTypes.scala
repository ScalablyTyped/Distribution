package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PermissionGroupDatabaseTypes extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "PermissionGroupDatabaseTypes")
@js.native
object PermissionGroupDatabaseTypes extends js.Object {
  /** global query group (used for ServerQuery clients) */
  @js.native
  sealed trait Query extends PermissionGroupDatabaseTypes
  
  /** regular group (used for regular clients) */
  @js.native
  sealed trait Regular extends PermissionGroupDatabaseTypes
  
  /** template group (used for new virtual servers) */
  @js.native
  sealed trait Template extends PermissionGroupDatabaseTypes
  
  /* 2 */ val Query: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes.Query with Double = js.native
  /* 1 */ val Regular: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes.Regular with Double = js.native
  /* 0 */ val Template: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes.Template with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PermissionGroupDatabaseTypes with Double] = js.native
}

