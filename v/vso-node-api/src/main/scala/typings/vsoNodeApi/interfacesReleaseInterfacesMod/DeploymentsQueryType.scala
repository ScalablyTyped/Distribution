package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentsQueryType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentsQueryType")
@js.native
object DeploymentsQueryType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentsQueryType & Double] = js.native
  
  @js.native
  sealed trait FailingSince
    extends StObject
       with DeploymentsQueryType
  /* 2 */ val FailingSince: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentsQueryType.FailingSince & Double = js.native
  
  @js.native
  sealed trait Regular
    extends StObject
       with DeploymentsQueryType
  /* 1 */ val Regular: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentsQueryType.Regular & Double = js.native
}
