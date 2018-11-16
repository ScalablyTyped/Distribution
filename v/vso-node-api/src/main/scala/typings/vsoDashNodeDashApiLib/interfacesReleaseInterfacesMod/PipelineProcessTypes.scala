package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PipelineProcessTypes extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "PipelineProcessTypes")
@js.native
object PipelineProcessTypes extends js.Object {
  @js.native
  sealed trait Designer
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.PipelineProcessTypes
  
  @js.native
  sealed trait Yaml
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.PipelineProcessTypes
  
  /* 1 */ val Designer: Designer with scala.Double = js.native
  /* 2 */ val Yaml: Yaml with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.PipelineProcessTypes with scala.Double
  ] = js.native
}

