package typings
package vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContainerOptions extends js.Object

@JSImport("vso-node-api/interfaces/FileContainerInterfaces", "ContainerOptions")
@js.native
object ContainerOptions extends js.Object {
  /**
       * No option.
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.ContainerOptions
  
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod.ContainerOptions with scala.Double
  ] = js.native
}

