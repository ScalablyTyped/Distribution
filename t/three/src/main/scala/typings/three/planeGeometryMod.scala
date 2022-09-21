package typings.three

import typings.three.anon.WidthSegments
import typings.three.bufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object planeGeometryMod {
  
  @JSImport("three/src/geometries/PlaneGeometry", "PlaneGeometry")
  @js.native
  /**
    * @param [width=1] — Width of the sides on the X axis.
    * @param [height=1] — Height of the sides on the Y axis.
    * @param [widthSegments=1] — Number of segmented faces along the width of the sides.
    * @param [heightSegments=1] — Number of segmented faces along the height of the sides.
    */
  open class PlaneGeometry () extends BufferGeometry {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Unit, height: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double) = this()
    def this(width: Double, height: Unit, widthSegments: Double) = this()
    def this(width: Unit, height: Double, widthSegments: Double) = this()
    def this(width: Unit, height: Unit, widthSegments: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double, heightSegments: Double) = this()
    def this(width: Double, height: Double, widthSegments: Unit, heightSegments: Double) = this()
    def this(width: Double, height: Unit, widthSegments: Double, heightSegments: Double) = this()
    def this(width: Double, height: Unit, widthSegments: Unit, heightSegments: Double) = this()
    def this(width: Unit, height: Double, widthSegments: Double, heightSegments: Double) = this()
    def this(width: Unit, height: Double, widthSegments: Unit, heightSegments: Double) = this()
    def this(width: Unit, height: Unit, widthSegments: Double, heightSegments: Double) = this()
    def this(width: Unit, height: Unit, widthSegments: Unit, heightSegments: Double) = this()
    
    var parameters: WidthSegments = js.native
  }
  /* static members */
  object PlaneGeometry {
    
    @JSImport("three/src/geometries/PlaneGeometry", "PlaneGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): PlaneGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[PlaneGeometry]
  }
}
