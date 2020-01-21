package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryDeletedOption with Double] = js.native
  /* 0 */ @js.native
  object ExcludeDeleted extends TopLevel[ExcludeDeleted with Double]
  
  /* 1 */ @js.native
  object IncludeDeleted extends TopLevel[IncludeDeleted with Double]
  
  /* 2 */ @js.native
  object OnlyDeleted extends TopLevel[OnlyDeleted with Double]
  
}

