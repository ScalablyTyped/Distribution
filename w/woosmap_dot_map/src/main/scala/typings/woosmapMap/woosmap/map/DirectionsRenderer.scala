package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsRenderer
  extends StObject
     with MVCObject {
  
  /**
    * Sets the directions result to render.
    */
  def setDirections(directions: DirectionResult): Unit = js.native
  
  /**
    * Sets the map where to render the directions.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  /**
    * Sets the route index in the DirectionResult object to render.
    * By default the first route (0) will be rendered.
    */
  def setRouteIndex(routeIndex: Double): Unit = js.native
}
