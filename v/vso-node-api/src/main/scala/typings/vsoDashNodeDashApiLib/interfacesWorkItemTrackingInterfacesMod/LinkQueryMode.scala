package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

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
  sealed trait LinksOneHopDoesNotContain
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode
  
  /**
       * Returns work items that satisfy the source and link criteria, even if no linked work item satisfies the target criteria.
       */
  @js.native
  sealed trait LinksOneHopMayContain
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode
  
  /**
       * Returns work items where the source, target, and link criteria are all satisfied.
       */
  @js.native
  sealed trait LinksOneHopMustContain
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode
  
  @js.native
  sealed trait LinksRecursiveDoesNotContain
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode
  
  /**
       * Returns work items a hierarchy of work items that by default satisfy the source
       */
  @js.native
  sealed trait LinksRecursiveMayContain
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode
  
  @js.native
  sealed trait LinksRecursiveMustContain
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode
  
  @js.native
  sealed trait WorkItems
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode
  
  /* 3 */ val LinksOneHopDoesNotContain: LinksOneHopDoesNotContain with scala.Double = js.native
  /* 2 */ val LinksOneHopMayContain: LinksOneHopMayContain with scala.Double = js.native
  /* 1 */ val LinksOneHopMustContain: LinksOneHopMustContain with scala.Double = js.native
  /* 6 */ val LinksRecursiveDoesNotContain: LinksRecursiveDoesNotContain with scala.Double = js.native
  /* 5 */ val LinksRecursiveMayContain: LinksRecursiveMayContain with scala.Double = js.native
  /* 4 */ val LinksRecursiveMustContain: LinksRecursiveMustContain with scala.Double = js.native
  /* 0 */ val WorkItems: WorkItems with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.LinkQueryMode with scala.Double
  ] = js.native
}

