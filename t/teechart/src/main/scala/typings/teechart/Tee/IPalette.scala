package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPalette extends StObject {
  
  var colors: js.Array[String] = js.native
  
  def get(index: Double): String = js.native
}
object IPalette {
  
  @scala.inline
  def apply(colors: js.Array[String], get: Double => String): IPalette = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[IPalette]
  }
  
  @scala.inline
  implicit class IPaletteMutableBuilder[Self <: IPalette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setGet(value: Double => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
