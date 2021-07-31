package typings.terminalKit

import typings.terminalKit.anon.`0`
import typings.terminalKit.anon.`1`
import typings.terminalKit.screenBufferMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenBufferHDMod {
  
  @JSImport("terminal-kit/ScreenBufferHD", JSImport.Namespace)
  @js.native
  class ^ protected () extends ScreenBufferHD {
    def this(options: typings.terminalKit.anon.Blending) = this()
    def this(options: Options) = this()
  }
  @JSImport("terminal-kit/ScreenBufferHD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def loadImage(
    url: String,
    calback: js.Function2[/* error */ js.UndefOr[js.Any], /* image */ js.UndefOr[ScreenBufferHD], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(url.asInstanceOf[js.Any], calback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  @scala.inline
  def loadImage(
    url: String,
    options: `0`,
    callback: js.Function2[/* error */ js.Any, /* image */ ScreenBufferHD, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Attributes extends StObject {
    
    var a: js.UndefOr[Double] = js.undefined
    
    var b: Double
    
    var bgA: js.UndefOr[Double] = js.undefined
    
    var bgB: Double
    
    var bgDefaultColor: js.UndefOr[Boolean] = js.undefined
    
    var bgG: Double
    
    var bgR: Double
    
    var blink: js.UndefOr[Boolean] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var charTransparency: js.UndefOr[Boolean] = js.undefined
    
    var defaultColor: js.UndefOr[Boolean] = js.undefined
    
    var dim: js.UndefOr[Boolean] = js.undefined
    
    var g: Double
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    var italic: js.UndefOr[Boolean] = js.undefined
    
    var r: Double
    
    var strike: js.UndefOr[Boolean] = js.undefined
    
    var styleTransparency: js.UndefOr[Boolean] = js.undefined
    
    var transparency: js.UndefOr[Boolean] = js.undefined
    
    var underline: js.UndefOr[Boolean] = js.undefined
  }
  object Attributes {
    
    @scala.inline
    def apply(b: Double, bgB: Double, bgG: Double, bgR: Double, g: Double, r: Double): Attributes = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], bgB = bgB.asInstanceOf[js.Any], bgG = bgG.asInstanceOf[js.Any], bgR = bgR.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgA(value: Double): Self = StObject.set(x, "bgA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgAUndefined: Self = StObject.set(x, "bgA", js.undefined)
      
      @scala.inline
      def setBgB(value: Double): Self = StObject.set(x, "bgB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgDefaultColor(value: Boolean): Self = StObject.set(x, "bgDefaultColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgDefaultColorUndefined: Self = StObject.set(x, "bgDefaultColor", js.undefined)
      
      @scala.inline
      def setBgG(value: Double): Self = StObject.set(x, "bgG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgR(value: Double): Self = StObject.set(x, "bgR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlink(value: Boolean): Self = StObject.set(x, "blink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlinkUndefined: Self = StObject.set(x, "blink", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setCharTransparency(value: Boolean): Self = StObject.set(x, "charTransparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharTransparencyUndefined: Self = StObject.set(x, "charTransparency", js.undefined)
      
      @scala.inline
      def setDefaultColor(value: Boolean): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
      
      @scala.inline
      def setDim(value: Boolean): Self = StObject.set(x, "dim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimUndefined: Self = StObject.set(x, "dim", js.undefined)
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrike(value: Boolean): Self = StObject.set(x, "strike", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrikeUndefined: Self = StObject.set(x, "strike", js.undefined)
      
      @scala.inline
      def setStyleTransparency(value: Boolean): Self = StObject.set(x, "styleTransparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleTransparencyUndefined: Self = StObject.set(x, "styleTransparency", js.undefined)
      
      @scala.inline
      def setTransparency(value: Boolean): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
      
      @scala.inline
      def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  trait BlendFn extends StObject {
    
    def hardLight(src: Double, dst: Double): Double
    @JSName("hardLight")
    var hardLight_Original: BlendFunction
    
    def multiply(src: Double, dst: Double): Double
    @JSName("multiply")
    var multiply_Original: BlendFunction
    
    def normal(src: Double, dst: Double): Double
    @JSName("normal")
    var normal_Original: BlendFunction
    
    def overlay(src: Double, dst: Double): Double
    @JSName("overlay")
    var overlay_Original: BlendFunction
    
    def screen(src: Double, dst: Double): Double
    @JSName("screen")
    var screen_Original: BlendFunction
    
    def softLight(src: Double, dst: Double): Double
    @JSName("softLight")
    var softLight_Original: BlendFunction
  }
  object BlendFn {
    
    @scala.inline
    def apply(
      hardLight: (/* src */ Double, /* dst */ Double) => Double,
      multiply: (/* src */ Double, /* dst */ Double) => Double,
      normal: (/* src */ Double, /* dst */ Double) => Double,
      overlay: (/* src */ Double, /* dst */ Double) => Double,
      screen: (/* src */ Double, /* dst */ Double) => Double,
      softLight: (/* src */ Double, /* dst */ Double) => Double
    ): BlendFn = {
      val __obj = js.Dynamic.literal(hardLight = js.Any.fromFunction2(hardLight), multiply = js.Any.fromFunction2(multiply), normal = js.Any.fromFunction2(normal), overlay = js.Any.fromFunction2(overlay), screen = js.Any.fromFunction2(screen), softLight = js.Any.fromFunction2(softLight))
      __obj.asInstanceOf[BlendFn]
    }
    
    @scala.inline
    implicit class BlendFnMutableBuilder[Self <: BlendFn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHardLight(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "hardLight", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMultiply(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "multiply", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNormal(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "normal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOverlay(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "overlay", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScreen(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "screen", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSoftLight(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "softLight", js.Any.fromFunction2(value))
    }
  }
  
  type BlendFunction = js.Function2[/* src */ Double, /* dst */ Double, Double]
  
  trait Blending
    extends StObject
       with IsBlending {
    
    var blendSrcFgWithDstBg: Boolean
    
    def fn(src: Double, dst: Double): Double
    @JSName("fn")
    var fn_Original: BlendFunction
    
    var opacity: Double
  }
  object Blending {
    
    @scala.inline
    def apply(blendSrcFgWithDstBg: Boolean, fn: (/* src */ Double, /* dst */ Double) => Double, opacity: Double): Blending = {
      val __obj = js.Dynamic.literal(blendSrcFgWithDstBg = blendSrcFgWithDstBg.asInstanceOf[js.Any], fn = js.Any.fromFunction2(fn), opacity = opacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blending]
    }
    
    @scala.inline
    implicit class BlendingMutableBuilder[Self <: Blending] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlendSrcFgWithDstBg(value: Boolean): Self = StObject.set(x, "blendSrcFgWithDstBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFn(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.terminalKit.terminalKitBooleans.`false`
    - typings.terminalKit.screenBufferHDMod.Blending
  */
  trait IsBlending extends StObject
  
  @js.native
  trait ScreenBufferHD
    extends typings.terminalKit.screenBufferMod.^ {
    
    @JSName("blending")
    val blending_ScreenBufferHD: IsBlending = js.native
    
    def draw(options: typings.terminalKit.anon.Blending): Unit = js.native
    
    def fill(options: `1`): Unit = js.native
  }
}
