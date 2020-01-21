package typings.wonderJs.deviceManagerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPolygonOffsetMode extends js.Object

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "EPolygonOffsetMode")
@js.native
object EPolygonOffsetMode extends js.Object {
  @js.native
  sealed trait CUSTOM extends EPolygonOffsetMode
  
  @js.native
  sealed trait IN extends EPolygonOffsetMode
  
  @js.native
  sealed trait NONE extends EPolygonOffsetMode
  
  @js.native
  sealed trait OUT extends EPolygonOffsetMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPolygonOffsetMode with Double] = js.native
  /* 3 */ @js.native
  object CUSTOM extends TopLevel[CUSTOM with Double]
  
  /* 1 */ @js.native
  object IN extends TopLevel[IN with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 2 */ @js.native
  object OUT extends TopLevel[OUT with Double]
  
}

