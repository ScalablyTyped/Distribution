package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BoardColumnType extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "BoardColumnType")
@js.native
object BoardColumnType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BoardColumnType with Double] = js.native
  
  @js.native
  sealed trait InProgress extends BoardColumnType
  /* 1 */ val InProgress: typings.vsoNodeApi.workInterfacesMod.BoardColumnType.InProgress with Double = js.native
  
  @js.native
  sealed trait Incoming extends BoardColumnType
  /* 0 */ val Incoming: typings.vsoNodeApi.workInterfacesMod.BoardColumnType.Incoming with Double = js.native
  
  @js.native
  sealed trait Outgoing extends BoardColumnType
  /* 2 */ val Outgoing: typings.vsoNodeApi.workInterfacesMod.BoardColumnType.Outgoing with Double = js.native
}
