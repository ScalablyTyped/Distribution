package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import typings.stylus.mod.Stylus.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Object
  extends StObject
     with Node {
  
  /**
    * Get `key`.
    */
  def get(key: java.lang.String): Node
  
  /**
    * Has `key`?
    */
  def has(key: java.lang.String): scala.Boolean
  
  var length: Double
  
  /**
    * Set `key` to `val`.
    */
  def set(key: java.lang.String, value: Node): this.type
  
  /**
    * Convert object to string with properties.
    */
  def toBlock(): java.lang.String
  
  var vals: Dictionary[Node]
}
object Object {
  
  inline def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    get: java.lang.String => Node,
    has: java.lang.String => scala.Boolean,
    hash: java.lang.String,
    length: Double,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    set: (java.lang.String, Node) => Object,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBlock: () => java.lang.String,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column,
    vals: Dictionary[Node]
  ): Object = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), hash = hash.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), set = js.Any.fromFunction2(set), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBlock = js.Any.fromFunction0(toBlock), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON), vals = vals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  
  extension [Self <: Object](x: Self) {
    
    inline def setGet(value: java.lang.String => Node): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: java.lang.String => scala.Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setSet(value: (java.lang.String, Node) => Object): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setToBlock(value: () => java.lang.String): Self = StObject.set(x, "toBlock", js.Any.fromFunction0(value))
    
    inline def setVals(value: Dictionary[Node]): Self = StObject.set(x, "vals", value.asInstanceOf[js.Any])
  }
}
