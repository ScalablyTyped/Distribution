package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimelineTeamStatusCode extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimelineTeamStatusCode")
@js.native
object TimelineTeamStatusCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineTeamStatusCode with Double] = js.native
  
  /**
    * Backlog does not exist or is missing crucial information.
    */
  @js.native
  sealed trait BacklogInError extends TimelineTeamStatusCode
  /* 4 */ val BacklogInError: typings.vsoNodeApi.workInterfacesMod.TimelineTeamStatusCode.BacklogInError with Double = js.native
  
  /**
    * Team does not exist or access is denied.
    */
  @js.native
  sealed trait DoesntExistOrAccessDenied extends TimelineTeamStatusCode
  /* 1 */ val DoesntExistOrAccessDenied: typings.vsoNodeApi.workInterfacesMod.TimelineTeamStatusCode.DoesntExistOrAccessDenied with Double = js.native
  
  /**
    * Maximum number of team fields (ie Area paths) have been exceeded. No team data will be returned for this team.
    */
  @js.native
  sealed trait MaxTeamFieldsExceeded extends TimelineTeamStatusCode
  /* 3 */ val MaxTeamFieldsExceeded: typings.vsoNodeApi.workInterfacesMod.TimelineTeamStatusCode.MaxTeamFieldsExceeded with Double = js.native
  
  /**
    * Maximum number of teams was exceeded. No team data will be returned for this team.
    */
  @js.native
  sealed trait MaxTeamsExceeded extends TimelineTeamStatusCode
  /* 2 */ val MaxTeamsExceeded: typings.vsoNodeApi.workInterfacesMod.TimelineTeamStatusCode.MaxTeamsExceeded with Double = js.native
  
  /**
    * Team field value is not set for this team. No team data will be returned for this team
    */
  @js.native
  sealed trait MissingTeamFieldValue extends TimelineTeamStatusCode
  /* 5 */ val MissingTeamFieldValue: typings.vsoNodeApi.workInterfacesMod.TimelineTeamStatusCode.MissingTeamFieldValue with Double = js.native
  
  /**
    * Team does not have a single iteration with date range.
    */
  @js.native
  sealed trait NoIterationsExist extends TimelineTeamStatusCode
  /* 6 */ val NoIterationsExist: typings.vsoNodeApi.workInterfacesMod.TimelineTeamStatusCode.NoIterationsExist with Double = js.native
  
  /**
    * No error - all data for team is good.
    */
  @js.native
  sealed trait OK extends TimelineTeamStatusCode
  /* 0 */ val OK: typings.vsoNodeApi.workInterfacesMod.TimelineTeamStatusCode.OK with Double = js.native
}
