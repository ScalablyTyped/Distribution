package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildResult extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildResult")
@js.native
object BuildResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildResult with Double] = js.native
  
  /**
    * The build was canceled before starting.
    */
  @js.native
  sealed trait Canceled extends BuildResult
  /* 32 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  /**
    * The build completed unsuccessfully.
    */
  @js.native
  sealed trait Failed extends BuildResult
  /* 8 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /**
    * No result
    */
  @js.native
  sealed trait None extends BuildResult
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * The build completed compilation successfully but had other errors.
    */
  @js.native
  sealed trait PartiallySucceeded extends BuildResult
  /* 4 */ @js.native
  object PartiallySucceeded extends TopLevel[PartiallySucceeded with Double]
  
  /**
    * The build completed successfully.
    */
  @js.native
  sealed trait Succeeded extends BuildResult
  /* 2 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
}
