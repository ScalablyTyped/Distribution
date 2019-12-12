package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueueOptions.DoNotRun
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueueOptions.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueueOptions extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "QueueOptions")
@js.native
object QueueOptions extends js.Object {
  /**
    * Create a plan Id for the build, do not run it
    */
  @js.native
  sealed trait DoNotRun extends QueueOptions
  
  /**
    * No queue options
    */
  @js.native
  sealed trait None extends QueueOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueueOptions with Double] = js.native
  /* 1 */ @js.native
  object DoNotRun extends TopLevel[DoNotRun with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

