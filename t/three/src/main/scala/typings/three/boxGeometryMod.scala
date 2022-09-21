package typings.three

import typings.three.anon.Depth
import typings.three.bufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxGeometryMod {
  
  @JSImport("three/src/geometries/BoxGeometry", "BoxGeometry")
  @js.native
  open class BoxGeometry protected () extends BufferGeometry {
    /**
      * @param [width=1] — Width of the sides on the X axis.
      * @param [height=1] — Height of the sides on the Y axis.
      * @param [depth=1] — Depth of the sides on the Z axis.
      * @param [widthSegments=1] — Number of segmented faces along the width of the sides.
      * @param [heightSegments=1] — Number of segmented faces along the height of the sides.
      * @param [depthSegments=1] — Number of segmented faces along the depth of the sides.
      */
    def this(
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      depth: js.UndefOr[Double],
      widthSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      depthSegments: js.UndefOr[Double]
    ) = this()
    
    var parameters: Depth = js.native
  }
  /* static members */
  object BoxGeometry {
    
    @JSImport("three/src/geometries/BoxGeometry", "BoxGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): BoxGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[BoxGeometry]
  }
}
