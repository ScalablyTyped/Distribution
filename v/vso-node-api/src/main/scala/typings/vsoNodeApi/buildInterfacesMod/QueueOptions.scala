package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueueOptions extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "QueueOptions")
@js.native
object QueueOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueueOptions with Double] = js.native
  
  /**
    * Create a plan Id for the build, do not run it
    */
  @js.native
  sealed trait DoNotRun extends QueueOptions
  /* 1 */ @js.native
  object DoNotRun extends TopLevel[DoNotRun with Double]
  
  /**
    * No queue options
    */
  @js.native
  sealed trait None extends QueueOptions
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
