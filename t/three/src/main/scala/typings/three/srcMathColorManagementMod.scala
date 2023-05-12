package typings.three

import typings.three.srcConstantsMod.ColorSpace
import typings.three.srcMathColorMod.Color
import typings.three.threeStrings.`srgb-linear`
import typings.three.threeStrings.srgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathColorManagementMod {
  
  @JSImport("three/src/math/ColorManagement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ColorManagement {
    
    @JSImport("three/src/math/ColorManagement", "ColorManagement")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convert(color: Color, sourceColorSpace: srgb | `srgb-linear`, targetColorSpace: srgb | `srgb-linear`): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    inline def convert(color: Color, sourceColorSpace: srgb | `srgb-linear`, targetColorSpace: /* "display-p3" */ String): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    inline def convert(color: Color, sourceColorSpace: /* "display-p3" */ String, targetColorSpace: srgb | `srgb-linear`): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    inline def convert(
      color: Color,
      sourceColorSpace: /* "display-p3" */ String,
      targetColorSpace: /* "display-p3" */ String
    ): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    
    /**
      * @default false
      */
    @JSImport("three/src/math/ColorManagement", "ColorManagement.enabled")
    @js.native
    def enabled: Boolean = js.native
    inline def enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
    
    inline def fromWorkingColorSpace(color: Color, targetColorSpace: srgb | `srgb-linear`): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWorkingColorSpace")(color.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    inline def fromWorkingColorSpace(color: Color, targetColorSpace: /* "display-p3" */ String): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWorkingColorSpace")(color.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    
    inline def toWorkingColorSpace(color: Color, sourceColorSpace: srgb | `srgb-linear`): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("toWorkingColorSpace")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    inline def toWorkingColorSpace(color: Color, sourceColorSpace: /* "display-p3" */ String): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("toWorkingColorSpace")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    
    /**
      * @default LinearSRGBColorSpace
      */
    @JSImport("three/src/math/ColorManagement", "ColorManagement.workingColorSpace")
    @js.native
    def workingColorSpace: ColorSpace = js.native
    inline def workingColorSpace_=(x: ColorSpace): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workingColorSpace")(x.asInstanceOf[js.Any])
  }
  
  inline def LinearToSRGB(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("LinearToSRGB")(c.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def SRGBToLinear(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("SRGBToLinear")(c.asInstanceOf[js.Any]).asInstanceOf[Double]
}
