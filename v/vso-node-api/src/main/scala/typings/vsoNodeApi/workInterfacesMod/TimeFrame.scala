package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeFrame extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimeFrame")
@js.native
object TimeFrame extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeFrame with Double] = js.native
  
  @js.native
  sealed trait Current extends TimeFrame
  /* 1 */ val Current: typings.vsoNodeApi.workInterfacesMod.TimeFrame.Current with Double = js.native
  
  @js.native
  sealed trait Future extends TimeFrame
  /* 2 */ val Future: typings.vsoNodeApi.workInterfacesMod.TimeFrame.Future with Double = js.native
  
  @js.native
  sealed trait Past extends TimeFrame
  /* 0 */ val Past: typings.vsoNodeApi.workInterfacesMod.TimeFrame.Past with Double = js.native
}
