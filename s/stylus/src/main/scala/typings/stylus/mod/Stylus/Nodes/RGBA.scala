package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RGBA
  extends StObject
     with Node {
  
  var a: Double
  
  /**
    * Add r,g,b,a to the current component values
    */
  def add(r: Double, g: Double, b: Double, a: Double): RGBA
  
  var b: Double
  
  /**
    * Divide rgb components by `n`.
    */
  def divide(n: Double): RGBA
  
  var g: Double
  
  var hsla: HSLA
  
  /**
    * Multiply rgb components by `n`.
    */
  def multiply(n: Double): RGBA
  
  var r: Double
  
  var rgba: RGBA
  
  /**
    * Subtract r,g,b,a from the current component values
    */
  def substract(r: Double, g: Double, b: Double, a: Double): RGBA
}
object RGBA {
  
  inline def apply(
    a: Double,
    add: (Double, Double, Double, Double) => RGBA,
    b: Double,
    coerce: Node => Node,
    column: Double,
    divide: Double => RGBA,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    g: Double,
    hash: java.lang.String,
    hsla: HSLA,
    lineno: Double,
    multiply: Double => RGBA,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    r: Double,
    rgba: RGBA,
    shouldCoerce: java.lang.String => scala.Boolean,
    substract: (Double, Double, Double, Double) => RGBA,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column
  ): RGBA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], add = js.Any.fromFunction4(add), b = b.asInstanceOf[js.Any], coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], divide = js.Any.fromFunction1(divide), eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], multiply = js.Any.fromFunction1(multiply), nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), r = r.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any], shouldCoerce = js.Any.fromFunction1(shouldCoerce), substract = js.Any.fromFunction4(substract), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[RGBA]
  }
  
  extension [Self <: RGBA](x: Self) {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAdd(value: (Double, Double, Double, Double) => RGBA): Self = StObject.set(x, "add", js.Any.fromFunction4(value))
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setDivide(value: Double => RGBA): Self = StObject.set(x, "divide", js.Any.fromFunction1(value))
    
    inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setHsla(value: HSLA): Self = StObject.set(x, "hsla", value.asInstanceOf[js.Any])
    
    inline def setMultiply(value: Double => RGBA): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRgba(value: RGBA): Self = StObject.set(x, "rgba", value.asInstanceOf[js.Any])
    
    inline def setSubstract(value: (Double, Double, Double, Double) => RGBA): Self = StObject.set(x, "substract", js.Any.fromFunction4(value))
  }
}
