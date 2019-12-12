package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksOneHopDoesNotContain
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksOneHopMayContain
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksOneHopMustContain
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksRecursiveDoesNotContain
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksRecursiveMayContain
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksRecursiveMustContain
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.WorkItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkQueryMode extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LinkQueryMode")
@js.native
object LinkQueryMode extends js.Object {
  /**
    * Returns work items that satisfy the source, only if no linked work item satisfies the link and target criteria.
    */
  @js.native
  sealed trait LinksOneHopDoesNotContain extends LinkQueryMode
  
  /**
    * Returns work items that satisfy the source and link criteria, even if no linked work item satisfies the target criteria.
    */
  @js.native
  sealed trait LinksOneHopMayContain extends LinkQueryMode
  
  /**
    * Returns work items where the source, target, and link criteria are all satisfied.
    */
  @js.native
  sealed trait LinksOneHopMustContain extends LinkQueryMode
  
  @js.native
  sealed trait LinksRecursiveDoesNotContain extends LinkQueryMode
  
  /**
    * Returns work items a hierarchy of work items that by default satisfy the source
    */
  @js.native
  sealed trait LinksRecursiveMayContain extends LinkQueryMode
  
  @js.native
  sealed trait LinksRecursiveMustContain extends LinkQueryMode
  
  @js.native
  sealed trait WorkItems extends LinkQueryMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkQueryMode with Double] = js.native
  /* 3 */ @js.native
  object LinksOneHopDoesNotContain extends TopLevel[LinksOneHopDoesNotContain with Double]
  
  /* 2 */ @js.native
  object LinksOneHopMayContain extends TopLevel[LinksOneHopMayContain with Double]
  
  /* 1 */ @js.native
  object LinksOneHopMustContain extends TopLevel[LinksOneHopMustContain with Double]
  
  /* 6 */ @js.native
  object LinksRecursiveDoesNotContain extends TopLevel[LinksRecursiveDoesNotContain with Double]
  
  /* 5 */ @js.native
  object LinksRecursiveMayContain extends TopLevel[LinksRecursiveMayContain with Double]
  
  /* 4 */ @js.native
  object LinksRecursiveMustContain extends TopLevel[LinksRecursiveMustContain with Double]
  
  /* 0 */ @js.native
  object WorkItems extends TopLevel[WorkItems with Double]
  
}

