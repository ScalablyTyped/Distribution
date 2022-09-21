package typings.styledComponents.anon

import typings.std.CSSStyleSheet
import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRule extends StObject {
  
  def deleteRule(index: Double): Unit
  
  var element: HTMLStyleElement
  
  def getRule(index: Double): String
  
  def insertRule(index: Double, rule: String): Boolean
  
  var length: Double
  
  var sheet: CSSStyleSheet
}
object DeleteRule {
  
  inline def apply(
    deleteRule: Double => Unit,
    element: HTMLStyleElement,
    getRule: Double => String,
    insertRule: (Double, String) => Boolean,
    length: Double,
    sheet: CSSStyleSheet
  ): DeleteRule = {
    val __obj = js.Dynamic.literal(deleteRule = js.Any.fromFunction1(deleteRule), element = element.asInstanceOf[js.Any], getRule = js.Any.fromFunction1(getRule), insertRule = js.Any.fromFunction2(insertRule), length = length.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRule]
  }
  
  extension [Self <: DeleteRule](x: Self) {
    
    inline def setDeleteRule(value: Double => Unit): Self = StObject.set(x, "deleteRule", js.Any.fromFunction1(value))
    
    inline def setElement(value: HTMLStyleElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setGetRule(value: Double => String): Self = StObject.set(x, "getRule", js.Any.fromFunction1(value))
    
    inline def setInsertRule(value: (Double, String) => Boolean): Self = StObject.set(x, "insertRule", js.Any.fromFunction2(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setSheet(value: CSSStyleSheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
  }
}
