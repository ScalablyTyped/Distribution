package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryMembership extends js.Object
@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "QueryMembership")
@js.native
object QueryMembership extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryMembership with Double] = js.native
  
  /**
    * Query will return only direct membership data
    */
  @js.native
  sealed trait Direct extends QueryMembership
  /* 1 */ @js.native
  object Direct extends TopLevel[Direct with Double]
  
  /**
    * Query will return expanded membership data
    */
  @js.native
  sealed trait Expanded extends QueryMembership
  /* 2 */ @js.native
  object Expanded extends TopLevel[Expanded with Double]
  
  /**
    * Query will return expanded down membership data (children only)
    */
  @js.native
  sealed trait ExpandedDown extends QueryMembership
  /* 4 */ @js.native
  object ExpandedDown extends TopLevel[ExpandedDown with Double]
  
  /**
    * Query will return expanded up membership data (parents only)
    */
  @js.native
  sealed trait ExpandedUp extends QueryMembership
  /* 3 */ @js.native
  object ExpandedUp extends TopLevel[ExpandedUp with Double]
  
  /**
    * Query will not return any membership data
    */
  @js.native
  sealed trait None extends QueryMembership
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
