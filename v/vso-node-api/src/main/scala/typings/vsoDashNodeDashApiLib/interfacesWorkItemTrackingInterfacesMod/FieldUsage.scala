package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldUsage extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "FieldUsage")
@js.native
object FieldUsage extends js.Object {
  /**
       * Empty usage.
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldUsage
  
  /**
       * Treenode field usage.
       */
  @js.native
  sealed trait Tree
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldUsage
  
  /**
       * Work item field usage.
       */
  @js.native
  sealed trait WorkItem
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldUsage
  
  /**
       * Work item link field usage.
       */
  @js.native
  sealed trait WorkItemLink
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldUsage
  
  /**
       * Work Item Type Extension usage.
       */
  @js.native
  sealed trait WorkItemTypeExtension
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldUsage
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val Tree: Tree with scala.Double = js.native
  /* 1 */ val WorkItem: WorkItem with scala.Double = js.native
  /* 2 */ val WorkItemLink: WorkItemLink with scala.Double = js.native
  /* 4 */ val WorkItemTypeExtension: WorkItemTypeExtension with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldUsage with scala.Double
  ] = js.native
}

