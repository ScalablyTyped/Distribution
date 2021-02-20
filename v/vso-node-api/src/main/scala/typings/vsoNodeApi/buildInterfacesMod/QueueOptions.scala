package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueueOptions extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "QueueOptions")
@js.native
object QueueOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueueOptions with Double] = js.native
  
  /**
    * Create a plan Id for the build, do not run it
    */
  @js.native
  sealed trait DoNotRun extends QueueOptions
  /* 1 */ val DoNotRun: typings.vsoNodeApi.buildInterfacesMod.QueueOptions.DoNotRun with Double = js.native
  
  /**
    * No queue options
    */
  @js.native
  sealed trait None extends QueueOptions
  /* 0 */ val None: typings.vsoNodeApi.buildInterfacesMod.QueueOptions.None with Double = js.native
}
