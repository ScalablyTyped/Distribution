package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sparklines extends StObject {
  
  var paddingX: Double = js.native
  
  var paddingY: Double = js.native
  
  var radius: Double = js.native
  
  def template(item: js.Any, common: String, data: js.Array[_], column: js.Any, index: Double): String = js.native
}
object Sparklines {
  
  @scala.inline
  def apply(
    paddingX: Double,
    paddingY: Double,
    radius: Double,
    template: (js.Any, String, js.Array[_], js.Any, Double) => String
  ): Sparklines = {
    val __obj = js.Dynamic.literal(paddingX = paddingX.asInstanceOf[js.Any], paddingY = paddingY.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], template = js.Any.fromFunction5(template))
    __obj.asInstanceOf[Sparklines]
  }
  
  @scala.inline
  implicit class SparklinesMutableBuilder[Self <: Sparklines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: (js.Any, String, js.Array[_], js.Any, Double) => String): Self = StObject.set(x, "template", js.Any.fromFunction5(value))
  }
}
