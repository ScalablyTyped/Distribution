package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BugsBehavior extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "BugsBehavior")
@js.native
object BugsBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BugsBehavior with Double] = js.native
  
  @js.native
  sealed trait AsRequirements extends BugsBehavior
  /* 1 */ val AsRequirements: typings.vsoNodeApi.workInterfacesMod.BugsBehavior.AsRequirements with Double = js.native
  
  @js.native
  sealed trait AsTasks extends BugsBehavior
  /* 2 */ val AsTasks: typings.vsoNodeApi.workInterfacesMod.BugsBehavior.AsTasks with Double = js.native
  
  @js.native
  sealed trait Off extends BugsBehavior
  /* 0 */ val Off: typings.vsoNodeApi.workInterfacesMod.BugsBehavior.Off with Double = js.native
}
