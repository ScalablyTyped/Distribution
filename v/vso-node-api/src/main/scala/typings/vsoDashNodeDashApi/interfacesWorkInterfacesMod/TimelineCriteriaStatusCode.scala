package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineCriteriaStatusCode.InvalidFilterClause
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineCriteriaStatusCode.OK
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineCriteriaStatusCode.Unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineCriteriaStatusCode with Double] = js.native
  /* 1 */ @js.native
  object InvalidFilterClause extends TopLevel[InvalidFilterClause with Double]
  
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  /* 2 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}

