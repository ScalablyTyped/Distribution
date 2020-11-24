package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessType extends js.Object
@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProcessType")
@js.native
object ProcessType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessType with Double] = js.native
  
  @js.native
  sealed trait Custom extends ProcessType
  /* 1 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  @js.native
  sealed trait Inherited extends ProcessType
  /* 2 */ @js.native
  object Inherited extends TopLevel[Inherited with Double]
  
  @js.native
  sealed trait System extends ProcessType
  /* 0 */ @js.native
  object System extends TopLevel[System with Double]
}
