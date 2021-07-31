package typings.wonderJs.deviceManagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPolygonOffsetMode extends StObject
@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EPolygonOffsetMode")
@js.native
object EPolygonOffsetMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPolygonOffsetMode & Double] = js.native
  
  @js.native
  sealed trait CUSTOM
    extends StObject
       with EPolygonOffsetMode
  /* 3 */ val CUSTOM: typings.wonderJs.deviceManagerMod.EPolygonOffsetMode.CUSTOM & Double = js.native
  
  @js.native
  sealed trait IN
    extends StObject
       with EPolygonOffsetMode
  /* 1 */ val IN: typings.wonderJs.deviceManagerMod.EPolygonOffsetMode.IN & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with EPolygonOffsetMode
  /* 0 */ val NONE: typings.wonderJs.deviceManagerMod.EPolygonOffsetMode.NONE & Double = js.native
  
  @js.native
  sealed trait OUT
    extends StObject
       with EPolygonOffsetMode
  /* 2 */ val OUT: typings.wonderJs.deviceManagerMod.EPolygonOffsetMode.OUT & Double = js.native
}
