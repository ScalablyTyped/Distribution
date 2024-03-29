package typings.three

import typings.three.anon.Shapes
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcExtrasCoreShapeMod.Shape
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesExtrudeGeometryMod {
  
  @JSImport("three/src/geometries/ExtrudeGeometry", "ExtrudeGeometry")
  @js.native
  /**
    * Create a new instance of {@link ExtrudeGeometry}
    * @param shapes Shape or an array of shapes. Default `new Shape([new Vector2(0.5, 0.5), new Vector2(-0.5, 0.5), new Vector2(-0.5, -0.5), new Vector2(0.5, -0.5)])`.
    * @param options Object that can contain the following parameters. @see {@link ExtrudeGeometryOptions} for defaults.
    */
  open class ExtrudeGeometry () extends BufferGeometry[NormalBufferAttributes] {
    def this(shapes: js.Array[Shape]) = this()
    def this(shapes: Shape) = this()
    def this(shapes: js.Array[Shape], options: ExtrudeGeometryOptions) = this()
    def this(shapes: Unit, options: ExtrudeGeometryOptions) = this()
    def this(shapes: Shape, options: ExtrudeGeometryOptions) = this()
    
    def addShape(shape: Shape): Unit = js.native
    
    /**
      * An object with a property for each of the constructor parameters.
      * @remarks Any modification after instantiation does not change the geometry.
      */
    val parameters: Shapes = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `ExtrudeGeometry`
      */
    @JSName("type")
    val type_ExtrudeGeometry: String | typings.three.threeStrings.ExtrudeGeometry = js.native
  }
  /* static members */
  object ExtrudeGeometry {
    
    @JSImport("three/src/geometries/ExtrudeGeometry", "ExtrudeGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object, shapes: Any): ExtrudeGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any])).asInstanceOf[ExtrudeGeometry]
  }
  
  trait ExtrudeGeometryOptions extends StObject {
    
    /**
      * A object that provides UV generator functions.
      */
    var UVGenerator: js.UndefOr[typings.three.srcGeometriesExtrudeGeometryMod.UVGenerator] = js.undefined
    
    /**
      * Turn on bevel. Applying beveling to the shape.
      * @defaultValue `true`
      */
    var bevelEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Distance from the shape outline that the bevel starts.
      * Expects a `Float`.
      * @defaultValue `0`
      */
    var bevelOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of bevel layers/segments.
      * Expects a `Integer`.
      * @defaultValue `3`
      */
    var bevelSegments: js.UndefOr[Double] = js.undefined
    
    /**
      * Distance from the shape outline that the bevel extends
      * Expects a `Float`.
      * @defaultValue `bevelThickness - 0.1`
      */
    var bevelSize: js.UndefOr[Double] = js.undefined
    
    /**
      * How deep into the original shape the bevel goes.
      * Expects a `Float`.
      * @defaultValue `0.2`
      */
    var bevelThickness: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of points on the curves.
      * Expects a `Integer`.
      * @defaultValue `12`
      */
    var curveSegments: js.UndefOr[Double] = js.undefined
    
    /**
      * Depth to extrude the shape.
      * @defaultValue `1`
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      * A 3D spline path along which the shape should be extruded.
      * @remarks Bevels not supported for path extrusion.
      */
    var extrudePath: js.UndefOr[Curve[Vector3]] = js.undefined
    
    /**
      * Number of points used for subdividing segments along the depth of the extruded spline.
      * @defaultValue `1`
      */
    var steps: js.UndefOr[Double] = js.undefined
  }
  object ExtrudeGeometryOptions {
    
    inline def apply(): ExtrudeGeometryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtrudeGeometryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtrudeGeometryOptions] (val x: Self) extends AnyVal {
      
      inline def setBevelEnabled(value: Boolean): Self = StObject.set(x, "bevelEnabled", value.asInstanceOf[js.Any])
      
      inline def setBevelEnabledUndefined: Self = StObject.set(x, "bevelEnabled", js.undefined)
      
      inline def setBevelOffset(value: Double): Self = StObject.set(x, "bevelOffset", value.asInstanceOf[js.Any])
      
      inline def setBevelOffsetUndefined: Self = StObject.set(x, "bevelOffset", js.undefined)
      
      inline def setBevelSegments(value: Double): Self = StObject.set(x, "bevelSegments", value.asInstanceOf[js.Any])
      
      inline def setBevelSegmentsUndefined: Self = StObject.set(x, "bevelSegments", js.undefined)
      
      inline def setBevelSize(value: Double): Self = StObject.set(x, "bevelSize", value.asInstanceOf[js.Any])
      
      inline def setBevelSizeUndefined: Self = StObject.set(x, "bevelSize", js.undefined)
      
      inline def setBevelThickness(value: Double): Self = StObject.set(x, "bevelThickness", value.asInstanceOf[js.Any])
      
      inline def setBevelThicknessUndefined: Self = StObject.set(x, "bevelThickness", js.undefined)
      
      inline def setCurveSegments(value: Double): Self = StObject.set(x, "curveSegments", value.asInstanceOf[js.Any])
      
      inline def setCurveSegmentsUndefined: Self = StObject.set(x, "curveSegments", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setExtrudePath(value: Curve[Vector3]): Self = StObject.set(x, "extrudePath", value.asInstanceOf[js.Any])
      
      inline def setExtrudePathUndefined: Self = StObject.set(x, "extrudePath", js.undefined)
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setUVGenerator(value: UVGenerator): Self = StObject.set(x, "UVGenerator", value.asInstanceOf[js.Any])
      
      inline def setUVGeneratorUndefined: Self = StObject.set(x, "UVGenerator", js.undefined)
    }
  }
  
  trait UVGenerator extends StObject {
    
    def generateSideWallUV(
      geometry: ExtrudeGeometry,
      vertices: js.Array[Double],
      indexA: Double,
      indexB: Double,
      indexC: Double,
      indexD: Double
    ): js.Array[Vector2]
    
    def generateTopUV(
      geometry: ExtrudeGeometry,
      vertices: js.Array[Double],
      indexA: Double,
      indexB: Double,
      indexC: Double
    ): js.Array[Vector2]
  }
  object UVGenerator {
    
    inline def apply(
      generateSideWallUV: (ExtrudeGeometry, js.Array[Double], Double, Double, Double, Double) => js.Array[Vector2],
      generateTopUV: (ExtrudeGeometry, js.Array[Double], Double, Double, Double) => js.Array[Vector2]
    ): UVGenerator = {
      val __obj = js.Dynamic.literal(generateSideWallUV = js.Any.fromFunction6(generateSideWallUV), generateTopUV = js.Any.fromFunction5(generateTopUV))
      __obj.asInstanceOf[UVGenerator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UVGenerator] (val x: Self) extends AnyVal {
      
      inline def setGenerateSideWallUV(value: (ExtrudeGeometry, js.Array[Double], Double, Double, Double, Double) => js.Array[Vector2]): Self = StObject.set(x, "generateSideWallUV", js.Any.fromFunction6(value))
      
      inline def setGenerateTopUV(value: (ExtrudeGeometry, js.Array[Double], Double, Double, Double) => js.Array[Vector2]): Self = StObject.set(x, "generateTopUV", js.Any.fromFunction5(value))
    }
  }
}
