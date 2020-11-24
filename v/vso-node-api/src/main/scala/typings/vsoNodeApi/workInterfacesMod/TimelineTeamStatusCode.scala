package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimelineTeamStatusCode extends js.Object
@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimelineTeamStatusCode")
@js.native
object TimelineTeamStatusCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineTeamStatusCode with Double] = js.native
  
  /**
    * Backlog does not exist or is missing crucial information.
    */
  @js.native
  sealed trait BacklogInError extends TimelineTeamStatusCode
  /* 4 */ @js.native
  object BacklogInError extends TopLevel[BacklogInError with Double]
  
  /**
    * Team does not exist or access is denied.
    */
  @js.native
  sealed trait DoesntExistOrAccessDenied extends TimelineTeamStatusCode
  /* 1 */ @js.native
  object DoesntExistOrAccessDenied extends TopLevel[DoesntExistOrAccessDenied with Double]
  
  /**
    * Maximum number of team fields (ie Area paths) have been exceeded. No team data will be returned for this team.
    */
  @js.native
  sealed trait MaxTeamFieldsExceeded extends TimelineTeamStatusCode
  /* 3 */ @js.native
  object MaxTeamFieldsExceeded extends TopLevel[MaxTeamFieldsExceeded with Double]
  
  /**
    * Maximum number of teams was exceeded. No team data will be returned for this team.
    */
  @js.native
  sealed trait MaxTeamsExceeded extends TimelineTeamStatusCode
  /* 2 */ @js.native
  object MaxTeamsExceeded extends TopLevel[MaxTeamsExceeded with Double]
  
  /**
    * Team field value is not set for this team. No team data will be returned for this team
    */
  @js.native
  sealed trait MissingTeamFieldValue extends TimelineTeamStatusCode
  /* 5 */ @js.native
  object MissingTeamFieldValue extends TopLevel[MissingTeamFieldValue with Double]
  
  /**
    * Team does not have a single iteration with date range.
    */
  @js.native
  sealed trait NoIterationsExist extends TimelineTeamStatusCode
  /* 6 */ @js.native
  object NoIterationsExist extends TopLevel[NoIterationsExist with Double]
  
  /**
    * No error - all data for team is good.
    */
  @js.native
  sealed trait OK extends TimelineTeamStatusCode
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
}
