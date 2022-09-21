package typings.trimblemapsTrimblemapsJs.mod

import typings.std.WheelEvent
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@trimblemaps/trimblemaps-js", "MapWheelEvent")
@js.native
open class MapWheelEvent () extends MapEvent[WheelEvent] {
  
  var defaultPrevented: Boolean = js.native
  
  def preventDefault(): Unit = js.native
  
  @JSName("type")
  var type_MapWheelEvent: wheel = js.native
}
