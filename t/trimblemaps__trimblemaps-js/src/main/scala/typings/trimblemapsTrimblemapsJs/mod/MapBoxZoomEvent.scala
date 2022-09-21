package typings.trimblemapsTrimblemapsJs.mod

import typings.std.MouseEvent
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.boxzoomcancel
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.boxzoomend
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.boxzoomstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapBoxZoomEvent extends MapEvent[MouseEvent] {
  
  var boxZoomBounds: LngLatBounds = js.native
  
  @JSName("type")
  var type_MapBoxZoomEvent: boxzoomstart | boxzoomend | boxzoomcancel = js.native
}
