package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
  sealed trait Canceled extends BuildResult
  
  /**
    * The build completed unsuccessfully.
    */
  @js.native
  sealed trait Failed extends BuildResult
  
  /**
    * No result
    */
  @js.native
  sealed trait None extends BuildResult
  
  /**
    * The build completed compilation successfully but had other errors.
    */
  @js.native
  sealed trait PartiallySucceeded extends BuildResult
  
  /**
    * The build completed successfully.
    */
  @js.native
  sealed trait Succeeded extends BuildResult
  
  /* 32 */ val Canceled: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildResult.Canceled with Double = js.native
  /* 8 */ val Failed: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildResult.Failed with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildResult.None with Double = js.native
  /* 4 */ val PartiallySucceeded: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildResult.PartiallySucceeded with Double = js.native
  /* 2 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildResult.Succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildResult with Double] = js.native
}

