package typings.upngJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("upng-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buffer: js.typedarray.ArrayBuffer): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Image]
  
  inline def encode(imgs: js.Array[js.typedarray.ArrayBuffer], w: Double, h: Double, cnum: Double): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(imgs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], cnum.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def encode(
    imgs: js.Array[js.typedarray.ArrayBuffer],
    w: Double,
    h: Double,
    cnum: Double,
    dels: js.Array[Double]
  ): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(imgs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], cnum.asInstanceOf[js.Any], dels.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def encodeLL(
    imgs: js.Array[js.typedarray.ArrayBuffer],
    w: Double,
    h: Double,
    cc: Double,
    ac: Double,
    depth: Double
  ): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeLL")(imgs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], cc.asInstanceOf[js.Any], ac.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def encodeLL(
    imgs: js.Array[js.typedarray.ArrayBuffer],
    w: Double,
    h: Double,
    cc: Double,
    ac: Double,
    depth: Double,
    dels: js.Array[Double]
  ): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeLL")(imgs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], cc.asInstanceOf[js.Any], ac.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], dels.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def quantize(data: js.typedarray.ArrayBuffer, psize: Double): QuantizeResult = (^.asInstanceOf[js.Dynamic].applyDynamic("quantize")(data.asInstanceOf[js.Any], psize.asInstanceOf[js.Any])).asInstanceOf[QuantizeResult]
  
  inline def toRGBA8(out: Image): js.Array[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("toRGBA8")(out.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.typedarray.ArrayBuffer]]
  
  trait Image extends StObject {
    
    var ctype: Double
    
    var data: js.typedarray.ArrayBuffer
    
    var depth: Double
    
    var frames: js.Array[ImageFrame]
    
    var height: Double
    
    var tabs: ImageTabs
    
    var width: Double
  }
  object Image {
    
    inline def apply(
      ctype: Double,
      data: js.typedarray.ArrayBuffer,
      depth: Double,
      frames: js.Array[ImageFrame],
      height: Double,
      tabs: ImageTabs,
      width: Double
    ): Image = {
      val __obj = js.Dynamic.literal(ctype = ctype.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      inline def setCtype(value: Double): Self = StObject.set(x, "ctype", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setFrames(value: js.Array[ImageFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(value: ImageFrame*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setTabs(value: ImageTabs): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageFrame extends StObject {
    
    var blend: Double
    
    var delay: Double
    
    var dispose: Double
    
    var rect: ImageFrameRect
  }
  object ImageFrame {
    
    inline def apply(blend: Double, delay: Double, dispose: Double, rect: ImageFrameRect): ImageFrame = {
      val __obj = js.Dynamic.literal(blend = blend.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], dispose = dispose.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageFrame] (val x: Self) extends AnyVal {
      
      inline def setBlend(value: Double): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDispose(value: Double): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
      
      inline def setRect(value: ImageFrameRect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageFrameRect extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object ImageFrameRect {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): ImageFrameRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageFrameRect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageFrameRect] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageTabACTL extends StObject {
    
    var num_frames: Double
    
    var num_plays: Double
  }
  object ImageTabACTL {
    
    inline def apply(num_frames: Double, num_plays: Double): ImageTabACTL = {
      val __obj = js.Dynamic.literal(num_frames = num_frames.asInstanceOf[js.Any], num_plays = num_plays.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageTabACTL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageTabACTL] (val x: Self) extends AnyVal {
      
      inline def setNum_frames(value: Double): Self = StObject.set(x, "num_frames", value.asInstanceOf[js.Any])
      
      inline def setNum_plays(value: Double): Self = StObject.set(x, "num_plays", value.asInstanceOf[js.Any])
    }
  }
  
  type ImageTabText = StringDictionary[String]
  
  trait ImageTabs extends StObject {
    
    var PLTE: js.UndefOr[js.Array[Double]] = js.undefined
    
    var acTL: js.UndefOr[ImageTabACTL] = js.undefined
    
    var bKGD: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var cHRM: js.UndefOr[js.Array[Double]] = js.undefined
    
    // Depends on ctype
    var gAMA: js.UndefOr[Double] = js.undefined
    
    var hIST: js.UndefOr[js.Array[Double]] = js.undefined
    
    var iTXt: js.UndefOr[ImageTabText] = js.undefined
    
    var pHYs: js.UndefOr[js.Array[Double]] = js.undefined
    
    var sRGB: js.UndefOr[Double] = js.undefined
    
    var tEXt: js.UndefOr[ImageTabText] = js.undefined
    
    var tRNS: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object ImageTabs {
    
    inline def apply(): ImageTabs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageTabs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageTabs] (val x: Self) extends AnyVal {
      
      inline def setAcTL(value: ImageTabACTL): Self = StObject.set(x, "acTL", value.asInstanceOf[js.Any])
      
      inline def setAcTLUndefined: Self = StObject.set(x, "acTL", js.undefined)
      
      inline def setBKGD(value: Double | js.Array[Double]): Self = StObject.set(x, "bKGD", value.asInstanceOf[js.Any])
      
      inline def setBKGDUndefined: Self = StObject.set(x, "bKGD", js.undefined)
      
      inline def setBKGDVarargs(value: Double*): Self = StObject.set(x, "bKGD", js.Array(value*))
      
      inline def setCHRM(value: js.Array[Double]): Self = StObject.set(x, "cHRM", value.asInstanceOf[js.Any])
      
      inline def setCHRMUndefined: Self = StObject.set(x, "cHRM", js.undefined)
      
      inline def setCHRMVarargs(value: Double*): Self = StObject.set(x, "cHRM", js.Array(value*))
      
      inline def setGAMA(value: Double): Self = StObject.set(x, "gAMA", value.asInstanceOf[js.Any])
      
      inline def setGAMAUndefined: Self = StObject.set(x, "gAMA", js.undefined)
      
      inline def setHIST(value: js.Array[Double]): Self = StObject.set(x, "hIST", value.asInstanceOf[js.Any])
      
      inline def setHISTUndefined: Self = StObject.set(x, "hIST", js.undefined)
      
      inline def setHISTVarargs(value: Double*): Self = StObject.set(x, "hIST", js.Array(value*))
      
      inline def setITXt(value: ImageTabText): Self = StObject.set(x, "iTXt", value.asInstanceOf[js.Any])
      
      inline def setITXtUndefined: Self = StObject.set(x, "iTXt", js.undefined)
      
      inline def setPHYs(value: js.Array[Double]): Self = StObject.set(x, "pHYs", value.asInstanceOf[js.Any])
      
      inline def setPHYsUndefined: Self = StObject.set(x, "pHYs", js.undefined)
      
      inline def setPHYsVarargs(value: Double*): Self = StObject.set(x, "pHYs", js.Array(value*))
      
      inline def setPLTE(value: js.Array[Double]): Self = StObject.set(x, "PLTE", value.asInstanceOf[js.Any])
      
      inline def setPLTEUndefined: Self = StObject.set(x, "PLTE", js.undefined)
      
      inline def setPLTEVarargs(value: Double*): Self = StObject.set(x, "PLTE", js.Array(value*))
      
      inline def setSRGB(value: Double): Self = StObject.set(x, "sRGB", value.asInstanceOf[js.Any])
      
      inline def setSRGBUndefined: Self = StObject.set(x, "sRGB", js.undefined)
      
      inline def setTEXt(value: ImageTabText): Self = StObject.set(x, "tEXt", value.asInstanceOf[js.Any])
      
      inline def setTEXtUndefined: Self = StObject.set(x, "tEXt", js.undefined)
      
      inline def setTRNS(value: Double | js.Array[Double]): Self = StObject.set(x, "tRNS", value.asInstanceOf[js.Any])
      
      inline def setTRNSUndefined: Self = StObject.set(x, "tRNS", js.undefined)
      
      inline def setTRNSVarargs(value: Double*): Self = StObject.set(x, "tRNS", js.Array(value*))
    }
  }
  
  trait QuantizeResult extends StObject {
    
    var abuf: js.typedarray.ArrayBuffer
    
    var inds: js.typedarray.Uint8Array
    
    // Type is complicated and I am too lazy to work it out right now, sorry!
    var plte: js.Array[Any]
  }
  object QuantizeResult {
    
    inline def apply(abuf: js.typedarray.ArrayBuffer, inds: js.typedarray.Uint8Array, plte: js.Array[Any]): QuantizeResult = {
      val __obj = js.Dynamic.literal(abuf = abuf.asInstanceOf[js.Any], inds = inds.asInstanceOf[js.Any], plte = plte.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuantizeResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantizeResult] (val x: Self) extends AnyVal {
      
      inline def setAbuf(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "abuf", value.asInstanceOf[js.Any])
      
      inline def setInds(value: js.typedarray.Uint8Array): Self = StObject.set(x, "inds", value.asInstanceOf[js.Any])
      
      inline def setPlte(value: js.Array[Any]): Self = StObject.set(x, "plte", value.asInstanceOf[js.Any])
      
      inline def setPlteVarargs(value: Any*): Self = StObject.set(x, "plte", js.Array(value*))
    }
  }
}
