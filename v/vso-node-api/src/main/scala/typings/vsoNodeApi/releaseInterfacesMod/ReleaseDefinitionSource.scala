package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseDefinitionSource extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionSource")
@js.native
object ReleaseDefinitionSource extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionSource & Double] = js.native
  
  @js.native
  sealed trait Ibiza
    extends StObject
       with ReleaseDefinitionSource
  /* 4 */ val Ibiza: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionSource.Ibiza & Double = js.native
  
  @js.native
  sealed trait PortalExtensionApi
    extends StObject
       with ReleaseDefinitionSource
  /* 8 */ val PortalExtensionApi: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionSource.PortalExtensionApi & Double = js.native
  
  @js.native
  sealed trait RestApi
    extends StObject
       with ReleaseDefinitionSource
  /* 1 */ val RestApi: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionSource.RestApi & Double = js.native
  
  @js.native
  sealed trait Undefined
    extends StObject
       with ReleaseDefinitionSource
  /* 0 */ val Undefined: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionSource.Undefined & Double = js.native
  
  @js.native
  sealed trait UserInterface
    extends StObject
       with ReleaseDefinitionSource
  /* 2 */ val UserInterface: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionSource.UserInterface & Double = js.native
}
