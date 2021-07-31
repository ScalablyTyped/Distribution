package typings.winrtUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentProgressState extends StObject
/** Represents the state of a deployment request. */
@JSGlobal("Windows.Management.Deployment.DeploymentProgressState")
@js.native
object DeploymentProgressState extends StObject {
  
  /** The deployment request is being processed. */
  @js.native
  sealed trait processing
    extends StObject
       with DeploymentProgressState
  
  /** The deployment request is queued. */
  @js.native
  sealed trait queued
    extends StObject
       with DeploymentProgressState
}
