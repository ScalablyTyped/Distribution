package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BugsBehavior extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "BugsBehavior")
@js.native
object BugsBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BugsBehavior & Double] = js.native
  
  @js.native
  sealed trait AsRequirements
    extends StObject
       with BugsBehavior
  /* 1 */ val AsRequirements: typings.vsoNodeApi.interfacesWorkInterfacesMod.BugsBehavior.AsRequirements & Double = js.native
  
  @js.native
  sealed trait AsTasks
    extends StObject
       with BugsBehavior
  /* 2 */ val AsTasks: typings.vsoNodeApi.interfacesWorkInterfacesMod.BugsBehavior.AsTasks & Double = js.native
  
  @js.native
  sealed trait Off
    extends StObject
       with BugsBehavior
  /* 0 */ val Off: typings.vsoNodeApi.interfacesWorkInterfacesMod.BugsBehavior.Off & Double = js.native
}
