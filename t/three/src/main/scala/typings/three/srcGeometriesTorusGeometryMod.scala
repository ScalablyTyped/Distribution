package typings.three

import typings.three.anon.Arc
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesTorusGeometryMod {
  
  @JSImport("three/src/geometries/TorusGeometry", "TorusGeometry")
  @js.native
  /**
    * @param [radius=1]
    * @param [tube=0.4]
    * @param [radialSegments=8]
    * @param [tubularSegments=6]
    * @param [arc=Math.PI * 2]
    */
  open class TorusGeometry () extends BufferGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, tube: Double) = this()
    def this(radius: Unit, tube: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Unit, tubularSegments: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Double, tubularSegments: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Unit, tubularSegments: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Double, tubularSegments: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Unit, tubularSegments: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Double, tubularSegments: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Unit, tubularSegments: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, arc: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Unit, tubularSegments: Double, arc: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Unit, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Double, tubularSegments: Double, arc: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Double, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Unit, tubularSegments: Double, arc: Double) = this()
    def this(radius: Double, tube: Unit, radialSegments: Unit, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Double, tubularSegments: Double, arc: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Double, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Unit, tubularSegments: Double, arc: Double) = this()
    def this(radius: Unit, tube: Double, radialSegments: Unit, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Double, tubularSegments: Double, arc: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Double, tubularSegments: Unit, arc: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Unit, tubularSegments: Double, arc: Double) = this()
    def this(radius: Unit, tube: Unit, radialSegments: Unit, tubularSegments: Unit, arc: Double) = this()
    
    var parameters: Arc = js.native
  }
  /* static members */
  object TorusGeometry {
    
    @JSImport("three/src/geometries/TorusGeometry", "TorusGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): TorusGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[TorusGeometry]
  }
}
