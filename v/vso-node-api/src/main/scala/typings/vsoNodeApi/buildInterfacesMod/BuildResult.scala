package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildResult extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildResult")
@js.native
object BuildResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildResult with Double] = js.native
  
  /**
    * The build was canceled before starting.
    */
  @js.native
  sealed trait Canceled extends BuildResult
  /* 32 */ val Canceled: typings.vsoNodeApi.buildInterfacesMod.BuildResult.Canceled with Double = js.native
  
  /**
    * The build completed unsuccessfully.
    */
  @js.native
  sealed trait Failed extends BuildResult
  /* 8 */ val Failed: typings.vsoNodeApi.buildInterfacesMod.BuildResult.Failed with Double = js.native
  
  /**
    * No result
    */
  @js.native
  sealed trait None extends BuildResult
  /* 0 */ val None: typings.vsoNodeApi.buildInterfacesMod.BuildResult.None with Double = js.native
  
  /**
    * The build completed compilation successfully but had other errors.
    */
  @js.native
  sealed trait PartiallySucceeded extends BuildResult
  /* 4 */ val PartiallySucceeded: typings.vsoNodeApi.buildInterfacesMod.BuildResult.PartiallySucceeded with Double = js.native
  
  /**
    * The build completed successfully.
    */
  @js.native
  sealed trait Succeeded extends BuildResult
  /* 2 */ val Succeeded: typings.vsoNodeApi.buildInterfacesMod.BuildResult.Succeeded with Double = js.native
}
