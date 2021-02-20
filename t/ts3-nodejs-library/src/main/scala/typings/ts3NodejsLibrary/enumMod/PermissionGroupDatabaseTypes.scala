package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PermissionGroupDatabaseTypes extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "PermissionGroupDatabaseTypes")
@js.native
object PermissionGroupDatabaseTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PermissionGroupDatabaseTypes with Double] = js.native
  
  /** global query group (used for ServerQuery clients) */
  @js.native
  sealed trait Query extends PermissionGroupDatabaseTypes
  /* 2 */ val Query: typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes.Query with Double = js.native
  
  /** regular group (used for regular clients) */
  @js.native
  sealed trait Regular extends PermissionGroupDatabaseTypes
  /* 1 */ val Regular: typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes.Regular with Double = js.native
  
  /** template group (used for new virtual servers) */
  @js.native
  sealed trait Template extends PermissionGroupDatabaseTypes
  /* 0 */ val Template: typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes.Template with Double = js.native
}
