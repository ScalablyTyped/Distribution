package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Number extends StObject {
  
  def format(value: Double, config: js.Any): String
  
  def getConfig(format: String): js.Any
  
  def numToStr(config: js.Any): WebixCallback
  
  def parse(value: String, config: js.Any): Double
}
object Number {
  
  inline def apply(
    format: (Double, js.Any) => String,
    getConfig: String => js.Any,
    numToStr: js.Any => WebixCallback,
    parse: (String, js.Any) => Double
  ): Number = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), getConfig = js.Any.fromFunction1(getConfig), numToStr = js.Any.fromFunction1(numToStr), parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[Number]
  }
  
  extension [Self <: Number](x: Self) {
    
    inline def setFormat(value: (Double, js.Any) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    inline def setGetConfig(value: String => js.Any): Self = StObject.set(x, "getConfig", js.Any.fromFunction1(value))
    
    inline def setNumToStr(value: js.Any => WebixCallback): Self = StObject.set(x, "numToStr", js.Any.fromFunction1(value))
    
    inline def setParse(value: (String, js.Any) => Double): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
  }
}
