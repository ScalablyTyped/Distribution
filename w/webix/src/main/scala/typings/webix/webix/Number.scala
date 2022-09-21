package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Number extends StObject {
  
  def format(value: Double, config: Any): String
  
  def getConfig(format: String): Any
  
  def numToStr(config: Any): WebixCallback
  
  def parse(value: String, config: Any): Double
}
object Number {
  
  inline def apply(
    format: (Double, Any) => String,
    getConfig: String => Any,
    numToStr: Any => WebixCallback,
    parse: (String, Any) => Double
  ): Number = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), getConfig = js.Any.fromFunction1(getConfig), numToStr = js.Any.fromFunction1(numToStr), parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[Number]
  }
  
  extension [Self <: Number](x: Self) {
    
    inline def setFormat(value: (Double, Any) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    inline def setGetConfig(value: String => Any): Self = StObject.set(x, "getConfig", js.Any.fromFunction1(value))
    
    inline def setNumToStr(value: Any => WebixCallback): Self = StObject.set(x, "numToStr", js.Any.fromFunction1(value))
    
    inline def setParse(value: (String, Any) => Double): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
  }
}
