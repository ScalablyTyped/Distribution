package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IssueType extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "IssueType")
@js.native
object IssueType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IssueType & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with IssueType
  /* 1 */ val Error: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.IssueType.Error & Double = js.native
  
  @js.native
  sealed trait Warning
    extends StObject
       with IssueType
  /* 2 */ val Warning: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.IssueType.Warning & Double = js.native
}
