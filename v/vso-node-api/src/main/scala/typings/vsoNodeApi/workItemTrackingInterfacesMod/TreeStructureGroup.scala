package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TreeStructureGroup extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "TreeStructureGroup")
@js.native
object TreeStructureGroup extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TreeStructureGroup with Double] = js.native
  
  @js.native
  sealed trait Areas extends TreeStructureGroup
  /* 0 */ @js.native
  object Areas extends TopLevel[Areas with Double]
  
  @js.native
  sealed trait Iterations extends TreeStructureGroup
  /* 1 */ @js.native
  object Iterations extends TopLevel[Iterations with Double]
}
