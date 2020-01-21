package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApprovalType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalType")
@js.native
object ApprovalType extends js.Object {
  @js.native
  sealed trait All extends ApprovalType
  
  @js.native
  sealed trait PostDeploy extends ApprovalType
  
  @js.native
  sealed trait PreDeploy extends ApprovalType
  
  @js.native
  sealed trait Undefined extends ApprovalType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalType with Double] = js.native
  /* 3 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 2 */ @js.native
  object PostDeploy extends TopLevel[PostDeploy with Double]
  
  /* 1 */ @js.native
  object PreDeploy extends TopLevel[PreDeploy with Double]
  
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
}

