package typings.three.buildThreeDotmoduleMod

import typings.three.srcConstantsMod.ColorSpace
import typings.three.threeStrings.`srgb-linear`
import typings.three.threeStrings.srgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorManagement {
  
  @JSImport("three/build/three.module", "ColorManagement")
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(
    color: typings.three.srcMathColorMod.Color,
    sourceColorSpace: srgb | `srgb-linear`,
    targetColorSpace: srgb | `srgb-linear`
  ): typings.three.srcMathColorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathColorMod.Color]
  inline def convert(
    color: typings.three.srcMathColorMod.Color,
    sourceColorSpace: srgb | `srgb-linear`,
    targetColorSpace: /* "display-p3" */ String
  ): typings.three.srcMathColorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathColorMod.Color]
  inline def convert(
    color: typings.three.srcMathColorMod.Color,
    sourceColorSpace: /* "display-p3" */ String,
    targetColorSpace: srgb | `srgb-linear`
  ): typings.three.srcMathColorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathColorMod.Color]
  inline def convert(
    color: typings.three.srcMathColorMod.Color,
    sourceColorSpace: /* "display-p3" */ String,
    targetColorSpace: /* "display-p3" */ String
  ): typings.three.srcMathColorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathColorMod.Color]
  
  /**
    * @default false
    */
  @JSImport("three/build/three.module", "ColorManagement.enabled")
  @js.native
  def enabled: Boolean = js.native
  inline def enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
  
  inline def fromWorkingColorSpace(color: typings.three.srcMathColorMod.Color, targetColorSpace: srgb | `srgb-linear`): typings.three.srcMathColorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWorkingColorSpace")(color.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathColorMod.Color]
  inline def fromWorkingColorSpace(color: typings.three.srcMathColorMod.Color, targetColorSpace: /* "display-p3" */ String): typings.three.srcMathColorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWorkingColorSpace")(color.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathColorMod.Color]
  
  inline def toWorkingColorSpace(color: typings.three.srcMathColorMod.Color, sourceColorSpace: srgb | `srgb-linear`): typings.three.srcMathColorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("toWorkingColorSpace")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathColorMod.Color]
  inline def toWorkingColorSpace(color: typings.three.srcMathColorMod.Color, sourceColorSpace: /* "display-p3" */ String): typings.three.srcMathColorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("toWorkingColorSpace")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathColorMod.Color]
  
  /**
    * @default LinearSRGBColorSpace
    */
  @JSImport("three/build/three.module", "ColorManagement.workingColorSpace")
  @js.native
  def workingColorSpace: ColorSpace = js.native
  inline def workingColorSpace_=(x: ColorSpace): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workingColorSpace")(x.asInstanceOf[js.Any])
}
