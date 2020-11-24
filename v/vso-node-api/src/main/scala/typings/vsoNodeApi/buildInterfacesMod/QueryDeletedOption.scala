package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryDeletedOption extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "QueryDeletedOption")
@js.native
object QueryDeletedOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryDeletedOption with Double] = js.native
  
  /**
    * Include only non-deleted builds.
    */
  @js.native
  sealed trait ExcludeDeleted extends QueryDeletedOption
  /* 0 */ @js.native
  object ExcludeDeleted extends TopLevel[ExcludeDeleted with Double]
  
  /**
    * Include deleted and non-deleted builds.
    */
  @js.native
  sealed trait IncludeDeleted extends QueryDeletedOption
  /* 1 */ @js.native
  object IncludeDeleted extends TopLevel[IncludeDeleted with Double]
  
  /**
    * Include only deleted builds.
    */
  @js.native
  sealed trait OnlyDeleted extends QueryDeletedOption
  /* 2 */ @js.native
  object OnlyDeleted extends TopLevel[OnlyDeleted with Double]
}
