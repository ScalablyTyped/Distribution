package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PipelineProcessTypes extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "PipelineProcessTypes")
@js.native
object PipelineProcessTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PipelineProcessTypes with Double] = js.native
  
  @js.native
  sealed trait Designer extends PipelineProcessTypes
  /* 1 */ @js.native
  object Designer extends TopLevel[Designer with Double]
  
  @js.native
  sealed trait Yaml extends PipelineProcessTypes
  /* 2 */ @js.native
  object Yaml extends TopLevel[Yaml with Double]
}
