package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessType with Double] = js.native
  /* 1 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /* 2 */ @js.native
  object Inherited extends TopLevel[Inherited with Double]
  
  /* 0 */ @js.native
  object System extends TopLevel[System with Double]
  
}

