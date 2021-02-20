package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessType extends StObject
@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProcessType")
@js.native
object ProcessType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessType with Double] = js.native
  
  @js.native
  sealed trait Custom extends ProcessType
  /* 1 */ val Custom: typings.vsoNodeApi.coreInterfacesMod.ProcessType.Custom with Double = js.native
  
  @js.native
  sealed trait Inherited extends ProcessType
  /* 2 */ val Inherited: typings.vsoNodeApi.coreInterfacesMod.ProcessType.Inherited with Double = js.native
  
  @js.native
  sealed trait System extends ProcessType
  /* 0 */ val System: typings.vsoNodeApi.coreInterfacesMod.ProcessType.System with Double = js.native
}
