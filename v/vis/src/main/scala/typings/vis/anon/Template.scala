package typings.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Template extends StObject {
  
  def template(item: Any): Any
}
object Template {
  
  inline def apply(template: Any => Any): Template = {
    val __obj = js.Dynamic.literal(template = js.Any.fromFunction1(template))
    __obj.asInstanceOf[Template]
  }
  
  extension [Self <: Template](x: Self) {
    
    inline def setTemplate(value: Any => Any): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
  }
}
