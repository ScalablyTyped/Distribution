package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProcessType extends js.Object

@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProcessType")
@js.native
object ProcessType extends js.Object {
  @js.native
  sealed trait Custom
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProcessType
  
  @js.native
  sealed trait Inherited
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProcessType
  
  @js.native
  sealed trait System
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProcessType
  
  /* 1 */ val Custom: Custom with scala.Double = js.native
  /* 2 */ val Inherited: Inherited with scala.Double = js.native
  /* 0 */ val System: System with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProcessType with scala.Double] = js.native
}

