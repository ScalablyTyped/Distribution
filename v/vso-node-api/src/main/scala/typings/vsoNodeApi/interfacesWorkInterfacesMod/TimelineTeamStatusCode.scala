package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimelineTeamStatusCode extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimelineTeamStatusCode")
@js.native
object TimelineTeamStatusCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineTeamStatusCode & Double] = js.native
  
  /**
    * Backlog does not exist or is missing crucial information.
    */
  @js.native
  sealed trait BacklogInError
    extends StObject
       with TimelineTeamStatusCode
  /* 4 */ val BacklogInError: typings.vsoNodeApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.BacklogInError & Double = js.native
  
  /**
    * Team does not exist or access is denied.
    */
  @js.native
  sealed trait DoesntExistOrAccessDenied
    extends StObject
       with TimelineTeamStatusCode
  /* 1 */ val DoesntExistOrAccessDenied: typings.vsoNodeApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.DoesntExistOrAccessDenied & Double = js.native
  
  /**
    * Maximum number of team fields (ie Area paths) have been exceeded. No team data will be returned for this team.
    */
  @js.native
  sealed trait MaxTeamFieldsExceeded
    extends StObject
       with TimelineTeamStatusCode
  /* 3 */ val MaxTeamFieldsExceeded: typings.vsoNodeApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.MaxTeamFieldsExceeded & Double = js.native
  
  /**
    * Maximum number of teams was exceeded. No team data will be returned for this team.
    */
  @js.native
  sealed trait MaxTeamsExceeded
    extends StObject
       with TimelineTeamStatusCode
  /* 2 */ val MaxTeamsExceeded: typings.vsoNodeApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.MaxTeamsExceeded & Double = js.native
  
  /**
    * Team field value is not set for this team. No team data will be returned for this team
    */
  @js.native
  sealed trait MissingTeamFieldValue
    extends StObject
       with TimelineTeamStatusCode
  /* 5 */ val MissingTeamFieldValue: typings.vsoNodeApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.MissingTeamFieldValue & Double = js.native
  
  /**
    * Team does not have a single iteration with date range.
    */
  @js.native
  sealed trait NoIterationsExist
    extends StObject
       with TimelineTeamStatusCode
  /* 6 */ val NoIterationsExist: typings.vsoNodeApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.NoIterationsExist & Double = js.native
  
  /**
    * No error - all data for team is good.
    */
  @js.native
  sealed trait OK
    extends StObject
       with TimelineTeamStatusCode
  /* 0 */ val OK: typings.vsoNodeApi.interfacesWorkInterfacesMod.TimelineTeamStatusCode.OK & Double = js.native
}
