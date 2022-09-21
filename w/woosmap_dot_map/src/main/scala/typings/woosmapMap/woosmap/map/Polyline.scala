package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline
  extends StObject
     with BaseGeometry {
  
  def getPath(): MVCArray[LatLng] = js.native
  
  def setOptions(options: PolylineOptions): Unit = js.native
  
  def setPath(path: js.Array[LatLng | LatLngLiteral]): Unit = js.native
  def setPath(path: MVCArray[LatLng]): Unit = js.native
}
