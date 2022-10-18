package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParallelExecutionTypes extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ParallelExecutionTypes")
@js.native
object ParallelExecutionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParallelExecutionTypes & Double] = js.native
  
  @js.native
  sealed trait MultiConfiguration
    extends StObject
       with ParallelExecutionTypes
  /* 1 */ val MultiConfiguration: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ParallelExecutionTypes.MultiConfiguration & Double = js.native
  
  @js.native
  sealed trait MultiMachine
    extends StObject
       with ParallelExecutionTypes
  /* 2 */ val MultiMachine: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ParallelExecutionTypes.MultiMachine & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ParallelExecutionTypes
  /* 0 */ val None: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ParallelExecutionTypes.None & Double = js.native
}
