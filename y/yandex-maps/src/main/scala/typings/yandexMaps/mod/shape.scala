package typings.yandexMaps.mod

import typings.yandexMaps.anon.Fill
import typings.yandexMaps.anon.StrokeWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "shape")
@js.native
object shape extends js.Object {
  @js.native
  class Circle protected () extends IShape {
    def this(pixelGeometry: IPixelCircleGeometry) = this()
    def this(pixelGeometry: IPixelCircleGeometry, params: Fill) = this()
  }
  
  @js.native
  class LineString protected () extends IShape {
    def this(pixelGeometry: IPixelLineStringGeometry) = this()
    def this(pixelGeometry: IPixelLineStringGeometry, params: StrokeWidth) = this()
  }
  
  @js.native
  class MultiPolygon protected () extends IShape {
    def this(pixelGeometry: IPixelMultiPolygonGeometry) = this()
    def this(pixelGeometry: IPixelMultiPolygonGeometry, params: Fill) = this()
  }
  
  @js.native
  class Polygon protected () extends IShape {
    def this(pixelGeometry: IPixelPolygonGeometry) = this()
    def this(pixelGeometry: IPixelPolygonGeometry, params: Fill) = this()
  }
  
  @js.native
  class Rectangle protected () extends IShape {
    def this(geometry: IPixelRectangleGeometry) = this()
    def this(geometry: IPixelRectangleGeometry, params: Fill) = this()
  }
  
}

