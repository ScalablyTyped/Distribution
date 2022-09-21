package typings.three

import typings.std.HTMLCanvasElement
import typings.three.threeMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lutMod {
  
  @JSImport("three/examples/jsm/math/Lut", "Lut")
  @js.native
  open class Lut () extends StObject {
    def this(colormap: String) = this()
    def this(colormap: String, numberofcolors: Double) = this()
    def this(colormap: Unit, numberofcolors: Double) = this()
    
    def addColorMap(colormapName: String, arrayOfColors: js.Array[js.Array[Double]]): Unit = js.native
    
    def copy(lut: Lut): this.type = js.native
    
    def createCanvas(): HTMLCanvasElement = js.native
    
    def getColor(alpha: Double): Color = js.native
    
    var lut: js.Array[Color] = js.native
    
    var map: js.Array[js.Object] = js.native
    
    var maxV: Double = js.native
    
    var minV: Double = js.native
    
    var n: Double = js.native
    
    def set(value: Lut): this.type = js.native
    
    def setColorMap(): this.type = js.native
    def setColorMap(colormap: String): this.type = js.native
    def setColorMap(colormap: String, numberofcolors: Double): this.type = js.native
    def setColorMap(colormap: Unit, numberofcolors: Double): this.type = js.native
    
    def setMax(max: Double): this.type = js.native
    
    def setMin(min: Double): this.type = js.native
    
    def updateCanvas(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
  }
  
  trait ColorMapKeywords extends StObject {
    
    var blackbody: js.Array[js.Array[Double]]
    
    var cooltowarm: js.Array[js.Array[Double]]
    
    var grayscale: js.Array[js.Array[Double]]
    
    var rainbow: js.Array[js.Array[Double]]
  }
  object ColorMapKeywords {
    
    inline def apply(
      blackbody: js.Array[js.Array[Double]],
      cooltowarm: js.Array[js.Array[Double]],
      grayscale: js.Array[js.Array[Double]],
      rainbow: js.Array[js.Array[Double]]
    ): ColorMapKeywords = {
      val __obj = js.Dynamic.literal(blackbody = blackbody.asInstanceOf[js.Any], cooltowarm = cooltowarm.asInstanceOf[js.Any], grayscale = grayscale.asInstanceOf[js.Any], rainbow = rainbow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorMapKeywords]
    }
    
    extension [Self <: ColorMapKeywords](x: Self) {
      
      inline def setBlackbody(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "blackbody", value.asInstanceOf[js.Any])
      
      inline def setBlackbodyVarargs(value: js.Array[Double]*): Self = StObject.set(x, "blackbody", js.Array(value*))
      
      inline def setCooltowarm(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "cooltowarm", value.asInstanceOf[js.Any])
      
      inline def setCooltowarmVarargs(value: js.Array[Double]*): Self = StObject.set(x, "cooltowarm", js.Array(value*))
      
      inline def setGrayscale(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
      
      inline def setGrayscaleVarargs(value: js.Array[Double]*): Self = StObject.set(x, "grayscale", js.Array(value*))
      
      inline def setRainbow(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "rainbow", value.asInstanceOf[js.Any])
      
      inline def setRainbowVarargs(value: js.Array[Double]*): Self = StObject.set(x, "rainbow", js.Array(value*))
    }
  }
}
