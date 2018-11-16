package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryDeletedOption extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "QueryDeletedOption")
@js.native
object QueryDeletedOption extends js.Object {
  /**
       * Include only non-deleted builds.
       */
  @js.native
  sealed trait ExcludeDeleted
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueryDeletedOption
  
  /**
       * Include deleted and non-deleted builds.
       */
  @js.native
  sealed trait IncludeDeleted
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueryDeletedOption
  
  /**
       * Include only deleted builds.
       */
  @js.native
  sealed trait OnlyDeleted
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueryDeletedOption
  
  /* 0 */ val ExcludeDeleted: ExcludeDeleted with scala.Double = js.native
  /* 1 */ val IncludeDeleted: IncludeDeleted with scala.Double = js.native
  /* 2 */ val OnlyDeleted: OnlyDeleted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueryDeletedOption with scala.Double
  ] = js.native
}

