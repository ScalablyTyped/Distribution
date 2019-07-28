package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimelineCriteriaStatusCode extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimelineCriteriaStatusCode")
@js.native
object TimelineCriteriaStatusCode extends js.Object {
  /**
    * One of the filter clause is invalid.
    */
  @js.native
  sealed trait InvalidFilterClause extends TimelineCriteriaStatusCode
  
  /**
    * No error - filter is good.
    */
  @js.native
  sealed trait OK extends TimelineCriteriaStatusCode
  
  /**
    * Unknown error.
    */
  @js.native
  sealed trait Unknown extends TimelineCriteriaStatusCode
  
  /* 1 */ val InvalidFilterClause: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineCriteriaStatusCode.InvalidFilterClause with Double = js.native
  /* 0 */ val OK: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineCriteriaStatusCode.OK with Double = js.native
  /* 2 */ val Unknown: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineCriteriaStatusCode.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineCriteriaStatusCode with Double] = js.native
}

