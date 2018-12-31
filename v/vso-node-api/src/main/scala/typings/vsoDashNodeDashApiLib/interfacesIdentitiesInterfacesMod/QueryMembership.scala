package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

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
  sealed trait Direct
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.QueryMembership
  
  /**
    * Query will return expanded membership data
    */
  @js.native
  sealed trait Expanded
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.QueryMembership
  
  /**
    * Query will return expanded down membership data (children only)
    */
  @js.native
  sealed trait ExpandedDown
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.QueryMembership
  
  /**
    * Query will return expanded up membership data (parents only)
    */
  @js.native
  sealed trait ExpandedUp
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.QueryMembership
  
  /**
    * Query will not return any membership data
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.QueryMembership
  
  /* 1 */ val Direct: Direct with scala.Double = js.native
  /* 2 */ val Expanded: Expanded with scala.Double = js.native
  /* 4 */ val ExpandedDown: ExpandedDown with scala.Double = js.native
  /* 3 */ val ExpandedUp: ExpandedUp with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.QueryMembership with scala.Double
  ] = js.native
}

