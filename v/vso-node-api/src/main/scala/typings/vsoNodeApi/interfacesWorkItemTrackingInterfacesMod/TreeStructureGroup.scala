package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TreeStructureGroup extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "TreeStructureGroup")
@js.native
object TreeStructureGroup extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TreeStructureGroup & Double] = js.native
  
  @js.native
  sealed trait Areas
    extends StObject
       with TreeStructureGroup
  /* 0 */ val Areas: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup.Areas & Double = js.native
  
  @js.native
  sealed trait Iterations
    extends StObject
       with TreeStructureGroup
  /* 1 */ val Iterations: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup.Iterations & Double = js.native
}
