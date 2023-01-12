package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPalette extends StObject {
  
  var colors: js.Array[String]
  
  def get(index: Double): String
}
object IPalette {
  
  inline def apply(colors: js.Array[String], get: Double => String): IPalette = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[IPalette]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPalette] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setGet(value: Double => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
