package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuildResult extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildResult")
@js.native
object BuildResult extends js.Object {
  /**
       * The build was canceled before starting.
       */
  @js.native
  sealed trait Canceled
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildResult
  
  /**
       * The build completed unsuccessfully.
       */
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildResult
  
  /**
       * No result
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildResult
  
  /**
       * The build completed compilation successfully but had other errors.
       */
  @js.native
  sealed trait PartiallySucceeded
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildResult
  
  /**
       * The build completed successfully.
       */
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildResult
  
  /* 32 */ val Canceled: Canceled with scala.Double = js.native
  /* 8 */ val Failed: Failed with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 4 */ val PartiallySucceeded: PartiallySucceeded with scala.Double = js.native
  /* 2 */ val Succeeded: Succeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildResult with scala.Double] = js.native
}

