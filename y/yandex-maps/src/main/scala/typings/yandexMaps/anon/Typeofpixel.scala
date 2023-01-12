package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.yandexMaps.mod.geometry.pixel.Circle
import typings.yandexMaps.mod.geometry.pixel.LineString
import typings.yandexMaps.mod.geometry.pixel.MultiLineString
import typings.yandexMaps.mod.geometry.pixel.MultiPolygon
import typings.yandexMaps.mod.geometry.pixel.Point
import typings.yandexMaps.mod.geometry.pixel.Polygon
import typings.yandexMaps.mod.geometry.pixel.Rectangle
import typings.yandexMaps.yandexMapsStrings.evenOdd
import typings.yandexMaps.yandexMapsStrings.nonZero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofpixel extends StObject {
  
  var Circle: Instantiable3[
    /* coordinates */ js.Array[Double] | Null, 
    /* radius */ Double, 
    /* metaData */ js.UndefOr[js.Object], 
    typings.yandexMaps.mod.geometry.pixel.Circle
  ]
  
  var LineString: Instantiable2[
    /* coordinates */ js.Array[js.Array[Double]], 
    /* metaData */ js.UndefOr[js.Object], 
    typings.yandexMaps.mod.geometry.pixel.LineString
  ]
  
  var MultiLineString: Instantiable2[
    /* coordinates */ js.Array[js.Array[js.Array[Double]]], 
    /* metaData */ js.UndefOr[js.Object], 
    typings.yandexMaps.mod.geometry.pixel.MultiLineString
  ]
  
  var MultiPolygon: Instantiable3[
    /* coordinates */ js.Array[js.Array[js.Array[js.Array[Double]]]], 
    /* fillRule */ evenOdd | nonZero, 
    /* metaData */ js.UndefOr[js.Object], 
    typings.yandexMaps.mod.geometry.pixel.MultiPolygon
  ]
  
  var Point: Instantiable2[
    /* position */ js.Array[Double] | Null, 
    /* metaData */ js.UndefOr[js.Object], 
    typings.yandexMaps.mod.geometry.pixel.Point
  ]
  
  var Polygon: Instantiable3[
    /* coordinates */ js.Array[js.Array[js.Array[Double]]], 
    /* fillRule */ evenOdd | nonZero, 
    /* metaData */ js.UndefOr[js.Object], 
    typings.yandexMaps.mod.geometry.pixel.Polygon
  ]
  
  var Rectangle: Instantiable2[
    /* coordinates */ js.Array[js.Array[Double]] | Null, 
    /* metaData */ js.UndefOr[js.Object], 
    typings.yandexMaps.mod.geometry.pixel.Rectangle
  ]
}
object Typeofpixel {
  
  inline def apply(
    Circle: Instantiable3[
      /* coordinates */ js.Array[Double] | Null, 
      /* radius */ Double, 
      /* metaData */ js.UndefOr[js.Object], 
      Circle
    ],
    LineString: Instantiable2[
      /* coordinates */ js.Array[js.Array[Double]], 
      /* metaData */ js.UndefOr[js.Object], 
      LineString
    ],
    MultiLineString: Instantiable2[
      /* coordinates */ js.Array[js.Array[js.Array[Double]]], 
      /* metaData */ js.UndefOr[js.Object], 
      MultiLineString
    ],
    MultiPolygon: Instantiable3[
      /* coordinates */ js.Array[js.Array[js.Array[js.Array[Double]]]], 
      /* fillRule */ evenOdd | nonZero, 
      /* metaData */ js.UndefOr[js.Object], 
      MultiPolygon
    ],
    Point: Instantiable2[/* position */ js.Array[Double] | Null, /* metaData */ js.UndefOr[js.Object], Point],
    Polygon: Instantiable3[
      /* coordinates */ js.Array[js.Array[js.Array[Double]]], 
      /* fillRule */ evenOdd | nonZero, 
      /* metaData */ js.UndefOr[js.Object], 
      Polygon
    ],
    Rectangle: Instantiable2[
      /* coordinates */ js.Array[js.Array[Double]] | Null, 
      /* metaData */ js.UndefOr[js.Object], 
      Rectangle
    ]
  ): Typeofpixel = {
    val __obj = js.Dynamic.literal(Circle = Circle.asInstanceOf[js.Any], LineString = LineString.asInstanceOf[js.Any], MultiLineString = MultiLineString.asInstanceOf[js.Any], MultiPolygon = MultiPolygon.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpixel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofpixel] (val x: Self) extends AnyVal {
    
    inline def setCircle(
      value: Instantiable3[
          /* coordinates */ js.Array[Double] | Null, 
          /* radius */ Double, 
          /* metaData */ js.UndefOr[js.Object], 
          Circle
        ]
    ): Self = StObject.set(x, "Circle", value.asInstanceOf[js.Any])
    
    inline def setLineString(
      value: Instantiable2[
          /* coordinates */ js.Array[js.Array[Double]], 
          /* metaData */ js.UndefOr[js.Object], 
          LineString
        ]
    ): Self = StObject.set(x, "LineString", value.asInstanceOf[js.Any])
    
    inline def setMultiLineString(
      value: Instantiable2[
          /* coordinates */ js.Array[js.Array[js.Array[Double]]], 
          /* metaData */ js.UndefOr[js.Object], 
          MultiLineString
        ]
    ): Self = StObject.set(x, "MultiLineString", value.asInstanceOf[js.Any])
    
    inline def setMultiPolygon(
      value: Instantiable3[
          /* coordinates */ js.Array[js.Array[js.Array[js.Array[Double]]]], 
          /* fillRule */ evenOdd | nonZero, 
          /* metaData */ js.UndefOr[js.Object], 
          MultiPolygon
        ]
    ): Self = StObject.set(x, "MultiPolygon", value.asInstanceOf[js.Any])
    
    inline def setPoint(
      value: Instantiable2[/* position */ js.Array[Double] | Null, /* metaData */ js.UndefOr[js.Object], Point]
    ): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
    
    inline def setPolygon(
      value: Instantiable3[
          /* coordinates */ js.Array[js.Array[js.Array[Double]]], 
          /* fillRule */ evenOdd | nonZero, 
          /* metaData */ js.UndefOr[js.Object], 
          Polygon
        ]
    ): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
    
    inline def setRectangle(
      value: Instantiable2[
          /* coordinates */ js.Array[js.Array[Double]] | Null, 
          /* metaData */ js.UndefOr[js.Object], 
          Rectangle
        ]
    ): Self = StObject.set(x, "Rectangle", value.asInstanceOf[js.Any])
  }
}
