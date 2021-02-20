package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryDeletedOption extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "QueryDeletedOption")
@js.native
object QueryDeletedOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryDeletedOption with Double] = js.native
  
  /**
    * Include only non-deleted builds.
    */
  @js.native
  sealed trait ExcludeDeleted extends QueryDeletedOption
  /* 0 */ val ExcludeDeleted: typings.vsoNodeApi.buildInterfacesMod.QueryDeletedOption.ExcludeDeleted with Double = js.native
  
  /**
    * Include deleted and non-deleted builds.
    */
  @js.native
  sealed trait IncludeDeleted extends QueryDeletedOption
  /* 1 */ val IncludeDeleted: typings.vsoNodeApi.buildInterfacesMod.QueryDeletedOption.IncludeDeleted with Double = js.native
  
  /**
    * Include only deleted builds.
    */
  @js.native
  sealed trait OnlyDeleted extends QueryDeletedOption
  /* 2 */ val OnlyDeleted: typings.vsoNodeApi.buildInterfacesMod.QueryDeletedOption.OnlyDeleted with Double = js.native
}
