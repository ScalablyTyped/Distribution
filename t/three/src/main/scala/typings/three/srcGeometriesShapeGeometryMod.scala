package typings.three

import typings.three.anon.CurveSegments
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcExtrasCoreShapeMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesShapeGeometryMod {
  
  @JSImport("three/src/geometries/ShapeGeometry", "ShapeGeometry")
  @js.native
  /**
    * Create a new instance of {@link ShapeGeometry}
    * @param shapes Array of shapes or a single {@link THREE.Shape | Shape}. Default `new Shape([new Vector2(0, 0.5), new Vector2(-0.5, -0.5), new Vector2(0.5, -0.5)])`, _a single triangle shape_.
    * @param curveSegments Number of segments per shape. Expects a `Integer`. Default `12`
    */
  open class ShapeGeometry () extends BufferGeometry[NormalBufferAttributes] {
    def this(shapes: js.Array[Shape]) = this()
    def this(shapes: Shape) = this()
    def this(shapes: js.Array[Shape], curveSegments: Double) = this()
    def this(shapes: Unit, curveSegments: Double) = this()
    def this(shapes: Shape, curveSegments: Double) = this()
    
    /**
      * An object with a property for each of the constructor parameters.
      * @remarks Any modification after instantiation does not change the geometry.
      */
    val parameters: CurveSegments = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `ShapeGeometry`
      */
    @JSName("type")
    val type_ShapeGeometry: String | typings.three.threeStrings.ShapeGeometry = js.native
  }
  /* static members */
  object ShapeGeometry {
    
    @JSImport("three/src/geometries/ShapeGeometry", "ShapeGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): ShapeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[ShapeGeometry]
  }
}
