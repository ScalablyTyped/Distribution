package typings.yandexMaps.mod

import typings.yandexMaps.anon.Fill
import typings.yandexMaps.anon.StrokeWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shape {
  
  @JSImport("yandex-maps", "shape.Circle")
  @js.native
  open class Circle protected ()
    extends StObject
       with IShape {
    def this(pixelGeometry: IPixelCircleGeometry) = this()
    def this(pixelGeometry: IPixelCircleGeometry, params: Fill) = this()
    
    /* CompleteClass */
    override def contains(position: js.Array[Double]): Boolean = js.native
    
    /* CompleteClass */
    override def equals(shape: IShape): Boolean = js.native
    
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    
    /* CompleteClass */
    override def getGeometry(): IPixelGeometry = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
    
    /* CompleteClass */
    override def scale(factor: Double): IShape = js.native
    
    /* CompleteClass */
    override def shift(offset: js.Array[Double]): IShape = js.native
  }
  
  @JSImport("yandex-maps", "shape.LineString")
  @js.native
  open class LineString protected ()
    extends StObject
       with IShape {
    def this(pixelGeometry: IPixelLineStringGeometry) = this()
    def this(pixelGeometry: IPixelLineStringGeometry, params: StrokeWidth) = this()
    
    /* CompleteClass */
    override def contains(position: js.Array[Double]): Boolean = js.native
    
    /* CompleteClass */
    override def equals(shape: IShape): Boolean = js.native
    
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    
    /* CompleteClass */
    override def getGeometry(): IPixelGeometry = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
    
    /* CompleteClass */
    override def scale(factor: Double): IShape = js.native
    
    /* CompleteClass */
    override def shift(offset: js.Array[Double]): IShape = js.native
  }
  
  @JSImport("yandex-maps", "shape.MultiPolygon")
  @js.native
  open class MultiPolygon protected ()
    extends StObject
       with IShape {
    def this(pixelGeometry: IPixelMultiPolygonGeometry) = this()
    def this(pixelGeometry: IPixelMultiPolygonGeometry, params: Fill) = this()
    
    /* CompleteClass */
    override def contains(position: js.Array[Double]): Boolean = js.native
    
    /* CompleteClass */
    override def equals(shape: IShape): Boolean = js.native
    
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    
    /* CompleteClass */
    override def getGeometry(): IPixelGeometry = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
    
    /* CompleteClass */
    override def scale(factor: Double): IShape = js.native
    
    /* CompleteClass */
    override def shift(offset: js.Array[Double]): IShape = js.native
  }
  
  @JSImport("yandex-maps", "shape.Polygon")
  @js.native
  open class Polygon protected ()
    extends StObject
       with IShape {
    def this(pixelGeometry: IPixelPolygonGeometry) = this()
    def this(pixelGeometry: IPixelPolygonGeometry, params: Fill) = this()
    
    /* CompleteClass */
    override def contains(position: js.Array[Double]): Boolean = js.native
    
    /* CompleteClass */
    override def equals(shape: IShape): Boolean = js.native
    
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    
    /* CompleteClass */
    override def getGeometry(): IPixelGeometry = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
    
    /* CompleteClass */
    override def scale(factor: Double): IShape = js.native
    
    /* CompleteClass */
    override def shift(offset: js.Array[Double]): IShape = js.native
  }
  
  @JSImport("yandex-maps", "shape.Rectangle")
  @js.native
  open class Rectangle protected ()
    extends StObject
       with IShape {
    def this(geometry: IPixelRectangleGeometry) = this()
    def this(geometry: IPixelRectangleGeometry, params: Fill) = this()
    
    /* CompleteClass */
    override def contains(position: js.Array[Double]): Boolean = js.native
    
    /* CompleteClass */
    override def equals(shape: IShape): Boolean = js.native
    
    /* CompleteClass */
    override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    
    /* CompleteClass */
    override def getGeometry(): IPixelGeometry = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
    
    /* CompleteClass */
    override def scale(factor: Double): IShape = js.native
    
    /* CompleteClass */
    override def shift(offset: js.Array[Double]): IShape = js.native
  }
}
