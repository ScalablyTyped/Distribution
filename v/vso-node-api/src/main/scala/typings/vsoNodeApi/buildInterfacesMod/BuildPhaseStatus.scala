package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildPhaseStatus extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildPhaseStatus")
@js.native
object BuildPhaseStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildPhaseStatus & Double] = js.native
  
  /**
    * The build phase completed unsuccessfully.
    */
  @js.native
  sealed trait Failed
    extends StObject
       with BuildPhaseStatus
  /* 1 */ val Failed: typings.vsoNodeApi.buildInterfacesMod.BuildPhaseStatus.Failed & Double = js.native
  
  /**
    * The build phase completed successfully.
    */
  @js.native
  sealed trait Succeeded
    extends StObject
       with BuildPhaseStatus
  /* 2 */ val Succeeded: typings.vsoNodeApi.buildInterfacesMod.BuildPhaseStatus.Succeeded & Double = js.native
  
  /**
    * The state is not known.
    */
  @js.native
  sealed trait Unknown
    extends StObject
       with BuildPhaseStatus
  /* 0 */ val Unknown: typings.vsoNodeApi.buildInterfacesMod.BuildPhaseStatus.Unknown & Double = js.native
}
