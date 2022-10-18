package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildResult extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildResult")
@js.native
object BuildResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildResult & Double] = js.native
  
  /**
    * The build was canceled before starting.
    */
  @js.native
  sealed trait Canceled
    extends StObject
       with BuildResult
  /* 32 */ val Canceled: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildResult.Canceled & Double = js.native
  
  /**
    * The build completed unsuccessfully.
    */
  @js.native
  sealed trait Failed
    extends StObject
       with BuildResult
  /* 8 */ val Failed: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildResult.Failed & Double = js.native
  
  /**
    * No result
    */
  @js.native
  sealed trait None
    extends StObject
       with BuildResult
  /* 0 */ val None: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildResult.None & Double = js.native
  
  /**
    * The build completed compilation successfully but had other errors.
    */
  @js.native
  sealed trait PartiallySucceeded
    extends StObject
       with BuildResult
  /* 4 */ val PartiallySucceeded: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildResult.PartiallySucceeded & Double = js.native
  
  /**
    * The build completed successfully.
    */
  @js.native
  sealed trait Succeeded
    extends StObject
       with BuildResult
  /* 2 */ val Succeeded: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildResult.Succeeded & Double = js.native
}
