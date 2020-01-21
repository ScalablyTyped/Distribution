package typings.vsoNodeApi.fileContainerInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContainerOptions with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

