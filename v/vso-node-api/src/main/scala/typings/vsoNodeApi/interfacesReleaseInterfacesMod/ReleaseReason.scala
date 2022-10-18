package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseReason extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseReason")
@js.native
object ReleaseReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseReason & Double] = js.native
  
  @js.native
  sealed trait ContinuousIntegration
    extends StObject
       with ReleaseReason
  /* 2 */ val ContinuousIntegration: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseReason.ContinuousIntegration & Double = js.native
  
  @js.native
  sealed trait Manual
    extends StObject
       with ReleaseReason
  /* 1 */ val Manual: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseReason.Manual & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ReleaseReason
  /* 0 */ val None: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseReason.None & Double = js.native
  
  @js.native
  sealed trait Schedule
    extends StObject
       with ReleaseReason
  /* 3 */ val Schedule: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseReason.Schedule & Double = js.native
}
