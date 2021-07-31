package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkQueryMode extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LinkQueryMode")
@js.native
object LinkQueryMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkQueryMode & Double] = js.native
  
  /**
    * Returns work items that satisfy the source, only if no linked work item satisfies the link and target criteria.
    */
  @js.native
  sealed trait LinksOneHopDoesNotContain
    extends StObject
       with LinkQueryMode
  /* 3 */ val LinksOneHopDoesNotContain: typings.vsoNodeApi.workItemTrackingInterfacesMod.LinkQueryMode.LinksOneHopDoesNotContain & Double = js.native
  
  /**
    * Returns work items that satisfy the source and link criteria, even if no linked work item satisfies the target criteria.
    */
  @js.native
  sealed trait LinksOneHopMayContain
    extends StObject
       with LinkQueryMode
  /* 2 */ val LinksOneHopMayContain: typings.vsoNodeApi.workItemTrackingInterfacesMod.LinkQueryMode.LinksOneHopMayContain & Double = js.native
  
  /**
    * Returns work items where the source, target, and link criteria are all satisfied.
    */
  @js.native
  sealed trait LinksOneHopMustContain
    extends StObject
       with LinkQueryMode
  /* 1 */ val LinksOneHopMustContain: typings.vsoNodeApi.workItemTrackingInterfacesMod.LinkQueryMode.LinksOneHopMustContain & Double = js.native
  
  @js.native
  sealed trait LinksRecursiveDoesNotContain
    extends StObject
       with LinkQueryMode
  /* 6 */ val LinksRecursiveDoesNotContain: typings.vsoNodeApi.workItemTrackingInterfacesMod.LinkQueryMode.LinksRecursiveDoesNotContain & Double = js.native
  
  /**
    * Returns work items a hierarchy of work items that by default satisfy the source
    */
  @js.native
  sealed trait LinksRecursiveMayContain
    extends StObject
       with LinkQueryMode
  /* 5 */ val LinksRecursiveMayContain: typings.vsoNodeApi.workItemTrackingInterfacesMod.LinkQueryMode.LinksRecursiveMayContain & Double = js.native
  
  @js.native
  sealed trait LinksRecursiveMustContain
    extends StObject
       with LinkQueryMode
  /* 4 */ val LinksRecursiveMustContain: typings.vsoNodeApi.workItemTrackingInterfacesMod.LinkQueryMode.LinksRecursiveMustContain & Double = js.native
  
  @js.native
  sealed trait WorkItems
    extends StObject
       with LinkQueryMode
  /* 0 */ val WorkItems: typings.vsoNodeApi.workItemTrackingInterfacesMod.LinkQueryMode.WorkItems & Double = js.native
}
