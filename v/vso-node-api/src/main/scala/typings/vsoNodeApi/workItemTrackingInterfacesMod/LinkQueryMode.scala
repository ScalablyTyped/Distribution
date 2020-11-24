package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkQueryMode extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LinkQueryMode")
@js.native
object LinkQueryMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkQueryMode with Double] = js.native
  
  /**
    * Returns work items that satisfy the source, only if no linked work item satisfies the link and target criteria.
    */
  @js.native
  sealed trait LinksOneHopDoesNotContain extends LinkQueryMode
  /* 3 */ @js.native
  object LinksOneHopDoesNotContain extends TopLevel[LinksOneHopDoesNotContain with Double]
  
  /**
    * Returns work items that satisfy the source and link criteria, even if no linked work item satisfies the target criteria.
    */
  @js.native
  sealed trait LinksOneHopMayContain extends LinkQueryMode
  /* 2 */ @js.native
  object LinksOneHopMayContain extends TopLevel[LinksOneHopMayContain with Double]
  
  /**
    * Returns work items where the source, target, and link criteria are all satisfied.
    */
  @js.native
  sealed trait LinksOneHopMustContain extends LinkQueryMode
  /* 1 */ @js.native
  object LinksOneHopMustContain extends TopLevel[LinksOneHopMustContain with Double]
  
  @js.native
  sealed trait LinksRecursiveDoesNotContain extends LinkQueryMode
  /* 6 */ @js.native
  object LinksRecursiveDoesNotContain extends TopLevel[LinksRecursiveDoesNotContain with Double]
  
  /**
    * Returns work items a hierarchy of work items that by default satisfy the source
    */
  @js.native
  sealed trait LinksRecursiveMayContain extends LinkQueryMode
  /* 5 */ @js.native
  object LinksRecursiveMayContain extends TopLevel[LinksRecursiveMayContain with Double]
  
  @js.native
  sealed trait LinksRecursiveMustContain extends LinkQueryMode
  /* 4 */ @js.native
  object LinksRecursiveMustContain extends TopLevel[LinksRecursiveMustContain with Double]
  
  @js.native
  sealed trait WorkItems extends LinkQueryMode
  /* 0 */ @js.native
  object WorkItems extends TopLevel[WorkItems with Double]
}
