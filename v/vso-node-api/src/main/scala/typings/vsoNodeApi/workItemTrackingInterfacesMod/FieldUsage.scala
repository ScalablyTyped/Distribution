package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  sealed trait None extends FieldUsage
  
  /**
    * Treenode field usage.
    */
  @js.native
  sealed trait Tree extends FieldUsage
  
  /**
    * Work item field usage.
    */
  @js.native
  sealed trait WorkItem extends FieldUsage
  
  /**
    * Work item link field usage.
    */
  @js.native
  sealed trait WorkItemLink extends FieldUsage
  
  /**
    * Work Item Type Extension usage.
    */
  @js.native
  sealed trait WorkItemTypeExtension extends FieldUsage
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldUsage with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object Tree extends TopLevel[Tree with Double]
  
  /* 1 */ @js.native
  object WorkItem
    extends TopLevel[typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldUsage.WorkItem with Double]
  
  /* 2 */ @js.native
  object WorkItemLink
    extends TopLevel[
          typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldUsage.WorkItemLink with Double
        ]
  
  /* 4 */ @js.native
  object WorkItemTypeExtension extends TopLevel[WorkItemTypeExtension with Double]
  
}

