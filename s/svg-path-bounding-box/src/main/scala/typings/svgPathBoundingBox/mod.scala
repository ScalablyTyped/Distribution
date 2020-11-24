package typings.svgPathBoundingBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svg-path-bounding-box", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(path: String): BoundingBoxView = js.native
  
  /**
    * pass in initial points if you want
    * @see https://github.com/gabelerner/canvg/blob/860e418aca67b9a41e858a223d74d375793ec364/canvg.js#L449
    */
  @js.native
  class BoundingBox protected () extends js.Object {
    def this(x1: Double, y1: Double, x2: Double, y2: Double) = this()
    
    /** @see http://blog.hackers-cafe.net/2009/06/how-to-calculate-bezier-curves-bounding.html */
    def addBezierCurve(
      p0x: Double,
      p0y: Double,
      p1x: Double,
      p1y: Double,
      p2x: Double,
      p2y: Double,
      p3x: Double,
      p3y: Double
    ): Unit = js.native
    
    def addPoint(x: Double, y: Double): Unit = js.native
    
    def addQuadraticCurve(p0x: Double, p0y: Double, p1x: Double, p1y: Double, p2x: Double, p2y: Double): Unit = js.native
    
    def addX(x: Double): Unit = js.native
    
    def addY(y: Double): Unit = js.native
    
    def height(): Double = js.native
    
    def width(): Double = js.native
    
    var x1: Double = js.native
    
    var x2: Double = js.native
    
    var y1: Double = js.native
    
    var y2: Double = js.native
  }
  
  @js.native
  class BoundingBoxView protected () extends js.Object {
    def this(boundingBox: BoundingBox) = this()
    
    var height: Double = js.native
    
    var maxX: Double = js.native
    
    var maxY: Double = js.native
    
    var minX: Double = js.native
    
    var minY: Double = js.native
    
    def round(): this.type = js.native
    def round(precision: Double): this.type = js.native
    
    def scale(): this.type = js.native
    def scale(scale: Double): this.type = js.native
    
    var width: Double = js.native
    
    var x1: Double = js.native
    
    var x2: Double = js.native
    
    var y1: Double = js.native
    
    var y2: Double = js.native
  }
  
  @js.native
  class Path protected () extends js.Object {
    def this(d: String) = this()
    
    var d: String = js.native
    
    def getBoundingBox(): BoundingBoxView = js.native
  }
}
