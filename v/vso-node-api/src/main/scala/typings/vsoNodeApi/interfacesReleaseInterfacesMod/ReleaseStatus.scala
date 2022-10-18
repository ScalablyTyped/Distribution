package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseStatus")
@js.native
object ReleaseStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseStatus & Double] = js.native
  
  @js.native
  sealed trait Abandoned
    extends StObject
       with ReleaseStatus
  /* 4 */ val Abandoned: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseStatus.Abandoned & Double = js.native
  
  @js.native
  sealed trait Active
    extends StObject
       with ReleaseStatus
  /* 2 */ val Active: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseStatus.Active & Double = js.native
  
  @js.native
  sealed trait Draft
    extends StObject
       with ReleaseStatus
  /* 1 */ val Draft: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseStatus.Draft & Double = js.native
  
  @js.native
  sealed trait Undefined
    extends StObject
       with ReleaseStatus
  /* 0 */ val Undefined: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseStatus.Undefined & Double = js.native
}
