package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeFrame extends js.Object
@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimeFrame")
@js.native
object TimeFrame extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeFrame with Double] = js.native
  
  @js.native
  sealed trait Current extends TimeFrame
  /* 1 */ @js.native
  object Current extends TopLevel[Current with Double]
  
  @js.native
  sealed trait Future extends TimeFrame
  /* 2 */ @js.native
  object Future extends TopLevel[Future with Double]
  
  @js.native
  sealed trait Past extends TimeFrame
  /* 0 */ @js.native
  object Past extends TopLevel[Past with Double]
}
