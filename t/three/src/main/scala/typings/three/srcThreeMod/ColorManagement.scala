package typings.three.srcThreeMod

import typings.three.srcConstantsMod.ColorSpace
import typings.three.srcConstantsMod.LinearSRGBColorSpace
import typings.three.srcConstantsMod.SRGBColorSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorManagement {
  
  @JSImport("three/src/Three", "ColorManagement")
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(
    color: typings.three.srcMathColorMod.Color,
    sourceColorSpace: LinearSRGBColorSpace | SRGBColorSpace,
    targetColorSpace: LinearSRGBColorSpace | SRGBColorSpace
  ): typings.three.srcMathColorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathColorMod.Color]
  
  inline def fromWorkingColorSpace(
    color: typings.three.srcMathColorMod.Color,
    targetColorSpace: LinearSRGBColorSpace | SRGBColorSpace
  ): typings.three.srcMathColorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWorkingColorSpace")(color.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathColorMod.Color]
  
  /**
    * @default true
    */
  @JSImport("three/src/Three", "ColorManagement.legacyMode")
  @js.native
  def legacyMode: Boolean = js.native
  inline def legacyMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legacyMode")(x.asInstanceOf[js.Any])
  
  inline def toWorkingColorSpace(
    color: typings.three.srcMathColorMod.Color,
    sourceColorSpace: LinearSRGBColorSpace | SRGBColorSpace
  ): typings.three.srcMathColorMod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("toWorkingColorSpace")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcMathColorMod.Color]
  
  /**
    * @default LinearSRGBColorSpace
    */
  @JSImport("three/src/Three", "ColorManagement.workingColorSpace")
  @js.native
  def workingColorSpace: ColorSpace = js.native
  inline def workingColorSpace_=(x: ColorSpace): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workingColorSpace")(x.asInstanceOf[js.Any])
}
