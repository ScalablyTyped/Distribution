package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimelineCriteriaStatusCode extends js.Object
@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimelineCriteriaStatusCode")
@js.native
object TimelineCriteriaStatusCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineCriteriaStatusCode with Double] = js.native
  
  /**
    * One of the filter clause is invalid.
    */
  @js.native
  sealed trait InvalidFilterClause extends TimelineCriteriaStatusCode
  /* 1 */ @js.native
  object InvalidFilterClause extends TopLevel[InvalidFilterClause with Double]
  
  /**
    * No error - filter is good.
    */
  @js.native
  sealed trait OK extends TimelineCriteriaStatusCode
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  /**
    * Unknown error.
    */
  @js.native
  sealed trait Unknown extends TimelineCriteriaStatusCode
  /* 2 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}
