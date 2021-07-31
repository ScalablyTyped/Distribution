package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Components extends StObject {
  
  /**
    * Routing path (keys) from origin and file-path 
    * (values) to custom REST components.
    * Use the RestRouterGenerator plugin to generate 
    * a template router (see the generated file for more info).
    *   config.rest.components = {};
    */
  var components: js.Any
}
object Components {
  
  @scala.inline
  def apply(components: js.Any): Components = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
  
  @scala.inline
  implicit class ComponentsMutableBuilder[Self <: Components] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: js.Any): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
  }
}
