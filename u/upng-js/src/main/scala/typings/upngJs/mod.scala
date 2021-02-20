package typings.upngJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("upng-js", "decode")
  @js.native
  def decode(buffer: ArrayBuffer): Image = js.native
  
  @JSImport("upng-js", "encode")
  @js.native
  def encode(imgs: js.Array[ArrayBuffer], w: Double, h: Double, cnum: Double): ArrayBuffer = js.native
  @JSImport("upng-js", "encode")
  @js.native
  def encode(imgs: js.Array[ArrayBuffer], w: Double, h: Double, cnum: Double, dels: js.Array[Double]): ArrayBuffer = js.native
  
  @JSImport("upng-js", "encodeLL")
  @js.native
  def encodeLL(imgs: js.Array[ArrayBuffer], w: Double, h: Double, cc: Double, ac: Double, depth: Double): ArrayBuffer = js.native
  @JSImport("upng-js", "encodeLL")
  @js.native
  def encodeLL(
    imgs: js.Array[ArrayBuffer],
    w: Double,
    h: Double,
    cc: Double,
    ac: Double,
    depth: Double,
    dels: js.Array[Double]
  ): ArrayBuffer = js.native
  
  @JSImport("upng-js", "quantize")
  @js.native
  def quantize(data: ArrayBuffer, psize: Double): QuantizeResult = js.native
  
  @JSImport("upng-js", "toRGBA8")
  @js.native
  def toRGBA8(out: Image): js.Array[ArrayBuffer] = js.native
  
  @js.native
  trait Image extends StObject {
    
    var ctype: Double = js.native
    
    var data: ArrayBuffer = js.native
    
    var depth: Double = js.native
    
    var frames: js.Array[ImageFrame] = js.native
    
    var height: Double = js.native
    
    var tabs: ImageTabs = js.native
    
    var width: Double = js.native
  }
  object Image {
    
    @scala.inline
    def apply(
      ctype: Double,
      data: ArrayBuffer,
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
    implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtype(value: Double): Self = StObject.set(x, "ctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrames(value: js.Array[ImageFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesVarargs(value: ImageFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs(value: ImageTabs): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ImageFrame extends StObject {
    
    var blend: Double = js.native
    
    var delay: Double = js.native
    
    var dispose: Double = js.native
    
    var rect: ImageFrameRect = js.native
  }
  object ImageFrame {
    
    @scala.inline
    def apply(blend: Double, delay: Double, dispose: Double, rect: ImageFrameRect): ImageFrame = {
      val __obj = js.Dynamic.literal(blend = blend.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], dispose = dispose.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageFrame]
    }
    
    @scala.inline
    implicit class ImageFrameMutableBuilder[Self <: ImageFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlend(value: Double): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispose(value: Double): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRect(value: ImageFrameRect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ImageFrameRect extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object ImageFrameRect {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): ImageFrameRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageFrameRect]
    }
    
    @scala.inline
    implicit class ImageFrameRectMutableBuilder[Self <: ImageFrameRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ImageTabACTL extends StObject {
    
    var num_frames: Double = js.native
    
    var num_plays: Double = js.native
  }
  object ImageTabACTL {
    
    @scala.inline
    def apply(num_frames: Double, num_plays: Double): ImageTabACTL = {
      val __obj = js.Dynamic.literal(num_frames = num_frames.asInstanceOf[js.Any], num_plays = num_plays.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageTabACTL]
    }
    
    @scala.inline
    implicit class ImageTabACTLMutableBuilder[Self <: ImageTabACTL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNum_frames(value: Double): Self = StObject.set(x, "num_frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_plays(value: Double): Self = StObject.set(x, "num_plays", value.asInstanceOf[js.Any])
    }
  }
  
  type ImageTabText = StringDictionary[String]
  
  @js.native
  trait ImageTabs extends StObject {
    
    var PLTE: js.UndefOr[js.Array[Double]] = js.native
    
    var acTL: js.UndefOr[ImageTabACTL] = js.native
    
    var bKGD: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var cHRM: js.UndefOr[js.Array[Double]] = js.native
    
    // Depends on ctype
    var gAMA: js.UndefOr[Double] = js.native
    
    var hIST: js.UndefOr[js.Array[Double]] = js.native
    
    var iTXt: js.UndefOr[ImageTabText] = js.native
    
    var pHYs: js.UndefOr[js.Array[Double]] = js.native
    
    var sRGB: js.UndefOr[Double] = js.native
    
    var tEXt: js.UndefOr[ImageTabText] = js.native
    
    var tRNS: js.UndefOr[Double | js.Array[Double]] = js.native
  }
  object ImageTabs {
    
    @scala.inline
    def apply(): ImageTabs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageTabs]
    }
    
    @scala.inline
    implicit class ImageTabsMutableBuilder[Self <: ImageTabs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcTL(value: ImageTabACTL): Self = StObject.set(x, "acTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcTLUndefined: Self = StObject.set(x, "acTL", js.undefined)
      
      @scala.inline
      def setBKGD(value: Double | js.Array[Double]): Self = StObject.set(x, "bKGD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBKGDUndefined: Self = StObject.set(x, "bKGD", js.undefined)
      
      @scala.inline
      def setBKGDVarargs(value: Double*): Self = StObject.set(x, "bKGD", js.Array(value :_*))
      
      @scala.inline
      def setCHRM(value: js.Array[Double]): Self = StObject.set(x, "cHRM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCHRMUndefined: Self = StObject.set(x, "cHRM", js.undefined)
      
      @scala.inline
      def setCHRMVarargs(value: Double*): Self = StObject.set(x, "cHRM", js.Array(value :_*))
      
      @scala.inline
      def setGAMA(value: Double): Self = StObject.set(x, "gAMA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGAMAUndefined: Self = StObject.set(x, "gAMA", js.undefined)
      
      @scala.inline
      def setHIST(value: js.Array[Double]): Self = StObject.set(x, "hIST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHISTUndefined: Self = StObject.set(x, "hIST", js.undefined)
      
      @scala.inline
      def setHISTVarargs(value: Double*): Self = StObject.set(x, "hIST", js.Array(value :_*))
      
      @scala.inline
      def setITXt(value: ImageTabText): Self = StObject.set(x, "iTXt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setITXtUndefined: Self = StObject.set(x, "iTXt", js.undefined)
      
      @scala.inline
      def setPHYs(value: js.Array[Double]): Self = StObject.set(x, "pHYs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPHYsUndefined: Self = StObject.set(x, "pHYs", js.undefined)
      
      @scala.inline
      def setPHYsVarargs(value: Double*): Self = StObject.set(x, "pHYs", js.Array(value :_*))
      
      @scala.inline
      def setPLTE(value: js.Array[Double]): Self = StObject.set(x, "PLTE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPLTEUndefined: Self = StObject.set(x, "PLTE", js.undefined)
      
      @scala.inline
      def setPLTEVarargs(value: Double*): Self = StObject.set(x, "PLTE", js.Array(value :_*))
      
      @scala.inline
      def setSRGB(value: Double): Self = StObject.set(x, "sRGB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSRGBUndefined: Self = StObject.set(x, "sRGB", js.undefined)
      
      @scala.inline
      def setTEXt(value: ImageTabText): Self = StObject.set(x, "tEXt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTEXtUndefined: Self = StObject.set(x, "tEXt", js.undefined)
      
      @scala.inline
      def setTRNS(value: Double | js.Array[Double]): Self = StObject.set(x, "tRNS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRNSUndefined: Self = StObject.set(x, "tRNS", js.undefined)
      
      @scala.inline
      def setTRNSVarargs(value: Double*): Self = StObject.set(x, "tRNS", js.Array(value :_*))
    }
  }
  
  @js.native
  trait QuantizeResult extends StObject {
    
    var abuf: ArrayBuffer = js.native
    
    var inds: Uint8Array = js.native
    
    // Type is complicated and I am too lazy to work it out right now, sorry!
    var plte: js.Array[_] = js.native
  }
  object QuantizeResult {
    
    @scala.inline
    def apply(abuf: ArrayBuffer, inds: Uint8Array, plte: js.Array[_]): QuantizeResult = {
      val __obj = js.Dynamic.literal(abuf = abuf.asInstanceOf[js.Any], inds = inds.asInstanceOf[js.Any], plte = plte.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuantizeResult]
    }
    
    @scala.inline
    implicit class QuantizeResultMutableBuilder[Self <: QuantizeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbuf(value: ArrayBuffer): Self = StObject.set(x, "abuf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInds(value: Uint8Array): Self = StObject.set(x, "inds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlte(value: js.Array[_]): Self = StObject.set(x, "plte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlteVarargs(value: js.Any*): Self = StObject.set(x, "plte", js.Array(value :_*))
    }
  }
}
