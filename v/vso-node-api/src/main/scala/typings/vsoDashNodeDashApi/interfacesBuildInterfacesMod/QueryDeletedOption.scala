package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
  sealed trait ExcludeDeleted extends QueryDeletedOption
  
  /**
    * Include deleted and non-deleted builds.
    */
  @js.native
  sealed trait IncludeDeleted extends QueryDeletedOption
  
  /**
    * Include only deleted builds.
    */
  @js.native
  sealed trait OnlyDeleted extends QueryDeletedOption
  
  /* 0 */ val ExcludeDeleted: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueryDeletedOption.ExcludeDeleted with Double = js.native
  /* 1 */ val IncludeDeleted: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueryDeletedOption.IncludeDeleted with Double = js.native
  /* 2 */ val OnlyDeleted: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueryDeletedOption.OnlyDeleted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryDeletedOption with Double] = js.native
}

