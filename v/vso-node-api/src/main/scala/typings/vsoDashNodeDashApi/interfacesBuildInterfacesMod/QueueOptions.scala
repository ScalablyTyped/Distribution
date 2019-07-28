package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
  
  /* 1 */ val DoNotRun: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueueOptions.DoNotRun with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueueOptions.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueueOptions with Double] = js.native
}

