package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldUsage extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "FieldUsage")
@js.native
object FieldUsage extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldUsage with Double] = js.native
  
  /**
    * Empty usage.
    */
  @js.native
  sealed trait None extends FieldUsage
  /* 0 */ val None: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldUsage.None with Double = js.native
  
  /**
    * Treenode field usage.
    */
  @js.native
  sealed trait Tree extends FieldUsage
  /* 3 */ val Tree: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldUsage.Tree with Double = js.native
  
  /**
    * Work item field usage.
    */
  @js.native
  sealed trait WorkItem extends FieldUsage
  /* 1 */ val WorkItem: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldUsage.WorkItem with Double = js.native
  
  /**
    * Work item link field usage.
    */
  @js.native
  sealed trait WorkItemLink extends FieldUsage
  /* 2 */ val WorkItemLink: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldUsage.WorkItemLink with Double = js.native
  
  /**
    * Work Item Type Extension usage.
    */
  @js.native
  sealed trait WorkItemTypeExtension extends FieldUsage
  /* 4 */ val WorkItemTypeExtension: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldUsage.WorkItemTypeExtension with Double = js.native
}
