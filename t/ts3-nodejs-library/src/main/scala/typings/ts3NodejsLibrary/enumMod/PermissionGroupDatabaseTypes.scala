package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PermissionGroupDatabaseTypes extends js.Object
@JSImport("ts3-nodejs-library/lib/types/enum", "PermissionGroupDatabaseTypes")
@js.native
object PermissionGroupDatabaseTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PermissionGroupDatabaseTypes with Double] = js.native
  
  /** global query group (used for ServerQuery clients) */
  @js.native
  sealed trait Query extends PermissionGroupDatabaseTypes
  /* 2 */ @js.native
  object Query extends TopLevel[Query with Double]
  
  /** regular group (used for regular clients) */
  @js.native
  sealed trait Regular extends PermissionGroupDatabaseTypes
  /* 1 */ @js.native
  object Regular extends TopLevel[Regular with Double]
  
  /** template group (used for new virtual servers) */
  @js.native
  sealed trait Template extends PermissionGroupDatabaseTypes
  /* 0 */ @js.native
  object Template extends TopLevel[Template with Double]
}
