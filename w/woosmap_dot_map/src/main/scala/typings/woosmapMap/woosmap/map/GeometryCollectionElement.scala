package typings.woosmapMap.woosmap.map

import typings.woosmapMap.woosmap.map.Data_.LineString
import typings.woosmapMap.woosmap.map.Data_.LinearRing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.woosmapMap.woosmap.map.Data_.Point
  - typings.woosmapMap.woosmap.map.Data_.MultiPoint
  - typings.woosmapMap.woosmap.map.Data_.LineString
  - typings.woosmapMap.woosmap.map.Data_.MultiLineString
  - typings.woosmapMap.woosmap.map.Data_.Polygon
  - typings.woosmapMap.woosmap.map.Data_.MultiPolygon
*/
trait GeometryCollectionElement
  extends StObject
     with GeometryClasses
object GeometryCollectionElement {
  
  inline def LineString(
    forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Unit,
    getArray: () => js.Array[LatLng],
    getAt: Double => LatLng,
    getLength: () => Double,
    getType: () => typings.woosmapMap.woosmapMapStrings.LineString
  ): typings.woosmapMap.woosmap.map.Data_.LineString = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[typings.woosmapMap.woosmap.map.Data_.LineString]
  }
  
  inline def MultiLineString(
    forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Unit,
    getArray: () => js.Array[LineString],
    getAt: Double => LineString,
    getType: () => typings.woosmapMap.woosmapMapStrings.MultiLineString
  ): typings.woosmapMap.woosmap.map.Data_.MultiLineString = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[typings.woosmapMap.woosmap.map.Data_.MultiLineString]
  }
  
  inline def MultiPoint(
    forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Unit,
    getArray: () => js.Array[LatLng],
    getAt: Double => LatLng,
    getLength: () => Double,
    getType: () => typings.woosmapMap.woosmapMapStrings.MultiPoint
  ): typings.woosmapMap.woosmap.map.Data_.MultiPoint = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[typings.woosmapMap.woosmap.map.Data_.MultiPoint]
  }
  
  inline def MultiPolygon(
    forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Unit,
    getArray: () => js.Array[typings.woosmapMap.woosmap.map.Data_.Polygon],
    getAt: Double => typings.woosmapMap.woosmap.map.Data_.Polygon,
    getLength: () => Double,
    getType: () => String
  ): typings.woosmapMap.woosmap.map.Data_.MultiPolygon = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[typings.woosmapMap.woosmap.map.Data_.MultiPolygon]
  }
  
  inline def Point(
    forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Unit,
    get: () => LatLng,
    getType: () => typings.woosmapMap.woosmapMapStrings.Point
  ): typings.woosmapMap.woosmap.map.Data_.Point = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), get = js.Any.fromFunction0(get), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[typings.woosmapMap.woosmap.map.Data_.Point]
  }
  
  inline def Polygon(
    forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Unit,
    getArray: () => js.Array[LinearRing],
    getAt: Double => LinearRing,
    getLength: () => Double,
    getType: () => typings.woosmapMap.woosmapMapStrings.Polygon
  ): typings.woosmapMap.woosmap.map.Data_.Polygon = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[typings.woosmapMap.woosmap.map.Data_.Polygon]
  }
}
