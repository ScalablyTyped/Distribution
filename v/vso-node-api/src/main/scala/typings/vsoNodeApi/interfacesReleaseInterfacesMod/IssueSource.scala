package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IssueSource extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "IssueSource")
@js.native
object IssueSource extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IssueSource & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with IssueSource
  /* 0 */ val None: typings.vsoNodeApi.interfacesReleaseInterfacesMod.IssueSource.None & Double = js.native
  
  @js.native
  sealed trait System
    extends StObject
       with IssueSource
  /* 2 */ val System: typings.vsoNodeApi.interfacesReleaseInterfacesMod.IssueSource.System & Double = js.native
  
  @js.native
  sealed trait User
    extends StObject
       with IssueSource
  /* 1 */ val User: typings.vsoNodeApi.interfacesReleaseInterfacesMod.IssueSource.User & Double = js.native
}
