package typings.three

import typings.three.anon.Segments
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesCircleGeometryMod {
  
  @JSImport("three/src/geometries/CircleGeometry", "CircleGeometry")
  @js.native
  /**
    * Create a new instance of {@link CircleGeometry}
    * @param radius Radius of the circle. Expects a `Float`. Default `1`
    * @param segments Number of segments (triangles). Expects a `Integer`. Minimum `3`. Default `32`
    * @param thetaStart Start angle for first segment. Expects a `Float`. Default `0`, _(three o'clock position)_.
    * @param thetaLength The central angle, often called theta, of the circular sector. Expects a `Float`. Default `Math.PI * 2`, _which makes for a complete circle_.
    */
  open class CircleGeometry () extends BufferGeometry[NormalBufferAttributes] {
    def this(radius: Double) = this()
    def this(radius: Double, segments: Double) = this()
    def this(radius: Unit, segments: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double) = this()
    def this(radius: Double, segments: Unit, thetaStart: Double) = this()
    def this(radius: Unit, segments: Double, thetaStart: Double) = this()
    def this(radius: Unit, segments: Unit, thetaStart: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double, thetaLength: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Unit, thetaLength: Double) = this()
    def this(radius: Double, segments: Unit, thetaStart: Double, thetaLength: Double) = this()
    def this(radius: Double, segments: Unit, thetaStart: Unit, thetaLength: Double) = this()
    def this(radius: Unit, segments: Double, thetaStart: Double, thetaLength: Double) = this()
    def this(radius: Unit, segments: Double, thetaStart: Unit, thetaLength: Double) = this()
    def this(radius: Unit, segments: Unit, thetaStart: Double, thetaLength: Double) = this()
    def this(radius: Unit, segments: Unit, thetaStart: Unit, thetaLength: Double) = this()
    
    /**
      * An object with a property for each of the constructor parameters.
      * @remarks Any modification after instantiation does not change the geometry.
      */
    val parameters: Segments = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `CircleGeometry`
      */
    @JSName("type")
    val type_CircleGeometry: String | typings.three.threeStrings.CircleGeometry = js.native
  }
  /* static members */
  object CircleGeometry {
    
    @JSImport("three/src/geometries/CircleGeometry", "CircleGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): CircleGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[CircleGeometry]
  }
}
