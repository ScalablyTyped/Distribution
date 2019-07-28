package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryMembership extends js.Object

@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "QueryMembership")
@js.native
object QueryMembership extends js.Object {
  /**
    * Query will return only direct membership data
    */
  @js.native
  sealed trait Direct extends QueryMembership
  
  /**
    * Query will return expanded membership data
    */
  @js.native
  sealed trait Expanded extends QueryMembership
  
  /**
    * Query will return expanded down membership data (children only)
    */
  @js.native
  sealed trait ExpandedDown extends QueryMembership
  
  /**
    * Query will return expanded up membership data (parents only)
    */
  @js.native
  sealed trait ExpandedUp extends QueryMembership
  
  /**
    * Query will not return any membership data
    */
  @js.native
  sealed trait None extends QueryMembership
  
  /* 1 */ val Direct: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.QueryMembership.Direct with Double = js.native
  /* 2 */ val Expanded: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.QueryMembership.Expanded with Double = js.native
  /* 4 */ val ExpandedDown: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.QueryMembership.ExpandedDown with Double = js.native
  /* 3 */ val ExpandedUp: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.QueryMembership.ExpandedUp with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.QueryMembership.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryMembership with Double] = js.native
}

