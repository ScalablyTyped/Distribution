package typings.trianglify

import typings.std.HTMLCanvasElement
import typings.std.SVGElement
import typings.trianglify.mod.trianglify.Options
import typings.trianglify.mod.trianglify.Pattern
import typings.trianglify.trianglifyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("trianglify", JSImport.Namespace)
  @js.native
  def apply(): Pattern = js.native
  @JSImport("trianglify", JSImport.Namespace)
  @js.native
  def apply(opts: Options): Pattern = js.native
  
  object trianglify {
    
    @js.native
    trait Options extends StObject {
      
      /** Size of the cells used to generate a randomized grid */
      var cell_size: js.UndefOr[Double] = js.native
      
      /** Color function f(x, y) that returns a color specification that is consumable by chroma-js */
      var color_function: js.UndefOr[(js.Function2[/* x */ Double, /* y */ Double, String]) | Null] = js.native
      
      /** Color space used for gradient construction & interpolation */
      var color_space: js.UndefOr[String] = js.native
      
      /** Height of pattern */
      var height: js.UndefOr[Double] = js.native
      
      /** An array of [x,y] coordinates to trianglulate. Defaults to undefined, and points are generated. */
      var points: js.UndefOr[js.Array[Double]] = js.native
      
      /** Seed for the RNG */
      var seed: js.UndefOr[Double | String | Null] = js.native
      
      /** Width of stroke. Defaults to 1.51 to fix an issue with canvas antialiasing. */
      var stroke_width: js.UndefOr[Double] = js.native
      
      /** how much to randomize the grid */
      var variance: js.UndefOr[Double] = js.native
      
      /** Width of pattern */
      var width: js.UndefOr[Double] = js.native
      
      /** X color stops */
      var x_colors: js.UndefOr[`false` | String | js.Array[String]] = js.native
      
      /** Y color stops */
      var y_colors: js.UndefOr[`false` | String | js.Array[String]] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCell_size(value: Double): Self = StObject.set(x, "cell_size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCell_sizeUndefined: Self = StObject.set(x, "cell_size", js.undefined)
        
        @scala.inline
        def setColor_function(value: (/* x */ Double, /* y */ Double) => String): Self = StObject.set(x, "color_function", js.Any.fromFunction2(value))
        
        @scala.inline
        def setColor_functionNull: Self = StObject.set(x, "color_function", null)
        
        @scala.inline
        def setColor_functionUndefined: Self = StObject.set(x, "color_function", js.undefined)
        
        @scala.inline
        def setColor_space(value: String): Self = StObject.set(x, "color_space", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColor_spaceUndefined: Self = StObject.set(x, "color_space", js.undefined)
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
        
        @scala.inline
        def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value :_*))
        
        @scala.inline
        def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeedNull: Self = StObject.set(x, "seed", null)
        
        @scala.inline
        def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
        
        @scala.inline
        def setStroke_width(value: Double): Self = StObject.set(x, "stroke_width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStroke_widthUndefined: Self = StObject.set(x, "stroke_width", js.undefined)
        
        @scala.inline
        def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        @scala.inline
        def setX_colors(value: `false` | String | js.Array[String]): Self = StObject.set(x, "x_colors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX_colorsUndefined: Self = StObject.set(x, "x_colors", js.undefined)
        
        @scala.inline
        def setX_colorsVarargs(value: String*): Self = StObject.set(x, "x_colors", js.Array(value :_*))
        
        @scala.inline
        def setY_colors(value: `false` | String | js.Array[String]): Self = StObject.set(x, "y_colors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY_colorsUndefined: Self = StObject.set(x, "y_colors", js.undefined)
        
        @scala.inline
        def setY_colorsVarargs(value: String*): Self = StObject.set(x, "y_colors", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Pattern extends StObject {
      
      def canvas(): HTMLCanvasElement = js.native
      def canvas(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
      
      var opts: Options = js.native
      
      def png(): String = js.native
      
      var polys: js.Any = js.native
      
      def svg(): SVGElement = js.native
      def svg(opts: SVGOptions): SVGElement = js.native
    }
    
    @js.native
    trait SVGOptions extends StObject {
      
      var includeNamespace: Boolean = js.native
    }
    object SVGOptions {
      
      @scala.inline
      def apply(includeNamespace: Boolean): SVGOptions = {
        val __obj = js.Dynamic.literal(includeNamespace = includeNamespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[SVGOptions]
      }
      
      @scala.inline
      implicit class SVGOptionsMutableBuilder[Self <: SVGOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIncludeNamespace(value: Boolean): Self = StObject.set(x, "includeNamespace", value.asInstanceOf[js.Any])
      }
    }
  }
}
