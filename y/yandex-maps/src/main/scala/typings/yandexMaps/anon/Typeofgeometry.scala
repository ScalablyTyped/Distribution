package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.yandexMaps.mod.geometry.LineString
import typings.yandexMaps.mod.geometry.Point
import typings.yandexMaps.mod.geometry.Polygon
import typings.yandexMaps.yandexMapsStrings.evenOdd
import typings.yandexMaps.yandexMapsStrings.nonZero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofgeometry extends StObject {
  
  var LineString: Instantiable2[
    /* coordinates */ js.UndefOr[js.Array[js.Array[Double]]], 
    /* options */ js.UndefOr[CoordRendering], 
    typings.yandexMaps.mod.geometry.LineString
  ]
  
  var Point: Instantiable1[
    /* coordinates */ js.UndefOr[js.Array[Double] | Null], 
    typings.yandexMaps.mod.geometry.Point
  ]
  
  var Polygon: Instantiable3[
    /* coordinates */ js.UndefOr[js.Array[js.Array[js.Array[Double]]]], 
    /* fillRule */ js.UndefOr[evenOdd | nonZero], 
    /* options */ js.UndefOr[js.Object], 
    typings.yandexMaps.mod.geometry.Polygon
  ]
  
  val base: Typeofbase
  
  val pixel: Typeofpixel
}
object Typeofgeometry {
  
  inline def apply(
    LineString: Instantiable2[
      /* coordinates */ js.UndefOr[js.Array[js.Array[Double]]], 
      /* options */ js.UndefOr[CoordRendering], 
      LineString
    ],
    Point: Instantiable1[/* coordinates */ js.UndefOr[js.Array[Double] | Null], Point],
    Polygon: Instantiable3[
      /* coordinates */ js.UndefOr[js.Array[js.Array[js.Array[Double]]]], 
      /* fillRule */ js.UndefOr[evenOdd | nonZero], 
      /* options */ js.UndefOr[js.Object], 
      Polygon
    ],
    base: Typeofbase,
    pixel: Typeofpixel
  ): Typeofgeometry = {
    val __obj = js.Dynamic.literal(LineString = LineString.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofgeometry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofgeometry] (val x: Self) extends AnyVal {
    
    inline def setBase(value: Typeofbase): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setLineString(
      value: Instantiable2[
          /* coordinates */ js.UndefOr[js.Array[js.Array[Double]]], 
          /* options */ js.UndefOr[CoordRendering], 
          LineString
        ]
    ): Self = StObject.set(x, "LineString", value.asInstanceOf[js.Any])
    
    inline def setPixel(value: Typeofpixel): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Instantiable1[/* coordinates */ js.UndefOr[js.Array[Double] | Null], Point]): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
    
    inline def setPolygon(
      value: Instantiable3[
          /* coordinates */ js.UndefOr[js.Array[js.Array[js.Array[Double]]]], 
          /* fillRule */ js.UndefOr[evenOdd | nonZero], 
          /* options */ js.UndefOr[js.Object], 
          Polygon
        ]
    ): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
  }
}
