package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BoardColumnType extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "BoardColumnType")
@js.native
object BoardColumnType extends js.Object {
  @js.native
  sealed trait InProgress extends BoardColumnType
  
  @js.native
  sealed trait Incoming extends BoardColumnType
  
  @js.native
  sealed trait Outgoing extends BoardColumnType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BoardColumnType with Double] = js.native
  /* 1 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 0 */ @js.native
  object Incoming extends TopLevel[Incoming with Double]
  
  /* 2 */ @js.native
  object Outgoing extends TopLevel[Outgoing with Double]
  
}

