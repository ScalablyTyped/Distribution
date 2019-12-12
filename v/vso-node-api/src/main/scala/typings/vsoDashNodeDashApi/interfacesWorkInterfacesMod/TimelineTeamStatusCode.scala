package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.BacklogInError
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.DoesntExistOrAccessDenied
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.MaxTeamFieldsExceeded
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.MaxTeamsExceeded
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.MissingTeamFieldValue
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.NoIterationsExist
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.OK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimelineTeamStatusCode extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimelineTeamStatusCode")
@js.native
object TimelineTeamStatusCode extends js.Object {
  /**
    * Backlog does not exist or is missing crucial information.
    */
  @js.native
  sealed trait BacklogInError extends TimelineTeamStatusCode
  
  /**
    * Team does not exist or access is denied.
    */
  @js.native
  sealed trait DoesntExistOrAccessDenied extends TimelineTeamStatusCode
  
  /**
    * Maximum number of team fields (ie Area paths) have been exceeded. No team data will be returned for this team.
    */
  @js.native
  sealed trait MaxTeamFieldsExceeded extends TimelineTeamStatusCode
  
  /**
    * Maximum number of teams was exceeded. No team data will be returned for this team.
    */
  @js.native
  sealed trait MaxTeamsExceeded extends TimelineTeamStatusCode
  
  /**
    * Team field value is not set for this team. No team data will be returned for this team
    */
  @js.native
  sealed trait MissingTeamFieldValue extends TimelineTeamStatusCode
  
  /**
    * Team does not have a single iteration with date range.
    */
  @js.native
  sealed trait NoIterationsExist extends TimelineTeamStatusCode
  
  /**
    * No error - all data for team is good.
    */
  @js.native
  sealed trait OK extends TimelineTeamStatusCode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineTeamStatusCode with Double] = js.native
  /* 4 */ @js.native
  object BacklogInError extends TopLevel[BacklogInError with Double]
  
  /* 1 */ @js.native
  object DoesntExistOrAccessDenied extends TopLevel[DoesntExistOrAccessDenied with Double]
  
  /* 3 */ @js.native
  object MaxTeamFieldsExceeded extends TopLevel[MaxTeamFieldsExceeded with Double]
  
  /* 2 */ @js.native
  object MaxTeamsExceeded extends TopLevel[MaxTeamsExceeded with Double]
  
  /* 5 */ @js.native
  object MissingTeamFieldValue extends TopLevel[MissingTeamFieldValue with Double]
  
  /* 6 */ @js.native
  object NoIterationsExist extends TopLevel[NoIterationsExist with Double]
  
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
}

