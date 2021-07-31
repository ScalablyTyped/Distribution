package typings.wonderJs.deviceManagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ECanvasType extends StObject
@JSImport("wonder.js/dist/es2015/device/DeviceManager", "ECanvasType")
@js.native
object ECanvasType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ECanvasType & Double] = js.native
  
  @js.native
  sealed trait TwoDUI
    extends StObject
       with ECanvasType
  /* 0 */ val TwoDUI: typings.wonderJs.deviceManagerMod.ECanvasType.TwoDUI & Double = js.native
}
