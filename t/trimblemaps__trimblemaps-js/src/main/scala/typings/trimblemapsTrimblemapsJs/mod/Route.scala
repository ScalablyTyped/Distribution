package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.end
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.start
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@trimblemaps/trimblemaps-js", "Route")
@js.native
open class Route () extends Evented {
  def this(options: RouteOptions) = this()
  
  def addStopIcon(stopType: start | end | stop, url: String): Unit = js.native
  
  def addTo(map: Map): this.type = js.native
  
  def canRedo(): Boolean = js.native
  
  def canUndo(): Boolean = js.native
  
  def disableRouteStack(): Unit = js.native
  
  def enableRouteStack(): Unit = js.native
  
  def frame(): this.type = js.native
  
  /* @deprecated */
  def frameRoute(): this.type = js.native
  
  def getReports(options: RouteOptions): Unit = js.native
  
  def getRouteId(): String = js.native
  
  def getRouteWithNewStop(newStop: LngLat, routeLegPosition: Double): Unit = js.native
  
  def redo(): Unit = js.native
  
  def remove(): this.type = js.native
  
  def setDraggable(isDraggable: Boolean): this.type = js.native
  
  def styleStopIcons(style: js.Object): Unit = js.native
  
  def undo(): Unit = js.native
  
  def update(options: RouteOptions): Unit = js.native
}
