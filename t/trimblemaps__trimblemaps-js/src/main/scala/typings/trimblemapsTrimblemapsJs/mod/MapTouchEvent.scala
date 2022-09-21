package typings.trimblemapsTrimblemapsJs.mod

import typings.std.TouchEvent
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.touchcancel
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.touchend
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.touchstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@trimblemaps/trimblemaps-js", "MapTouchEvent")
@js.native
open class MapTouchEvent () extends MapEvent[TouchEvent] {
  
  var defaultPrevented: Boolean = js.native
  
  var lngLat: LngLat = js.native
  
  var lngLats: js.Array[LngLat] = js.native
  
  var point: Point = js.native
  
  var points: js.Array[Point] = js.native
  
  def preventDefault(): Unit = js.native
  
  @JSName("type")
  var type_MapTouchEvent: touchstart | touchend | touchcancel = js.native
}
