package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.calculateInverseMatrixMod.Matrix4x4
import typings.tensorflowModelsFaceLandmarksDetection.commonInterfacesMod.Padding
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IgnoreRotation extends StObject {
    
    var ignoreRotation: Boolean
  }
  object IgnoreRotation {
    
    inline def apply(ignoreRotation: Boolean): IgnoreRotation = {
      val __obj = js.Dynamic.literal(ignoreRotation = ignoreRotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgnoreRotation]
    }
    
    extension [Self <: IgnoreRotation](x: Self) {
      
      inline def setIgnoreRotation(value: Boolean): Self = StObject.set(x, "ignoreRotation", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageTensor extends StObject {
    
    var imageTensor: Tensor4D
    
    var padding: Padding
    
    var transformationMatrix: Matrix4x4
  }
  object ImageTensor {
    
    inline def apply(imageTensor: Tensor4D, padding: Padding, transformationMatrix: Matrix4x4): ImageTensor = {
      val __obj = js.Dynamic.literal(imageTensor = imageTensor.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], transformationMatrix = transformationMatrix.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageTensor]
    }
    
    extension [Self <: ImageTensor](x: Self) {
      
      inline def setImageTensor(value: Tensor4D): Self = StObject.set(x, "imageTensor", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setTransformationMatrix(value: Matrix4x4): Self = StObject.set(x, "transformationMatrix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var score: js.UndefOr[Double] = js.undefined
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object Name {
    
    inline def apply(x: Double, y: Double, z: Double): Name = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
