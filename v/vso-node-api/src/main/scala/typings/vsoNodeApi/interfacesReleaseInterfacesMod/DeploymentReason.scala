package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentReason extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentReason")
@js.native
object DeploymentReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentReason & Double] = js.native
  
  /**
    * The deployment reason is automated.
    */
  @js.native
  sealed trait Automated
    extends StObject
       with DeploymentReason
  /* 2 */ val Automated: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentReason.Automated & Double = js.native
  
  /**
    * The deployment reason is manual.
    */
  @js.native
  sealed trait Manual
    extends StObject
       with DeploymentReason
  /* 1 */ val Manual: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentReason.Manual & Double = js.native
  
  /**
    * The deployment reason is none.
    */
  @js.native
  sealed trait None
    extends StObject
       with DeploymentReason
  /* 0 */ val None: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentReason.None & Double = js.native
  
  /**
    * The deployment reason is scheduled.
    */
  @js.native
  sealed trait Scheduled
    extends StObject
       with DeploymentReason
  /* 4 */ val Scheduled: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentReason.Scheduled & Double = js.native
}
