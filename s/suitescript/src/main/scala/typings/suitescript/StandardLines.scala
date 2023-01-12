package typings.suitescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardLines extends StObject {
  
  def getCount(): Double
  
  def getLine(index: Double): StandardLine
}
object StandardLines {
  
  inline def apply(getCount: () => Double, getLine: Double => StandardLine): StandardLines = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction0(getCount), getLine = js.Any.fromFunction1(getLine))
    __obj.asInstanceOf[StandardLines]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardLines] (val x: Self) extends AnyVal {
    
    inline def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    inline def setGetLine(value: Double => StandardLine): Self = StObject.set(x, "getLine", js.Any.fromFunction1(value))
  }
}
