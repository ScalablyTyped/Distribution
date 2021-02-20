package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PipelineProcessTypes extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "PipelineProcessTypes")
@js.native
object PipelineProcessTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PipelineProcessTypes with Double] = js.native
  
  @js.native
  sealed trait Designer extends PipelineProcessTypes
  /* 1 */ val Designer: typings.vsoNodeApi.releaseInterfacesMod.PipelineProcessTypes.Designer with Double = js.native
  
  @js.native
  sealed trait Yaml extends PipelineProcessTypes
  /* 2 */ val Yaml: typings.vsoNodeApi.releaseInterfacesMod.PipelineProcessTypes.Yaml with Double = js.native
}
