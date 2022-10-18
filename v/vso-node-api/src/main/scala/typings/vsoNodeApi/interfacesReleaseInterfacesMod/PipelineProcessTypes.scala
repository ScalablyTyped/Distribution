package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PipelineProcessTypes extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "PipelineProcessTypes")
@js.native
object PipelineProcessTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PipelineProcessTypes & Double] = js.native
  
  @js.native
  sealed trait Designer
    extends StObject
       with PipelineProcessTypes
  /* 1 */ val Designer: typings.vsoNodeApi.interfacesReleaseInterfacesMod.PipelineProcessTypes.Designer & Double = js.native
  
  @js.native
  sealed trait Yaml
    extends StObject
       with PipelineProcessTypes
  /* 2 */ val Yaml: typings.vsoNodeApi.interfacesReleaseInterfacesMod.PipelineProcessTypes.Yaml & Double = js.native
}
