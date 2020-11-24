package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemExpand extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemExpand")
@js.native
object WorkItemExpand extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemExpand with Double] = js.native
  
  @js.native
  sealed trait All extends WorkItemExpand
  /* 4 */ @js.native
  object All extends TopLevel[All with Double]
  
  @js.native
  sealed trait Fields extends WorkItemExpand
  /* 2 */ @js.native
  object Fields extends TopLevel[Fields with Double]
  
  @js.native
  sealed trait Links extends WorkItemExpand
  /* 3 */ @js.native
  object Links extends TopLevel[Links with Double]
  
  @js.native
  sealed trait None extends WorkItemExpand
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Relations extends WorkItemExpand
  /* 1 */ @js.native
  object Relations extends TopLevel[Relations with Double]
}
