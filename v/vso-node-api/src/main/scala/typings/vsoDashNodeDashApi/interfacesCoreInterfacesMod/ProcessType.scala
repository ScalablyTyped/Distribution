package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProcessType extends js.Object

@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProcessType")
@js.native
object ProcessType extends js.Object {
  @js.native
  sealed trait Custom extends ProcessType
  
  @js.native
  sealed trait Inherited extends ProcessType
  
  @js.native
  sealed trait System extends ProcessType
  
  /* 1 */ val Custom: typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ProcessType.Custom with Double = js.native
  /* 2 */ val Inherited: typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ProcessType.Inherited with Double = js.native
  /* 0 */ val System: typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ProcessType.System with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessType with Double] = js.native
}

