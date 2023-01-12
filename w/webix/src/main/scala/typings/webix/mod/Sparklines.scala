package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sparklines extends StObject {
  
  var paddingX: Double
  
  var paddingY: Double
  
  var radius: Double
  
  def template(item: obj, common: String, data: js.Array[Any], column: obj, index: Double): String
}
object Sparklines {
  
  @JSImport("webix", "Sparklines")
  @js.native
  val ^ : Sparklines = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sparklines] (val x: Self) extends AnyVal {
    
    inline def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
    
    inline def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: (obj, String, js.Array[Any], obj, Double) => String): Self = StObject.set(x, "template", js.Any.fromFunction5(value))
  }
}
