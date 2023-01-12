package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Keypoint
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsInterfacesShapeInterfacesMod {
  
  trait AnchorTensor extends StObject {
    
    var h: Tensor1D
    
    var w: Tensor1D
    
    var x: Tensor1D
    
    var y: Tensor1D
  }
  object AnchorTensor {
    
    inline def apply(h: Tensor1D, w: Tensor1D, x: Tensor1D, y: Tensor1D): AnchorTensor = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorTensor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnchorTensor] (val x: Self) extends AnyVal {
      
      inline def setH(value: Tensor1D): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Tensor1D): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: Tensor1D): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Tensor1D): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait BoundingBox extends StObject {
    
    var height: Double
    
    var width: Double
    
    var xMax: Double
    
    var xMin: Double
    
    var yMax: Double
    
    var yMin: Double
  }
  object BoundingBox {
    
    inline def apply(height: Double, width: Double, xMax: Double, xMin: Double, yMax: Double, yMin: Double): BoundingBox = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundingBox]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoundingBox] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXMax(value: Double): Self = StObject.set(x, "xMax", value.asInstanceOf[js.Any])
      
      inline def setXMin(value: Double): Self = StObject.set(x, "xMin", value.asInstanceOf[js.Any])
      
      inline def setYMax(value: Double): Self = StObject.set(x, "yMax", value.asInstanceOf[js.Any])
      
      inline def setYMin(value: Double): Self = StObject.set(x, "yMin", value.asInstanceOf[js.Any])
    }
  }
  
  trait Detection extends StObject {
    
    var ind: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[js.Array[String]] = js.undefined
    
    var labelId: js.UndefOr[js.Array[Double]] = js.undefined
    
    var locationData: LocationData
    
    var score: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Detection {
    
    inline def apply(locationData: LocationData): Detection = {
      val __obj = js.Dynamic.literal(locationData = locationData.asInstanceOf[js.Any])
      __obj.asInstanceOf[Detection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Detection] (val x: Self) extends AnyVal {
      
      inline def setInd(value: Double): Self = StObject.set(x, "ind", value.asInstanceOf[js.Any])
      
      inline def setIndUndefined: Self = StObject.set(x, "ind", js.undefined)
      
      inline def setLabel(value: js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelId(value: js.Array[Double]): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
      
      inline def setLabelIdVarargs(value: Double*): Self = StObject.set(x, "labelId", js.Array(value*))
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLocationData(value: LocationData): Self = StObject.set(x, "locationData", value.asInstanceOf[js.Any])
      
      inline def setScore(value: js.Array[Double]): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
      
      inline def setScoreVarargs(value: Double*): Self = StObject.set(x, "score", js.Array(value*))
    }
  }
  
  trait LocationData extends StObject {
    
    var boundingBox: js.UndefOr[BoundingBox] = js.undefined
    
    var relativeBoundingBox: js.UndefOr[BoundingBox] = js.undefined
    
    var relativeKeypoints: js.UndefOr[js.Array[Keypoint]] = js.undefined
  }
  object LocationData {
    
    inline def apply(): LocationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocationData] (val x: Self) extends AnyVal {
      
      inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      inline def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
      
      inline def setRelativeBoundingBox(value: BoundingBox): Self = StObject.set(x, "relativeBoundingBox", value.asInstanceOf[js.Any])
      
      inline def setRelativeBoundingBoxUndefined: Self = StObject.set(x, "relativeBoundingBox", js.undefined)
      
      inline def setRelativeKeypoints(value: js.Array[Keypoint]): Self = StObject.set(x, "relativeKeypoints", value.asInstanceOf[js.Any])
      
      inline def setRelativeKeypointsUndefined: Self = StObject.set(x, "relativeKeypoints", js.undefined)
      
      inline def setRelativeKeypointsVarargs(value: Keypoint*): Self = StObject.set(x, "relativeKeypoints", js.Array(value*))
    }
  }
  
  trait Rect extends StObject {
    
    var height: Double
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var width: Double
    
    var xCenter: Double
    
    var yCenter: Double
  }
  object Rect {
    
    inline def apply(height: Double, width: Double, xCenter: Double, yCenter: Double): Rect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xCenter = xCenter.asInstanceOf[js.Any], yCenter = yCenter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXCenter(value: Double): Self = StObject.set(x, "xCenter", value.asInstanceOf[js.Any])
      
      inline def setYCenter(value: Double): Self = StObject.set(x, "yCenter", value.asInstanceOf[js.Any])
    }
  }
}
