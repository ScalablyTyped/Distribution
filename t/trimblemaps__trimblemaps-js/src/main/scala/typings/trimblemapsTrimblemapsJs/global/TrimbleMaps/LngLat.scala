package typings.trimblemapsTrimblemapsJs.global.TrimbleMaps

import typings.trimblemapsTrimblemapsJs.mod.LngLatLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TrimbleMaps.LngLat")
@js.native
open class LngLat protected ()
  extends typings.trimblemapsTrimblemapsJs.mod.LngLat {
  def this(lng: Double, lat: Double) = this()
}
/* static members */
object LngLat {
  
  @JSGlobal("TrimbleMaps.LngLat")
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(input: LngLatLike): typings.trimblemapsTrimblemapsJs.mod.LngLat = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(input.asInstanceOf[js.Any]).asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.LngLat]
}
