package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import typings.three.srcThreeMod.Curve
import typings.three.srcThreeMod.DataTexture
import typings.three.srcThreeMod.InstancedMesh
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmModifiersCurveModifierMod {
  
  @JSImport("three/examples/jsm/modifiers/CurveModifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/modifiers/CurveModifier", "Flow")
  @js.native
  open class Flow protected () extends StObject {
    def this(mesh: Mesh[BufferGeometry, Material | js.Array[Material]]) = this()
    def this(mesh: Mesh[BufferGeometry, Material | js.Array[Material]], numberOfCurves: Double) = this()
    
    var curveArray: js.Array[Double] = js.native
    
    var curveLengthArray: js.Array[Double] = js.native
    
    def moveAlongCurve(amount: Double): Unit = js.native
    
    var object3D: Mesh[BufferGeometry, Material | js.Array[Material]] = js.native
    
    var splineTexure: DataTexture = js.native
    
    var uniforms: SplineUniform = js.native
    
    def updateCurve(index: Double, curve: Curve[Vector3]): Unit = js.native
  }
  
  @JSImport("three/examples/jsm/modifiers/CurveModifier", "InstancedFlow")
  @js.native
  open class InstancedFlow protected () extends Flow {
    def this(
      count: Double,
      curveCount: Double,
      geometry: typings.three.srcThreeMod.BufferGeometry,
      material: typings.three.srcThreeMod.Material
    ) = this()
    
    def moveIndividualAlongCurve(index: Double, offset: Double): Unit = js.native
    
    @JSName("object3D")
    var object3D_InstancedFlow: InstancedMesh[BufferGeometry, Material | js.Array[Material]] = js.native
    
    var offsets: js.Array[Double] = js.native
    
    def setCurve(index: Double, curveNo: Double): Unit = js.native
    
    var whichCurve: js.Array[Double] = js.native
  }
  
  inline def getUniforms(splineTexture: DataTexture): SplineUniform = ^.asInstanceOf[js.Dynamic].applyDynamic("getUniforms")(splineTexture.asInstanceOf[js.Any]).asInstanceOf[SplineUniform]
  
  inline def initSplineTexture(): DataTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("initSplineTexture")().asInstanceOf[DataTexture]
  inline def initSplineTexture(size: Double): DataTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("initSplineTexture")(size.asInstanceOf[js.Any]).asInstanceOf[DataTexture]
  
  inline def modifyShader(material: typings.three.srcThreeMod.Material, uniforms: SplineUniform): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyShader")(material.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def modifyShader(material: typings.three.srcThreeMod.Material, uniforms: SplineUniform, numberOfCurves: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyShader")(material.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any], numberOfCurves.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateSplineTexture(texture: DataTexture, splineCurve: Curve[Vector3]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSplineTexture")(texture.asInstanceOf[js.Any], splineCurve.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateSplineTexture(texture: DataTexture, splineCurve: Curve[Vector3], offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSplineTexture")(texture.asInstanceOf[js.Any], splineCurve.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait SplineUniform extends StObject {
    
    var flow: IUniform[Any]
    
    var pathOffset: IUniform[Any]
    
    var pathSegment: IUniform[Any]
    
    var spineOffset: IUniform[Any]
    
    var spineTexture: IUniform[Any]
  }
  object SplineUniform {
    
    inline def apply(
      flow: IUniform[Any],
      pathOffset: IUniform[Any],
      pathSegment: IUniform[Any],
      spineOffset: IUniform[Any],
      spineTexture: IUniform[Any]
    ): SplineUniform = {
      val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], pathOffset = pathOffset.asInstanceOf[js.Any], pathSegment = pathSegment.asInstanceOf[js.Any], spineOffset = spineOffset.asInstanceOf[js.Any], spineTexture = spineTexture.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplineUniform]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplineUniform] (val x: Self) extends AnyVal {
      
      inline def setFlow(value: IUniform[Any]): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
      
      inline def setPathOffset(value: IUniform[Any]): Self = StObject.set(x, "pathOffset", value.asInstanceOf[js.Any])
      
      inline def setPathSegment(value: IUniform[Any]): Self = StObject.set(x, "pathSegment", value.asInstanceOf[js.Any])
      
      inline def setSpineOffset(value: IUniform[Any]): Self = StObject.set(x, "spineOffset", value.asInstanceOf[js.Any])
      
      inline def setSpineTexture(value: IUniform[Any]): Self = StObject.set(x, "spineTexture", value.asInstanceOf[js.Any])
    }
  }
}
