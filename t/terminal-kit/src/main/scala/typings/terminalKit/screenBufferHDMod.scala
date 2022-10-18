package typings.terminalKit

import typings.terminalKit.anon.AttrChar
import typings.terminalKit.anon.`0`
import typings.terminalKit.screenBufferMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenBufferHDMod {
  
  @JSImport("terminal-kit/ScreenBufferHD", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ScreenBufferHD {
    def this(options: typings.terminalKit.anon.Blending) = this()
    def this(options: Options) = this()
  }
  @JSImport("terminal-kit/ScreenBufferHD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def loadImage(
    url: String,
    calback: js.Function2[/* error */ js.UndefOr[Any], /* image */ js.UndefOr[ScreenBufferHD], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(url.asInstanceOf[js.Any], calback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def loadImage(
    url: String,
    options: `0`,
    callback: js.Function2[/* error */ Any, /* image */ ScreenBufferHD, Unit]
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
    
    inline def apply(b: Double, bgB: Double, bgG: Double, bgR: Double, g: Double, r: Double): Attributes = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], bgB = bgB.asInstanceOf[js.Any], bgG = bgG.asInstanceOf[js.Any], bgR = bgR.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBgA(value: Double): Self = StObject.set(x, "bgA", value.asInstanceOf[js.Any])
      
      inline def setBgAUndefined: Self = StObject.set(x, "bgA", js.undefined)
      
      inline def setBgB(value: Double): Self = StObject.set(x, "bgB", value.asInstanceOf[js.Any])
      
      inline def setBgDefaultColor(value: Boolean): Self = StObject.set(x, "bgDefaultColor", value.asInstanceOf[js.Any])
      
      inline def setBgDefaultColorUndefined: Self = StObject.set(x, "bgDefaultColor", js.undefined)
      
      inline def setBgG(value: Double): Self = StObject.set(x, "bgG", value.asInstanceOf[js.Any])
      
      inline def setBgR(value: Double): Self = StObject.set(x, "bgR", value.asInstanceOf[js.Any])
      
      inline def setBlink(value: Boolean): Self = StObject.set(x, "blink", value.asInstanceOf[js.Any])
      
      inline def setBlinkUndefined: Self = StObject.set(x, "blink", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setCharTransparency(value: Boolean): Self = StObject.set(x, "charTransparency", value.asInstanceOf[js.Any])
      
      inline def setCharTransparencyUndefined: Self = StObject.set(x, "charTransparency", js.undefined)
      
      inline def setDefaultColor(value: Boolean): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
      
      inline def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
      
      inline def setDim(value: Boolean): Self = StObject.set(x, "dim", value.asInstanceOf[js.Any])
      
      inline def setDimUndefined: Self = StObject.set(x, "dim", js.undefined)
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setStrike(value: Boolean): Self = StObject.set(x, "strike", value.asInstanceOf[js.Any])
      
      inline def setStrikeUndefined: Self = StObject.set(x, "strike", js.undefined)
      
      inline def setStyleTransparency(value: Boolean): Self = StObject.set(x, "styleTransparency", value.asInstanceOf[js.Any])
      
      inline def setStyleTransparencyUndefined: Self = StObject.set(x, "styleTransparency", js.undefined)
      
      inline def setTransparency(value: Boolean): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
      
      inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
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
    
    inline def apply(
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
    
    extension [Self <: BlendFn](x: Self) {
      
      inline def setHardLight(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "hardLight", js.Any.fromFunction2(value))
      
      inline def setMultiply(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "multiply", js.Any.fromFunction2(value))
      
      inline def setNormal(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "normal", js.Any.fromFunction2(value))
      
      inline def setOverlay(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "overlay", js.Any.fromFunction2(value))
      
      inline def setScreen(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "screen", js.Any.fromFunction2(value))
      
      inline def setSoftLight(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "softLight", js.Any.fromFunction2(value))
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
    
    inline def apply(blendSrcFgWithDstBg: Boolean, fn: (/* src */ Double, /* dst */ Double) => Double, opacity: Double): Blending = {
      val __obj = js.Dynamic.literal(blendSrcFgWithDstBg = blendSrcFgWithDstBg.asInstanceOf[js.Any], fn = js.Any.fromFunction2(fn), opacity = opacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blending]
    }
    
    extension [Self <: Blending](x: Self) {
      
      inline def setBlendSrcFgWithDstBg(value: Boolean): Self = StObject.set(x, "blendSrcFgWithDstBg", value.asInstanceOf[js.Any])
      
      inline def setFn(value: (/* src */ Double, /* dst */ Double) => Double): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
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
    
    def fill(options: AttrChar): Unit = js.native
  }
}
