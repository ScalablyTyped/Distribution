package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryMembership with Double] = js.native
  /* 1 */ @js.native
  object Direct extends TopLevel[Direct with Double]
  
  /* 2 */ @js.native
  object Expanded extends TopLevel[Expanded with Double]
  
  /* 4 */ @js.native
  object ExpandedDown extends TopLevel[ExpandedDown with Double]
  
  /* 3 */ @js.native
  object ExpandedUp extends TopLevel[ExpandedUp with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

