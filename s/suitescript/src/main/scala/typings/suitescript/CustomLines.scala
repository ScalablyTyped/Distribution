package typings.suitescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLines extends StObject {
  
  def addNewLine(): CustomLine
  
  def getCount(): Double
  
  def getLine(index: Double): CustomLine
}
object CustomLines {
  
  inline def apply(addNewLine: () => CustomLine, getCount: () => Double, getLine: Double => CustomLine): CustomLines = {
    val __obj = js.Dynamic.literal(addNewLine = js.Any.fromFunction0(addNewLine), getCount = js.Any.fromFunction0(getCount), getLine = js.Any.fromFunction1(getLine))
    __obj.asInstanceOf[CustomLines]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomLines] (val x: Self) extends AnyVal {
    
    inline def setAddNewLine(value: () => CustomLine): Self = StObject.set(x, "addNewLine", js.Any.fromFunction0(value))
    
    inline def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    inline def setGetLine(value: Double => CustomLine): Self = StObject.set(x, "getLine", js.Any.fromFunction1(value))
  }
}
