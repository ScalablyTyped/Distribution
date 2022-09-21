package typings.trimblemapsTrimblemapsJs.mod

import typings.std.MouseEvent
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.click
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.contextmenu
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.dblclick
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.mousedown
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.mouseenter
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.mouseleave
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.mousemove
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.mouseout
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.mouseover
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.mouseup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@trimblemaps/trimblemaps-js", "MapMouseEvent")
@js.native
open class MapMouseEvent () extends MapEvent[MouseEvent] {
  
  var defaultPrevented: Boolean = js.native
  
  var lngLat: LngLat = js.native
  
  var point: Point = js.native
  
  def preventDefault(): Unit = js.native
  
  @JSName("type")
  var type_MapMouseEvent: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu = js.native
}
