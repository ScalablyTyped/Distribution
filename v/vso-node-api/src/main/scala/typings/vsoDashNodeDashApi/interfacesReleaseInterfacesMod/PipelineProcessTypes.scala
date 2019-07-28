package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
  
  /* 1 */ val Designer: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.PipelineProcessTypes.Designer with Double = js.native
  /* 2 */ val Yaml: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.PipelineProcessTypes.Yaml with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PipelineProcessTypes with Double] = js.native
}

