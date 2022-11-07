package typings.threeTdsLoader.anon

import typings.three.srcConstantsMod.ColorSpace
import typings.three.srcConstantsMod.LinearSRGBColorSpace
import typings.three.srcConstantsMod.SRGBColorSpace
import typings.three.srcMathColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofColorManagement extends StObject {
  
  def convert(color: Color, sourceColorSpace: LinearSRGBColorSpace, targetColorSpace: LinearSRGBColorSpace): Color = js.native
  def convert(color: Color, sourceColorSpace: LinearSRGBColorSpace, targetColorSpace: SRGBColorSpace): Color = js.native
  def convert(color: Color, sourceColorSpace: SRGBColorSpace, targetColorSpace: LinearSRGBColorSpace): Color = js.native
  def convert(color: Color, sourceColorSpace: SRGBColorSpace, targetColorSpace: SRGBColorSpace): Color = js.native
  
  def fromWorkingColorSpace(color: Color, targetColorSpace: LinearSRGBColorSpace): Color = js.native
  def fromWorkingColorSpace(color: Color, targetColorSpace: SRGBColorSpace): Color = js.native
  
  /**
    * @default true
    */
  var legacyMode: Boolean = js.native
  
  def toWorkingColorSpace(color: Color, sourceColorSpace: LinearSRGBColorSpace): Color = js.native
  def toWorkingColorSpace(color: Color, sourceColorSpace: SRGBColorSpace): Color = js.native
  
  /**
    * @default LinearSRGBColorSpace
    */
  var workingColorSpace: ColorSpace = js.native
}
