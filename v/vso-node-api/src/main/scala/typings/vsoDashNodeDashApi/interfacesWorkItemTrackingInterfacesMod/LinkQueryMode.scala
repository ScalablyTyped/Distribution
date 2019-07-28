package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

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
  
  /* 3 */ val LinksOneHopDoesNotContain: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksOneHopDoesNotContain with Double = js.native
  /* 2 */ val LinksOneHopMayContain: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksOneHopMayContain with Double = js.native
  /* 1 */ val LinksOneHopMustContain: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksOneHopMustContain with Double = js.native
  /* 6 */ val LinksRecursiveDoesNotContain: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksRecursiveDoesNotContain with Double = js.native
  /* 5 */ val LinksRecursiveMayContain: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksRecursiveMayContain with Double = js.native
  /* 4 */ val LinksRecursiveMustContain: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.LinksRecursiveMustContain with Double = js.native
  /* 0 */ val WorkItems: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode.WorkItems with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkQueryMode with Double] = js.native
}

