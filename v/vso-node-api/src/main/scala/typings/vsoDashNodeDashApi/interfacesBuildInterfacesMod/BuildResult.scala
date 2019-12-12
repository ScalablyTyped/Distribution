package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildResult.Canceled
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildResult.Failed
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildResult.None
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildResult.PartiallySucceeded
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildResult.Succeeded
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildResult with Double] = js.native
  /* 32 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  /* 8 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4 */ @js.native
  object PartiallySucceeded extends TopLevel[PartiallySucceeded with Double]
  
  /* 2 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
}

