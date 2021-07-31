package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HSLA
  extends StObject
     with Node {
  
  var a: Double
  
  /**
    * Add h,s,l to the current component values
    */
  def add(h: Double, s: Double, l: Double): HSLA
  
  /**
    * djust hue by `deg`.
    */
  def adjustHue(deg: Double): HSLA
  
  /**
    * Adjust lightness by `percent`.
    */
  def adjustLightness(percent: Double): HSLA
  
  var h: Double
  
  var hsla: HSLA
  
  var l: Double
  
  var rgba: RGBA
  
  var s: Double
  
  /**
    * Subtract h,s,l from the current component values
    */
  def substract(h: Double, s: Double, l: Double): HSLA
}
object HSLA {
  
  @scala.inline
  def apply(
    a: Double,
    add: (Double, Double, Double) => HSLA,
    adjustHue: Double => HSLA,
    adjustLightness: Double => HSLA,
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    h: Double,
    hash: java.lang.String,
    hsla: HSLA,
    l: Double,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    rgba: RGBA,
    s: Double,
    shouldCoerce: java.lang.String => scala.Boolean,
    substract: (Double, Double, Double) => HSLA,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column
  ): HSLA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], add = js.Any.fromFunction3(add), adjustHue = js.Any.fromFunction1(adjustHue), adjustLightness = js.Any.fromFunction1(adjustLightness), coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), rgba = rgba.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], shouldCoerce = js.Any.fromFunction1(shouldCoerce), substract = js.Any.fromFunction3(substract), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[HSLA]
  }
  
  @scala.inline
  implicit class HSLAMutableBuilder[Self <: HSLA] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd(value: (Double, Double, Double) => HSLA): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAdjustHue(value: Double => HSLA): Self = StObject.set(x, "adjustHue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdjustLightness(value: Double => HSLA): Self = StObject.set(x, "adjustLightness", js.Any.fromFunction1(value))
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsla(value: HSLA): Self = StObject.set(x, "hsla", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgba(value: RGBA): Self = StObject.set(x, "rgba", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstract(value: (Double, Double, Double) => HSLA): Self = StObject.set(x, "substract", js.Any.fromFunction3(value))
  }
}
