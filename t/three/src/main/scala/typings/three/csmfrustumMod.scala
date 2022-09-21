package typings.three

import typings.three.threeMod.Matrix4
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csmfrustumMod {
  
  @JSImport("three/examples/jsm/csm/CSMFrustum", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CSMFrustum {
    def this(data: CSMFrustumParameters) = this()
    
    /* CompleteClass */
    override def setFromProjectionMatrix(projectionMatrix: Matrix4, maxFar: Double): CSMFrustumVerticies = js.native
    
    /* CompleteClass */
    override def split(breaks: js.Array[Double], target: js.Array[CSMFrustum]): Unit = js.native
    
    /* CompleteClass */
    override def toSpace(cameraMatrix: Matrix4, target: CSMFrustum): Unit = js.native
    
    /* CompleteClass */
    var vertices: CSMFrustumVerticies = js.native
  }
  
  trait CSMFrustum extends StObject {
    
    def setFromProjectionMatrix(projectionMatrix: Matrix4, maxFar: Double): CSMFrustumVerticies
    
    def split(breaks: js.Array[Double], target: js.Array[CSMFrustum]): Unit
    
    def toSpace(cameraMatrix: Matrix4, target: CSMFrustum): Unit
    
    var vertices: CSMFrustumVerticies
  }
  object CSMFrustum {
    
    inline def apply(
      setFromProjectionMatrix: (Matrix4, Double) => CSMFrustumVerticies,
      split: (js.Array[Double], js.Array[CSMFrustum]) => Unit,
      toSpace: (Matrix4, CSMFrustum) => Unit,
      vertices: CSMFrustumVerticies
    ): CSMFrustum = {
      val __obj = js.Dynamic.literal(setFromProjectionMatrix = js.Any.fromFunction2(setFromProjectionMatrix), split = js.Any.fromFunction2(split), toSpace = js.Any.fromFunction2(toSpace), vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSMFrustum]
    }
    
    extension [Self <: CSMFrustum](x: Self) {
      
      inline def setSetFromProjectionMatrix(value: (Matrix4, Double) => CSMFrustumVerticies): Self = StObject.set(x, "setFromProjectionMatrix", js.Any.fromFunction2(value))
      
      inline def setSplit(value: (js.Array[Double], js.Array[CSMFrustum]) => Unit): Self = StObject.set(x, "split", js.Any.fromFunction2(value))
      
      inline def setToSpace(value: (Matrix4, CSMFrustum) => Unit): Self = StObject.set(x, "toSpace", js.Any.fromFunction2(value))
      
      inline def setVertices(value: CSMFrustumVerticies): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    }
  }
  
  trait CSMFrustumParameters extends StObject {
    
    var maxFar: js.UndefOr[Double] = js.undefined
    
    var projectionMatrix: js.UndefOr[Matrix4] = js.undefined
  }
  object CSMFrustumParameters {
    
    inline def apply(): CSMFrustumParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSMFrustumParameters]
    }
    
    extension [Self <: CSMFrustumParameters](x: Self) {
      
      inline def setMaxFar(value: Double): Self = StObject.set(x, "maxFar", value.asInstanceOf[js.Any])
      
      inline def setMaxFarUndefined: Self = StObject.set(x, "maxFar", js.undefined)
      
      inline def setProjectionMatrix(value: Matrix4): Self = StObject.set(x, "projectionMatrix", value.asInstanceOf[js.Any])
      
      inline def setProjectionMatrixUndefined: Self = StObject.set(x, "projectionMatrix", js.undefined)
    }
  }
  
  trait CSMFrustumVerticies extends StObject {
    
    var far: js.Array[Vector3]
    
    var near: js.Array[Vector3]
  }
  object CSMFrustumVerticies {
    
    inline def apply(far: js.Array[Vector3], near: js.Array[Vector3]): CSMFrustumVerticies = {
      val __obj = js.Dynamic.literal(far = far.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSMFrustumVerticies]
    }
    
    extension [Self <: CSMFrustumVerticies](x: Self) {
      
      inline def setFar(value: js.Array[Vector3]): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
      
      inline def setFarVarargs(value: Vector3*): Self = StObject.set(x, "far", js.Array(value*))
      
      inline def setNear(value: js.Array[Vector3]): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
      
      inline def setNearVarargs(value: Vector3*): Self = StObject.set(x, "near", js.Array(value*))
    }
  }
}
