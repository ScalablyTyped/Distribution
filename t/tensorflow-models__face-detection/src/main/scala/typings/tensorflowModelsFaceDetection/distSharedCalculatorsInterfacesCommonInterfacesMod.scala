package typings.tensorflowModelsFaceDetection

import typings.std.CanvasImageSource
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.canvasimagesource
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.imagedata
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsInterfacesCommonInterfacesMod {
  
  trait Color extends StObject {
    
    var a: Double
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object Color {
    
    inline def apply(a: Double, b: Double, g: Double, r: Double): Color = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object ImageSize {
    
    inline def apply(height: Double, width: Double): ImageSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageSize]
    }
    
    extension [Self <: ImageSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputResolution extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object InputResolution {
    
    inline def apply(height: Double, width: Double): InputResolution = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputResolution]
    }
    
    extension [Self <: InputResolution](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Keypoint extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var score: js.UndefOr[Double] = js.undefined
    
    var x: Double
    
    var y: Double
    
    var z: js.UndefOr[Double] = js.undefined
  }
  object Keypoint {
    
    inline def apply(x: Double, y: Double): Keypoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keypoint]
    }
    
    extension [Self <: Keypoint](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  trait KeypointsFilter extends StObject {
    
    @JSName("apply")
    def apply(landmarks: js.Array[Keypoint], microSeconds: Double, objectScale: Double): js.Array[Keypoint]
    
    def reset(): Unit
  }
  object KeypointsFilter {
    
    inline def apply(apply: (js.Array[Keypoint], Double, Double) => js.Array[Keypoint], reset: () => Unit): KeypointsFilter = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[KeypointsFilter]
    }
    
    extension [Self <: KeypointsFilter](x: Self) {
      
      inline def setApply(value: (js.Array[Keypoint], Double, Double) => js.Array[Keypoint]): Self = StObject.set(x, "apply", js.Any.fromFunction3(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  trait Mask extends StObject {
    
    def getUnderlyingType(): canvasimagesource | imagedata | tensor
    
    def toCanvasImageSource(): js.Promise[CanvasImageSource]
    
    def toImageData(): js.Promise[ImageData]
    
    def toTensor(): js.Promise[Tensor3D]
  }
  object Mask {
    
    inline def apply(
      getUnderlyingType: () => canvasimagesource | imagedata | tensor,
      toCanvasImageSource: () => js.Promise[CanvasImageSource],
      toImageData: () => js.Promise[ImageData],
      toTensor: () => js.Promise[Tensor3D]
    ): Mask = {
      val __obj = js.Dynamic.literal(getUnderlyingType = js.Any.fromFunction0(getUnderlyingType), toCanvasImageSource = js.Any.fromFunction0(toCanvasImageSource), toImageData = js.Any.fromFunction0(toImageData), toTensor = js.Any.fromFunction0(toTensor))
      __obj.asInstanceOf[Mask]
    }
    
    extension [Self <: Mask](x: Self) {
      
      inline def setGetUnderlyingType(value: () => canvasimagesource | imagedata | tensor): Self = StObject.set(x, "getUnderlyingType", js.Any.fromFunction0(value))
      
      inline def setToCanvasImageSource(value: () => js.Promise[CanvasImageSource]): Self = StObject.set(x, "toCanvasImageSource", js.Any.fromFunction0(value))
      
      inline def setToImageData(value: () => js.Promise[ImageData]): Self = StObject.set(x, "toImageData", js.Any.fromFunction0(value))
      
      inline def setToTensor(value: () => js.Promise[Tensor3D]): Self = StObject.set(x, "toTensor", js.Any.fromFunction0(value))
    }
  }
  
  trait Padding extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Padding {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Padding = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Padding]
    }
    
    extension [Self <: Padding](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type PixelInput = Tensor3D | ImageData | HTMLVideoElement | HTMLImageElement | HTMLCanvasElement | ImageBitmap
  
  trait Segmentation extends StObject {
    
    var mask: Mask
    
    def maskValueToLabel(maskValue: Double): String
  }
  object Segmentation {
    
    inline def apply(mask: Mask, maskValueToLabel: Double => String): Segmentation = {
      val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], maskValueToLabel = js.Any.fromFunction1(maskValueToLabel))
      __obj.asInstanceOf[Segmentation]
    }
    
    extension [Self <: Segmentation](x: Self) {
      
      inline def setMask(value: Mask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskValueToLabel(value: Double => String): Self = StObject.set(x, "maskValueToLabel", js.Any.fromFunction1(value))
    }
  }
  
  trait ValueTransform extends StObject {
    
    var offset: Double
    
    var scale: Double
  }
  object ValueTransform {
    
    inline def apply(offset: Double, scale: Double): ValueTransform = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueTransform]
    }
    
    extension [Self <: ValueTransform](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  trait WindowElement extends StObject {
    
    var distance: Double
    
    var duration: Double
  }
  object WindowElement {
    
    inline def apply(distance: Double, duration: Double): WindowElement = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowElement]
    }
    
    extension [Self <: WindowElement](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    }
  }
}
