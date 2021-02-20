package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IssueSource extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "IssueSource")
@js.native
object IssueSource extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IssueSource with Double] = js.native
  
  @js.native
  sealed trait None extends IssueSource
  /* 0 */ val None: typings.vsoNodeApi.releaseInterfacesMod.IssueSource.None with Double = js.native
  
  @js.native
  sealed trait System extends IssueSource
  /* 2 */ val System: typings.vsoNodeApi.releaseInterfacesMod.IssueSource.System with Double = js.native
  
  @js.native
  sealed trait User extends IssueSource
  /* 1 */ val User: typings.vsoNodeApi.releaseInterfacesMod.IssueSource.User with Double = js.native
}
