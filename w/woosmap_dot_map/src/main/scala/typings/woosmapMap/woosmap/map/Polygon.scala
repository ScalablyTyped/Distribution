package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polygon
  extends StObject
     with BaseGeometry {
  
  /**
    * Returns the outer path of the polygon.
    */
  def getPath(): MVCArray[LatLng] = js.native
  
  /**
    * Returns all the path that compose the polygon.
    */
  def getPaths(): MVCArray[MVCArray[LatLng]] = js.native
  
  /**
    * Sets the polygon options.
    */
  def setOptions(options: PolygonOptions): Unit = js.native
  
  def setPath(path: js.Array[LatLng | LatLngLiteral]): Unit = js.native
  /**
    * Sets the polygon path.
    */
  def setPath(path: MVCArray[LatLng]): Unit = js.native
  
  def setPaths(paths: js.Array[(js.Array[LatLng | LatLngLiteral]) | LatLng | LatLngLiteral]): Unit = js.native
  /**
    * Sets the polygon paths.
    */
  def setPaths(paths: MVCArray[LatLng | MVCArray[LatLng]]): Unit = js.native
}
