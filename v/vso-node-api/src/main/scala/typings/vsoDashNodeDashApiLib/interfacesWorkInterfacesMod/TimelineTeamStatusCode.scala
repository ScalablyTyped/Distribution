package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

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
  sealed trait BacklogInError
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineTeamStatusCode
  
  /**
       * Team does not exist or access is denied.
       */
  @js.native
  sealed trait DoesntExistOrAccessDenied
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineTeamStatusCode
  
  /**
       * Maximum number of team fields (ie Area paths) have been exceeded. No team data will be returned for this team.
       */
  @js.native
  sealed trait MaxTeamFieldsExceeded
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineTeamStatusCode
  
  /**
       * Maximum number of teams was exceeded. No team data will be returned for this team.
       */
  @js.native
  sealed trait MaxTeamsExceeded
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineTeamStatusCode
  
  /**
       * Team field value is not set for this team. No team data will be returned for this team
       */
  @js.native
  sealed trait MissingTeamFieldValue
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineTeamStatusCode
  
  /**
       * Team does not have a single iteration with date range.
       */
  @js.native
  sealed trait NoIterationsExist
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineTeamStatusCode
  
  /**
       * No error - all data for team is good.
       */
  @js.native
  sealed trait OK
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineTeamStatusCode
  
  /* 4 */ val BacklogInError: BacklogInError with scala.Double = js.native
  /* 1 */ val DoesntExistOrAccessDenied: DoesntExistOrAccessDenied with scala.Double = js.native
  /* 3 */ val MaxTeamFieldsExceeded: MaxTeamFieldsExceeded with scala.Double = js.native
  /* 2 */ val MaxTeamsExceeded: MaxTeamsExceeded with scala.Double = js.native
  /* 5 */ val MissingTeamFieldValue: MissingTeamFieldValue with scala.Double = js.native
  /* 6 */ val NoIterationsExist: NoIterationsExist with scala.Double = js.native
  /* 0 */ val OK: OK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineTeamStatusCode with scala.Double
  ] = js.native
}

