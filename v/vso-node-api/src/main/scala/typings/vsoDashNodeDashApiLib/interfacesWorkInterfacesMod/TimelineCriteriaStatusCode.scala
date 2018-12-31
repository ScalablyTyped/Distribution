package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

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
  sealed trait InvalidFilterClause
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineCriteriaStatusCode
  
  /**
    * No error - filter is good.
    */
  @js.native
  sealed trait OK
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineCriteriaStatusCode
  
  /**
    * Unknown error.
    */
  @js.native
  sealed trait Unknown
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineCriteriaStatusCode
  
  /* 1 */ val InvalidFilterClause: InvalidFilterClause with scala.Double = js.native
  /* 0 */ val OK: OK with scala.Double = js.native
  /* 2 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineCriteriaStatusCode with scala.Double
  ] = js.native
}

