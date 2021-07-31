package typings.wonderJs.deviceManagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ESide extends StObject
@JSImport("wonder.js/dist/es2015/device/DeviceManager", "ESide")
@js.native
object ESide extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESide & Double] = js.native
  
  @js.native
  sealed trait BACK
    extends StObject
       with ESide
  /* 2 */ val BACK: typings.wonderJs.deviceManagerMod.ESide.BACK & Double = js.native
  
  @js.native
  sealed trait BOTH
    extends StObject
       with ESide
  /* 1 */ val BOTH: typings.wonderJs.deviceManagerMod.ESide.BOTH & Double = js.native
  
  @js.native
  sealed trait FRONT
    extends StObject
       with ESide
  /* 3 */ val FRONT: typings.wonderJs.deviceManagerMod.ESide.FRONT & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with ESide
  /* 0 */ val NONE: typings.wonderJs.deviceManagerMod.ESide.NONE & Double = js.native
}
