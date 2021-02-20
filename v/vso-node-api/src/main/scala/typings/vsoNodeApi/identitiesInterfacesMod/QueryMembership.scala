package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryMembership extends StObject
@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "QueryMembership")
@js.native
object QueryMembership extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryMembership with Double] = js.native
  
  /**
    * Query will return only direct membership data
    */
  @js.native
  sealed trait Direct extends QueryMembership
  /* 1 */ val Direct: typings.vsoNodeApi.identitiesInterfacesMod.QueryMembership.Direct with Double = js.native
  
  /**
    * Query will return expanded membership data
    */
  @js.native
  sealed trait Expanded extends QueryMembership
  /* 2 */ val Expanded: typings.vsoNodeApi.identitiesInterfacesMod.QueryMembership.Expanded with Double = js.native
  
  /**
    * Query will return expanded down membership data (children only)
    */
  @js.native
  sealed trait ExpandedDown extends QueryMembership
  /* 4 */ val ExpandedDown: typings.vsoNodeApi.identitiesInterfacesMod.QueryMembership.ExpandedDown with Double = js.native
  
  /**
    * Query will return expanded up membership data (parents only)
    */
  @js.native
  sealed trait ExpandedUp extends QueryMembership
  /* 3 */ val ExpandedUp: typings.vsoNodeApi.identitiesInterfacesMod.QueryMembership.ExpandedUp with Double = js.native
  
  /**
    * Query will not return any membership data
    */
  @js.native
  sealed trait None extends QueryMembership
  /* 0 */ val None: typings.vsoNodeApi.identitiesInterfacesMod.QueryMembership.None with Double = js.native
}
