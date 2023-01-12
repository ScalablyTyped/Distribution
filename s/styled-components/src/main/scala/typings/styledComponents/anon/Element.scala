package typings.styledComponents.anon

import typings.std.HTMLStyleElement
import typings.std.Node
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  def deleteRule(index: Double): Unit
  
  var element: HTMLStyleElement
  
  def getRule(index: Double): String
  
  def insertRule(index: Double, rule: String): Boolean
  
  var length: Double
  
  var nodes: NodeListOf[Node]
}
object Element {
  
  inline def apply(
    deleteRule: Double => Unit,
    element: HTMLStyleElement,
    getRule: Double => String,
    insertRule: (Double, String) => Boolean,
    length: Double,
    nodes: NodeListOf[Node]
  ): Element = {
    val __obj = js.Dynamic.literal(deleteRule = js.Any.fromFunction1(deleteRule), element = element.asInstanceOf[js.Any], getRule = js.Any.fromFunction1(getRule), insertRule = js.Any.fromFunction2(insertRule), length = length.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    inline def setDeleteRule(value: Double => Unit): Self = StObject.set(x, "deleteRule", js.Any.fromFunction1(value))
    
    inline def setElement(value: HTMLStyleElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setGetRule(value: Double => String): Self = StObject.set(x, "getRule", js.Any.fromFunction1(value))
    
    inline def setInsertRule(value: (Double, String) => Boolean): Self = StObject.set(x, "insertRule", js.Any.fromFunction2(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: NodeListOf[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
