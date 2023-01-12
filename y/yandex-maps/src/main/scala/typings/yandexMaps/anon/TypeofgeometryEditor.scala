package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.yandexMaps.mod.ICircleGeometry
import typings.yandexMaps.mod.ILineStringGeometry
import typings.yandexMaps.mod.IPolygonGeometry
import typings.yandexMaps.mod.geometryEditor.Circle
import typings.yandexMaps.mod.geometryEditor.LineString
import typings.yandexMaps.mod.geometryEditor.Point
import typings.yandexMaps.mod.geometryEditor.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofgeometryEditor extends StObject {
  
  var Circle: Instantiable2[
    /* geometry */ ICircleGeometry, 
    /* options */ js.UndefOr[js.Object], 
    typings.yandexMaps.mod.geometryEditor.Circle
  ]
  
  var LineString: Instantiable2[
    /* geometry */ ILineStringGeometry, 
    /* options */ js.UndefOr[js.Object], 
    typings.yandexMaps.mod.geometryEditor.LineString
  ]
  
  var Point: Instantiable0[typings.yandexMaps.mod.geometryEditor.Point]
  
  var Polygon: Instantiable2[
    /* geometry */ IPolygonGeometry, 
    /* options */ js.Object, 
    typings.yandexMaps.mod.geometryEditor.Polygon
  ]
  
  val model: Typeofmodel
  
  val view: Typeofview
}
object TypeofgeometryEditor {
  
  inline def apply(
    Circle: Instantiable2[/* geometry */ ICircleGeometry, /* options */ js.UndefOr[js.Object], Circle],
    LineString: Instantiable2[/* geometry */ ILineStringGeometry, /* options */ js.UndefOr[js.Object], LineString],
    Point: Instantiable0[Point],
    Polygon: Instantiable2[/* geometry */ IPolygonGeometry, /* options */ js.Object, Polygon],
    model: Typeofmodel,
    view: Typeofview
  ): TypeofgeometryEditor = {
    val __obj = js.Dynamic.literal(Circle = Circle.asInstanceOf[js.Any], LineString = LineString.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofgeometryEditor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofgeometryEditor] (val x: Self) extends AnyVal {
    
    inline def setCircle(value: Instantiable2[/* geometry */ ICircleGeometry, /* options */ js.UndefOr[js.Object], Circle]): Self = StObject.set(x, "Circle", value.asInstanceOf[js.Any])
    
    inline def setLineString(
      value: Instantiable2[/* geometry */ ILineStringGeometry, /* options */ js.UndefOr[js.Object], LineString]
    ): Self = StObject.set(x, "LineString", value.asInstanceOf[js.Any])
    
    inline def setModel(value: Typeofmodel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Instantiable0[Point]): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
    
    inline def setPolygon(value: Instantiable2[/* geometry */ IPolygonGeometry, /* options */ js.Object, Polygon]): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
    
    inline def setView(value: Typeofview): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
