package typings.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Template extends StObject {
  
  def template(item: js.Any): js.Any
}
object Template {
  
  @scala.inline
  def apply(template: js.Any => js.Any): Template = {
    val __obj = js.Dynamic.literal(template = js.Any.fromFunction1(template))
    __obj.asInstanceOf[Template]
  }
  
  @scala.inline
  implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: js.Any => js.Any): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
  }
}
