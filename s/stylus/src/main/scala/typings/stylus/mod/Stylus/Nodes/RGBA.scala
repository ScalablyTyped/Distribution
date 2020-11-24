package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RGBA extends Node {
  
  var a: Double = js.native
  
  /**
    * Add r,g,b,a to the current component values
    */
  def add(r: Double, g: Double, b: Double, a: Double): RGBA = js.native
  
  var b: Double = js.native
  
  /**
    * Divide rgb components by `n`.
    */
  def divide(n: Double): RGBA = js.native
  
  var g: Double = js.native
  
  var hsla: HSLA = js.native
  
  /**
    * Multiply rgb components by `n`.
    */
  def multiply(n: Double): RGBA = js.native
  
  var r: Double = js.native
  
  var rgba: RGBA = js.native
  
  /**
    * Subtract r,g,b,a from the current component values
    */
  def substract(r: Double, g: Double, b: Double, a: Double): RGBA = js.native
}
object RGBA {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class RGBAOps[Self <: RGBA] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd(value: (Double, Double, Double, Double) => RGBA): Self = this.set("add", js.Any.fromFunction4(value))
    
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivide(value: Double => RGBA): Self = this.set("divide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setG(value: Double): Self = this.set("g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsla(value: HSLA): Self = this.set("hsla", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiply(value: Double => RGBA): Self = this.set("multiply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgba(value: RGBA): Self = this.set("rgba", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstract(value: (Double, Double, Double, Double) => RGBA): Self = this.set("substract", js.Any.fromFunction4(value))
  }
}
