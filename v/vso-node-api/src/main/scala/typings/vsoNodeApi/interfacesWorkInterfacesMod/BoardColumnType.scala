package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BoardColumnType extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "BoardColumnType")
@js.native
object BoardColumnType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BoardColumnType & Double] = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with BoardColumnType
  /* 1 */ val InProgress: typings.vsoNodeApi.interfacesWorkInterfacesMod.BoardColumnType.InProgress & Double = js.native
  
  @js.native
  sealed trait Incoming
    extends StObject
       with BoardColumnType
  /* 0 */ val Incoming: typings.vsoNodeApi.interfacesWorkInterfacesMod.BoardColumnType.Incoming & Double = js.native
  
  @js.native
  sealed trait Outgoing
    extends StObject
       with BoardColumnType
  /* 2 */ val Outgoing: typings.vsoNodeApi.interfacesWorkInterfacesMod.BoardColumnType.Outgoing & Double = js.native
}
