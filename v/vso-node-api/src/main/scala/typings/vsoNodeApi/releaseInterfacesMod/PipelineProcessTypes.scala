package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PipelineProcessTypes extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "PipelineProcessTypes")
@js.native
object PipelineProcessTypes extends js.Object {
  @js.native
  sealed trait Designer extends PipelineProcessTypes
  
  @js.native
  sealed trait Yaml extends PipelineProcessTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PipelineProcessTypes with Double] = js.native
  /* 1 */ @js.native
  object Designer extends TopLevel[Designer with Double]
  
  /* 2 */ @js.native
  object Yaml extends TopLevel[Yaml with Double]
  
}

