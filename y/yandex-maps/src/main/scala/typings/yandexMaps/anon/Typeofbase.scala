package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.yandexMaps.mod.geometry.base.LineString
import typings.yandexMaps.mod.geometry.base.Point
import typings.yandexMaps.mod.geometry.base.Polygon
import typings.yandexMaps.yandexMapsStrings.evenOdd
import typings.yandexMaps.yandexMapsStrings.nonZero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofbase extends StObject {
  
  var LineString: Instantiable0[typings.yandexMaps.mod.geometry.base.LineString]
  
  var Point: Instantiable0[typings.yandexMaps.mod.geometry.base.Point]
  
  var Polygon: Instantiable2[
    /* coordinates */ js.UndefOr[js.Array[js.Array[js.Array[Double]]]], 
    /* fillRule */ js.UndefOr[evenOdd | nonZero], 
    typings.yandexMaps.mod.geometry.base.Polygon
  ]
}
object Typeofbase {
  
  inline def apply(
    LineString: Instantiable0[LineString],
    Point: Instantiable0[Point],
    Polygon: Instantiable2[
      /* coordinates */ js.UndefOr[js.Array[js.Array[js.Array[Double]]]], 
      /* fillRule */ js.UndefOr[evenOdd | nonZero], 
      Polygon
    ]
  ): Typeofbase = {
    val __obj = js.Dynamic.literal(LineString = LineString.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofbase]
  }
  
  extension [Self <: Typeofbase](x: Self) {
    
    inline def setLineString(value: Instantiable0[LineString]): Self = StObject.set(x, "LineString", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Instantiable0[Point]): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
    
    inline def setPolygon(
      value: Instantiable2[
          /* coordinates */ js.UndefOr[js.Array[js.Array[js.Array[Double]]]], 
          /* fillRule */ js.UndefOr[evenOdd | nonZero], 
          Polygon
        ]
    ): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
  }
}
