package typings.vsoNodeApi.fileContainerInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContainerOptions extends js.Object
@JSImport("vso-node-api/interfaces/FileContainerInterfaces", "ContainerOptions")
@js.native
object ContainerOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContainerOptions with Double] = js.native
  
  /**
    * No option.
    */
  @js.native
  sealed trait None extends ContainerOptions
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
