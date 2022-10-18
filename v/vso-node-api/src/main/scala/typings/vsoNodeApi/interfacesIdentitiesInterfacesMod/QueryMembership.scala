package typings.vsoNodeApi.interfacesIdentitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryMembership extends StObject
@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "QueryMembership")
@js.native
object QueryMembership extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryMembership & Double] = js.native
  
  /**
    * Query will return only direct membership data
    */
  @js.native
  sealed trait Direct
    extends StObject
       with QueryMembership
  /* 1 */ val Direct: typings.vsoNodeApi.interfacesIdentitiesInterfacesMod.QueryMembership.Direct & Double = js.native
  
  /**
    * Query will return expanded membership data
    */
  @js.native
  sealed trait Expanded
    extends StObject
       with QueryMembership
  /* 2 */ val Expanded: typings.vsoNodeApi.interfacesIdentitiesInterfacesMod.QueryMembership.Expanded & Double = js.native
  
  /**
    * Query will return expanded down membership data (children only)
    */
  @js.native
  sealed trait ExpandedDown
    extends StObject
       with QueryMembership
  /* 4 */ val ExpandedDown: typings.vsoNodeApi.interfacesIdentitiesInterfacesMod.QueryMembership.ExpandedDown & Double = js.native
  
  /**
    * Query will return expanded up membership data (parents only)
    */
  @js.native
  sealed trait ExpandedUp
    extends StObject
       with QueryMembership
  /* 3 */ val ExpandedUp: typings.vsoNodeApi.interfacesIdentitiesInterfacesMod.QueryMembership.ExpandedUp & Double = js.native
  
  /**
    * Query will not return any membership data
    */
  @js.native
  sealed trait None
    extends StObject
       with QueryMembership
  /* 0 */ val None: typings.vsoNodeApi.interfacesIdentitiesInterfacesMod.QueryMembership.None & Double = js.native
}
