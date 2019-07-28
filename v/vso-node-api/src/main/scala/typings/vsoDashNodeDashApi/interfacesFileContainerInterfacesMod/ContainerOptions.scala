package typings.vsoDashNodeDashApi.interfacesFileContainerInterfacesMod

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
  sealed trait None extends ContainerOptions
  
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesFileContainerInterfacesMod.ContainerOptions.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContainerOptions with Double] = js.native
}

