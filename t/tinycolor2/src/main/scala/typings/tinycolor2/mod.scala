package typings.tinycolor2

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.tinycolor2.anon.Aliceblue
import typings.tinycolor2.anon.`000`
import typings.tinycolor2.mod.ColorFormats.HSLA
import typings.tinycolor2.mod.ColorFormats.HSVA
import typings.tinycolor2.mod.ColorFormats.PRGBA
import typings.tinycolor2.mod.ColorFormats.RGBA
import typings.tinycolor2.tinycolor2Booleans.`false`
import typings.tinycolor2.tinycolor2Strings.AA
import typings.tinycolor2.tinycolor2Strings.AAA
import typings.tinycolor2.tinycolor2Strings.hex
import typings.tinycolor2.tinycolor2Strings.hex3
import typings.tinycolor2.tinycolor2Strings.hex4
import typings.tinycolor2.tinycolor2Strings.hex6
import typings.tinycolor2.tinycolor2Strings.hex8
import typings.tinycolor2.tinycolor2Strings.hsl
import typings.tinycolor2.tinycolor2Strings.hsv
import typings.tinycolor2.tinycolor2Strings.large
import typings.tinycolor2.tinycolor2Strings.name
import typings.tinycolor2.tinycolor2Strings.prgb
import typings.tinycolor2.tinycolor2Strings.rgb
import typings.tinycolor2.tinycolor2Strings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tinycolor2", JSImport.Namespace)
  @js.native
  /**
    * Create a tinycolor instance of the color named.
    *
    * @param color - the color as one of the valid color input format.
    */
  open class ^ ()
    extends StObject
       with Instance {
    def this(color: ColorInput) = this()
    def this(color: Unit, opts: ConstructorOptions) = this()
    def this(color: ColorInput, opts: ConstructorOptions) = this()
  }
  @JSImport("tinycolor2", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  object ColorFormats {
    
    trait Alpha extends StObject {
      
      var a: Double
    }
    object Alpha {
      
      inline def apply(a: Double): Alpha = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
        __obj.asInstanceOf[Alpha]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Alpha] (val x: Self) extends AnyVal {
        
        inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      }
    }
    
    trait HSL
      extends StObject
         with _ColorInputWithoutInstance {
      
      var h: Double
      
      var l: Double
      
      var s: Double
    }
    object HSL {
      
      inline def apply(h: Double, l: Double, s: Double): HSL = {
        val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
        __obj.asInstanceOf[HSL]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HSL] (val x: Self) extends AnyVal {
        
        inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
        
        inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
        
        inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.tinycolor2.mod._ColorInput because Already inherited
    - typings.tinycolor2.mod._ColorInputWithoutInstance because Already inherited */ trait HSLA
      extends StObject
         with HSL
         with Alpha
    object HSLA {
      
      inline def apply(a: Double, h: Double, l: Double, s: Double): HSLA = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
        __obj.asInstanceOf[HSLA]
      }
    }
    
    trait HSV
      extends StObject
         with _ColorInputWithoutInstance {
      
      var h: Double
      
      var s: Double
      
      var v: Double
    }
    object HSV {
      
      inline def apply(h: Double, s: Double, v: Double): HSV = {
        val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
        __obj.asInstanceOf[HSV]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HSV] (val x: Self) extends AnyVal {
        
        inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
        
        inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
        
        inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.tinycolor2.mod._ColorInput because Already inherited
    - typings.tinycolor2.mod._ColorInputWithoutInstance because Already inherited */ trait HSVA
      extends StObject
         with HSV {
      
      var a: Double
    }
    object HSVA {
      
      inline def apply(a: Double, h: Double, s: Double, v: Double): HSVA = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
        __obj.asInstanceOf[HSVA]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HSVA] (val x: Self) extends AnyVal {
        
        inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      }
    }
    
    trait PRGB
      extends StObject
         with _ColorInputWithoutInstance {
      
      var b: String
      
      var g: String
      
      var r: String
    }
    object PRGB {
      
      inline def apply(b: String, g: String, r: String): PRGB = {
        val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
        __obj.asInstanceOf[PRGB]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PRGB] (val x: Self) extends AnyVal {
        
        inline def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        inline def setG(value: String): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.tinycolor2.mod._ColorInput because Already inherited
    - typings.tinycolor2.mod._ColorInputWithoutInstance because Already inherited */ trait PRGBA
      extends StObject
         with PRGB
         with Alpha
    object PRGBA {
      
      inline def apply(a: Double, b: String, g: String, r: String): PRGBA = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
        __obj.asInstanceOf[PRGBA]
      }
    }
    
    trait RGB
      extends StObject
         with _ColorInputWithoutInstance {
      
      var b: Double
      
      var g: Double
      
      var r: Double
    }
    object RGB {
      
      inline def apply(b: Double, g: Double, r: Double): RGB = {
        val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
        __obj.asInstanceOf[RGB]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
        
        inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.tinycolor2.mod._ColorInput because Already inherited
    - typings.tinycolor2.mod._ColorInputWithoutInstance because Already inherited */ trait RGBA
      extends StObject
         with RGB
         with Alpha
    object RGBA {
      
      inline def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
        __obj.asInstanceOf[RGBA]
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tinycolor2.mod.ColorInputWithoutInstance
    - typings.tinycolor2.mod.Instance
  */
  type ColorInput = _ColorInput | String
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.tinycolor2.mod.ColorFormats.PRGB
    - typings.tinycolor2.mod.ColorFormats.PRGBA
    - typings.tinycolor2.mod.ColorFormats.RGB
    - typings.tinycolor2.mod.ColorFormats.RGBA
    - typings.tinycolor2.mod.ColorFormats.HSL
    - typings.tinycolor2.mod.ColorFormats.HSLA
    - typings.tinycolor2.mod.ColorFormats.HSV
    - typings.tinycolor2.mod.ColorFormats.HSVA
  */
  type ColorInputWithoutInstance = _ColorInputWithoutInstance | String
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * Create a tinycolor instance of the color named.
    *
    * @param color - the color as one of the valid color input format.
    */
  Instantiable0[Instance]
       with Instantiable1[/* color */ ColorInput, Instance]
       with Instantiable2[
          (/* color */ ColorInput) | (/* color */ Unit), 
          /* opts */ ConstructorOptions, 
          Instance
        ] {
    
    def apply(): Instance = js.native
    def apply(color: Unit, opts: ConstructorOptions): Instance = js.native
    def apply(color: ColorInput): Instance = js.native
    def apply(color: ColorInput, opts: ConstructorOptions): Instance = js.native
    
    /**
      * Compares two colors. Each colors can be any color inputs.
      */
    def equals(): Boolean = js.native
    def equals(color1: Unit, color2: ColorInput): Boolean = js.native
    def equals(color1: ColorInput, color2: ColorInput): Boolean = js.native
    
    /**
      * Create a tinycolor instance based off the relative values.
      * Works with any color formats
      *
      * @param ratio - the relative color/hue values to apply to the new instance.
      */
    def fromRatio(): Instance = js.native
    def fromRatio(ratio: ColorInputWithoutInstance): Instance = js.native
    
    /**
      * key: hex value
      * value: string name ex. hexnames["f00"] --> "red"
      */
    var hexNames: `000` = js.native
    
    /**
      * Ensure that foreground and background color combinations meet WCAG2 guidelines.
      *
      * @param color1 - the fore color wanted.
      * @param color2 - the back color wanted.
      * @param wcag2 - WCAG option. If the entire object is absent, function use the default of {level:"AA",size:"small"}.
      * @param wcag2.level - The 'level' property states 'AA' or 'AAA'
      *     if missing or invalid, it defaults to 'AA'
      * @param wcag2.size - The 'size' property states 'large' or 'small'
      *     if missing or invalid, it defaults to 'small'.
      */
    def isReadable(color1: ColorInput, color2: ColorInput): Boolean = js.native
    def isReadable(color1: ColorInput, color2: ColorInput, wcag2: WCAG2Options): Boolean = js.native
    
    def mix(color1: ColorInput, color2: ColorInput): Instance = js.native
    def mix(color1: ColorInput, color2: ColorInput, amount: Double): Instance = js.native
    
    /**
      * Given a base color and a list of possible foreground or background colors for that base,
      *  returns the most readable color. Optionally returns Black or White if the most readable color is unreadable.
      *
      * @param color - the base color.
      * @param colorsToCompare - array of colors to pick the most readable one from.
      * @param args - and object with extra arguments
      */
    def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput]): Instance = js.native
    def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput], args: MostReadableArgs): Instance = js.native
    
    /**
      * key: 'real' color name
      * value: hex value ex. names["red"] --> "f00"
      */
    var names: Aliceblue = js.native
    
    /**
      * Returns a random color
      */
    def random(): Instance = js.native
    
    /**
      * Compares the two colors and returns the constrast between two colors as a number.
      *
      * @param color1 - the first color to be used in the comparison.
      * @param color2 - the second color to be used in the comparison.
      */
    def readability(color1: ColorInput, color2: ColorInput): Double = js.native
  }
  
  trait ConstructorOptions extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var gradientType: js.UndefOr[Boolean] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGradientType(value: Boolean): Self = StObject.set(x, "gradientType", value.asInstanceOf[js.Any])
      
      inline def setGradientTypeUndefined: Self = StObject.set(x, "gradientType", js.undefined)
    }
  }
  
  @js.native
  trait Instance
    extends StObject
       with _ColorInput {
    
    /**
      * Gets an analogous color scheme based off of the current color.
      *
      * @param results - The amount of results to return.
      *  Default value: 6.
      * @param slices - The amount to slice the input color by.
      *  Default value: 30.
      */
    def analogous(): js.Array[Instance] = js.native
    def analogous(results: Double): js.Array[Instance] = js.native
    def analogous(results: Double, slices: Double): js.Array[Instance] = js.native
    def analogous(results: Unit, slices: Double): js.Array[Instance] = js.native
    
    /**
      * Brighten the color a given amount.
      *
      * @param amount - The amount to brighten by. The valid range is 0 to 100.
      *  Default value: 10.
      */
    def brighten(): Instance = js.native
    def brighten(amount: Double): Instance = js.native
    
    /**
      * Gets the complement of the current color
      */
    def complement(): Instance = js.native
    
    /**
      * Darken the color a given amount.
      *  Providing 100 will always return black.
      *
      * @param amount - The amount to darken by. The valid range is 0 to 100.
      *  Default value: 10.
      */
    def darken(): Instance = js.native
    def darken(amount: Double): Instance = js.native
    
    /**
      * Desaturate the color a given amount.
      *  Providing 100 will is the same as calling greyscale.
      *
      * @param amount - The amount to desaturate by. The valid range is 0 to 100.
      *  Default value: 10.
      */
    def desaturate(): Instance = js.native
    def desaturate(amount: Double): Instance = js.native
    
    /**
      * Returns the alpha value of the color
      */
    def getAlpha(): Double = js.native
    
    /**
      * Returns the perceived brightness of the color, from 0-255.
      */
    def getBrightness(): Double = js.native
    
    /**
      * Returns the format used to create the tinycolor instance.
      */
    def getFormat(): String = js.native
    
    /**
      * Returns the perceived luminance of a color, from 0-1.
      */
    def getLuminance(): Double = js.native
    
    /**
      * Returns the input passed into the constructer used to create the tinycolor instance.
      */
    def getOriginalInput(): ColorInput = js.native
    
    /**
      * Completely desaturates a color into greyscale.
      * Same as calling desaturate(100).
      */
    def greyscale(): Instance = js.native
    
    /**
      * Return an indication whether the color's perceived brightness is dark.
      */
    def isDark(): Boolean = js.native
    
    /**
      * Return an indication whether the color's perceived brightness is light.
      */
    def isLight(): Boolean = js.native
    
    /**
      * Return an indication whether the color was successfully parsed.
      */
    def isValid(): Boolean = js.native
    
    /**
      * Lighten the color a given amount. Providing 100 will always return white.
      *
      * @param amount - The amount to lighten by. The valid range is 0 to 100.
      *  Default value: 10.
      */
    def lighten(): Instance = js.native
    def lighten(amount: Double): Instance = js.native
    
    /**
      * Gets a monochromatic color scheme based off of the current color.
      *
      * @param results - The amount of results to return.
      *  Default value: 6.
      */
    def monochromatic(): js.Array[Instance] = js.native
    def monochromatic(results: Double): js.Array[Instance] = js.native
    
    /**
      * Saturate the color a given amount.
      *
      * @param amount - The amount to saturate by. The valid range is 0  to 100.
      *  Default value: 10.
      */
    def saturate(): Instance = js.native
    def saturate(amount: Double): Instance = js.native
    
    /**
      * Sets the alpha value on the current color.
      *
      * @param alpha - The new alpha value. The accepted range is 0-1.
      */
    def setAlpha(alpha: Double): Instance = js.native
    
    /**
      * Spin the hue a given amount. Calling with 0, 360, or -360 will do nothing.
      *
      * @param amount - The amount to spin by. The valid range is -360 to 360.
      */
    def spin(amount: Double): Instance = js.native
    
    /**
      * Gets a split complement color scheme based off of the current color.
      */
    def splitcomplement(): js.Tuple3[Instance, Instance, Instance] = js.native
    
    /**
      * Gets a tetrad based off of the current color.
      */
    def tetrad(): js.Tuple4[Instance, Instance, Instance, Instance] = js.native
    
    /**
      * Returns the color represented as a Microsoft filter for use in old versions of IE.
      */
    def toFilter(): String = js.native
    
    /**
      * Returns the hex value of the color.
      */
    def toHex(): String = js.native
    
    /**
      * Returns the hex 8 value of the color.
      */
    def toHex8(): String = js.native
    
    /**
      * Returns the hex 8  value of the color -with a # appened.
      */
    def toHex8String(): String = js.native
    
    /**
      * Returns the hex value of the color -with a # appened.
      */
    def toHexString(): String = js.native
    
    /**
      * Returns the object as a HSLA object.
      */
    def toHsl(): HSLA = js.native
    
    /**
      * Returns the hsla values interpolated into a string with the following format:
      * "hsla(xxx, xxx, xxx, xx)".
      */
    def toHslString(): String = js.native
    
    /**
      * Returns the object as a HSVA object.
      */
    def toHsv(): HSVA = js.native
    
    /**
      * Returns the hsva values interpolated into a string with the following format:
      * "hsva(xxx, xxx, xxx, xx)".
      */
    def toHsvString(): String = js.native
    
    /**
      * The 'real' name of the color -if there is one.
      */
    def toName(): String | `false` = js.native
    
    /**
      * Returns the object as a RGBA object.
      */
    def toPercentageRgb(): PRGBA = js.native
    
    /**
      * Returns the RGBA relative values interpolated into a string with the following format:
      * "RGBA(xxx, xxx, xxx, xx)".
      */
    def toPercentageRgbString(): String = js.native
    
    /**
      * Returns the object as a RGBA object.
      */
    def toRgb(): RGBA = js.native
    
    /**
      * Returns the RGBA values interpolated into a string with the following format:
      * "RGBA(xxx, xxx, xxx, xx)".
      */
    def toRgbString(): String = js.native
    
    def toString(format: rgb | prgb | hex | hex6 | hex3 | hex4 | hex8 | name | hsl | hsv): String = js.native
    
    /**
      * Gets a triad based off of the current color.
      */
    def triad(): js.Tuple3[Instance, Instance, Instance] = js.native
  }
  
  trait MostReadableArgs
    extends StObject
       with WCAG2Options {
    
    var includeFallbackColors: js.UndefOr[Boolean] = js.undefined
  }
  object MostReadableArgs {
    
    inline def apply(): MostReadableArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MostReadableArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MostReadableArgs] (val x: Self) extends AnyVal {
      
      inline def setIncludeFallbackColors(value: Boolean): Self = StObject.set(x, "includeFallbackColors", value.asInstanceOf[js.Any])
      
      inline def setIncludeFallbackColorsUndefined: Self = StObject.set(x, "includeFallbackColors", js.undefined)
    }
  }
  
  trait WCAG2Options extends StObject {
    
    var level: js.UndefOr[AA | AAA] = js.undefined
    
    var size: js.UndefOr[large | small] = js.undefined
  }
  object WCAG2Options {
    
    inline def apply(): WCAG2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WCAG2Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WCAG2Options] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: AA | AAA): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait _ColorInput extends StObject
  
  trait _ColorInputWithoutInstance
    extends StObject
       with _ColorInput
  object _ColorInputWithoutInstance {
    
    inline def HSL(h: Double, l: Double, s: Double): typings.tinycolor2.mod.ColorFormats.HSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tinycolor2.mod.ColorFormats.HSL]
    }
    
    inline def HSLA(a: Double, h: Double, l: Double, s: Double): typings.tinycolor2.mod.ColorFormats.HSLA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tinycolor2.mod.ColorFormats.HSLA]
    }
    
    inline def HSV(h: Double, s: Double, v: Double): typings.tinycolor2.mod.ColorFormats.HSV = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tinycolor2.mod.ColorFormats.HSV]
    }
    
    inline def HSVA(a: Double, h: Double, s: Double, v: Double): typings.tinycolor2.mod.ColorFormats.HSVA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tinycolor2.mod.ColorFormats.HSVA]
    }
    
    inline def PRGB(b: String, g: String, r: String): typings.tinycolor2.mod.ColorFormats.PRGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tinycolor2.mod.ColorFormats.PRGB]
    }
    
    inline def PRGBA(a: Double, b: String, g: String, r: String): typings.tinycolor2.mod.ColorFormats.PRGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tinycolor2.mod.ColorFormats.PRGBA]
    }
    
    inline def RGB(b: Double, g: Double, r: Double): typings.tinycolor2.mod.ColorFormats.RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tinycolor2.mod.ColorFormats.RGB]
    }
    
    inline def RGBA(a: Double, b: Double, g: Double, r: Double): typings.tinycolor2.mod.ColorFormats.RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tinycolor2.mod.ColorFormats.RGBA]
    }
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Constructor = ^
}
