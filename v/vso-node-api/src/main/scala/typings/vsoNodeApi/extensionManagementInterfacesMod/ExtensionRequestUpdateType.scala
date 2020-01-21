package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionRequestUpdateType extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionRequestUpdateType")
@js.native
object ExtensionRequestUpdateType extends js.Object {
  @js.native
  sealed trait Approved extends ExtensionRequestUpdateType
  
  @js.native
  sealed trait Created extends ExtensionRequestUpdateType
  
  @js.native
  sealed trait Deleted extends ExtensionRequestUpdateType
  
  @js.native
  sealed trait Rejected extends ExtensionRequestUpdateType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionRequestUpdateType with Double] = js.native
  /* 2 */ @js.native
  object Approved extends TopLevel[Approved with Double]
  
  /* 1 */ @js.native
  object Created extends TopLevel[Created with Double]
  
  /* 4 */ @js.native
  object Deleted extends TopLevel[Deleted with Double]
  
  /* 3 */ @js.native
  object Rejected extends TopLevel[Rejected with Double]
  
}

