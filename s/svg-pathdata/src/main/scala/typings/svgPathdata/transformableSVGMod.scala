package typings.svgPathdata

import typings.svgPathdata.typesMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformableSVGMod {
  
  @JSImport("svg-pathdata/lib/TransformableSVG", "TransformableSVG")
  @js.native
  abstract class TransformableSVG () extends StObject {
    
    def aToC(): this.type = js.native
    
    def annotateArcs(): this.type = js.native
    
    def matrix(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): this.type = js.native
    
    def normalizeHVZ(): this.type = js.native
    def normalizeHVZ(a: Boolean): this.type = js.native
    def normalizeHVZ(a: Boolean, b: Boolean): this.type = js.native
    def normalizeHVZ(a: Boolean, b: Boolean, c: Boolean): this.type = js.native
    def normalizeHVZ(a: Boolean, b: Unit, c: Boolean): this.type = js.native
    def normalizeHVZ(a: Unit, b: Boolean): this.type = js.native
    def normalizeHVZ(a: Unit, b: Boolean, c: Boolean): this.type = js.native
    def normalizeHVZ(a: Unit, b: Unit, c: Boolean): this.type = js.native
    
    def normalizeST(): this.type = js.native
    
    def qtToC(): this.type = js.native
    
    def rotate(a: Double): this.type = js.native
    def rotate(a: Double, x: Double): this.type = js.native
    def rotate(a: Double, x: Double, y: Double): this.type = js.native
    def rotate(a: Double, x: Unit, y: Double): this.type = js.native
    
    def round(): this.type = js.native
    def round(x: Double): this.type = js.native
    
    def sanitize(): this.type = js.native
    def sanitize(eps: Double): this.type = js.native
    
    def scale(x: Double): this.type = js.native
    def scale(x: Double, y: Double): this.type = js.native
    
    def skewX(a: Double): this.type = js.native
    
    def skewY(a: Double): this.type = js.native
    
    def toAbs(): this.type = js.native
    
    def toRel(): this.type = js.native
    
    def transform(transformFunction: TransformFunction): this.type = js.native
    
    def translate(x: Double): this.type = js.native
    def translate(x: Double, y: Double): this.type = js.native
    
    def xSymmetry(): this.type = js.native
    def xSymmetry(xOffset: Double): this.type = js.native
    
    def ySymmetry(): this.type = js.native
    def ySymmetry(yOffset: Double): this.type = js.native
  }
}
