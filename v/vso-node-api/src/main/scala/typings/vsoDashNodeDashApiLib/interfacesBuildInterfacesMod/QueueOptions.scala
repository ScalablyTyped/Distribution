package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
  sealed trait DoNotRun
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueueOptions
  
  /**
       * No queue options
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueueOptions
  
  /* 1 */ val DoNotRun: DoNotRun with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueueOptions with scala.Double
  ] = js.native
}

