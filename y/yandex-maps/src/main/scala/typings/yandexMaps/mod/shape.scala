package typings.yandexMaps.mod

import typings.yandexMaps.anon.Fill
import typings.yandexMaps.anon.StrokeWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shape {
  
  @JSImport("yandex-maps", "shape.Circle")
  @js.native
  class Circle protected () extends IShape {
    def this(pixelGeometry: IPixelCircleGeometry) = this()
    def this(pixelGeometry: IPixelCircleGeometry, params: Fill) = this()
  }
  
  @JSImport("yandex-maps", "shape.LineString")
  @js.native
  class LineString protected () extends IShape {
    def this(pixelGeometry: IPixelLineStringGeometry) = this()
    def this(pixelGeometry: IPixelLineStringGeometry, params: StrokeWidth) = this()
  }
  
  @JSImport("yandex-maps", "shape.MultiPolygon")
  @js.native
  class MultiPolygon protected () extends IShape {
    def this(pixelGeometry: IPixelMultiPolygonGeometry) = this()
    def this(pixelGeometry: IPixelMultiPolygonGeometry, params: Fill) = this()
  }
  
  @JSImport("yandex-maps", "shape.Polygon")
  @js.native
  class Polygon protected () extends IShape {
    def this(pixelGeometry: IPixelPolygonGeometry) = this()
    def this(pixelGeometry: IPixelPolygonGeometry, params: Fill) = this()
  }
  
  @JSImport("yandex-maps", "shape.Rectangle")
  @js.native
  class Rectangle protected () extends IShape {
    def this(geometry: IPixelRectangleGeometry) = this()
    def this(geometry: IPixelRectangleGeometry, params: Fill) = this()
  }
}
